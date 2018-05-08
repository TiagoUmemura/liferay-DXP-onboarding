<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="amfUser-web.caption"/></b>
</p>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addUser" var="addUserURL"></portlet:actionURL>

<liferay-ui:error key="InvalidFirstName" message="InvalidFirstName" />
<liferay-ui:error key="InvalidLastName" message="InvalidLastName" />

<aui:form action="<%= addUserURL %>" name="<portlet:namespace />fm">
	<aui:fieldset>
		<h4>Basic Info</h4>

		<aui:input name="first_name" label="First Name"></aui:input>
		<aui:input name="last_name" label="Last Name"></aui:input>
		<aui:input name="email_address" label="Email address"></aui:input>
		<aui:input name="username" label="Username"></aui:input>
		<aui:select name="gender">
			<aui:option value="male">Male</aui:option>
			<aui:option value="female">Female</aui:option>
		</aui:select>
		<aui:input name="birthday"></aui:input>
		<aui:input name="password1" label="Password"></aui:input>
		<aui:input name="password2" label="Confirm password"></aui:input>

		</br>

		<h4>Phone</h4>
		<aui:input name="home_phone" label="Home Phone"></aui:input>
		<aui:input name="mobile_phone" label="Mobile Phone"></aui:input>

		</br>

		<h4>Billing Address</h4>
		<aui:input name="address1" label="Address1"></aui:input>
		<aui:input name="address2" label="Address2"></aui:input>
		<aui:input name="city" label="City"></aui:input>
		<aui:input name="state" label="State"></aui:input>
		<aui:input name="zip" label="Zip Code"></aui:input>

		</br>

		<h4>Misc.</h4>
		<aui:select name="security_question" label="Security Question">
			<aui:option value="1">What is your mother's maiden name?</aui:option>
			<aui:option value="2">What is the make of your first car?</aui:option>
			<aui:option value="3">What is your high school mascot?</aui:option>
			<aui:option value="4">Who is your favorite actor?</aui:option>
		</aui:select>
		<aui:input name="security_answer" label="Answer"></aui:input>

		<aui:input name="accepted_tou" label="text-checkbox" type="checkbox"></aui:input>

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
	</aui:button-row>
</aui:form>