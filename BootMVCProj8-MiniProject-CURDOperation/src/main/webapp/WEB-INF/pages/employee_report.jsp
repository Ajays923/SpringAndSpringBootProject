<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
	<c:when test="${!empty empList}">
		<table border="1" bgcolor="cyan"  align="center">
			<tr bgcolor="pink">
				<th>eno</th><th>ename</th><th>desg</th><th>salary</th><th>deptNo</th><th>operation</th>
			</tr>
			
			<c:forEach var="emp" items="${empList}">
				<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.job}</td>
				<td>${emp.sal}</td>
				<td>${emp.deptno}</td>
				<td><a href="edit_employee?eno=${emp.empno}"><img src="images/edit1.png" width="50" height="50">&nbsp;&nbsp;</a></td>
				<td><a href="delete_employee?eno=${emp.empno}" onclick="confirm('Do you want to delete')"><img src="images/delete.png" width="50" height="50"></a></td>	
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color:red;text-align:center">Record not found</h1>
	</c:otherwise>
</c:choose>

<blink><h1 style="color:green;text-align:center">${resultMsg}</h1></blink>

<br>
<br>
<h1 style="text-align:center"><a href="insert_employee">Add Employee <img src="images/add.png"></a></h1>

<br>
<br>
<h1 style="text-align:center"><a href="./">home <img src="images/home.png"/></a></h1>
