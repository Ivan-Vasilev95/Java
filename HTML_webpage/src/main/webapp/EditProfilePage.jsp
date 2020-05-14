<%@page import="Entity.User"%>
<%@page import="Entity.Skills"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="head.jsp" />
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="CSS/web_pageCSS.css">
<title>Insert title here</title>
</head>
<body>
	<%
		User user = (User) session.getAttribute("user");
		response.setContentType("text/html;charset=UTF-8");
	%>
	<jsp:include page="TopBar.jsp" />
	<form class="user-info" enctype="application/x-www-form-urlencoded">
		<input type="hidden" name="id" value="<%=user.getId()%>" />
		<div class="section1">
			<h1 style="width: 30%">
				<img src="image/avatar.png" style="width: 70%; margin-left: 65px">
			</h1>
			<h2 style="width: 70%">
				<font size="4" color="#012e5e"> Профилна информация</font><a
					class="button" style="margin-left: 10px; font-size: 10px"
					href="user?id=<%=user.getId()%>">Профилна страница</a><br> <font
					size="2" color="#012e5e"> Име: <input type="text"
					value="<%=user.getName()%>" name="name" /><br>Работа: <input
					type="text" value="<%=user.getJob()%>" name="job" /> <br> <textarea
						style="width: 100%; height: 100px" name="info"><%=user.getInfo()%>></textarea>
				</font>
			</h2>
		</div>
		<button type="button" onclick="postUserInfo()"
			style="margin-left: 25%">Запази</button>
		<span id="user_info_message" style="color: blue; size: 2"></span><br>
	</form>
	<form class="user-skill" enctype="application/x-www-form-urlencoded">
		<input type="hidden" name="id" value="<%=user.getId()%>" />
		<div class="a">
			<font size="6" color="#012e5e">Умения</font>
		</div>
		<div class="section">
			<font size="4" color="blue"
				style="margin-left: 50px; margin-top: 100px; margin-left: 65px">Професионални</font>
			<br>
			<%
				int index = 1;
				for (Skills skill : user.getJobSkills()) {
			%>
			<input type="text" size="100" name="Jskillname<%=index%>"
				value="<%=skill.getName()%>"> <br> <input type="range"
				min="0" max="100" step="5" value="<%=skill.getValue()%>"
				name="Jskillvalue<%=index%>" /> <br>

			<%
				index++;
				}
			%>
			<br> <br> <font size="4" color="blue"
				style="margin-left: 50px; margin-top: 100px;">Лични</font> <br>
			<%
				index = 1;
				for (Skills skill : user.getPersonalSkills()) {
			%>
			<input type="text" size="100" name="Pskillname<%=index%>"
				value="<%=skill.getName()%>"> <br> <input type="range"
				min="0" max="100" step="5" value="<%=skill.getValue()%>"
				name="Pskillvalue<%=index%>" /> <br>

			<%
				index++;
				}
			%>
		</div>
		<button type="button" onclick="postUserSkill()"
			style="margin-left: 25%">Запази</button>
		<span id="user_skill_message" style="color: blue; size: 2"></span><br>
	</form>
	<hr />
	<form class="user-address" enctype="application/x-www-form-urlencoded">
		<input type="hidden" name="id" value="<%=user.getId()%>" />
		<div class="a">
			<font size="6" color="#012e5e">Контакти</font>
		</div>
		<div class="section">
			<font size="2" color="blue" style="margin: 20px">Имейл<font
				size="2" color="blue" style="margin: 400px">Град</font></font> <br> 
				<input type="email" value="<%=user.getEmail()%>" name="email" /> 
				<input type="text" value="<%=user.getAddress().getName()%>"
				name="addressName" style="margin-left: 300px" /> <br> 
				<font size="2" color="blue" style="margin: 20px">Телефон<font
				size="2" color="blue" style="margin: 390px">Улица</font></font> <br> 
				<input type="text" value="<%=user.getPhone()%>" name="phone" /> 
				<input type="text" value="<%=user.getAddress().getStreet()%>"
				name="addressStreet" style="margin-left: 300px" />
		</div>
		<button type="button" onclick="postUserAddress()"
			style="margin-left: 25%">Запази</button>
		<span id="user_address_message" style="color: blue; size: 2"></span><br>
	</form>
	<div class="bottomborder"></div>
</body>
</html>