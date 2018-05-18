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

import com.liferay.docs.amfRegistrationService.dto.AmfAuditLogDTO;
import com.liferay.docs.amfRegistrationService.model.AmfAuditLog;
import com.liferay.docs.amfRegistrationService.service.base.AmfAuditLogLocalServiceBaseImpl;
import com.liferay.docs.amfRegistrationService.service.persistence.AmfAuditLogUtil;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;

import static com.liferay.portal.kernel.security.permission.PermissionThreadLocal.getPermissionChecker;

/**
 * The implementation of the amf audit log local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.amfRegistrationService.service.AmfAuditLogLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AmfAuditLogLocalServiceBaseImpl
 * @see com.liferay.docs.amfRegistrationService.service.AmfAuditLogLocalServiceUtil
 */
public class AmfAuditLogLocalServiceImpl extends AmfAuditLogLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.docs.amfRegistrationService.service.AmfAuditLogLocalServiceUtil} to access the amf audit log local service.
	 */

	public void addAuditLogEvent(AmfAuditLogDTO amfAuditLogDTO){
		AmfAuditLog amfAuditLog = amfAuditLogPersistence.create(counterLocalService.increment(AmfAuditLog.class.getName()));

		amfAuditLog.setUserId(amfAuditLogDTO.getUserId());
		amfAuditLog.setUserName(amfAuditLogDTO.getUserName());
		amfAuditLog.setIpAddress(amfAuditLogDTO.getIpAddress());
		amfAuditLog.setDateTime(amfAuditLogDTO.getDateTime());
		amfAuditLog.setEventType(amfAuditLogDTO.getEventType());

		amfAuditLogPersistence.update(amfAuditLog);
	}

	public List<AmfAuditLog> findByUserId(long userId) {
		return AmfAuditLogUtil.findByuserId(userId);
	}

	public List<AmfAuditLog> findByUserId(long userId, int start, int end){
		return amfAuditLogPersistence.findByuserId(userId, start, end);
	}

	public List<AmfAuditLog> findByRegistration(int start, int end) {
		return amfAuditLogPersistence.findByeventType(REGISTRATION_EVENT, start, end);
	}

	public List<AmfAuditLog> findByRegistration(long userId, int start, int end) {
		return amfAuditLogPersistence.findByEventTypeAndUserId(REGISTRATION_EVENT, userId, start, end);
	}

	public List<AmfAuditLog> findByLoginAndLogout(int start, int end){
		String[] loginLogout = {LOGIN, LOGOUT};
		return amfAuditLogPersistence.findByeventType(loginLogout, start, end);
	}

	public List<AmfAuditLog> findByLoginAndLogout(long userId, int start, int end){
		String[] loginLogout = {LOGIN, LOGOUT};
		return amfAuditLogPersistence.findByEventTypeAndUserId(loginLogout, userId, start, end);
	}

	public int countByUserId(long userId){
		return amfAuditLogPersistence.countByuserId(userId);
	}

	public int countByRegistration(){
		return amfAuditLogPersistence.countByeventType(REGISTRATION_EVENT);
	}

	public int countByRegistration(long userId){
		return amfAuditLogPersistence.countByEventTypeAndUserId(REGISTRATION_EVENT, userId);
	}

	public int countByLoginAndLogout(){
		String[] loginLogout = {LOGIN, LOGOUT};
		return amfAuditLogPersistence.countByeventType(loginLogout);
	}

	public int countByLoginAndLogout(long userId){
		String[] loginLogout = {LOGIN, LOGOUT};
		return amfAuditLogPersistence.countByEventTypeAndUserId(loginLogout, userId);
	}


	private static final String LOGIN = "LOGIN";
	private static final String LOGOUT = "LOGOUT";
	private static final String REGISTRATION_EVENT = "REGISTRATION";

}