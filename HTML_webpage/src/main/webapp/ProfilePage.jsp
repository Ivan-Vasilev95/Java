<%@page import="Entity.User"%>
<%@page import="Entity.Skills"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//<jsp:useBean id="user" class="Entity.User" scope="session"></jsp:useBean>
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="CSS/web_pageCSS.css">
<title>Insert title here</title>
</head>
<body>
	<%
		User user = (User) request.getAttribute("user");
		User sessionuser = (User) session.getAttribute("user");
	%>
	<jsp:include page="TopBar.jsp" />
	<%
		if (request.getAttribute("message") == null) {
	%>

	<div class="a">
		<form action="cookie" method="POST">
			<h5>Добър ден с ТУ Варна</h5>
			<input type="submit" value="Затвори" />
		</form>
	</div>
	<%
		}
	%>
	<form action="user" method="GET"
		enctype="application/x-www-form-urlencoded">
		<div class="section1">
			<h1 style="width: 30%">
				<img src="image/avatar.png" style="width: 70%; margin-left: 65px">
			</h1>
			<h2 style="width: 70%">
				<font size="4" color="#012e5e"> Профилна информация <br></font>
				<font size="2" color="#012e5e"> Име: <%=user.getName()%><br>Работа:
					<%=user.getJob()%><br><%=user.getInfo()%>
				</font>
			</h2>
		</div>
		<%
			if (user.getId() == sessionuser.getId()) {
		%>
		<div class="w3-container">
			<a class="button" href="user?id=<%=user.getId()%>&action=edit"
				style="margin-left: 80%; font-size:10px">Edit</a>
		</div>
		<%
			}
		%>
		<div class="a">
			<font size="6" color="#012e5e">Умения</font>
		</div>
		<div class="section">
			<font size="4" color="blue"
				style="margin-left: 50px; margin-top: 100px; margin-left: 65px">Професионални</font>
			<br>
			<%
				for (Skills skill : user.getJobSkills()) {
			%>
			<font size="2" color="blue" style="margin: 10px"><%=skill.getName()%></font>
			<br>
			<progress max="100" value=<%=skill.getValue()%>></progress>
			<br>

			<%
				}
			%>
			<br> <br> <font size="4" color="blue"
				style="margin-left: 50px; margin-top: 100px;">Лични</font> <br>
			<%
				for (Skills skill : user.getPersonalSkills()) {
			%>
			<font size="2" color="blue" style="margin: 10px"><%=skill.getName()%></font>
			<br>
			<progress max="100" value=<%=skill.getValue()%>></progress>
			<br>

			<%
				}
			%>
		</div>
		<hr />
		<div class="a">
			<font size="6" color="#012e5e">Контакти</font>
		</div>
		<div class="section">
			<font size="2" color="blue" style="margin: 20px">Имейл<font
				size="2" color="blue" style="margin: 400px">Град</font></font> <br> <font
				size="2" color="yellow" style="margin: 20px"><%=user.getEmail()%><font
				size="2" color="yellow" style="margin: 350px"><%=user.getAddress().getName()%></font></font>
			<br> <font size="2" color="blue" style="margin: 20px">Телефон<font
				size="2" color="blue" style="margin: 390px">Улица</font></font> <br> <font
				size="2" color="yellow" style="margin: 20px"><%=user.getPhone()%><font
				size="2" color="yellow" style="margin: 370px"><%=user.getAddress().getStreet()%></font></font>
		</div>
		<div class="bottomborder"></div>

	</form>
</body>
</html>