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
    //private static final String LOGIN_TIME_PARAMETER_NAME = "";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //on recupère les valeurs du formulaire
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
       //  req.setAttribute(LOGIN_TIME_PARAMETER_NAME, loginTime);

        Account userAccount = DataDAO.findUser(nom, prenom);

        if (userAccount == null) {
            String errorMessage = "Invalid nom or prenom";

            req.setAttribute("errorMessage", errorMessage);

            RequestDispatcher dispatcher //
                    = this.getServletContext().getRequestDispatcher("/login.jsp");

            dispatcher.forward(req, resp);
            return;
        }







        // Redirection vers la vue JSP
        final ServletContext servletContext = req.getServletContext();
        final RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(DASHBOARD_JSP_VIEW);
        requestDispatcher.forward(req, resp);

    }
}
