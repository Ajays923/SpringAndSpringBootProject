<%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color:red;text-align:cetner">Marriage Seeker Registration</h1>

<form:form modelAttribute="profile" enctype="multipart/form-data">
	<table align="center" bgcolor="cyan">
		<tr>
			<td>Marriage Seeker name :: </td>
			<td><form:input path="profileName"/></td>
		</tr>
		<tr>
		<td>Marriage Seeker gender:: </td>
		     <td>
				<form:radiobutton path="gender" value="Male"/>Male &nbsp;&nbsp;
				<form:radiobutton path="gender" value="Female"/>FeMale
			</td>
			<tr>
			<td>Select Resume:: </td>
			<td><form:input type="file" path="resume"/></td>
		</tr>
			<tr>
			<td>Select photo:: </td>
			<td><form:input type="file" path="photo"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="register"/></td>
			<td><input type="reset" value="Cancel"/></td>
		</tr>
		
	</table>
</form:form>