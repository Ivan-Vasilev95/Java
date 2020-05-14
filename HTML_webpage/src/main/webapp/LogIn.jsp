<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="CSS/RegistrationCSS.css">
<title>Log in</title>
</head>
<body>
	<jsp:include page="TopBar.jsp" />
	<form action="LogInServlet" method="POST">
		<h1>Влезте в системата</h1>
		<div class="section">
			<font style="margin-top: 40px">Потребителско име:</font>
			<p>
				<input id="email" type="email" name="email" size="100"
					placeholder="Въведете имейл адрес"
					oninvalid="alert('Трябва да въведете имейл!')" required>
			<p>
				<font style="margin-top: 20px">Парола:</font>
			<p>
				<input id="pass" type="password" name="pass" size="100"
					placeholder="Въведете парола"
					oninvalid="alert('Трябва да въведете парола!')" required>
			<p>
				<button>Вход</button>
		</div>
	</form>
</body>
</html>