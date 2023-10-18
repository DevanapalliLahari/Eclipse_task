<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Collecting information</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<form action="player" method="post">
		<div class="navbar navbar-expand-sm btn  btn-success navbar-succes">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="#">Player </a></li>
				<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="product.jsp">Product</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="vendor.jsp">Vendor</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="airport.jsp">Airport</a>
				</li>
			</ul>
		</div>
		<div class="row">
			<div class="mx-auto col-10 col-md-8 col-lg-6">
				<form class="container">
					<div class="form-group">
						<label for=" ">Enter name</label> <input type="text"
							class="form-control" name="name" placeholder="Enter name" />
					</div>
					<div class="form-group">
						<label for=" ">Enter Sport</label> <input type="text"
							class="form-control" name="sport" placeholder="Enter sport" />
					</div>
					<div class="form-group">
						<label for=" ">Enter Country</label> <input type="text"
							class="form-control" name="country" placeholder="Enter Country" />
					</div>
					<div class="form-group">
						<label for=" ">Enter Wife</label> <input type="text"
							class="form-control" name="wife" placeholder="Enter wife" />
					</div>
					<select class="form-select" aria-label="Default select example" name="married">
						<option selected>Select option</option>
						<option value="married">Married</option>
						<option value="single">Single</option>
					</select>
					
					<select class="form-select" aria-label="Default select example" name="alive">
						<option selected>Alive</option>
						<option value="yes">Yes</option>
						<option value="no">No</option>
					</select>
					<div class="form-check">
						<label class="form-check-label" for="">Gender
						<div class="form-check form-check-inline">
						
							<input class="form-check-input" type="radio" name="gender"
								id="male" value="Male"> <label class="form-check-label"
								for="">Male</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="female" value="Female"> <label
								class="form-check-label" for="">Female</label>
						
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="others" value="Others"> <label
								class="form-check-label" for="">Others</label>
						</div>
						</label>
						</div>

						<div class="form-group">
							<label for=" ">Enter DOB</label> <input type="date"
								class="form-control" name="dob" placeholder="Enter DOB" />
						</div>
						<div class="form-group">
							<label for=" ">Enter Father Name</label> <input type="text"
								class="form-control" name="father name"
								placeholder="Enter Father Name" />
						</div>
						<div class="form-group">
						<label for=" ">Enter Mother Name</label> <input type="text"
							class="form-control" name="mother name"
							placeholder="Enter Mother Name" />
					</div>
					<div class="form-group">
					<label for=" ">Enter Jersey No</label> <input type="number"
						class="form-control" name="jersey no" placeholder="Enter Jersey No" />
			</div>
			<div class="form-group">
			<label for=" ">Enter Captain Name</label> <input type="text"
				class="form-control" name="captain name"
				placeholder="Enter captain Name" />
		</div>
		<div class="form-group">
		<label for=" ">Enter Coach Name</label> <input type="text"
			class="form-control" name="coach name" placeholder="Enter Coach Name" />
		</div>
		<div class="form-group">
		<label for=" ">Enter Age</label> <input type="number"
			class="form-control" name="age" placeholder="Enter Age" />
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