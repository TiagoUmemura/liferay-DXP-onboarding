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

import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the AmfSearch service. Represents a row in the &quot;AmfSearch&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.docs.amfRegistrationService.model.impl.AmfSearchModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.docs.amfRegistrationService.model.impl.AmfSearchImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AmfSearch
 * @see com.liferay.docs.amfRegistrationService.model.impl.AmfSearchImpl
 * @see com.liferay.docs.amfRegistrationService.model.impl.AmfSearchModelImpl
 * @generated
 */
@ProviderType
public interface AmfSearchModel extends BaseModel<AmfSearch> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a amf search model instance should use the {@link AmfSearch} interface instead.
	 */

	/**
	 * Returns the primary key of this amf search.
	 *
	 * @return the primary key of this amf search
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this amf search.
	 *
	 * @param primaryKey the primary key of this amf search
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the amf search field of this amf search.
	 *
	 * @return the amf search field of this amf search
	 */
	public long getAmfSearchField();

	/**
	 * Sets the amf search field of this amf search.
	 *
	 * @param amfSearchField the amf search field of this amf search
	 */
	public void setAmfSearchField(long amfSearchField);

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
	public int compareTo(AmfSearch amfSearch);

	@Override
	public int hashCode();

	@Override
	public CacheModel<AmfSearch> toCacheModel();

	@Override
	public AmfSearch toEscapedModel();

	@Override
	public AmfSearch toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}