<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="RegistrationCSS.css"> 
<title>Registration</title>
</head>
<body>
<form action="RegistrationInfo" method="GET">
<h1>Създаване на Профил</h1>
<div class="section">
<font style="margin-top:40px">Имe:</font>
<p>
<input id="name" type="text" size="100" name ="name" placeholder="Въведете име за контанкт" >
<p>
<font style="margin-top:20px">Потребителско име:</font>
<p>
<input id="email" type=email name ="email" size="100" placeholder="Въведете имейл" >
<p>
<font style="margin-top:20px">Парола:</font>
<p>
<input id="pass" type="password" size="100" name ="pass" placeholder="Въведете парола с поне 8 символа" >
<p>
<font style="margin-top:20%">Повторете парола:</font>
<p>
<input id="check_pass" type="password" size="100" name ="check_pass" placeholder="Въведете парола с поне 8 символа" >
<p>
<button>Регистрация</button>
</div>
</form>
</body>
</html>