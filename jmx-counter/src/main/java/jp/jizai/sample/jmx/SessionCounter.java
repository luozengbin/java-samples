package jp.jizai.sample.jmx;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener()
public class SessionCounter implements HttpSessionListener {

    SampleCounter counter = SampleCounter.getSampleCounter();

    public void sessionCreated(HttpSessionEvent arg0) {
        System.out.println("--- sessionCreated ---");
        counter.sessionCreated();
    }

    public void sessionDestroyed(HttpSessionEvent arg0) {
        System.out.println("--- sessionDestroyed ---");
        counter.sessionDestroyed();
    }
}
