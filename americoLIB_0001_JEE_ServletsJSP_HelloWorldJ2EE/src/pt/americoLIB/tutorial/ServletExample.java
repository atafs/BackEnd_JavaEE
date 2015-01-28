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
		
		//SEND PRINT on first page of server (and only one in this case)
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<BODY BGCOLOR=" + "GREEN" + "TEXT=" + "WHITE" + ">");
		
		out.println("Hello JAVA EE!!! World of WEB DEVELOPMENT ;-)" + "<br>");
		out.println("DESCRIPTION: simple server of ONE PAGE" + "<br>" + "<br>");
		out.println("Its purpose is for installing on my machine the programs/plug-ins:" + "<br>");
		out.println("- Spring Framework" + "<br>");
		out.println("- Spring WebFlow" + "<br>"); 
		out.println("- Spring Security" + "<br>"); 
		out.println("- JPA (Hibernate)" + "<br>");
		out.println("- JSF 2.0 (PrimeFaces) " + "<br>");
		out.println("- Subversion (version control)" + "<br>");
		out.println("- Oracle RDBMS" + "<br>");
		out.println("- Apache Maven2" + "<br>");
		out.println( "- Apache Tomcat" + "<br>");
		out.println("- Eclipse IDE" + "<br>");
		out.println("- Maven 2.0 tools" + "<br>");
		out.println("- Basic Java Servlets and JSP" + "<br>");
		
		out.println("</BODY> ");
		out.println("</HTML>");
	}

}
