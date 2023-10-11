<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Grocery Store</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
<form action="login" method="post">
        <div class="navbar navbar-expand-sm btn  btn-warning navbar-succes">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">Login </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Grocery.jsp">Grocery</a>
                    </li>
                    
            </ul>
           </div>
           <h1>please enter the details and save details</h1>
           <div class="row">
            <div class="mx-auto col-10 col-md-8 col-lg-6">
            <form class="container">
            
            <label for=" ">Enter name</label>
          <input type="text" class="form-control" name="name" placeholder="Enter Name"/>
          
           </br>
           
            <label for=" ">Enter type</label>
          <input type="password" class="form-control" name="password" placeholder="Enter password"/>
          </br>
          
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