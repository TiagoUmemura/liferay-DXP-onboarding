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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class AmfSearchSoap implements Serializable {
	public static AmfSearchSoap toSoapModel(AmfSearch model) {
		AmfSearchSoap soapModel = new AmfSearchSoap();

		soapModel.setAmfSearchField(model.getAmfSearchField());

		return soapModel;
	}

	public static AmfSearchSoap[] toSoapModels(AmfSearch[] models) {
		AmfSearchSoap[] soapModels = new AmfSearchSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AmfSearchSoap[][] toSoapModels(AmfSearch[][] models) {
		AmfSearchSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AmfSearchSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AmfSearchSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AmfSearchSoap[] toSoapModels(List<AmfSearch> models) {
		List<AmfSearchSoap> soapModels = new ArrayList<AmfSearchSoap>(models.size());

		for (AmfSearch model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AmfSearchSoap[soapModels.size()]);
	}

	public AmfSearchSoap() {
	}

	public long getPrimaryKey() {
		return _amfSearchField;
	}

	public void setPrimaryKey(long pk) {
		setAmfSearchField(pk);
	}

	public long getAmfSearchField() {
		return _amfSearchField;
	}

	public void setAmfSearchField(long amfSearchField) {
		_amfSearchField = amfSearchField;
	}

	private long _amfSearchField;
}