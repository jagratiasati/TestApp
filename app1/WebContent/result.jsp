<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="com.nt.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello world</title>
</head>
<body>

	<%
		ArrayList<User> userList = (ArrayList<User>) request.getAttribute("userInfo");
	Iterator<User> iter = userList.iterator();
	while (iter.hasNext()) {

		User user = iter.next();
	%>
	<%=user.getFname()%>&nbsp;&nbsp;&nbsp;<%=user.getLname()%>&nbsp;&nbsp;&nbsp;<%=user.getGender()%>
	</br>
	<%
		}
	%>
</body>
</html>