<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="Entity.User"%>
<%@page import="java.util.HashSet"%>
<%@page import="Data.Repository"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="TopBar.jsp" />
	<%
		Repository repo = Repository.getInstance();
	%>

	<div>
		<table style="margin-left:-10px; margin-right:-10px">
			<tr>
				<th bgcolor="#ffb606">Потребител</th>
				<th bgcolor="#ffb606">Работа</th>
				<th bgcolor="#ffb606">Информация</th>
			</tr>
			<%
				for (User user : repo.getUsers()) {
			%>

			<tr>
				<td bgcolor="#ffb606"><a href="user?id=<%=user.getId()%>"><%=user.getName()%></a></td>
				<td bgcolor="#ffb606"><%=user.getJob()%></td>
				<td bgcolor="#ffb606"><%=user.getInfo()%></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
	<jsp:include page="BottomBar.jsp" />
</body>
</html>