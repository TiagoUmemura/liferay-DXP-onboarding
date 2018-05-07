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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link amfRegistrationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see amfRegistrationLocalService
 * @generated
 */
@ProviderType
public class amfRegistrationLocalServiceWrapper
	implements amfRegistrationLocalService,
		ServiceWrapper<amfRegistrationLocalService> {
	public amfRegistrationLocalServiceWrapper(
		amfRegistrationLocalService amfRegistrationLocalService) {
		_amfRegistrationLocalService = amfRegistrationLocalService;
	}

	@Override
	public void addAMFUser(
		com.liferay.docs.amfRegistrationService.model.AMFUser user)
		throws com.liferay.portal.kernel.exception.PortalException {
		_amfRegistrationLocalService.addAMFUser(user);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _amfRegistrationLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.service.UserServiceUtil getUserService() {
		return _amfRegistrationLocalService.getUserService();
	}

	@Override
	public amfRegistrationLocalService getWrappedService() {
		return _amfRegistrationLocalService;
	}

	@Override
	public void setWrappedService(
		amfRegistrationLocalService amfRegistrationLocalService) {
		_amfRegistrationLocalService = amfRegistrationLocalService;
	}

	private amfRegistrationLocalService _amfRegistrationLocalService;
}