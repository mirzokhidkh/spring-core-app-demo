package uz.mkh.springcoreapp.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServlet implements Servlet {
    ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
        System.out.println("servlet is initialized");

    }

    @Override
    public ServletConfig getServletConfig() {

        return servletConfig;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
     res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<b>hello simple servlet</b>");
        out.print("</body></html>");
     }

    @Override
    public String getServletInfo() {
        return "copyright 2023";
    }

    @Override
    public void destroy() {

    }
}
