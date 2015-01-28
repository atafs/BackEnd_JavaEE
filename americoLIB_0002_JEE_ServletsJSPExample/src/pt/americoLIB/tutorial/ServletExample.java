package pt.americoLIB.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletExample extends HttpServlet {
	
	//ATTRIBUTE
	private static final long serialVersionUID = 1L;
      
	//MAIN
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//TEXT OUTPUT STREAM
		PrintWriter out = response.getWriter();
		
		if(request.getParameter("firstname") == null || request.getParameter("lastname") == null) {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			return;
		}
		//REQUEST PARAMS
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		
		//SET THE PARAMS
		request.setAttribute("firstname", firstName);
		request.setAttribute("lastname", lastName);
		
		//SEND PRINT TO ANOTHER PAGE
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);

	
	}
}
