package com.octest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.octest.beans.Auteur;


public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Test() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/**
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("Bonjour !");
		*/
		
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		request.setAttribute("heure", "jour");
		String messahe = "Au revoir !";
		request.setAttribute("variable", messahe);
		String[] noms = {"oussema","sam","alin"};
		request.setAttribute("noms", noms);
		
		Auteur auteur = new Auteur();
		auteur.setPrenom("oussema");
		auteur.setNom("Jaziri");
		auteur.setActif(true);
		request.setAttribute("auteur", auteur);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
