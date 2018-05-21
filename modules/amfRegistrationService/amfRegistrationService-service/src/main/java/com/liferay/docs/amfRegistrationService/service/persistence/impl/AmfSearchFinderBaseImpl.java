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

package com.liferay.docs.amfRegistrationService.service.persistence.impl;

import com.liferay.docs.amfRegistrationService.model.AmfSearch;
import com.liferay.docs.amfRegistrationService.service.persistence.AmfSearchPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AmfSearchFinderBaseImpl extends BasePersistenceImpl<AmfSearch> {
	public AmfSearchFinderBaseImpl() {
		setModelClass(AmfSearch.class);
	}

	/**
	 * Returns the amf search persistence.
	 *
	 * @return the amf search persistence
	 */
	public AmfSearchPersistence getAmfSearchPersistence() {
		return amfSearchPersistence;
	}

	/**
	 * Sets the amf search persistence.
	 *
	 * @param amfSearchPersistence the amf search persistence
	 */
	public void setAmfSearchPersistence(
		AmfSearchPersistence amfSearchPersistence) {
		this.amfSearchPersistence = amfSearchPersistence;
	}

	@BeanReference(type = AmfSearchPersistence.class)
	protected AmfSearchPersistence amfSearchPersistence;
}