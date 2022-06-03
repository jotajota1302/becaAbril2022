package edu.es.eoi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class MyFirstServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public MyFirstServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
//		response.getWriter().append("Served at: ").append(request.getContextPath()).append(" called from: ").append(request.getRemoteAddr());
		
		System.out.println("me ha invocado: " + request.getRemoteAddr());
		
		response.sendRedirect("helloworld.html");
	}




}
