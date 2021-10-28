import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(name = "hello", urlPatterns = {"/hello"})
public class Servlet extends HttpServlet {
 
    private static final long serialVersionUID = -1915463532411657451L;
 
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException 
    {
         
         
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        try {
            // Write some content
            out.println("<html>");
            out.println("<head>");
            out.println("<title>hello</title>");
            out.println("</head>");
            out.println("<body>");
            if(username != null){
                out.println("<h2>Hello " + username +"!!!</h2>");
            }else{
                out.println("<h2>Hello! if you want to see your name, specify it in the url as such:</h2>");
                out.println("<h3>http://localhost:8080/webapp-1.0/hello?username=<NAME></h3>");
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
     
    
}