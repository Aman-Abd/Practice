
import Entity.Media;
import Entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "login",
        urlPatterns = "/logIn"
)
public class LogInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String uname = req.getParameter("uname");
        String password = req.getParameter("password");

        Media media = Media.getMedia();
        for(User user : media.getUsers()){
            if(user.getName().equalsIgnoreCase(name)){
                if(password.equals(user.getPassword())){
                    Cookie ck=new Cookie("name", name);
                    resp.addCookie(ck);

                    HttpSession session=req.getSession();
                    session.setAttribute("name",name);
                    out.print("work");

                }else{
                    req.getRequestDispatcher("login.html").include(req, resp);
                }
            }else {
                out.print("User not found");
            }
        }

        out.close();
    }
}

