<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<h1 style="color:blue;text-align:center"><spring:message code="cust.reg.title"/></h1>

<form:form modelAttribute="cust">
		<table align="center" bgcolor="cyan">
			<tr>
				<td><spring:message code="cust.reg.name"/></td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td><spring:message code="cust.reg.addrs"/></td>
				<td><form:input path="cadd"/></td>
			</tr>
			<tr>
				<td><spring:message code="cust.reg.billAmt"/></td>
				<td><form:input path="billAmt"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="<spring:message code="cust.reg.submit"/>"></td>
			</tr>
		</table>
</form:form>
<br><br>
<p style="text-align:center">
	<a href="?lang=en_US">English</a>&nbsp;&nbsp;
	<a href="?lang=fr_FR">French</a>&nbsp;&nbsp;
	<a href="?lang=de_DE">German</a>&nbsp;&nbsp;
	<a href="?lang=hi_IN">Hindi</a>&nbsp;&nbsp;
	<a href="?lang=zh_CH">Chinese</a>&nbsp;&nbsp;
	<a href="?lang=mr_IN">Marathi</a>&nbsp;&nbsp;
</p>

