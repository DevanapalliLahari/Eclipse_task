<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Temple</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>

<form action="save" method="post">

        <div class="navbar navbar-expand-sm btn  btn-warning navbar-succes">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">Temple </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                    <a class="nav-link" href="view">view</a>
                     </li>
            </ul>
           </div>
           <h1>Total Items:${total}</h1>
           
           <div class="row">
            <div class="mx-auto col-10 col-md-8 col-lg-6">
            <form class="container">
            
            <label for=" ">Enter name</label>
          <input type="text" class="form-control" name="name" placeholder="Enter Name"/>
          
           </br>
           
            <label for=" ">Enter place</label>
          <input type="text" class="form-control" name="place" placeholder="Enter Place"/>
          </br>
          
            <label for=" ">Enter Main God</label>
          <input type="text" class="form-control" name="mainGod" placeholder="Enter Main God"/>
          </br>
           Cons Year: <select name="year">
						<option>Select option</option>
						<option value="1982">1982</option>
						<option value="1983">1983</option>
						<option value="1984">1984</option>
						<option value="1985">1985</option>
						<option value="1986">1986</option>
						<option value="1987">1987</option>
						<option value="1988">1988</option>
						<option value="1989">1989</option>
						<option value="1990">1990</option>
						<option value="1991">1991</option>
					</select>
					</br>
          <label for=" ">Enter Cons By</label>
          <input type="text" class="form-control" name="constBy" placeholder="Enter Cons By"/>
          </br>
           
           
           <button type="submit" class="btn btn-info">Save</button>
           </form>
           </div>
           </div>

</form>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous">
		</script>
</body>
</html>