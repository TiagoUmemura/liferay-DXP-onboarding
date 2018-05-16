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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link AmfSearch}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AmfSearch
 * @generated
 */
@ProviderType
public class AmfSearchWrapper implements AmfSearch, ModelWrapper<AmfSearch> {
	public AmfSearchWrapper(AmfSearch amfSearch) {
		_amfSearch = amfSearch;
	}

	@Override
	public Class<?> getModelClass() {
		return AmfSearch.class;
	}

	@Override
	public String getModelClassName() {
		return AmfSearch.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("amfSearchField", getAmfSearchField());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long amfSearchField = (Long)attributes.get("amfSearchField");

		if (amfSearchField != null) {
			setAmfSearchField(amfSearchField);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new AmfSearchWrapper((AmfSearch)_amfSearch.clone());
	}

	@Override
	public int compareTo(AmfSearch amfSearch) {
		return _amfSearch.compareTo(amfSearch);
	}

	/**
	* Returns the amf search field of this amf search.
	*
	* @return the amf search field of this amf search
	*/
	@Override
	public long getAmfSearchField() {
		return _amfSearch.getAmfSearchField();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _amfSearch.getExpandoBridge();
	}

	/**
	* Returns the primary key of this amf search.
	*
	* @return the primary key of this amf search
	*/
	@Override
	public long getPrimaryKey() {
		return _amfSearch.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _amfSearch.getPrimaryKeyObj();
	}

	@Override
	public int hashCode() {
		return _amfSearch.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _amfSearch.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _amfSearch.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _amfSearch.isNew();
	}

	@Override
	public void persist() {
		_amfSearch.persist();
	}

	/**
	* Sets the amf search field of this amf search.
	*
	* @param amfSearchField the amf search field of this amf search
	*/
	@Override
	public void setAmfSearchField(long amfSearchField) {
		_amfSearch.setAmfSearchField(amfSearchField);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_amfSearch.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_amfSearch.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_amfSearch.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_amfSearch.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_amfSearch.setNew(n);
	}

	/**
	* Sets the primary key of this amf search.
	*
	* @param primaryKey the primary key of this amf search
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_amfSearch.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_amfSearch.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AmfSearch> toCacheModel() {
		return _amfSearch.toCacheModel();
	}

	@Override
	public AmfSearch toEscapedModel() {
		return new AmfSearchWrapper(_amfSearch.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _amfSearch.toString();
	}

	@Override
	public AmfSearch toUnescapedModel() {
		return new AmfSearchWrapper(_amfSearch.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _amfSearch.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AmfSearchWrapper)) {
			return false;
		}

		AmfSearchWrapper amfSearchWrapper = (AmfSearchWrapper)obj;

		if (Objects.equals(_amfSearch, amfSearchWrapper._amfSearch)) {
			return true;
		}

		return false;
	}

	@Override
	public AmfSearch getWrappedModel() {
		return _amfSearch;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _amfSearch.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _amfSearch.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_amfSearch.resetOriginalValues();
	}

	private final AmfSearch _amfSearch;
}