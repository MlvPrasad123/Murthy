<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Chapter1</title>
</head>
<body>
Hello world
<c:forEach var="prasad" items="${Sai}">
${prasad}
</br>
</c:forEach>

hello sai
</body>
</html>