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
 * Provides a wrapper for {@link AmfAuditLogService}.
 *
 * @author Brian Wing Shun Chan
 * @see AmfAuditLogService
 * @generated
 */
@ProviderType
public class AmfAuditLogServiceWrapper implements AmfAuditLogService,
	ServiceWrapper<AmfAuditLogService> {
	public AmfAuditLogServiceWrapper(AmfAuditLogService amfAuditLogService) {
		_amfAuditLogService = amfAuditLogService;
	}

	@Override
	public boolean checkPermission(
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.security.auth.PrincipalException {
		return _amfAuditLogService.checkPermission(serviceContext);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _amfAuditLogService.getOSGiServiceIdentifier();
	}

	@Override
	public AmfAuditLogService getWrappedService() {
		return _amfAuditLogService;
	}

	@Override
	public void setWrappedService(AmfAuditLogService amfAuditLogService) {
		_amfAuditLogService = amfAuditLogService;
	}

	private AmfAuditLogService _amfAuditLogService;
}