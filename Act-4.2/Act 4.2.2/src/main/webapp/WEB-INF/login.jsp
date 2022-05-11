
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>


	<%@ include file="header.jsp"%>
	
	

<c:choose>
    <c:when test="${ cnx==true }">Du texte</c:when>
    <c:when test="${ cnx==false }">Du texte22</c:when>
    <c:otherwise></c:otherwise>
</c:choose>

	<h1 style="text-align: center; color: #339966 ; padding-top:50px;padding-bottom:50px">Login</h1>


	<form method="post" action="Login" >
		<p class="mb-3" style="width: 50%; margin-left:35px">
			<label for="email" class="form-label">Email : </label> 
			<input type="text" class="form-control" name="email" id="email " />
		</p>

		<p class="mb-3" style="width: 50%; margin-left:35px">
			<label class="form-label" for="pwd">Mot de passe : </label> 
			<input type="password" class="form-control" name="pwd" id="pwd" />
		</p>
	
		<p style="text-align: center; margin-top:50px">
		<input type="submit" class="btn btn-success" style="width: 15%; height: 50px; border-radius:20px" />
		</p>
	</form>
	
</body>
</html>