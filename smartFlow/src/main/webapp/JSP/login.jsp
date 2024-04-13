<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Smart Flow - Login</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/CSS/login-style.css">
</head>
<body>
    <div class="container">
        <div class="image-container">
            <img class="front" src="<%= request.getContextPath() %>/IMAGE/ananlysis.jpeg" alt="image">
        </div>
        <div class="form-container">
            <img class ="logo-image" src="<%= request.getContextPath() %>/IMAGE/smartflow.png">
            <h2 class ="welcome-text"> Welcome to Smart Flow </h2>
            <h4 class="login-text">Sign in</h4>
            <form action="login" method="post" >
                <div class="input-group">
                    <label for="username">Username</label>
                    <input class="input"type="text"  >
                </div>
                <div class="input-group">
                    <label for="password">Password</label>
                    <input class="input" type="password" id="password" name="password" >
                </div>
                <div class="btn">
               		 <button type="submit">Sign in</button>
                </div>
            </form>
    </div>
</body>
</html>
    