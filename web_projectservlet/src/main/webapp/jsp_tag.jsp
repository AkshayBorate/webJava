<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import = "java.time.LocalDate"%>
<!DOCTYPE html>
<html>
<body>
	<%--Including the resources : color.html --%>
	<%@include file="color.html"%>
	<%-- using a declaration section to declare a variable and define a method --%>

	<%!int val = 7;

	public String sayWelcome(String name) {
		String message = "Welcome " + name;
		return message;
	}%>
	<%--Starting a for loop using Scriplet --%>
	<%
	for (int a = 1; a <= 5; a++) {
	%>
	<h1>Hello</h1>
	<%
	}
	%>
	<%--Fetching the value of variable :val using expression --%>
	
	<h2>Val = <%=val %></h2>
	<h2>Squqre of val = <%=(val * val) %></h2>
	
	<%--Invoking the method :sayWelcome() using expression --%>
	
	<h2>Replay from method is <%=sayWelcome("James") %></h2>
	<%--Creating a localDate object for system date --%>
	<%
	LocalDate today =LocalDate.now();
	%>
	<h2>Today's date is <%=today %></h2>
</body>
</html>