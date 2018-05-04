<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="amfUser-web.caption"/></b>
</p>

<portlet:renderURL var="addEntryURL">
	<portlet:param name="mvcPath" value="/edit_entry.jsp"></portlet:param>
</portlet:renderURL>

<aui:button-row>
	<aui:button value="Register" onClick="<%= addEntryURL.toString() %>" ></aui:button>
</aui:button-row>