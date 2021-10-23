<html>
	<head>
		<title>Book Update</title>
	</head>
	<body>
		<h1>Book Update</h1>
		<form method="POST">
		  <p>Title : <input type = "text" name = "title"  value = "${data.title}" /> </p>
		  <p>Category : <input type = "text" name = "category" value = "${ data.category }" /> </p>
		  <p>Price : <input type = "text" name = "price" value = "${ data.price }"/> </p>
		  <p><input type = "submit" value = "Save"/>
		</form>
	</body>
</html>