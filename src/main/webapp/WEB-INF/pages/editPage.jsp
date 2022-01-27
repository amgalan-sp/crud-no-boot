<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<c:url value="/edit" var="var"/>
<form action="${var}" method="POST">
    <input type="hidden" name="id" value="${user.id}">
    <label for="name">Name</label>
    <input type="text" name="name" id="name">
    <label for="lastname">Lastname</label>
    <input type="text" name="lastname" id="lastname">
    <label for="age">Age</label>
    <input type="text" name="age" id="age">
    <input type="submit" value="Edit user">
</form>
</body>
</html>
