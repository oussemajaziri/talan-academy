
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deposer Annonce</title>
</head>
<body>

	<%@ include file="header.jsp"%>

	<h1 style="text-align: center; color: #339966 ; padding-top:50px;padding-bottom:50px">Deposer une annonce</h1>


	<form method="post" >
		<p class="mb-3" style="width: 50%; margin-left:35px">
			<label for="title" class="form-label">Title : </label> 
			<input type="text" class="form-control" name="title" id="title " />
		</p>

		<p class="mb-3" style="width: 50%; margin-left:35px">
			<label class="form-label" for="description">Description : </label> 
			<input type="text" class="form-control" name="description" id="description" />
		</p>
		<p class="mb-3" style="width: 50%; margin-left:35px">
			<label class="form-label" for="category">Category : </label> 
			<select class="form-control" style="width: 25%;">
				<option > 1 </option>
				<option > 2 </option>
				<option > 3 </option>
			</select>
		</p>
		
		<p class="mb-3" style="width: 50%; margin-left:35px">
			<label class="form-label" for="price">Price : </label> 
			<input type="number" class="form-control" name="price" id="price" />
		</p>
		
		<p class="mb-3" style="width: 50%; margin-left:35px">
			<label class="form-label" for="location">Description : </label> 
			<input type="text" class="form-control" name="location" id="location" />
		</p>

		<p style="text-align: center; margin-top:50px">
		<input type="submit" class="btn btn-success" style="width: 15%; height: 50px; border-radius:20px" />
		</p>
	</form>

</body>
</html>