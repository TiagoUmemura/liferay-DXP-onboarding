<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.liferay.portal.kernel.service.RegionServiceUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.model.Region" %>
<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="amfUser-web.caption"/></b>
</p>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="/registration/addUser" var="addUserURL"></portlet:actionURL>

<%
	List<Region> regions = (List<Region>) renderRequest.getAttribute("regions");
%>

<liferay-ui:error key="InvalidFirstName" message="InvalidFirstName" />
<liferay-ui:error key="InvalidLastName" message="InvalidLastName" />
<liferay-ui:error key="InvalidEmail" message="InvalidEmail" />
<liferay-ui:error key="InvalidUserName" message="InvalidUserName" />
<liferay-ui:error key="InvalidBirthday" message="InvalidBirthday" />
<liferay-ui:error key="InvalidHomePhone" message="InvalidHomePhone" />
<liferay-ui:error key="InvalidMobilePhone" message="InvalidMobilePhone" />
<liferay-ui:error key="InvalidAddress1" message="InvalidAddress1" />
<liferay-ui:error key="InvalidAddress2" message="InvalidAddress2" />
<liferay-ui:error key="InvalidState" message="InvalidState" />
<liferay-ui:error key="InvalidCity" message="InvalidCity" />
<liferay-ui:error key="InvalidZipCode" message="InvalidZipCode" />
<liferay-ui:error key="InvalidSecurityQuestion" message="InvalidSecurityQuestion" />
<liferay-ui:error key="InvalidSecurityAnswer" message="InvalidSecurityAnswer" />
<liferay-ui:error key="InvalidAcceptedTou" message="InvalidAcceptedTou" />
<liferay-ui:error key="InvalidPassword1" message="InvalidPassword1" />
<liferay-ui:error key="InvalidPassword2" message="InvalidPassword2" />

<aui:form action="<%= addUserURL %>" name="<portlet:namespace />fm">
	<aui:row>
		<aui:col md="12" sm="12">
		<h4>Basic Info</h4>
		</aui:col>

		<aui:col md="6" sm="6">
			<aui:input name="first_name" label="First Name"></aui:input>
		</aui:col>

		<aui:col md="6" sm="6">
			<aui:input name="last_name" label="Last Name"></aui:input>
		</aui:col>

		<aui:col md="6" sm="6">
			<aui:input name="email_address" label="Email address"></aui:input>
		</aui:col>

		<aui:col md="6" sm="6">
			<aui:input name="username" label="Username"></aui:input>
		</aui:col>

		<aui:col md="6" sm="6">
			<aui:select name="gender">
				<aui:option value="male">Male</aui:option>
				<aui:option value="female">Female</aui:option>
			</aui:select>
		</aui:col>

		<aui:col md="6" sm="6">
			<aui:input name="birthday"></aui:input>
		</aui:col>

		<aui:col md="6" sm="6">
			<aui:input name="password1" label="Password"></aui:input>
		</aui:col>

		<aui:col md="6" sm="6">
			<aui:input name="password2" label="Confirm password"></aui:input>
		</aui:col>
	</aui:row>

	</br>

	<aui:row>
		<aui:col md="12" sm="12">
			<h4>Phone</h4>
		</aui:col>

		<aui:col md="6" sm="6">
			<aui:input name="home_phone" label="Home Phone"></aui:input>
		</aui:col>

		<aui:col md="6" sm="6">
			<aui:input name="mobile_phone" label="Mobile Phone"></aui:input>
		</aui:col>
	</aui:row>

	</br>

	<aui:row>
		<aui:col md="12" sm="12">
			<h4>Billing Address</h4>
		</aui:col>

		<aui:col md="6" sm="6">
			<aui:input name="address1" label="Address1"></aui:input>
		</aui:col>

		<aui:col md="6" sm="6">
			<aui:input name="address2" label="Address2"></aui:input>
		</aui:col>

		<aui:col md="5" sm="5">
			<aui:input name="city" label="City"></aui:input>
		</aui:col>

		<aui:col md="4" sm="4">
			<aui:select label="State" id="state" name="state" showEmptyOption="true">
				<c:forEach var="region" items="<%= regions %>">
					<aui:option value="${region.getRegionId()}">${region.getName()}</aui:option>
				</c:forEach>
			</aui:select>
		</aui:col>

		<aui:col md="3" sm="3">
			<aui:input name="zip" label="Zip Code"></aui:input>
		</aui:col>
	</aui:row>

	</br>

	<aui:row>
		<aui:col md="12" sm="12">
			<h4>Misc.</h4>
		</aui:col>

		<aui:col md="12" sm="12">
			<aui:select name="security_question" label="Security Question">
				<aui:option value="1">What is your mother's maiden name?</aui:option>
				<aui:option value="2">What is the make of your first car?</aui:option>
				<aui:option value="3">What is your high school mascot?</aui:option>
				<aui:option value="4">Who is your favorite actor?</aui:option>
			</aui:select>
		</aui:col>

		<aui:col md="12" sm="12">
			<aui:input name="security_answer" label="Answer"></aui:input>
		</aui:col>

		<aui:col md="12" sm="12">
			<aui:input name="accepted_tou" label="text-checkbox" type="checkbox"></aui:input>
		</aui:col>
	</aui:row>


	<aui:button-row>
		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
	</aui:button-row>
</aui:form>