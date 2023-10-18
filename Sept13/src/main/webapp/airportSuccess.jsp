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
        <div class="navbar navbar-expand-sm btn  btn-success navbar-succes">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">airportSuccess </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="airport.jsp">Airport</a>
                    </li>
            </ul>
           </div>
   <h1>Airport send Successfully</h1>
   <p>Name :${Name }</p>
   <p>Country:${Country }</p>
   <p>Type:${Type}</p>
   <p>City:${City }</p>
   <p>Capacity:${Capacity }</p>
   <p>Width:${Width }</p>
   <p>Terminal:${Terminal }</p>
   <p>Open:${Open }</p>
   <p>Operation:${Operation }</p>
   <p>Ingrauted:${Ingrauted }</p>
   
   <script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>

</body>
</html>