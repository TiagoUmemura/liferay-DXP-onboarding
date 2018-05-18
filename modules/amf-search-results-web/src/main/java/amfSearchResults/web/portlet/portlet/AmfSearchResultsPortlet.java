package amfSearchResults.web.portlet.portlet;

import amfSearchResults.web.portlet.constants.AmfSearchResultsPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import org.osgi.service.component.annotations.Component;

import java.io.IOException;

/**
 * @author tiago
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=amf-search-results-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AmfSearchResultsPortletKeys.AmfSearchResults,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supported-processing-event=producermessage;http://aditya.com"
	},
	service = Portlet.class
)
public class AmfSearchResultsPortlet extends MVCPortlet {
	private String zipCode = "0";

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		super.render(renderRequest, renderResponse);
	}

	@ProcessEvent(qname="{http://aditya.com}producermessage")
	public void getZipCodeIPC(EventRequest request, EventResponse response){
		Event event = request.getEvent();
		String zipCode = (String) event.getValue();
		request.setAttribute("zipCode", zipCode);
	}
}