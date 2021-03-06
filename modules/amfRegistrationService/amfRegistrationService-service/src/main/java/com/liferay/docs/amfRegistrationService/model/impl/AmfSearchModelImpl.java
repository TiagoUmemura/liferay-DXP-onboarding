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
import com.liferay.docs.amfRegistrationService.model.AmfSearchModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the AmfSearch service. Represents a row in the &quot;AmfSearch&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link AmfSearchModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AmfSearchImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AmfSearchImpl
 * @see AmfSearch
 * @see AmfSearchModel
 * @generated
 */
@ProviderType
public class AmfSearchModelImpl extends BaseModelImpl<AmfSearch>
	implements AmfSearchModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a amf search model instance should use the {@link AmfSearch} interface instead.
	 */
	public static final String TABLE_NAME = "AmfSearch";
	public static final Object[][] TABLE_COLUMNS = {
			{ "amfSearchField", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("amfSearchField", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table AmfSearch (amfSearchField LONG not null primary key)";
	public static final String TABLE_SQL_DROP = "drop table AmfSearch";
	public static final String ORDER_BY_JPQL = " ORDER BY amfSearch.amfSearchField ASC";
	public static final String ORDER_BY_SQL = " ORDER BY AmfSearch.amfSearchField ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.docs.amfRegistrationService.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.docs.amfRegistrationService.model.AmfSearch"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.docs.amfRegistrationService.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.docs.amfRegistrationService.model.AmfSearch"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.docs.amfRegistrationService.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.docs.amfRegistrationService.model.AmfSearch"),
			true);
	public static final long AMFSEARCHFIELD_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.docs.amfRegistrationService.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.docs.amfRegistrationService.model.AmfSearch"));

	public AmfSearchModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _amfSearchField;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAmfSearchField(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _amfSearchField;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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
	public long getAmfSearchField() {
		return _amfSearchField;
	}

	@Override
	public void setAmfSearchField(long amfSearchField) {
		_columnBitmask |= AMFSEARCHFIELD_COLUMN_BITMASK;

		if (!_setOriginalAmfSearchField) {
			_setOriginalAmfSearchField = true;

			_originalAmfSearchField = _amfSearchField;
		}

		_amfSearchField = amfSearchField;
	}

	public long getOriginalAmfSearchField() {
		return _originalAmfSearchField;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			AmfSearch.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AmfSearch toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AmfSearch)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AmfSearchImpl amfSearchImpl = new AmfSearchImpl();

		amfSearchImpl.setAmfSearchField(getAmfSearchField());

		amfSearchImpl.resetOriginalValues();

		return amfSearchImpl;
	}

	@Override
	public int compareTo(AmfSearch amfSearch) {
		long primaryKey = amfSearch.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AmfSearch)) {
			return false;
		}

		AmfSearch amfSearch = (AmfSearch)obj;

		long primaryKey = amfSearch.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		AmfSearchModelImpl amfSearchModelImpl = this;

		amfSearchModelImpl._originalAmfSearchField = amfSearchModelImpl._amfSearchField;

		amfSearchModelImpl._setOriginalAmfSearchField = false;

		amfSearchModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<AmfSearch> toCacheModel() {
		AmfSearchCacheModel amfSearchCacheModel = new AmfSearchCacheModel();

		amfSearchCacheModel.amfSearchField = getAmfSearchField();

		return amfSearchCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{amfSearchField=");
		sb.append(getAmfSearchField());

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(7);

		sb.append("<model><model-name>");
		sb.append("com.liferay.docs.amfRegistrationService.model.AmfSearch");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>amfSearchField</column-name><column-value><![CDATA[");
		sb.append(getAmfSearchField());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = AmfSearch.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			AmfSearch.class
		};
	private long _amfSearchField;
	private long _originalAmfSearchField;
	private boolean _setOriginalAmfSearchField;
	private long _columnBitmask;
	private AmfSearch _escapedModel;
}