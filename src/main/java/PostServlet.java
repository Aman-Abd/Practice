import Entity.Media;
import Entity.Post;
import Entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "post",
        urlPatterns = "/post"
)
public class PostServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String title  = req.getParameter("title");
        String content = req.getParameter("content");

        if(req.getSession()!=null){
            Post post = new Post();
            Media media = Media.getMedia();
            User user = null;
            out.print("Work");
            for ( User u : media.getUsers()){
                if(u.getName().equalsIgnoreCase((String)req.getSession().getAttribute("name"))){
                    u.getPosts().add(post);
                    user = u;
                    out.print("Work1");
                }
            }
            if (user != null) {
                String[] users = new String[]{"Tom", "Bob", "Sam"};
                req.setAttribute("posts", users);
                getServletContext().getRequestDispatcher("/Posts.jsp").forward(req, resp);
            }
        }
    }
}
