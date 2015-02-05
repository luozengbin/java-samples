package jp.jizai.sample.jmx.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.management.InstanceNotFoundException;
import javax.management.IntrospectionException;
import javax.management.JMException;
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanInfo;
import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.ReflectionException;
import javax.management.openmbean.CompositeData;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import net.arnx.jsonic.JSON;

public class JmxDumpUtil {
    /** Table header for attribute names. */
    private static final String NAME_HEADER = "Attribute Name";

    /** Table header for attribute values. */
    private static final String VALUE_HEADER = "Attribute Value";

    /** Place holder for nulls. */
    private static final String NULL_VALUE = "<null>";

    /** Place holder for unreadable values. */
    private static final String UNREADABLE_VALUE = "<not readable>";

    private static final String OS_NAME = "os.name";

    /**
     * Dumps a local or remote MBeanServer's entire object tree for support purposes. Nested arrays and CompositeData
     * objects in MBean attribute values are handled.
     * 
     * @param connection
     *            the server connection (or server itself)
     * @param out
     *            PrintWriter to write the output to
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static void dumpConnection(MBeanServerConnection connection, PrintWriter out) throws Exception {
        JmxDumpUtil.showStartBanner(out);
        
        // Get all the object names
        Set<ObjectName> objectNames = connection.queryNames(new ObjectName("jboss.as:deployment=ejb-sample.jar"), null);

        // Sort the names (don't assume ObjectName implements Comparable in JDK 1.5)
        Set<ObjectName> newObjectNames = new TreeSet<ObjectName>(new Comparator<ObjectName>()
        {
            public int compare(ObjectName o1, ObjectName o2)
            {
                return o1.toString().compareTo(o2.toString());
            }
        });
        newObjectNames.addAll(objectNames);
        objectNames = newObjectNames;

        
        // Dump each MBean
        Map<String, List<String>> treePathMap = new HashMap<String, List<String>>();
        for (ObjectName objectName : objectNames)
        {
            List<String> attrs = new ArrayList<String>();
            attrs.add(objectName.toString());
            MBeanInfo minfo = connection.getMBeanInfo(objectName);
            Object value;
            for (MBeanAttributeInfo element : minfo.getAttributes()) {

                if (element.isReadable()) {
                    try {
                        value = connection.getAttribute(objectName, element.getName());
                    } catch (Exception e) {
                        value = JmxDumpUtil.UNREADABLE_VALUE;
                    }
                } else {
                    value = JmxDumpUtil.UNREADABLE_VALUE;
                }

                attrs.add(element.getName() + "    " + element.getDescription() + "    " +value );
            }
            
            
            treePathMap.put(getMBeanPath(connection, objectName), attrs);
            //printMBeanInfo(connection, objectName, out);
        }
        
        Node root = TreeUtil.createTreeObject(treePathMap);
        System.out.println(JSON.encode(root, true));
    }

    private static String getMBeanPath(MBeanServerConnection connection, ObjectName objectName) throws InstanceNotFoundException, IntrospectionException, ReflectionException, IOException {
        
        String orign = objectName.toString();
        
        String[] subStr = orign.split(",");
        String type = null;
        List<String> pathList = new ArrayList<String>(); 
        for (String item : subStr) {
            if(!item.startsWith("type")) {
                pathList.add(item.substring(item.indexOf("=") + 1));
            } else {
                type = item.substring(item.indexOf("=") + 1);
            }
        }
        if(type != null) {
            pathList.add(0, type);
        }
        pathList.add(0, objectName.getDomain());
        
        StringBuilder sb = new StringBuilder(); 
        for (String path : pathList) {
            sb.append(path).append("|");
        }
        sb = sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    
    /**
     * Dumps the details of a single MBean.
     * 
     * @param connection
     *            the server connection (or server itself)
     * @param objectName
     *            the object name
     * @param out
     *            PrintWriter to write the output to
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     * @throws JMException
     *             Signals a JMX error
     */
    private static void printMBeanInfo(MBeanServerConnection connection, ObjectName objectName, PrintWriter out)
            throws IOException, JMException
    {
        Map<String, Object> attributes = new TreeMap<String, Object>();
        MBeanInfo info = connection.getMBeanInfo(objectName);
        attributes.put("** Domain Name", objectName.getDomain());
        attributes.put("** Object Name", objectName.toString());
        attributes.put("** Object Type", info.getClassName());
        
        for (MBeanAttributeInfo element : info.getAttributes())
        {
            Object value;
            if (element.isReadable())
            {
                try
                {
                    value = connection.getAttribute(objectName, element.getName());
                }
                catch (Exception e)
                {
                    value = JmxDumpUtil.UNREADABLE_VALUE;
                }
            }
            else
            {
                value = JmxDumpUtil.UNREADABLE_VALUE;
            }
            attributes.put(element.getName(), element.getDescription());
            
        }
        if (objectName.getCanonicalName().equals("Alfresco:Name=SystemProperties"))
        {
            String osName = (String) attributes.get(OS_NAME);
            if (osName != null && osName.toLowerCase().startsWith("linux"))
            {
                attributes.put(OS_NAME, "ArchLinux");
            }
        }
        tabulate(JmxDumpUtil.NAME_HEADER, JmxDumpUtil.VALUE_HEADER, attributes, out, 0);
    }

   

