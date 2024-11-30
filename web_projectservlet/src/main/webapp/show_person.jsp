<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body>
<%--Obtaining the bean of type Person with id:person --%>
<jsp:useBean id="personObj" class="example.bean.Person" scope="session" />

<%--Retriving the values of the bean properties and printing them  --%>
<h1>Person Details</h1>
<h2>Name <jsp:getProperty property="name" name="personObj"/></h2>
<h2>Age <jsp:getProperty property="age" name="personObj"/></h2>
<h2>Weight <jsp:getProperty property="weight" name="personObj"/></h2>
</body>
</html>