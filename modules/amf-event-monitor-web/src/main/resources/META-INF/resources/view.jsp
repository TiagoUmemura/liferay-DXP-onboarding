<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ page import="com.liferay.docs.amfRegistrationService.service.AmfAuditLogLocalServiceUtil" %>
<%@ page import="com.liferay.docs.amfRegistrationService.model.AmfAuditLog" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="amf-event-monitor"/></b>
</p>

<%
	int count = AmfAuditLogLocalServiceUtil.getAmfAuditLogsCount();
	int countRegistration = AmfAuditLogLocalServiceUtil.countByRegistration();
	int countLoginAndLogout = AmfAuditLogLocalServiceUtil.countByLoginAndLogout();
%>

<liferay-ui:tabs names="All,Registration,Login" refresh="false" tabsValues="All,Registration,Login">

	<liferay-ui:section>
		<liferay-ui:search-container delta="20" emptyResultsMessage="No results" total="<%= count %>">

			<liferay-ui:search-container-results
					results="<%= AmfAuditLogLocalServiceUtil.getAmfAuditLogs(searchContainer.getStart(), searchContainer.getEnd()) %>"
			/>

			<liferay-ui:search-container-row className="AmfAuditLog" keyProperty="amfAuditLogId" modelVar="log">
				<%
					SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
				%>
				<liferay-ui:search-container-column-text name="Time" value="<%= dateFormat.format(log.getDateTime()) %>" />
				<liferay-ui:search-container-column-text name="Username" value="<%= String.format("%s (%d)", log.getUserName(), log.getUserId()) %>" />
				<liferay-ui:search-container-column-text name="IP Address" property="ipAddress" />
				<liferay-ui:search-container-column-text name="Event type" property="eventType" />

			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator />
		</liferay-ui:search-container>
	</liferay-ui:section>

	<liferay-ui:section>
		<liferay-ui:search-container delta="20" emptyResultsMessage="No results" total="<%= countRegistration %>">
			<liferay-ui:search-container-results
					results="<%= AmfAuditLogLocalServiceUtil.findByRegistration(searchContainer.getStart(), searchContainer.getEnd()) %>"
			/>
			<liferay-ui:search-container-row className="AmfAuditLog" keyProperty="amfAuditLogId" modelVar="log">

				<%
					SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
				%>
				<liferay-ui:search-container-column-text name="Time" value="<%= dateFormat.format(log.getDateTime()) %>" />
				<liferay-ui:search-container-column-text name="Username" value="<%= String.format("%s (%d)", log.getUserName(), log.getUserId()) %>" />
				<liferay-ui:search-container-column-text name="IP Address" property="ipAddress" />
				<liferay-ui:search-container-column-text name="Event type" property="eventType" />

			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator />
		</liferay-ui:search-container>
	</liferay-ui:section>

	<liferay-ui:section>
		<liferay-ui:search-container delta="20" emptyResultsMessage="No results" total="<%= countLoginAndLogout %>">
			<liferay-ui:search-container-results
					results="<%= AmfAuditLogLocalServiceUtil.findByLoginAndLogout(searchContainer.getStart(), searchContainer.getEnd()) %>"
			/>
			<liferay-ui:search-container-row className="AmfAuditLog" keyProperty="amfAuditLogId" modelVar="log">

				<%
					SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
				%>
				<liferay-ui:search-container-column-text name="Time" value="<%= dateFormat.format(log.getDateTime()) %>" />
				<liferay-ui:search-container-column-text name="Username" value="<%= String.format("%s (%d)", log.getUserName(), log.getUserId()) %>" />
				<liferay-ui:search-container-column-text name="IP Address" property="ipAddress" />
				<liferay-ui:search-container-column-text name="Event type" property="eventType" />

			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator />
		</liferay-ui:search-container>
	</liferay-ui:section>

</liferay-ui:tabs>
