package jp.jizai.sample.jmx;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener()
public class MBeanRegisterListener implements ServletContextListener {

    SampleCounter counter = SampleCounter.getSampleCounter();

    public void contextInitialized(ServletContextEvent sce) {
        
        System.out.println("--- contextInitialized ---");

        // MBeanの登録と解除処理
        try {
            MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            ObjectName oname = new ObjectName("jp.jizai.sample.jmx.app:name=SampleCounter");
            if (server.isRegistered(oname)) {
                server.unregisterMBean(oname);
            }
            server.registerMBean(counter, oname);

        } catch (Exception e) {
            sce.getServletContext().log("mbean登録失敗", e);
        }
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("--- contextDestroyed ---");
        
        // MBeanの解除処理
        try {
            MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            ObjectName oname = new ObjectName("jp.jizai.sample.jmx.app:name=SampleCounter");
            if (server.isRegistered(oname)) {
                server.unregisterMBean(oname);
            }
        } catch (Exception e) {
            sce.getServletContext().log("mbean解除失敗", e);
        }
    }

}
