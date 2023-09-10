<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
 


<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="addbook"> Add New Book</a>
	    ${show}
	
	  
	<%-- <table border="1">

		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Author</th>
				<th>Price</th>

			</tr>

		</thead>
		<tbody>
			<c:forEach items="${show}" var="show">
				<tr>
					<td>${show.bookId}</td>
					<td>${show.bookName}</td>
					<td>${show.bookAuthor}</td>
					<td>${show.bookPrice}</td>

				</tr>
			</c:forEach>
		</tbody>

	</table>   --%>

	<%-- <table border="1">
		<thead>
			<tr>
				<td>Book Id</td> 
				<td>Book Name</td>
				<td>Book Author</td>
				<td>Book Price</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="show" items="${show}">
				<tr>
					<td>${show.bookId}</td>
					<td>${show.bookName}</td>
					<td>${show.bookAuthor}</td>
					<td>${show.bookPrice}</td>
				</tr>
			</c:forEach>
		</tbody>
		
		 
		 <tr><a href="addbook"> Return to Add Page</a></tr>
	</table> --%>
	
	
	<%-- Refered by eclipse ide springApp project
	
	<table border="1">
		<thead>
			<th>Skill Id</th>
			<th>Skill Name</th>
			<th>Action </th>
		</thead>
		
		<c:forEach items="${skillList}" var="cr"> 
		  <tr>
		    <td>${cr.skillId}</td>
		    <td>${cr.skillName}</td>
		    <td>
		    <a href="/springApp/skills/edit/<c:out value="${cr.skillId}"></c:out>">EDIT</a>
		    <a href="/springApp/skills/delete/<c:out value="${cr.skillId}"></c:out>">DELETE</a>
		    
		    
		    </td>
		  </tr>
		</c:forEach>
	</table>  --%>

</body>
</html>