    /**
     * Dumps the details of a single CompositeData object.
     * 
     * @param composite
     *            the composite object
     * @param out
     *            PrintWriter to write the output to
     * @param nestLevel
     *            the nesting level
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    @SuppressWarnings("unchecked")
    private static void printCompositeInfo(CompositeData composite, PrintWriter out, int nestLevel) throws IOException
    {
        Map<String, Object> attributes = new TreeMap<String, Object>();
        for (String key : (Set<String>)composite.getCompositeType().keySet())
        {
            Object value;
            try
            {
                value = composite.get(key);
            }
            catch (Exception e)
            {
                value = JmxDumpUtil.UNREADABLE_VALUE;
            }
            attributes.put(key, value);
        }
        tabulate(JmxDumpUtil.NAME_HEADER, JmxDumpUtil.VALUE_HEADER, attributes, out, nestLevel);
    }

    /**
     * Tabulates a given String -> Object Map.
     * 
     * @param keyHeader
     *            the key header
     * @param valueHeader
     *            the value header
     * @param rows
     *            Map containing key value pairs forming the rows
     * @param out
     *            PrintWriter to write the output to
     * @param nestLevel
     *            the nesting level
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private static void tabulate(String keyHeader, String valueHeader, Map<String, Object> rows, PrintWriter out,
            int nestLevel) throws IOException
    {
        if (rows.isEmpty())
        {
            return;
        }
        // Calculate column lengths
        int maxKeyLength = keyHeader.length(), maxValLength = valueHeader.length();
        for (Map.Entry<String, Object> entry : rows.entrySet())
        {
            maxKeyLength = Math.max(maxKeyLength, entry.getKey().length());
            maxValLength = Math.max(maxValLength, getValueLength(entry.getValue()));
        }
        // Output Header
        outputRow(out, maxKeyLength, keyHeader, valueHeader, nestLevel);
        indent(out, nestLevel);
        for (int col = 0; col < maxKeyLength; col++)
        {
            out.print('-');
        }
        out.print(' ');
        for (int col = 0; col < maxValLength; col++)
        {
            out.print('-');
        }
        out.println();

        // Output Body
        for (Map.Entry<String, Object> entry : rows.entrySet())
        {
            outputRow(out, maxKeyLength, entry.getKey(), entry.getValue(), nestLevel);
        }
        out.println();
    }

    /**
     * Outputs spaces in the left hand margin appropriate for the given nesting level.
     * 
     * @param out
     *            PrintWriter to write the output to
     * @param nestLevel
     *            the nesting level
     */
    private static void indent(PrintWriter out, int nestLevel)
    {
        int size = nestLevel * 3;
        for (int i = 0; i < size; i++)
        {
            out.print(' ');
        }
    }

    /**
     * Outputs a single row in a two-column table. The first column is padded with spaces so that the second column is
     * aligned.
     * 
     * @param out
     *            PrintWriter to write the output to
     * @param maxKeyLength
     *            maximum number of characters in the first column
     * @param key
     *            the first column value
     * @param value
     *            the second column value
     * @param nestLevel
     *            the nesting level
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private static void outputRow(PrintWriter out, int maxKeyLength, String key, Object value, int nestLevel)
            throws IOException
    {
        indent(out, nestLevel);
        out.print(key);
        for (int i = key.length() - 1; i < maxKeyLength; i++)
        {
            out.print(' ');
        }
        outputValue(out, value, nestLevel);
    }

    /**
     * Outputs a single value, dealing with nested arrays and CompositeData objects.
     * 
     * @param out
     *            PrintWriter to write the output to
     * @param value
     *            the value to output
     * @param nestLevel
     *            the nesting level
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    private static void outputValue(PrintWriter out, Object value, int nestLevel) throws IOException
    {
        if (value == null)
        {
            out.println(JmxDumpUtil.NULL_VALUE);
        }
        else if (value.getClass().isArray())
        {
            int length = Array.getLength(value);
            if (length == 0)
            {
                out.println("[]");
            }
            else
            {
                out.println();
                indent(out, nestLevel + 1);
                out.println('[');
                for (int i = 0; i < length; i++)
                {
                    indent(out, nestLevel + 2);
                    outputValue(out, Array.get(value, i), nestLevel + 2);
                    if (i + 1 < length)
                    {
                        indent(out, nestLevel + 1);
                        out.println(',');
                    }
                }
                indent(out, nestLevel + 1);
                out.println(']');
            }
        }
        else if (value instanceof CompositeData)
        {
            out.println();
            indent(out, nestLevel + 1);
            out.println('[');
            printCompositeInfo((CompositeData) value, out, nestLevel + 2);
            indent(out, nestLevel + 1);
            out.println(']');
        }
        else
        {
            out.println(value.toString());
        }
    }

    /**
     * Gets the number of characters required to encode a value.
     * 
     * @param value
     *            the value to be encoded
     * @return the number of characters
     */
    private static int getValueLength(Object value)
    {
        if (value == null)
        {
            return JmxDumpUtil.NULL_VALUE.length();
        }
        else if (value.getClass().isArray() || value instanceof CompositeData)
        {
            // We continue arrays and composites on a new line
            return 0;
        }
        else
        {
            return value.toString().length();
        }
    }
    
    /**
     * Show a message stating the JmxDumper has been started, with the current date and time. 
     */
    private static void showStartBanner(PrintWriter out)
    {
        DateFormat df = SimpleDateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        out.println(JmxDumpUtil.class.getSimpleName() + " started: " + df.format(new Date()));
        out.println();
    }
    
    
    public static void main(String[] args) throws Exception {
        
        Map<String, Object> env = new HashMap<String, Object>();
        
        String[] creds = {"admin", "P@ssw0rd"};
        env.put(JMXConnector.CREDENTIALS, creds);
        
        JMXServiceURL url = new JMXServiceURL("service:jmx:remoting-jmx://lab002:9999");
        JMXConnector connector = JMXConnectorFactory.connect(url, env);
        MBeanServerConnection connection = connector.getMBeanServerConnection();
        JmxDumpUtil.dumpConnection(connection, new PrintWriter(System.out));
        

    }
}
