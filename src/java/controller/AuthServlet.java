package controller;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.util.List;
import model.*;

//@WebServlet("/home")
public class AuthServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String action = request.getParameter("action");
        String username = request.getParameter("name");
        String userpassword = request.getParameter("password");
        if ("login".equals(action)) {
            AccountDAO ad = new AccountDAO();
            Account a = ad.auth(username, userpassword);
            if (a == null) {
                request.setAttribute("errormsg", "User or password is incorrect, please login again");
                request.getRequestDispatcher("Home.jsp").forward(request, response);
            } else {
                HttpSession session = request.getSession(); 
                session.setAttribute("user", a);
                session.setAttribute("logged", true);
                
                response.sendRedirect("home");
            }
        } else if ("signup".equals(action)) {
            AccountDAO ad = new AccountDAO();
            Account a = ad.checkUserExist(username);
            if (a != null) {
                request.setAttribute("errormsg", "Your Username alrady exist!");
                request.getRequestDispatcher("Home.jsp").forward(request, response);
            } else {
                Account newacc = new Account(username, userpassword);
                ad.insert(newacc);
                response.sendRedirect("home");
            }
        }

    }

}
