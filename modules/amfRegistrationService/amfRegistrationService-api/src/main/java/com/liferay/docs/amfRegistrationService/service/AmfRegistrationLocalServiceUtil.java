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
 * Provides the local service utility for AmfRegistration. This utility wraps
 * {@link com.liferay.docs.amfRegistrationService.service.impl.AmfRegistrationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AmfRegistrationLocalService
 * @see com.liferay.docs.amfRegistrationService.service.base.AmfRegistrationLocalServiceBaseImpl
 * @see com.liferay.docs.amfRegistrationService.service.impl.AmfRegistrationLocalServiceImpl
 * @generated
 */
@ProviderType
public class AmfRegistrationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.amfRegistrationService.service.impl.AmfRegistrationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static void addAMFUser(
		com.liferay.docs.amfRegistrationService.dto.AMFUser user)
		throws com.liferay.portal.kernel.exception.PortalException,
			java.text.ParseException {
		getService().addAMFUser(user);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static AmfRegistrationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AmfRegistrationLocalService, AmfRegistrationLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AmfRegistrationLocalService.class);
}