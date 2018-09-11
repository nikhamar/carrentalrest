//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class RegistrationPost {
//
//
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
//        PrintWriter p = resp.getWriter();
//        String fname= req.getParameter("fname");
//        String lname=req.getParameter("lname");
//        String gn=req.getParameter("gn");
//        String em1 = req.getParameter("email");
//        String uname = req.getParameter("uname");
//        String pswd= req.getParameter("pswd");
//        ServletContext ss = getServletContext();
//        ss.setAttribute("username",uname);
//        ss.setAttribute("password",pswd);
//        if(fname != null && fname!="" &&lname !=null && lname!="" &&gn!=null && gn!=""&& em1!=null &&em1!=""&&uname!=null&&uname!=""&&pswd!=null&&pswd!=""){
//
//            p.print(fname +"Welcome to the Login Page");
//
//            RequestDispatcher RD1=req.getRequestDispatcher("login.jsp");
//            RD1.include(req,resp);
//        }
//        else{
//            p.print("<html><b><h>please fill the fields</h></b></html>");
//            RequestDispatcher RD=req.getRequestDispatcher("reg.jsp");
//            RD.include(req,resp);
//        }
//
//        HttpSession hs=req.getSession();
//        hs.setAttribute("n",uname);
//        hs.setAttribute("p",pswd);
//
//    }
//
//
//}
