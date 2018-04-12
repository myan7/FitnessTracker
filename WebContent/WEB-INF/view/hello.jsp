<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="welcome.text"></spring:message></title>
</head>
<body>
	<h1>${hello}</h1>
	<a href="addM">click me to go to add minutes page</a>
</body>
</html>