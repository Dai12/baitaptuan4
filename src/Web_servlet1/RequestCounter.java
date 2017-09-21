package Web_servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RequestCounter")
public class RequestCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

   
    public RequestCounter() {
        super();

    }


	public void init(ServletConfig config) throws ServletException {
        super.init(config); 
		Integer counter = 0;
		getServletContext().setAttribute("counter", counter);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext servletcontext = getServletContext();
		
		//get counter
		Integer counter = (Integer)	servletcontext.getAttribute("counter");
		
		
		//increment counter
		  
		 counter ++;
		 
		 //Set counter to application scope
		 servletcontext.setAttribute("counter",counter);
		 
		 PrintWriter out = response.getWriter();
		 response.setContentType("text/html");
		 out.println("<html><head><title>Request Counter</title></head>");
		 out.println("<h2>The cuonter is incremented </h2>");
		 out.println("</body></html>");
	}

}
