package com.octest.forms;

import jakarta.servlet.http.HttpServletRequest;

public class ConnectionForm {
	
	private String resultat;
	static String test = "zero"; 
	
	public void verifierIdentifiants(HttpServletRequest request) {
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		
		if (pass.equals(login+"123")) {
			resultat = "Vous etes bien connecté !";
		} else {
			resultat = "Identifiants incorrectes";
		}
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	
	

}