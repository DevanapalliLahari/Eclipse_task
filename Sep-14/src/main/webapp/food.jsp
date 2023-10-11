<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Collecting  information</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body >
<form action="food" method="post">
        <div class="navbar navbar-expand-sm btn  btn-success navbar-succes">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">Food </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Home</a>
                    </li>
                    
            </ul>
           </div>
           <div class="row">
            <div class="mx-auto col-10 col-md-8 col-lg-6">
            <form class="container">
            
            <label for=" ">Enter name</label>
          <input type="text" class="form-control" name="name" placeholder="Enter name"/>
          
           </br>
          Type: <select name="type">
						<option>Select option</option>
						<option value="veg">Veg</option>
						<option value="non-veg">Non-veg</option>
					</select>
					</br>
					</br>
           
            Hotel Name: <select name="hotel name">
						<option >Select option</option>
						<option value="name">Paradise</option>
						<option value="name">Dolphins</option>
						<option value="name">7 Hills</option>
						<option value="name">Domino's</option>
					</select>
					</br>
					</br>
           <label for=" ">Enter Price</label>
           <input type="text" class="form-control" name="price" placeholder="Enter the Price"/>
           </br>
            
           Quantity: <select name="quantity">
						<option>Select option</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
					</select>
					</br>
					</br>
					<div class="form-check">
      <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
      <label class="form-check-label" for="invalidCheck">
        Accept Agreement
      </label>
      <div class="invalid-feedback">
        You must agree before submitting.
      </div>
    </div>
           
           <button type="submit" class="btn btn-info">Send</button>
           </form>
           </div>
           </div>

</form>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>

</body>
</html>