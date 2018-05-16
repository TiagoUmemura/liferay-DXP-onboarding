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

import com.liferay.docs.amfRegistrationService.model.AmfSearch;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AmfSearch in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AmfSearch
 * @generated
 */
@ProviderType
public class AmfSearchCacheModel implements CacheModel<AmfSearch>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AmfSearchCacheModel)) {
			return false;
		}

		AmfSearchCacheModel amfSearchCacheModel = (AmfSearchCacheModel)obj;

		if (amfSearchField == amfSearchCacheModel.amfSearchField) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, amfSearchField);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{amfSearchField=");
		sb.append(amfSearchField);

		return sb.toString();
	}

	@Override
	public AmfSearch toEntityModel() {
		AmfSearchImpl amfSearchImpl = new AmfSearchImpl();

		amfSearchImpl.setAmfSearchField(amfSearchField);

		amfSearchImpl.resetOriginalValues();

		return amfSearchImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		amfSearchField = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(amfSearchField);
	}

	public long amfSearchField;
}