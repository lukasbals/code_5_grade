<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Movie Line</title>
<script src="./res/js/jquery-1.11.1.min.js"></script>
<script src="./res/js/jquery-ui.min.js"></script>
<link href="./res/css/bootstrap.min.css" rel="stylesheet">
<script>
	$(function() {
		$("#access-button").click(
				function() {
					alert("IN");
					var movieTitle = $("#movie-title").val();
					movieTitle = movieTitle.replace(/\s/g, "+");
			$.ajax({
						// 				dataType:'json',
						// 				contentType : 'application/json',
						type : 'GET',
						url : 'http://omdbapi.com/?t=' + movieTitle,
						statusCode : {
							200 : function(data) {
								//alert("works");
								if (data.Error) {
									alert("Film nicht gefunden");
								}
								console.log(data);
								$("#output").html(
										"<div>" + data.Title + " / "
												+ data.Country + " / "
												+ data.Genre + "</div>");
								var postData = {};
								postData.title = data.Title;
// 								$.ajax({
// 									type : 'POST',
<%-- 									url : '<%=request.getContextPath()%>/rest/' --%>
// 																	+ movieTitle,
// 															data : JSON
// 																	.stringify(postData),
// 															statusCode : {
// 																200 : function(
// 																		data) {
// 																	//alert("works");
// 																	if (data.Error) {
// 																		alert("Insert hat nicht funktioniert!");
// 																	}
// 																	console
// 																			.log(data);

// 																}
// 															}
// 														});
											}
										},
										beforeSend : function() {
											//alert("before");
											$("#loadIcon").toggle();
										},
										complete : function() {
											// Handle the complete event
											$("#loadIcon").fadeToggle();
										}
									});
						});
	});
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1>
					Film-Suchmaschine <small>Bier schmeckt gut</small>
				</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-md-8">
				<input id="movie-title" class="form-control"
					placeholder="Filmtitel eingeben ..."></input>
			</div>
			<div class="col-md-4">
				<button id="access-button" type="button" class="btn btn-default">Suchen!</button>
			</div>
		</div>
		<div id="output"></div>
		<!-- 		<div class="row"> -->
		<!-- 			<div class="col-md-4"> -->
		<!-- 				<button id="getUbuntuDB-button" type="button" class="btn btn-default">GetUbuntuDB!</button> -->
		<!-- 			</div> -->
		<!-- 		</div> -->
	</div>
</body>
</html>