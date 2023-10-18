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
<body>
<form action="product" method="post">
        <div class="navbar navbar-expand-sm btn  btn-success navbar-succes">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">Product </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="vendor.jsp">Vendor</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="player.jsp">Player</a>
                    </li>
            </ul>
           </div>
           <div class="row">
            <div class="mx-auto col-10 col-md-8 col-lg-6">
            <form class="container">
             <div class="form-group">
            <label for=" ">Enter name</label>
          <input type="text" class="form-control" name="Name" placeholder="Enter name"/>
          </div>
           <div class="form-group">
           <label for=" ">Enter price</label>
          <input type="number" class="form-control" name="price" placeholder="Enter price"/>
          </div>
           <div class="form-group">
           <label for=" ">Enter type</label>
           <input type="text" class="form-control" name="type" placeholder="Enter the Type"/>
           </div>
            <div class="form-group">
           <label for=" ">Enter quantity</label>
           <input type="number" class="form-control" name="quantity" placeholder="Enter the Quantity"/>
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