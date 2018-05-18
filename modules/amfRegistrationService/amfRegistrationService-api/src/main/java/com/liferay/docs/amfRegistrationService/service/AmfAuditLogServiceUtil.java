/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.amfRegistrationService.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for AmfAuditLog. This utility wraps
 * {@link com.liferay.docs.amfRegistrationService.service.impl.AmfAuditLogServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AmfAuditLogService
 * @see com.liferay.docs.amfRegistrationService.service.base.AmfAuditLogServiceBaseImpl
 * @see com.liferay.docs.amfRegistrationService.service.impl.AmfAuditLogServiceImpl
 * @generated
 */
@ProviderType
public class AmfAuditLogServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.amfRegistrationService.service.impl.AmfAuditLogServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean checkPermission(
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.security.auth.PrincipalException {
		return getService().checkPermission(serviceContext);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static AmfAuditLogService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AmfAuditLogService, AmfAuditLogService> _serviceTracker =
		ServiceTrackerFactory.open(AmfAuditLogService.class);
}