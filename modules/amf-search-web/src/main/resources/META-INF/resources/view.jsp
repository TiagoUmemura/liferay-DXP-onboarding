<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ include file="/init.jsp" %>

<portlet:actionURL name="/search/searchByZip" var="searchURL"></portlet:actionURL>

<aui:form method="post" action="${searchURL}" name="searchForm">

	<aui:col md="12" sm="12">
		<aui:input name="zip_code" label="Enter US Zip"></aui:input>
	</aui:col>

	<aui:button-row>
		<aui:button name="Search" value="Search" type="submit"></aui:button>
	</aui:button-row>
</aui:form>