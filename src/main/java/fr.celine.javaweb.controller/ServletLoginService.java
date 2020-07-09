package fr.celine.javaweb.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletLoginService extends HttpServlet {

    private static final String DASHBOARD_JSP_VIEW = "/target_test.jsp";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Redirection vers la vue JSP
        final ServletContext servletContext = req.getServletContext();
        final RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(DASHBOARD_JSP_VIEW);
        requestDispatcher.forward(req, resp);

    }
}
