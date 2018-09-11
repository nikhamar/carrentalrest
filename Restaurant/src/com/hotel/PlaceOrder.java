package com.hotel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

public class PlaceOrder extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter p = resp.getWriter();
        String caramelMacchiato= req.getParameter("caramelmacchiato");
        String frenchVanilla=req.getParameter("frenchvanilla");
        String hotChocolate=req.getParameter("hotchocolate");
        String  chailatte= req.getParameter("chailatte");
        String mochafrappe = req.getParameter("mochafrappe");
        String mangopineapplesmoothie= req.getParameter("mangopineapplesmoothie");
        String cookiees= req.getParameter("cookiees");
        String chooseanamefororder= req.getParameter("chooseanamefororder");
if(caramelMacchiato!=null&& frenchVanilla!=null&&hotChocolate!=null&&chailatte!=null&&mochafrappe!=null&&mangopineapplesmoothie!=null&&cookiees!=null&&chooseanamefororder!=null){

    DbConnect dbConnect = new DbConnect(caramelMacchiato,frenchVanilla,hotChocolate,chailatte,mochafrappe,mangopineapplesmoothie,cookiees,chooseanamefororder);
    Connection connection = dbConnect.createConnection();
    dbConnect.setValue(connection);

    RequestDispatcher RD1=req.getRequestDispatcher("Homepage.html");
    RD1.include(req,resp);
}else{
    p.print("<html><b><h>please fill the fields</h></b></html>");
    RequestDispatcher RD=req.getRequestDispatcher("Placeorder.html");
    RD.include(req,resp);
}


    }
}
