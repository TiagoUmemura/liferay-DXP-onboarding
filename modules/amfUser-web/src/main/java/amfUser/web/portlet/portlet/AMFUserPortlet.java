package amfUser.web.portlet.portlet;

import amfUser.web.portlet.constants.AMFUserPortletKeys;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Country;
import com.liferay.portal.kernel.model.Region;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.liferay.portal.kernel.service.CountryService;
import com.liferay.portal.kernel.service.RegionService;
import com.liferay.portal.kernel.servlet.SessionErrors;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.List;

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
	private volatile CountryService _countryService;

	private CountryService getCountryService() { return _countryService; }

	@Reference
	private volatile RegionService _regionService;

	private RegionService getRegionService() { return _regionService; }


	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		Country country = null;
		try {
			country = getCountryService().getCountryByA2("US");
		} catch(PortalException ex) {
			SessionErrors.add(renderRequest, "error");
			super.render(renderRequest, renderResponse);
			return;
		}

		List<Region> regions = getRegionService().getRegions(country.getCountryId());

		renderRequest.setAttribute("regions", regions);

		super.render(renderRequest, renderResponse);
	}
}