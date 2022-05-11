package com.octest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import com.octest.beans.Auteur;
import com.octest.forms.ConnectionForm;

public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public static final int TAILLE_TAMPON = 10240;
    public static final String CHEMIN_FICHIERS = "C:/Users/ojaziri/Desktop/Nouveau dossier/stock/"; // A changer

	public Test() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// response.getWriter().append("Served at: ").append(request.getContextPath());

		/**
		 * response.setContentType("text/html"); response.setCharacterEncoding("UTF-8");
		 * 
		 * PrintWriter out = response.getWriter(); out.println("Bonjour !");
		 */

		String name = request.getParameter("name");
		request.setAttribute("name", name);
		request.setAttribute("heure", "jour");
		String message = "Au revoir !";
		request.setAttribute("variable", message);
		String[] noms = { "oussema", "sam", "alin" };
		request.setAttribute("noms", noms);

		String[] titres = { "premier titre", "deusieme titre", "troisieme titre" };
		request.setAttribute("titres", titres);

		Auteur auteur = new Auteur();
		auteur.setPrenom("oussema");
		auteur.setNom("Jaziri");
		auteur.setActif(true);
		request.setAttribute("auteur", auteur);

		this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
        ConnectionForm form = new ConnectionForm();
        form.verifierIdentifiants(request);
        request.setAttribute("form", form);
        **/
		
		
		/*
		//pour les session
	    String nom = request.getParameter("nom");
	    String prenom = request.getParameter("prenom");
	        
	    HttpSession session = request.getSession();

	    session.setAttribute("nom", nom);
	    session.setAttribute("prenom", prenom);
	    **/   
	  
       

        // On récupère le champ description comme d'habitude
        String description = request.getParameter("description");
        request.setAttribute("description", description );

        // On récupère le champ du fichier
        Part part = request.getPart("fichier");
            
        // On vérifie qu'on a bien reçu un fichier
        String nomFichier = getNomFichier(part);

        // Si on a bien un fichier
        if (nomFichier != null && !nomFichier.isEmpty()) {
            String nomChamp = part.getName();
            // Corrige un bug du fonctionnement d'Internet Explorer
             nomFichier = nomFichier.substring(nomFichier.lastIndexOf('/') + 1)
                    .substring(nomFichier.lastIndexOf('\\') + 1);

            // On écrit définitivement le fichier sur le disque
            ecrireFichier(part, nomFichier, CHEMIN_FICHIERS);

            request.setAttribute(nomChamp, nomFichier);
        }

        this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
    }

    private void ecrireFichier( Part part, String nomFichier, String chemin ) throws IOException {
        BufferedInputStream entree = null;
        BufferedOutputStream sortie = null;
        try {
            entree = new BufferedInputStream(part.getInputStream(), TAILLE_TAMPON);
            sortie = new BufferedOutputStream(new FileOutputStream(new File(chemin + nomFichier)), TAILLE_TAMPON);

            byte[] tampon = new byte[TAILLE_TAMPON];
            int longueur;
            while ((longueur = entree.read(tampon)) > 0) {
                sortie.write(tampon, 0, longueur);
            }
        } finally {
            try {
                sortie.close();
            } catch (IOException ignore) {
            }
            try {
                entree.close();
            } catch (IOException ignore) {
            }
        }
    }
    
    private static String getNomFichier( Part part ) {
        for ( String contentDisposition : part.getHeader( "content-disposition" ).split( ";" ) ) {
            if ( contentDisposition.trim().startsWith( "filename" ) ) {
                return contentDisposition.substring( contentDisposition.indexOf( '=' ) + 1 ).trim().replace( "\"", "" );
            }
        }
        return null;
    }   

    
     
        
        
}

