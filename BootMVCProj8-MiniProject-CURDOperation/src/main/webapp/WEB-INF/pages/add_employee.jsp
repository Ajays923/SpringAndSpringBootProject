<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1 style="color:green;text-align:center">Register Employee</h1>

<form:form modelAttribute="emp">
	<table border="0" bgcolor="cyan" align="center">
		<tr>
				<td>Employee name::</td>
				<td> <form:input path="ename"/></td>
		</tr>
		<tr>
				<td>Employee Desg::</td>
				<td> <form:input path="job"/></td>
		</tr>
		<tr>
				<td>Employee salary::</td>
				<td> <form:input path="sal"/></td>
		</tr>
		<tr>
				<td>Employee Dept no::</td>
				<td> <form:input path="deptno"/></td>
		</tr>
		
		<tr>
				<td><input type="image" src="images/submit.png" width="100" height="100"> </td>
				<td> <button type="reset"><img src="images/delete.png" width="100" height="100"></button></td>
		</tr>
	</table>
</form:form>

