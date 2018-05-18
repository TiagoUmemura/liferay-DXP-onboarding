package amfSearch.web.portlet.portlet;

import amfSearch.web.portlet.constants.AmfSearchPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.xml.namespace.QName;

@Component(immediate = true,
        property = { "javax.portlet.name=" + AmfSearchPortletKeys.AmfSearch,
                "mvc.command.name=/search/searchByZip",
                "javax.portlet.supported-publishing-event=producermessage;http://aditya.com"
        },
        service = MVCActionCommand.class)
public class AmfSearchActionCommand extends BaseMVCActionCommand {
    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
        String zipCode = ParamUtil.getString(actionRequest, "zip_code");
        QName qName = new QName("http://aditya.com", "producermessage");
        actionResponse.setEvent(qName, zipCode);
    }
}
