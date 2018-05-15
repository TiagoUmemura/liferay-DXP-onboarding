<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.liferay.docs.amfRegistrationService.service.AmfAuditLogLocalServiceUtil" %>
<%@ page import="com.liferay.docs.amfRegistrationService.model.AmfAuditLog" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.liferay.portal.kernel.model.User" %>
<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="amf-event-monitor"/></b>
</p>

<%
	boolean hasPermission = (boolean)request.getAttribute("viewAllEventsPermission");
	User currentUser = themeDisplay.getUser();

	int count,countRegistration,countLoginAndLogout;

	if(hasPermission) {
		count = AmfAuditLogLocalServiceUtil.getAmfAuditLogsCount();
		countRegistration = AmfAuditLogLocalServiceUtil.countByRegistration();
		countLoginAndLogout = AmfAuditLogLocalServiceUtil.countByLoginAndLogout();
	}else{
	    count = AmfAuditLogLocalServiceUtil.countByUserId(currentUser.getUserId());
	    countRegistration = AmfAuditLogLocalServiceUtil.countByRegistration(currentUser.getUserId());
	    countLoginAndLogout = AmfAuditLogLocalServiceUtil.countByLoginAndLogout(currentUser.getUserId());
	}
%>

<liferay-ui:tabs names="All,Registration,Login" refresh="false" tabsValues="All,Registration,Login">
	<liferay-ui:section>
		<liferay-ui:search-container delta="20" emptyResultsMessage="No results" total="<%= count %>">
			<c:choose>
				<c:when test="<%= hasPermission %>">
					<liferay-ui:search-container-results
						results="<%= AmfAuditLogLocalServiceUtil.getAmfAuditLogs(searchContainer.getStart(), searchContainer.getEnd()) %>"
					/>
				</c:when>
				<c:otherwise>
					<liferay-ui:search-container-results
						results="<%= AmfAuditLogLocalServiceUtil.findByUserId(currentUser.getUserId(), searchContainer.getStart(), searchContainer.getEnd()) %>"
					/>
				</c:otherwise>
			</c:choose>

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
				<c:choose>
					<c:when test="<%= hasPermission %>">
						<liferay-ui:search-container-results
							results="<%= AmfAuditLogLocalServiceUtil.findByRegistration(searchContainer.getStart(), searchContainer.getEnd()) %>"
						/>
					</c:when>
					<c:otherwise>
						<liferay-ui:search-container-results
							results="<%= AmfAuditLogLocalServiceUtil.findByRegistration(currentUser.getUserId(), searchContainer.getStart(), searchContainer.getEnd()) %>"
						/>
					</c:otherwise>
				</c:choose>
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
				<c:choose>
					<c:when test="<%= hasPermission %>">
						<liferay-ui:search-container-results
							results="<%= AmfAuditLogLocalServiceUtil.findByLoginAndLogout(searchContainer.getStart(), searchContainer.getEnd()) %>"
						/>
					</c:when>
					<c:otherwise>
						<liferay-ui:search-container-results
							results="<%= AmfAuditLogLocalServiceUtil.findByLoginAndLogout(currentUser.getUserId(), searchContainer.getStart(), searchContainer.getEnd()) %>"
						/>
					</c:otherwise>
				</c:choose>
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
