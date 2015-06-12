package jp.co.jizai.sample.jbossas7.tcp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@SuppressWarnings("serial")
//@WebServlet(name = "SampleServlet", value = "/")
//@ServletSecurity(@HttpConstraint(rolesAllowed = "SampleRole"))
public final class SampleServlet extends HttpServlet {
 
  @Override
  protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws IOException, ServletException {
    final RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
 
    dispatcher.forward(req, resp);
  }
 
}	