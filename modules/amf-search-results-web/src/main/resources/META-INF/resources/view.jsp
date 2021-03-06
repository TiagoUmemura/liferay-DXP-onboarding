<%@ include file="/init.jsp" %>

<%
	String zipCode = (String) request.getAttribute("zipCode");
%>

<p>
	<b><liferay-ui:message key="amf-search-results-web.caption"/></b>
</p>

<liferay-ui:search-container delta="5" emptyResultsMessage="No results" total="${count}">
	<liferay-ui:search-container-results
		results="<%= AmfSearchLocalServiceUtil.findUserByZipCode(zipCode ,searchContainer.getStart(), searchContainer.getEnd())%>"
	/>

	<liferay-ui:search-container-row className="AmfUserSearchDTO" modelVar="amfUserSearch">
		<liferay-ui:search-container-column-text name="First Name" value="<%= amfUserSearch.getFirstName() %>" />
		<liferay-ui:search-container-column-text name="Username" value="<%= amfUserSearch.getUserName() %>" />
		<liferay-ui:search-container-column-text name="Email Address" value="<%= amfUserSearch.getEmailAddress() %>" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>