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
		
		String user=request.getParameter("uname");
		String pw=request.getParameter("psw");
		
		System.out.println("voy a comprobar la contraseña de " + user + "pw: " + pw);
		
		//ACCEDERIA A BBDD
		
		if(!user.equals("JJ")) {
			response.sendRedirect("pagina2.html");
		}else{
			response.sendRedirect("pagina3.html");
		}	
		
	}




}
