package com.webapplication;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

public class Registration extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter p = resp.getWriter();
        String fname= req.getParameter("fname");
        String lname=req.getParameter("lname");
        String gn=req.getParameter("gn");
        String em1 = req.getParameter("email");
        String uname = req.getParameter("username");
        String pswd= req.getParameter("password");

//        Cookie cookie= new Cookie("usernamecookie", uname);
//        resp.addCookie(cookie);
//
//       HttpSession httpsession= req.getSession();
//       httpsession.setAttribute("u",uname);


        if(uname!=null&&uname!=""&&pswd!=null&&pswd!=""){

//            p.print(fname +"Welcome to the Login Page");
//            ServletContext ss =getServletContext();
//            ss.setAttribute("username",uname);
//            ss.setAttribute("password",pswd);

            DbConnect dbConnect = new DbConnect(uname,pswd);
            Connection connection = dbConnect.createConnection();

//            HttpSession httpSession =req.getSession();
//            httpSession.setAttribute("Dbconnect",connection);

            dbConnect.setValue(connection);






            RequestDispatcher RD1=req.getRequestDispatcher("login.jsp");
            RD1.include(req,resp);
        }
        else{
            p.print("<html><b><h>please fill the fields</h></b></html>");
            RequestDispatcher RD=req.getRequestDispatcher("reg.jsp");
            RD.include(req,resp);
        }

        HttpSession hs=req.getSession();
        hs.setAttribute("n",uname);
        hs.setAttribute("p",pswd);

    }



    }

