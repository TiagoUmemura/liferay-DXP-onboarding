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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the AmfSearch service. Represents a row in the &quot;AmfSearch&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AmfSearchModel
 * @see com.liferay.docs.amfRegistrationService.model.impl.AmfSearchImpl
 * @see com.liferay.docs.amfRegistrationService.model.impl.AmfSearchModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.docs.amfRegistrationService.model.impl.AmfSearchImpl")
@ProviderType
public interface AmfSearch extends AmfSearchModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.docs.amfRegistrationService.model.impl.AmfSearchImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AmfSearch, Long> AMF_SEARCH_FIELD_ACCESSOR = new Accessor<AmfSearch, Long>() {
			@Override
			public Long get(AmfSearch amfSearch) {
				return amfSearch.getAmfSearchField();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AmfSearch> getTypeClass() {
				return AmfSearch.class;
			}
		};
}