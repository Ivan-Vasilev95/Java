<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<link rel="stylesheet" href="CSS/TopBar.css">
<header style="background-color: #012e5e; height: 100px; margin-left: -10px; margin-right: -10px; margin-top: -10px">
	<div>
		<a type="submit" href="" class="button" style="margin-left:20px; font-size:10px">Вход</a> 
			<a type="submit" href="Registration.jsp" class="button" style="font-size:10px">Регистрация</a> 
			<a type="submit" href="usersList" class="button" style="font-size:10px">Потребители</a>
		<form action="logout" method="POST">
			<input type="submit" value="Изход" style="margin-top:20px; margin-left:20px; width:100px; font-size:10px" />
		</form>
	</div>
</header>