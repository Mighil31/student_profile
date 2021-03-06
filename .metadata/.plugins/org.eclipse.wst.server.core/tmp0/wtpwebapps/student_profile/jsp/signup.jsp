<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign up</title>
    <style><%@include file="../styles/signup.css"%></style>
</head>
<body>
    <header>
        <div class="Logo">
            <a href="./login.html">
                <svg width="48" height="36" viewBox="0 0 48 36" fill="none" xmlns="http://www.w3.org/2000/svg"> <path d="M20.64 0.755644C21.6903 0.258094 22.8379 0 24 0C25.1622 0 26.3098 0.258094 27.36 0.755644L46.856 9.99164C47.1956 10.1524 47.4831 10.4055 47.6855 10.7221C47.8879 11.0387 47.997 11.4059 48.0003 11.7816C48.0037 12.1573 47.9011 12.5264 47.7044 12.8465C47.5077 13.1667 47.2247 13.4249 46.888 13.5916L27.488 23.2156C26.404 23.7535 25.2102 24.0334 24 24.0334C22.7899 24.0334 21.5961 23.7535 20.512 23.2156L4.00002 15.0236V23.9996C4.00002 24.5301 3.78931 25.0388 3.41423 25.4139C3.03916 25.7889 2.53045 25.9996 2.00002 25.9996C1.46959 25.9996 0.96088 25.7889 0.585807 25.4139C0.210734 25.0388 2.03059e-05 24.5301 2.03059e-05 23.9996V11.9996V11.8996C-0.0185743 11.5043 0.0800979 11.1122 0.283639 10.7727C0.48718 10.4333 0.786511 10.1615 1.14402 9.99164L20.64 0.751644V0.755644ZM8.00002 21.4756V27.9996C8.00008 28.2627 8.05204 28.5232 8.15294 28.7662C8.25384 29.0092 8.40169 29.2299 8.58802 29.4156L8.59602 29.4276L8.68802 29.5116L8.92802 29.7356C10.1816 30.8529 11.5368 31.8506 12.976 32.7156C15.648 34.3196 19.508 35.9996 24 35.9996C28.492 35.9996 32.352 34.3196 35.028 32.7156C36.4672 31.8506 37.8225 30.8529 39.076 29.7356L39.316 29.5116L39.38 29.4476L39.404 29.4236L39.408 29.4196L39.416 29.4156C39.6016 29.2296 39.7487 29.0087 39.8489 28.7658C39.9492 28.5228 40.0005 28.2625 40 27.9996V21.4716L29.264 26.7996C27.6279 27.6111 25.8263 28.0332 24 28.0332C22.1737 28.0332 20.3722 27.6111 18.736 26.7996L8.00002 21.4716V21.4756Z" fill="#0FBCF9"/> </svg>
            </a>
        </div>
        <p>Student Profile</p>
    </header>
     
    <div id="signupForm">
        <div class="title">
            Signup
        </div>
        <p class="errorMessage">${errMessage}</p>
        <form action="signup" method="post" class="inputFields">
            <div class="input-field">
                <input type="text" name="userName" id="uname" required />
                <label for="uname">Username</label>
             </div>
              <div class="input-field">
                  <input type="password" name="password" id="pwd" required />
                  <label for="pwd">Password</label>
              </div>
              <div class="input-field">
                <input type="password" id="cnfpwd" name="cnfpassword" required />
                <label for="cnfpwd">Confirm password</label>
            </div>
            <div class="input-field">
                <input type="text" id="email" name="email" required />
                <label for="email">Email</label>
            </div>
            <div class="input-field">
                <input type="text" id="City" name="location" required />
                <label for="City">City</label>
            </div>
            <button type="submit">
                Register
            </button>
            
        </form>
    </div>
  

</body>
</html>