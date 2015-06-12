package jp.co.jizai.sample.jbossas7.tcp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

/**
 * Created by akira on 15/04/01.
 */
public class ShowParameterServlet extends HttpServlet {

    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        process(req, resp);
    }


    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    public void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	req.setCharacterEncoding("UTF-8");
    	
    	System.out.println("---------------:" + req.getParameter("aaa"));
    	
//    	System.out.println(req.getHeader("xx-user"));
//    	
//    	System.out.println(new String(org.apache.commons.codec.binary.Base64.decodeBase64(req.getHeader("xx-user")), "UTF-8"));
    	
        resp.setContentType(CONTENT_TYPE);
        PrintWriter out = resp.getWriter();
//        System.out.println("=== http parameter ===");
//        Map<String, Object> paramMap = (Map<String, Object>) req.getParameterMap();
//        for (Map.Entry<String, Object> entry : paramMap.entrySet()) {
//            out.write(String.format("%s = %s", entry.getKey(), entry.getValue()) + "<br/>");
//        }
//
//        System.out.println("=== http attribute ===");
//        Enumeration<String> attrNames = (Enumeration<String>) req.getAttributeNames();
//        while (attrNames.hasMoreElements()) {
//            String attrName = attrNames.nextElement();
//            out.write(String.format("%s = %s", attrName, req.getAttribute(attrName)) + "<br/>");
//        }
        out.close();
    }
}
