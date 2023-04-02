<%@page language="java" contentType="text/html" isELIgnored="false" %>
<html>
<head>
<title>Hello World</title></head>
<body>
<h1>Welcome!!</h1>
<%out.println("id "+request.getAttribute("id")+"<br>");
out.println("name "+request.getAttribute("name"));%>
<p>ID:<b>${id}</b></p>
<p>NAME:<b>${name}</b></p>
<p>Employee:<b>${employee}</b></p>
</body></html>