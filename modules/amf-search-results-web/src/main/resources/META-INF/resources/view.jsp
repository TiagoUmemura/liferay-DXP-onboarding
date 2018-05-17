<%@ page import="com.liferay.docs.amfRegistrationService.service.AmfSearchLocalServiceUtil" %>
<%@ page import="com.liferay.docs.amfRegistrationService.dto.AmfUserSearchDTO" %>
<%@ include file="/init.jsp" %>

<%
	int count = AmfSearchLocalServiceUtil.countUserByZipCode("54321");
%>

<p>
	<b><liferay-ui:message key="amf-search-results-web.caption"/></b>
</p>

<liferay-ui:search-container delta="20" emptyResultsMessage="No results" total="<%= count %>">
	<liferay-ui:search-container-results
		results="<%= AmfSearchLocalServiceUtil.findUserByZipCode("54321",searchContainer.getStart(), searchContainer.getEnd())%>"
	/>

	<liferay-ui:search-container-row className="AmfUserSearchDTO" modelVar="amfUserSearch">
		<liferay-ui:search-container-column-text name="First Name" value="<%= amfUserSearch.getFirstName() %>" />
		<liferay-ui:search-container-column-text name="Username" value="<%= amfUserSearch.getUserName() %>" />
		<liferay-ui:search-container-column-text name="Email Address" value="<%= amfUserSearch.getEmailAddress() %>" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>