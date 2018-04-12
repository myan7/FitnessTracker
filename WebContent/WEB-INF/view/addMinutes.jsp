<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="addMin.text" ></spring:message></title>
</head>
<body>
<h1><spring:message code ="addmin.title"></spring:message></h1>

Languages: <a href="?language=en">English</a> | <a href="?language=es">Español</a>
<form:form modelAttribute="exercise">
	<table>
		<tr>
			<td>
				<spring:message code="goal.text"></spring:message>
			</td>
			<td>
				<form:input path="minutes"/>
			</td>
		</tr>
		<tr>
			<td colspan = "2">
				<spring:message code="user.submit.ex" var="valSubmit"></spring:message> 
				<input type="submit" value = "${valSubmit}" />
			</td>
		</tr>
	</table>
</form:form>

<h1>Goal for today is ${goal.minutes}</h1>
</body>
</html>