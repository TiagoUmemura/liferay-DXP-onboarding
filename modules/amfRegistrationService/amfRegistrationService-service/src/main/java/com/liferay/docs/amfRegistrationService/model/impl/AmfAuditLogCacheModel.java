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

package com.liferay.docs.amfRegistrationService.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.amfRegistrationService.model.AmfAuditLog;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AmfAuditLog in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AmfAuditLog
 * @generated
 */
@ProviderType
public class AmfAuditLogCacheModel implements CacheModel<AmfAuditLog>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AmfAuditLogCacheModel)) {
			return false;
		}

		AmfAuditLogCacheModel amfAuditLogCacheModel = (AmfAuditLogCacheModel)obj;

		if (amfAuditLogId == amfAuditLogCacheModel.amfAuditLogId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, amfAuditLogId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{amfAuditLogId=");
		sb.append(amfAuditLogId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", dateTime=");
		sb.append(dateTime);
		sb.append(", eventType=");
		sb.append(eventType);
		sb.append(", ipAddress=");
		sb.append(ipAddress);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AmfAuditLog toEntityModel() {
		AmfAuditLogImpl amfAuditLogImpl = new AmfAuditLogImpl();

		amfAuditLogImpl.setAmfAuditLogId(amfAuditLogId);
		amfAuditLogImpl.setUserId(userId);

		if (userName == null) {
			amfAuditLogImpl.setUserName(StringPool.BLANK);
		}
		else {
			amfAuditLogImpl.setUserName(userName);
		}

		if (dateTime == Long.MIN_VALUE) {
			amfAuditLogImpl.setDateTime(null);
		}
		else {
			amfAuditLogImpl.setDateTime(new Date(dateTime));
		}

		if (eventType == null) {
			amfAuditLogImpl.setEventType(StringPool.BLANK);
		}
		else {
			amfAuditLogImpl.setEventType(eventType);
		}

		if (ipAddress == null) {
			amfAuditLogImpl.setIpAddress(StringPool.BLANK);
		}
		else {
			amfAuditLogImpl.setIpAddress(ipAddress);
		}

		amfAuditLogImpl.resetOriginalValues();

		return amfAuditLogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		amfAuditLogId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		dateTime = objectInput.readLong();
		eventType = objectInput.readUTF();
		ipAddress = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(amfAuditLogId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(dateTime);

		if (eventType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eventType);
		}

		if (ipAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ipAddress);
		}
	}

	public long amfAuditLogId;
	public long userId;
	public String userName;
	public long dateTime;
	public String eventType;
	public String ipAddress;
}