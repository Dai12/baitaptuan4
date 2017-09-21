package Web_servlet1;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.servlet.descriptor.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/HelloWordservlet")
public class HelloWordsevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
/* public void doGet ( HttpServletRequest request,
		 HttpServletResponse response )*/
	@Override
	protected void doGet( HttpServletRequest request,
			 HttpServletResponse response )
 throws ServletException , IOException
 {
	 PrintWriter out = response.getWriter();
	 response.setContentType("text/html");
	 out.println("<html><head><title>Hello</title></head>");
	 out.println("<h2>Hello World!</h2>");
	 out.println("</body></html>");

 }
}
