<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="CSS/RegistrationCSS.css">
<title>Registration</title>
</head>
<body>
	<jsp:include page="TopBar.jsp" />
	<form action="RegistrationServlet" method="POST">
		<h1>Създаване на Профил</h1>
		<div class="section">
			<font style="margin-top: 40px">Имe:</font>
			<p>
				<input id="name" type="text" size="100" name="name"
					placeholder="Въведете име за контанкт">
			<p>
				<font style="margin-top: 20px">Потребителско име:</font>
			<p>
				<input id="email" type=email name="email" size="100"
					placeholder="Въведете имейл"
					oninvalid="alert('Трябва да въведете имейл!')" required>
			<p>
				<font style="margin-top: 20px">Кратка информация:</font>
			<p>
				<textarea style="width: 100%; height: 50px" name="info"
					placeholder="Въведете кратка информация"></textarea>
			<p>
				<font style="margin-top: 20px">Работна позиция:</font>
			<p>
				<input id="job" type="text" size="100" name="job"
					placeholder="Въведете работна позиция">
			<p>
				<font style="margin-top: 20px">Телефонен номер:</font>
			<p>
				<input id="phone" type="text" size="100" name="phone"
					placeholder="Въведете телефонен номер">
			<p>
				<font style="margin-top: 20px">Адрес:</font>
			<p>
				<input id="citycddress" type="text" size="100" name="cityaddress"
					placeholder="Въведете град">
			<p>
				<input id="streataddress" type="text" size="100"
					name="streataddress" placeholder="Въведете улица">
			<p>
				<font style="margin-top: 20px">Професионални умения:</font>
			<p>
				<input id="Java" type="text" size="100" name="Jskill1"
					placeholder="Пример Java">
			<p>
				<input type="range" min="0" max="100" step="5" value="0"
					name="Jvalue1">
			<p>
				<input id="HTML" type="text" size="100" name="Jskill2"
					placeholder="Пример HTML">
			<p>
				<input type="range" min="0" max="100" step="5" value="0"
					name="Jvalue2">
			<p>
				<input id="CSS" type="text" size="100" name="Jskill3"
					placeholder="Пример CSS">
			<p>
				<input type="range" min="0" max="100" step="5" value="0"
					name="Jvalue3">
			<p>
				<input id="JavaScript" type="text" size="100" name="Jskill4"
					placeholder="Пример JavaScript">
			<p>
				<input type="range" min="0" max="100" step="5" value="0"
					name="Jvalue4">
			<p>
				<font style="margin-top: 20px">Лични умения:</font>
			<p>
				<input id="Communicative" type="text" size="100" name="Pskill1"
					placeholder="Пример Communicative">
			<p>
				<input type="range" min="0" max="100" step="5" value="0"
					name="Pvalue1">
			<p>
				<input id="Teamwork" type="text" size="100" name="Pskill2"
					placeholder="Пример Teamwork">
			<p>
				<input type="range" min="0" max="100" step="5" value="0"
					name="Pvalue2">
			<p>
				<input id="Creativity" type="text" size="100" name="Pskill3"
					placeholder="Пример Creativity">
			<p>
				<input type="range" min="0" max="100" step="5" value="0"
					name="Pvalue3">
			<p>
				<font style="margin-top: 20px">Парола:</font>
			<p>
				<input id="pass" type="password" size="100" name="pass"
					placeholder="Въведете парола с поне 8 символа"
					oninvalid="alert('Трябва да въведете парола!')" required>
			<p>
				<font style="margin-top: 20%">Повторете парола:</font>
			<p>
				<input id="check_pass" type="password" size="100" name="check_pass"
					placeholder="Въведете парола с поне 8 символа"
					oninvalid="alert('Трябва да въведете повторно паролата си!')"
					required>
			<p>
				<button>Регистрация</button>
		</div>
	</form>
</body>
</html>