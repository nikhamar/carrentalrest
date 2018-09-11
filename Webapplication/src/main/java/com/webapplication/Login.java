//package com.webapplication;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.util.Map;
//
//public class Login extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter pp=resp.getWriter();
//
////        String p=(String)h.getAttribute("p");
////        ServletContext ss =getServletContext();
////        String s=(String)ss.getAttribute("username");
////        String p=(String)ss.getAttribute("password");
//        String s1=req.getParameter("un");
//        String s2=req.getParameter("pswd");
////       Cookie[]cookies= req.getCookies();
////
////        HttpSession h=req.getSession(false);
////        String print=(String)h.getAttribute("u");
////        System.out.println("output"+ print);
//
////for(int i=0;i<cookies.length;i++){
////    System.out.println("cookie" + cookies[i].getValue());
////    System.out.println("cookie " + cookies[i].getName());
////}
//        DbConnect dbConnect = new DbConnect();
//        Connection connection = dbConnect.createConnection();
//        Map hashMap = dbConnect.getValue(connection);
//        String s = (String) hashMap.get("uname");
//        String p = (String) hashMap.get("pswd");
//        if(s1.equals(s)&&s2.equals(p)){
//
////            pp.println("Welcome to the  "  +s);
//            pp.print("<html><body>");
//            pp.print("<img src= 'indian-flag-images-18.jpg' alt='image' />" );
//            pp.print("</body></html>");
//
//        }
//        else{
//            pp.print("<html><b><h>username or password incorrect</h></b></html>");
//            RequestDispatcher RD=req.getRequestDispatcher("login.jsp");
//            RD.include(req,resp);
//        }
//    }
//
//
//}
//
//
