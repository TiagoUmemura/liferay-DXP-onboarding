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

package com.liferay.docs.amfRegistrationService.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link AmfAuditLog}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AmfAuditLog
 * @generated
 */
@ProviderType
public class AmfAuditLogWrapper implements AmfAuditLog,
	ModelWrapper<AmfAuditLog> {
	public AmfAuditLogWrapper(AmfAuditLog amfAuditLog) {
		_amfAuditLog = amfAuditLog;
	}

	@Override
	public Class<?> getModelClass() {
		return AmfAuditLog.class;
	}

	@Override
	public String getModelClassName() {
		return AmfAuditLog.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("amfAuditLogId", getAmfAuditLogId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("dateTime", getDateTime());
		attributes.put("eventType", getEventType());
		attributes.put("ipAddress", getIpAddress());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long amfAuditLogId = (Long)attributes.get("amfAuditLogId");

		if (amfAuditLogId != null) {
			setAmfAuditLogId(amfAuditLogId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date dateTime = (Date)attributes.get("dateTime");

		if (dateTime != null) {
			setDateTime(dateTime);
		}

		String eventType = (String)attributes.get("eventType");

		if (eventType != null) {
			setEventType(eventType);
		}

		String ipAddress = (String)attributes.get("ipAddress");

		if (ipAddress != null) {
			setIpAddress(ipAddress);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new AmfAuditLogWrapper((AmfAuditLog)_amfAuditLog.clone());
	}

	@Override
	public int compareTo(AmfAuditLog amfAuditLog) {
		return _amfAuditLog.compareTo(amfAuditLog);
	}

	/**
	* Returns the amf audit log ID of this amf audit log.
	*
	* @return the amf audit log ID of this amf audit log
	*/
	@Override
	public long getAmfAuditLogId() {
		return _amfAuditLog.getAmfAuditLogId();
	}

	/**
	* Returns the date time of this amf audit log.
	*
	* @return the date time of this amf audit log
	*/
	@Override
	public Date getDateTime() {
		return _amfAuditLog.getDateTime();
	}

	/**
	* Returns the event type of this amf audit log.
	*
	* @return the event type of this amf audit log
	*/
	@Override
	public java.lang.String getEventType() {
		return _amfAuditLog.getEventType();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _amfAuditLog.getExpandoBridge();
	}

	/**
	* Returns the ip address of this amf audit log.
	*
	* @return the ip address of this amf audit log
	*/
	@Override
	public java.lang.String getIpAddress() {
		return _amfAuditLog.getIpAddress();
	}

	/**
	* Returns the primary key of this amf audit log.
	*
	* @return the primary key of this amf audit log
	*/
	@Override
	public long getPrimaryKey() {
		return _amfAuditLog.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _amfAuditLog.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this amf audit log.
	*
	* @return the user ID of this amf audit log
	*/
	@Override
	public long getUserId() {
		return _amfAuditLog.getUserId();
	}

	/**
	* Returns the user name of this amf audit log.
	*
	* @return the user name of this amf audit log
	*/
	@Override
	public java.lang.String getUserName() {
		return _amfAuditLog.getUserName();
	}

	/**
	* Returns the user uuid of this amf audit log.
	*
	* @return the user uuid of this amf audit log
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _amfAuditLog.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _amfAuditLog.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _amfAuditLog.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _amfAuditLog.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _amfAuditLog.isNew();
	}

	@Override
	public void persist() {
		_amfAuditLog.persist();
	}

	/**
	* Sets the amf audit log ID of this amf audit log.
	*
	* @param amfAuditLogId the amf audit log ID of this amf audit log
	*/
	@Override
	public void setAmfAuditLogId(long amfAuditLogId) {
		_amfAuditLog.setAmfAuditLogId(amfAuditLogId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_amfAuditLog.setCachedModel(cachedModel);
	}

	/**
	* Sets the date time of this amf audit log.
	*
	* @param dateTime the date time of this amf audit log
	*/
	@Override
	public void setDateTime(Date dateTime) {
		_amfAuditLog.setDateTime(dateTime);
	}

	/**
	* Sets the event type of this amf audit log.
	*
	* @param eventType the event type of this amf audit log
	*/
	@Override
	public void setEventType(java.lang.String eventType) {
		_amfAuditLog.setEventType(eventType);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_amfAuditLog.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_amfAuditLog.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_amfAuditLog.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ip address of this amf audit log.
	*
	* @param ipAddress the ip address of this amf audit log
	*/
	@Override
	public void setIpAddress(java.lang.String ipAddress) {
		_amfAuditLog.setIpAddress(ipAddress);
	}

	@Override
	public void setNew(boolean n) {
		_amfAuditLog.setNew(n);
	}

	/**
	* Sets the primary key of this amf audit log.
	*
	* @param primaryKey the primary key of this amf audit log
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_amfAuditLog.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_amfAuditLog.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this amf audit log.
	*
	* @param userId the user ID of this amf audit log
	*/
	@Override
	public void setUserId(long userId) {
		_amfAuditLog.setUserId(userId);
	}

	/**
	* Sets the user name of this amf audit log.
	*
	* @param userName the user name of this amf audit log
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_amfAuditLog.setUserName(userName);
	}

	/**
	* Sets the user uuid of this amf audit log.
	*
	* @param userUuid the user uuid of this amf audit log
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_amfAuditLog.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AmfAuditLog> toCacheModel() {
		return _amfAuditLog.toCacheModel();
	}

	@Override
	public AmfAuditLog toEscapedModel() {
		return new AmfAuditLogWrapper(_amfAuditLog.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _amfAuditLog.toString();
	}

	@Override
	public AmfAuditLog toUnescapedModel() {
		return new AmfAuditLogWrapper(_amfAuditLog.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _amfAuditLog.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AmfAuditLogWrapper)) {
			return false;
		}

		AmfAuditLogWrapper amfAuditLogWrapper = (AmfAuditLogWrapper)obj;

		if (Objects.equals(_amfAuditLog, amfAuditLogWrapper._amfAuditLog)) {
			return true;
		}

		return false;
	}

	@Override
	public AmfAuditLog getWrappedModel() {
		return _amfAuditLog;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _amfAuditLog.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _amfAuditLog.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_amfAuditLog.resetOriginalValues();
	}

	private final AmfAuditLog _amfAuditLog;
}