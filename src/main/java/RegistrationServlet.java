import Entity.Media;
import Entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "registration",
        urlPatterns = "/registration"
)
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session=req.getSession();

        resp.setContentType("text/html");
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        String password = req.getParameter("password");
        PrintWriter out = resp.getWriter();

        Media.getMedia().getUsers().add(new User(name,lastName,password));

        out.println("Name: " + name +"<br>");
        out.println("Last Name: " + lastName+"<br>");
        out.println("Password: "+password+"<br>");
        out.close();

    }
}
