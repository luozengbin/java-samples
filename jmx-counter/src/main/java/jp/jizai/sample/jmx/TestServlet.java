package jp.jizai.sample.jmx;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
    
    SampleCounter counter = SampleCounter.getSampleCounter();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        try {
            counter.succeeded();
            response.getWriter().print(new Date() + ": hoge");    
        } catch (Exception e) {
            counter.failured();
            e.printStackTrace();
        }
        
    }
}
