package com.hotel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Map;

public class CancelOrder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html");
        PrintWriter pp=resp.getWriter();

        String s1=req.getParameter("chooseanamefororder");
        if(s1.isEmpty()){
            resp.getWriter().print("Please enter order name");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("Cancelorder.html");
            requestDispatcher.include(req,resp);
        }
            else {
            DbConnect dbConnect = new DbConnect(s1);
            Connection connection = dbConnect.createConnection();
            dbConnect.deleteValue(connection);

            resp.getWriter().print("Deleted successfully");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("Cancelorder.html");
            requestDispatcher.include(req,resp);
        }
    }
}
