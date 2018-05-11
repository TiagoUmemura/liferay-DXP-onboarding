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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AmfAuditLog service. Represents a row in the &quot;AmfAuditLog&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.docs.amfRegistrationService.model.impl.AmfAuditLogModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.docs.amfRegistrationService.model.impl.AmfAuditLogImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AmfAuditLog
 * @see com.liferay.docs.amfRegistrationService.model.impl.AmfAuditLogImpl
 * @see com.liferay.docs.amfRegistrationService.model.impl.AmfAuditLogModelImpl
 * @generated
 */
@ProviderType
public interface AmfAuditLogModel extends BaseModel<AmfAuditLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a amf audit log model instance should use the {@link AmfAuditLog} interface instead.
	 */

	/**
	 * Returns the primary key of this amf audit log.
	 *
	 * @return the primary key of this amf audit log
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this amf audit log.
	 *
	 * @param primaryKey the primary key of this amf audit log
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the amf audit log ID of this amf audit log.
	 *
	 * @return the amf audit log ID of this amf audit log
	 */
	public long getAmfAuditLogId();

	/**
	 * Sets the amf audit log ID of this amf audit log.
	 *
	 * @param amfAuditLogId the amf audit log ID of this amf audit log
	 */
	public void setAmfAuditLogId(long amfAuditLogId);

	/**
	 * Returns the user ID of this amf audit log.
	 *
	 * @return the user ID of this amf audit log
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this amf audit log.
	 *
	 * @param userId the user ID of this amf audit log
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this amf audit log.
	 *
	 * @return the user uuid of this amf audit log
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this amf audit log.
	 *
	 * @param userUuid the user uuid of this amf audit log
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this amf audit log.
	 *
	 * @return the user name of this amf audit log
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this amf audit log.
	 *
	 * @param userName the user name of this amf audit log
	 */
	public void setUserName(String userName);

	/**
	 * Returns the date time of this amf audit log.
	 *
	 * @return the date time of this amf audit log
	 */
	public Date getDateTime();

	/**
	 * Sets the date time of this amf audit log.
	 *
	 * @param dateTime the date time of this amf audit log
	 */
	public void setDateTime(Date dateTime);

	/**
	 * Returns the event type of this amf audit log.
	 *
	 * @return the event type of this amf audit log
	 */
	@AutoEscape
	public String getEventType();

	/**
	 * Sets the event type of this amf audit log.
	 *
	 * @param eventType the event type of this amf audit log
	 */
	public void setEventType(String eventType);

	/**
	 * Returns the ip address of this amf audit log.
	 *
	 * @return the ip address of this amf audit log
	 */
	@AutoEscape
	public String getIpAddress();

	/**
	 * Sets the ip address of this amf audit log.
	 *
	 * @param ipAddress the ip address of this amf audit log
	 */
	public void setIpAddress(String ipAddress);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(AmfAuditLog amfAuditLog);

	@Override
	public int hashCode();

	@Override
	public CacheModel<AmfAuditLog> toCacheModel();

	@Override
	public AmfAuditLog toEscapedModel();

	@Override
	public AmfAuditLog toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}