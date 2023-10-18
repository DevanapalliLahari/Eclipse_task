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
<form action="airport" method="post">
        <div class="navbar navbar-expand-sm btn  btn-success navbar-succes">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">Airport </a>
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
          <input type="text" class="form-control" name="name" placeholder="Enter name"/>
          </div>
           <div class="form-group">
           <label for=" ">Enter Country</label>
          <input type="text" class="form-control" name="country" placeholder="Enter country"/>
          </div>
           <div class="form-group">
           <label for=" ">Enter Type</label>
           <input type="text" class="form-control" name="type" placeholder="Enter the Type"/>
           </div>
            <div class="form-group">
           <label for=" ">Enter City</label>
           <input type="text" class="form-control" name="city" placeholder="Enter City"/>
           </div>
           <div class="form-group">
           <label for=" ">Enter Capacity</label>
           <input type="number" class="form-control" name="capacity" placeholder="Enter Capacity"/>
           </div>
           <div class="form-group">
           <label for=" ">Enter Width</label>
           <input type="number" class="form-control" name="width" placeholder="Enter Width"/>
           </div>
           <div class="form-group">
           <label for=" ">Total Terminal</label>
           <input type="number" class="form-control" name="terminal" placeholder="Total Terminal"/>
           </div>
           <div class="form-group">
           <label for=" ">Enter Open Date</label>
           <input type="date" class="form-control" name="open date" placeholder="Enter Open Date"/>
           </div>
           <div class="form-group">
           <label for=" ">Operation</label>
           <input type="text" class="form-control" name="operation" placeholder="Operation"/>
           </div>
           <div class="form-group">
           <label for=" ">Inagrauted By</label>
           <input type="text" class="form-control" name="ingrauted" placeholder="Ingrauted By"/>
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