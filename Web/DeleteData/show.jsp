<%@page import="java.util.ArrayList"%>
<%@page import="demo.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<th>Roll No</th><th>Name</th><th>Action</th>
 <%
 ArrayList<Student> arr1 = (ArrayList<Student>)session.getAttribute("data");
 for (Student student : arr1) {
	 out.print("<tr>");
	 out.print("<td>");
	 out.print(student.rollNo+":");
	 out.print("</td>");
	 out.print("<td>");
	out.print(student.stuNm);
	out.print("</td>");
	out.print("<td>");
	out.print("<a href='DeleteServlet?id="+student.rollNo+"'>Delete</a>");
	out.print("</td>");
	out.print("</tr>");
	}

%>
</table>
</body>
</html>