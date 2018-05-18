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

package com.liferay.docs.amfRegistrationService.service.impl;

import com.liferay.docs.amfRegistrationService.service.base.AmfAuditLogServiceBaseImpl;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.ServiceContext;


/**
 * The implementation of the amf audit log remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.amfRegistrationService.service.AmfAuditLogService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AmfAuditLogServiceBaseImpl
 * @see com.liferay.docs.amfRegistrationService.service.AmfAuditLogServiceUtil
 */
public class AmfAuditLogServiceImpl extends AmfAuditLogServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.docs.amfRegistrationService.service.AmfAuditLogServiceUtil} to access the amf audit log remote service.
	 */
	public boolean checkPermission(ServiceContext serviceContext) throws PrincipalException {
		PermissionChecker permissionChecker = getPermissionChecker();
		boolean viewAllEventsPermission = permissionChecker.hasPermission(serviceContext.getScopeGroupId(), serviceContext.getRootPortletId(), CLASS_PK, PERMISSION_NAME);
		return viewAllEventsPermission;
	}

	private static final long CLASS_PK = 0;
	private static final String PERMISSION_NAME = "VIEW_ALL_EVENTS";
}