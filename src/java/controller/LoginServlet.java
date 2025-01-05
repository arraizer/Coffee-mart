package controller;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.util.List;
import model.*;

//@WebServlet("/home")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String username=request.getParameter("name");
        String userpassword=request.getParameter("password");
        AccountDAO ad = new AccountDAO();
        Account  a = ad.auth(username, userpassword);
        if(a==null){
            request.setAttribute("errormsg", "User or password is incorrect, please login again");
            request.getRequestDispatcher("Home.jsp").forward(request, response);
        }else{
            response.sendRedirect("home");
        }                    
        
        

    }

}

