package Annonces;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Login() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String m = "ssss";
		request.setAttribute("m", m);

		UtilisateurDAOImpl utilisateurDAOImpl = new UtilisateurDAOImpl();
		boolean cnx =utilisateurDAOImpl.login(email, pwd);
		
		
		request.setAttribute("email", email);
		request.setAttribute("pwd", pwd);
		request.setAttribute("cnx", cnx);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

}
