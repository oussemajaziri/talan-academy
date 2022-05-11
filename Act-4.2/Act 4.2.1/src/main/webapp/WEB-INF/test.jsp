

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<!-- lES SESSIONS -->
	<!--  
	<c:if test="${ !empty sessionScope.prenom && !empty sessionScope.nom }">
        <p>Vous êtes ${ sessionScope.prenom } ${ sessionScope.nom } !</p>
    </c:if>
    <form method="post" action="test">
        <p>
            <label for="nom">Nom : </label>
            <input type="text" name="nom" id="nom" />
        </p>
        <p>
            <label for="prenom">Prénom : </label>
            <input type="text" name="prenom" id="prenom" />
        </p>
        
        <input type="submit" />
    </form>
	-->


	<!-- APPLOAD FILES -->
    <c:if test="${ !empty fichier }"><p><c:out value="Le fichier ${ fichier } (${ description }) a été uploadé !" /></p></c:if>
    <form method="post" action="test" enctype="multipart/form-data">
        <p>
            <label for="description">Description du fichier : </label>
            <input type="text" name="description" id="description" />
        </p>
        <p>
            <label for="fichier">Fichier à envoyer : </label>
            <input type="file" name="fichier" id="fichier" />
        </p>
        
        <input type="submit" />
    </form>
    
    
    

	<!-- PREMIER EXEMPLE JSTL -->
	<p>
		<c:out value="Bonjour JSTL !" />
	</p>

	<!-- jstl et variables -->
	
	<p>
		<c:out value="${ variable }">Valeur par défaut</c:out>
	</p>

	<c:set var="pseudo" value="Mateo21" scope="page" />
	<p>
		<c:out value="${pseudo}" />
	</p>

	<!-- LES CONDITIONS JSTL -->
	<c:if test="${ 50 > 10 }" var="variable">
    C'est vrai (avec Condition If)!
	</c:if>


	<c:choose>
		<c:when test="${ variable }">Du texte</c:when>
		<c:when test="${ autreVariable }">Du texte</c:when>
		<c:when test="${ encoreUneAutreVariable }">Du texte</c:when>
		<c:otherwise>No variable is true</c:otherwise>
	</c:choose>

	<!-- Boocle For EN JSTL-->
	<c:forEach var="i" begin="0" end="10" step="2">
		<p>
			Un message n°
			<c:out value="${ i }" />
			!
		</p>
	</c:forEach>

	<c:forEach items="${ titres }" var="titre" varStatus="status">
		<p>
			N°
			<c:out value="${ status.count }" />
			:
			<c:out value="${ titre }" />
			!
		</p>
	</c:forEach>

	<c:forTokens var="morceau"
		items="Un élément/Encore un autre élément/Un dernier pour la route"
		delims="/ ">
		<p>${ morceau }</p>
	</c:forTokens>


	<!-- FORMS EN JSTL-->
	<c:if test="${ !empty form.resultat }">
		<p>
			<c:out value="${form.resultat}"></c:out>
		</p>
	</c:if>


<!--  

	<form method="post" action="test">
		<p>
			<label for="login">Login : </label> <input type="text" name="login"
				id="login" />
		</p>
		<p>
			<label for="pass">Mot de passe : </label> <input type="password"
				name="pass" id="pass" />
		</p>
		<input type="submit" />
	</form>

-->


</body>
</html>