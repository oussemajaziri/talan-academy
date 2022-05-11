package Annonces;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;



public class deposerAnnonce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public deposerAnnonce() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/deposerAnnonce.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/deposerAnnonce.jsp").forward(request, response);
	}

}
