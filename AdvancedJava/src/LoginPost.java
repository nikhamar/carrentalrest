import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginPost extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pp = resp.getWriter();
//        HttpSession h=req.getSession(false);
//        String s=(String)h.getAttribute("n");
//        String p=(String)h.getAttribute("p");
        ServletContext ss = getServletContext();
        String s = (String) ss.getAttribute("username");
        String p = (String) ss.getAttribute("password");
        String s1 = req.getParameter("un");
        String s2 = req.getParameter("pswd");
        if (s1.equals(s) && s2.equals(p)) {

            pp.println("Welcome to the" + s);
        }
    }

}
