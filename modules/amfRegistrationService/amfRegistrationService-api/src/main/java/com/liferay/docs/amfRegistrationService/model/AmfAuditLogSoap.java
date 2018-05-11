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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class AmfAuditLogSoap implements Serializable {
	public static AmfAuditLogSoap toSoapModel(AmfAuditLog model) {
		AmfAuditLogSoap soapModel = new AmfAuditLogSoap();

		soapModel.setAmfAuditLogId(model.getAmfAuditLogId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setDateTime(model.getDateTime());
		soapModel.setEventType(model.getEventType());
		soapModel.setIpAddress(model.getIpAddress());

		return soapModel;
	}

	public static AmfAuditLogSoap[] toSoapModels(AmfAuditLog[] models) {
		AmfAuditLogSoap[] soapModels = new AmfAuditLogSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AmfAuditLogSoap[][] toSoapModels(AmfAuditLog[][] models) {
		AmfAuditLogSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AmfAuditLogSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AmfAuditLogSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AmfAuditLogSoap[] toSoapModels(List<AmfAuditLog> models) {
		List<AmfAuditLogSoap> soapModels = new ArrayList<AmfAuditLogSoap>(models.size());

		for (AmfAuditLog model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AmfAuditLogSoap[soapModels.size()]);
	}

	public AmfAuditLogSoap() {
	}

	public long getPrimaryKey() {
		return _amfAuditLogId;
	}

	public void setPrimaryKey(long pk) {
		setAmfAuditLogId(pk);
	}

	public long getAmfAuditLogId() {
		return _amfAuditLogId;
	}

	public void setAmfAuditLogId(long amfAuditLogId) {
		_amfAuditLogId = amfAuditLogId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getDateTime() {
		return _dateTime;
	}

	public void setDateTime(Date dateTime) {
		_dateTime = dateTime;
	}

	public String getEventType() {
		return _eventType;
	}

	public void setEventType(String eventType) {
		_eventType = eventType;
	}

	public String getIpAddress() {
		return _ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		_ipAddress = ipAddress;
	}

	private long _amfAuditLogId;
	private long _userId;
	private String _userName;
	private Date _dateTime;
	private String _eventType;
	private String _ipAddress;
}