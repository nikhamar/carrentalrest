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

public class ViewOrder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setContentType("text/html");
        PrintWriter pp=resp.getWriter();

        String s1=req.getParameter("chooseanamefororder");
        DbConnect dbConnect = new DbConnect(s1);
        Connection connection = dbConnect.createConnection();
        Map hashMap = dbConnect.getValue(connection);
        String s= (String) hashMap.get("chooseanamefororder");

        if(s1.equals(s)){

            RequestDispatcher requestDispatcher=req.getRequestDispatcher("Vieworder.html");
            resp.getWriter().print("CaramelMachiato : " + hashMap.get("caramelmacchiato"));

            resp.getWriter().print("French Vanilla :" + hashMap.get("frenchvanilla"));
            resp.getWriter().print("hotchocolate :" + hashMap.get("hotchocolate"));
            resp.getWriter().print("chailatte :" + hashMap.get("chailatte"));
            resp.getWriter().print("mochafrappe : " + hashMap.get("mochafrappe"));
            resp.getWriter().print("mangopineapple smoothie : " + hashMap.get("mangopineapplesmoothie"));
            resp.getWriter().print("Cookiees : " + hashMap.get("cookiees"));

                requestDispatcher.include(req,resp);

        }
        else{
            pp.print("<html><b><h>order name is inncorrect</h></b></html>");
            RequestDispatcher RD=req.getRequestDispatcher("Vieworder.html");
            RD.include(req,resp);
        }
    }
}
