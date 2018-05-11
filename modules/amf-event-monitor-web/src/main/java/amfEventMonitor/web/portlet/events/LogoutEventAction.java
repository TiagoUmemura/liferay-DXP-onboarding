package amfEventMonitor.web.portlet.events;

import com.liferay.docs.amfRegistrationService.dto.AmfAuditLogDTO;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.PortalUtil;
import org.osgi.service.component.annotations.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Component(
        immediate = true,
        property = {
                "key=logout.events.post"
        },
        service = LifecycleAction.class
)
public class LogoutEventAction implements LifecycleAction{
    @Override
    public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
        HttpServletRequest request = lifecycleEvent.getRequest();
        try {
            User user = PortalUtil.getUser(request);

            long userId = user.getUserId();
            String userName = user.getScreenName();
            String ipAddress = request.getRemoteAddr();
            String eventType = LOGOUT_EVENT;
            Date dateTime = new Date();

            AmfAuditLogDTO amfAuditLogDTO = new AmfAuditLogDTO(userId, userName, ipAddress, eventType, dateTime);
        } catch (PortalException e) {
            e.printStackTrace();
        }
    }
    public static final String LOGOUT_EVENT = "LOGOUT";
}
