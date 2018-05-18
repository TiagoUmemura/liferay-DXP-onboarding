package amfEventMonitor.web.portlet.portlet;

import amfEventMonitor.web.portlet.constants.AmfEventMonitorPortletKeys;

import com.liferay.docs.amfRegistrationService.service.AmfAuditLogLocalService;
import com.liferay.docs.amfRegistrationService.service.AmfAuditLogService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;

/**
 * @author tiago
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=amf-event-monitor-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AmfEventMonitorPortletKeys.AmfEventMonitor,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AmfEventMonitorPortlet extends MVCPortlet {
	@Reference
	private volatile AmfAuditLogLocalService _amfAuditLogLocalService;

	private AmfAuditLogLocalService getAmfAuditLogLocalService() { return _amfAuditLogLocalService;}

	@Reference
	private volatile AmfAuditLogService _amfAuditLogService;

	private AmfAuditLogService getAmfAuditLogService() { return _amfAuditLogService;}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User currentUser = themeDisplay.getUser();
		int count,countRegistration,countLoginAndLogout;
		boolean viewAllEventsPermission = false;

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(getClass().getName(), renderRequest);
			viewAllEventsPermission = getAmfAuditLogService().checkPermission(serviceContext);
		} catch (PortalException e) {
			e.printStackTrace();
		}

		if(viewAllEventsPermission){
			count = getAmfAuditLogLocalService().getAmfAuditLogsCount();
			countRegistration = getAmfAuditLogLocalService().countByRegistration();
			countLoginAndLogout = getAmfAuditLogLocalService().countByLoginAndLogout();
		}else{
			count = getAmfAuditLogLocalService().countByUserId(currentUser.getUserId());
			countRegistration = getAmfAuditLogLocalService().countByRegistration(currentUser.getUserId());
			countLoginAndLogout = getAmfAuditLogLocalService().countByLoginAndLogout(currentUser.getUserId());
		}

		renderRequest.setAttribute("viewAllEventsPermission", viewAllEventsPermission);
		renderRequest.setAttribute("count", count);
		renderRequest.setAttribute("countRegistration", countRegistration);
		renderRequest.setAttribute("countLoginAndLogout", countLoginAndLogout);
		renderRequest.setAttribute("currentUser", currentUser);
		super.render(renderRequest, renderResponse);
	}
}