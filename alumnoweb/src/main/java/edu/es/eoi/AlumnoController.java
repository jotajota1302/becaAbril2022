package edu.es.eoi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/alumno")
public class AlumnoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id=Integer.valueOf(request.getParameter("id"));		
		AlumnoRepository repository= new AlumnoRepository();		
		Alumno alumno=repository.read(id);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String json=gson.toJson(alumno);
		
		response.getWriter().append(json);	
		
	}

}
