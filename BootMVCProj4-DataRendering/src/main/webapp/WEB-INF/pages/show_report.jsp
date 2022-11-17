<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- <h1 style="color:red;text-align:center">Reading Simple Values</h1>

<b>name : ${name} </b><br>
<b>age : ${age}</b><br>
<b>address : ${address} </b> --%>

<%-- 
<h1 style="color:red;text-align:center">Reading Array, Collections Values</h1>

<b>nick Names (array) ::</b><br>
<c:forEach var="name" items="${nickNames}">
	${name}<br>
</c:forEach>
<hr>
<b>Mobile Nos (Set) ::</b><br>
<c:forEach var="ph" items="${phonesInfo}">
	${ph}<br>
</c:forEach>
<hr>
<b>Courses (List) ::</b><br>
<c:forEach var="course" items="${coursesInfo}">
	${course}<br>
</c:forEach>

<hr>
<b>Id Info (Map) ::</b><br>
<c:forEach var="id" items="${idsMap}">
	${id.key}===>${id.value} <br>
</c:forEach>
 --%>

<%-- <h1 style="color:red;text-align:center">Reading List of Model Values</h1>

<table border="1" align="center">
		<tr>
			<th>eno</th><th>Name</th><th>Desg</th><th>Salary</th>
		</tr>
		
		<c:forEach var="emp" items="${empsInfo}">
			<tr>
				<td>${emp.eno} </td>
				<td>${emp.ename} </td>
				<td>${emp.desg} </td>
				<td>${emp.salary} </td>
			</tr>
		</c:forEach>
</table> --%>

<h1 style="color:red;text-align:center">Reading Model Obj Values</h1>

<b>emp no:: ${empInfo.eno}</b><br>
<b>emp name:: ${empInfo.ename}</b><br>
<b>emp desg:: ${empInfo.desg}</b><br>
<b>emp Salary:: ${empInfo.salary}</b>
