<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file ="menu.jsp" %>
	
	    <%
        String heure = (String) request.getAttribute("heure");
        if (heure.equals("jour")) {
            out.println("Bonjour"); 
        }
        else {
            out.println("Bonsoir");
        }
    	%>
    	
	<p>
		<%
			String chaine = (String)request.getAttribute("variable");
			out.println(chaine);
		%> 
	</p>
	
	<p>
		Hey  ${ !empty name ? name : '' }
		<!--  
		<%
			String name = (String)request.getAttribute("name");
			out.println(" "+name+" ");
		%> 
		-->
		Bonjour !
	</p>
	
	<p> ${noms[0]}</p>
	
	<p> Bonjour Auteur : ${auteur.prenom} ${auteur.nom} </p>
	<p> ${auteur.actif ? 'vous etes trés actif' : 'vous etes inactif !'} </p>
</body>
</html>