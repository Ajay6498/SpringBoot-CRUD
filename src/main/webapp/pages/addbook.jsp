<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="added" modelAttribute="book" method="POST" >
		<table>
		    <tr>
				<td>Book Id :</td>
				<td><form:input path="bookId" /></td>
			</tr>
		    <tr>
				<td>Book Name :</td>
				<td><form:input path="bookName" /></td>
			</tr>

			<tr>
				<td>Book Author :</td>
				<td><form:input path="bookAuthor" /></td>
			</tr>
			<tr>
				<td>Book Price :</td>
				<td><form:input path="bookPrice" /></td>
			</tr>
			
			</tr>
			<tr>
			<td><input type="submit" value="Add"/></td>
			 
			</tr>
			<tr><a href="showbook"> Show All Books</a></tr>
			 
			 
		</table>
 </form:form>

</body>
</html>