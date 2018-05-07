package amfUser.web.portlet.portlet;

import amfUser.web.portlet.constants.AMFUserPortletKeys;

import com.liferay.docs.amfRegistrationService.service.amfRegistrationLocalService;
import com.liferay.docs.amfRegistrationService.service.amfRegistrationLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author tiago
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=amf-registration",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AMFUserPortletKeys.AMFUser,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AMFUserPortlet extends MVCPortlet {

	@Reference
	private volatile amfRegistrationLocalService _amfLocalService;

	public amfRegistrationLocalService getAmfLocalService() { return _amfLocalService; }

	public void addUser(ActionRequest request, ActionResponse response) {
		String firtName = ParamUtil.getString(request, "first_name");
		String lastName = ParamUtil.getString(request, "last_name");
		String emailAddress = ParamUtil.getString(request, "email_address");
		String username = ParamUtil.getString(request, "username");
		String gender = ParamUtil.getString(request, "gender");
		String birthday = ParamUtil.getString(request, "birthday");
		String password1 = ParamUtil.getString(request, "password1");
		String password2 = ParamUtil.getString(request, "password2");

		String homePhone = ParamUtil.getString(request, "home_phone");
		String mobilePhone = ParamUtil.getString(request, "mobile_phone");

		String address1 = ParamUtil.getString(request, "address1");
		String address2 = ParamUtil.getString(request, "address2");
		String city = ParamUtil.getString(request, "city");
		String state = ParamUtil.getString(request, "state");
		String zip = ParamUtil.getString(request, "zip");

		String securityQuestion = ParamUtil.getString(request, "security_question");
		String securityAnswer = ParamUtil.getString(request, "security_answer");
		boolean acceptedTou = ParamUtil.getBoolean(request, "accepted_tou");
		
	}
}