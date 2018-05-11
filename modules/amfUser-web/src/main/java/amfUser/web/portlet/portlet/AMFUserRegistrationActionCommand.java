package amfUser.web.portlet.portlet;

import amfUser.web.portlet.constants.AMFUserPortletKeys;
import com.liferay.docs.amfRegistrationService.dto.AMFUser;
import com.liferay.docs.amfRegistrationService.exceptions.RegistrationException;
import com.liferay.docs.amfRegistrationService.service.amfRegistrationLocalService;
import com.liferay.docs.amfRegistrationService.service.amfRegistrationLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.text.ParseException;
import java.util.Locale;

@Component(immediate = true,
         property = { "javax.portlet.name=" + AMFUserPortletKeys.AMFUser,
                      "mvc.command.name=/registration/addUser"
                    },
        service = MVCActionCommand.class)
public class AMFUserRegistrationActionCommand extends BaseMVCActionCommand{

    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
        String firtName = ParamUtil.getString(actionRequest, "first_name");
        String lastName = ParamUtil.getString(actionRequest, "last_name");
        String emailAddress = ParamUtil.getString(actionRequest, "email_address");
        String username = ParamUtil.getString(actionRequest, "username");
        String gender = ParamUtil.getString(actionRequest, "gender");
        String birthday = ParamUtil.getString(actionRequest, "birthday");
        String password1 = ParamUtil.getString(actionRequest, "password1");
        String password2 = ParamUtil.getString(actionRequest, "password2");

        String homePhone = ParamUtil.getString(actionRequest, "home_phone");
        String mobilePhone = ParamUtil.getString(actionRequest, "mobile_phone");

        String address1 = ParamUtil.getString(actionRequest, "address1");
        String address2 = ParamUtil.getString(actionRequest, "address2");
        String city = ParamUtil.getString(actionRequest, "city");
        String state = ParamUtil.getString(actionRequest, "state");
        String zip = ParamUtil.getString(actionRequest, "zip");

        String securityQuestion = ParamUtil.getString(actionRequest, "security_question");
        String securityAnswer = ParamUtil.getString(actionRequest, "security_answer");
        boolean acceptedTou = ParamUtil.getBoolean(actionRequest, "accepted_tou");

        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
        long companyId = themeDisplay.getCompanyId();
        Locale locale = themeDisplay.getLocale();

        AMFUser user = new AMFUser(firtName,lastName,emailAddress,username,gender,birthday,password1,password2,homePhone,mobilePhone,address1,address2,city,state,zip,securityQuestion,securityAnswer,acceptedTou, companyId, locale);



        try {
            SessionErrors.clear(actionRequest);
            //getAmfLocalService().addAMFUser(user);
            amfRegistrationLocalServiceUtil.addAMFUser(user);

        } catch (RegistrationException e) {
            //Add error messages if there are invalid values on some field
            for (String error: e.getErrors()) {
                SessionErrors.add(actionRequest, error);
            }
        } catch (PortalException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

//    @Reference
//    private volatile amfRegistrationLocalService _amfLocalService;
//
//    public amfRegistrationLocalService getAmfLocalService() { return _amfLocalService; }
}
