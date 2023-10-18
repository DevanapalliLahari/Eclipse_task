<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Temple</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>

        <div class="navbar navbar-expand-sm btn  btn-warning navbar-succes">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="Temple.jsp">Temple </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Home</a>
                    </li>
                   
            </ul>
           </div>
   <table class="table table-bordered" >
   <tr>
   <th>Name</th>
   <th>Place</th>
   <th>Main God</th>
   <th>Cons Year</th>
   <th>Cons By</th>
   </tr>
   <c:forEach items="${view }" var="DTO">
   <tr>
   <td>${DTO.name}</td>
   <td>${DTO.place}</td>
   <td>${DTO.mainGod}</td>
   <td>${DTO. constYear}</td>
   <td>${DTO.constBy}</td>
   </tr>
   </c:forEach>
   </table>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>

</body>
</html>