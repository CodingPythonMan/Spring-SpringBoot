<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Form Errors</title>
</head>
<body>
	<h2>Errors Result</h2>
	<table>
		<tr>
			<td>유저ID</td>
			<td>${member.userId }</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${member.userName }</td>
		</tr>
		<tr>
			<td>E-Mail</td>
			<td>${member.email }</td>
		</tr>
	</table>
</body>
</html>