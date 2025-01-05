package controller;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.List;
import model.*;

public class CategoryServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String category = request.getParameter("cid");
        ProductDAO d = new ProductDAO();
        List<Product> pc = d.getAllProductsbyCID(category);
        List<ProductCategory> listpc = d.getAllCategory();
       
        request.setAttribute("cid", category);
        request.setAttribute("pcid", listpc);
        request.setAttribute("products", pc);
        request.getRequestDispatcher("Home.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

    }
   
}
