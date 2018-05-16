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

package com.liferay.docs.amfRegistrationService.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AmfSearchLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AmfSearchLocalService
 * @generated
 */
@ProviderType
public class AmfSearchLocalServiceWrapper implements AmfSearchLocalService,
	ServiceWrapper<AmfSearchLocalService> {
	public AmfSearchLocalServiceWrapper(
		AmfSearchLocalService amfSearchLocalService) {
		_amfSearchLocalService = amfSearchLocalService;
	}

	/**
	* Adds the amf search to the database. Also notifies the appropriate model listeners.
	*
	* @param amfSearch the amf search
	* @return the amf search that was added
	*/
	@Override
	public com.liferay.docs.amfRegistrationService.model.AmfSearch addAmfSearch(
		com.liferay.docs.amfRegistrationService.model.AmfSearch amfSearch) {
		return _amfSearchLocalService.addAmfSearch(amfSearch);
	}

	@Override
	public int countUserByZipCode(java.lang.String zipCode) {
		return _amfSearchLocalService.countUserByZipCode(zipCode);
	}

	/**
	* Creates a new amf search with the primary key. Does not add the amf search to the database.
	*
	* @param amfSearchField the primary key for the new amf search
	* @return the new amf search
	*/
	@Override
	public com.liferay.docs.amfRegistrationService.model.AmfSearch createAmfSearch(
		long amfSearchField) {
		return _amfSearchLocalService.createAmfSearch(amfSearchField);
	}

	/**
	* Deletes the amf search from the database. Also notifies the appropriate model listeners.
	*
	* @param amfSearch the amf search
	* @return the amf search that was removed
	*/
	@Override
	public com.liferay.docs.amfRegistrationService.model.AmfSearch deleteAmfSearch(
		com.liferay.docs.amfRegistrationService.model.AmfSearch amfSearch) {
		return _amfSearchLocalService.deleteAmfSearch(amfSearch);
	}

	/**
	* Deletes the amf search with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param amfSearchField the primary key of the amf search
	* @return the amf search that was removed
	* @throws PortalException if a amf search with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.amfRegistrationService.model.AmfSearch deleteAmfSearch(
		long amfSearchField)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfSearchLocalService.deleteAmfSearch(amfSearchField);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfSearchLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _amfSearchLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _amfSearchLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.amfRegistrationService.model.impl.AmfSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _amfSearchLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.amfRegistrationService.model.impl.AmfSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _amfSearchLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _amfSearchLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _amfSearchLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.docs.amfRegistrationService.model.AmfSearch fetchAmfSearch(
		long amfSearchField) {
		return _amfSearchLocalService.fetchAmfSearch(amfSearchField);
	}

	@Override
	public void findByZip() {
		_amfSearchLocalService.findByZip();
	}

	@Override
	public java.util.List<com.liferay.docs.amfRegistrationService.dto.AmfUserSearchDTO> findUserByZipCode(
		java.lang.String zipCode, int start, int end) {
		return _amfSearchLocalService.findUserByZipCode(zipCode, start, end);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _amfSearchLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the amf search with the primary key.
	*
	* @param amfSearchField the primary key of the amf search
	* @return the amf search
	* @throws PortalException if a amf search with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.amfRegistrationService.model.AmfSearch getAmfSearch(
		long amfSearchField)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfSearchLocalService.getAmfSearch(amfSearchField);
	}

	/**
	* Returns a range of all the amf searchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.amfRegistrationService.model.impl.AmfSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf searchs
	* @param end the upper bound of the range of amf searchs (not inclusive)
	* @return the range of amf searchs
	*/
	@Override
	public java.util.List<com.liferay.docs.amfRegistrationService.model.AmfSearch> getAmfSearchs(
		int start, int end) {
		return _amfSearchLocalService.getAmfSearchs(start, end);
	}

	/**
	* Returns the number of amf searchs.
	*
	* @return the number of amf searchs
	*/
	@Override
	public int getAmfSearchsCount() {
		return _amfSearchLocalService.getAmfSearchsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _amfSearchLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _amfSearchLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfSearchLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the amf search in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param amfSearch the amf search
	* @return the amf search that was updated
	*/
	@Override
	public com.liferay.docs.amfRegistrationService.model.AmfSearch updateAmfSearch(
		com.liferay.docs.amfRegistrationService.model.AmfSearch amfSearch) {
		return _amfSearchLocalService.updateAmfSearch(amfSearch);
	}

	@Override
	public AmfSearchLocalService getWrappedService() {
		return _amfSearchLocalService;
	}

	@Override
	public void setWrappedService(AmfSearchLocalService amfSearchLocalService) {
		_amfSearchLocalService = amfSearchLocalService;
	}

	private AmfSearchLocalService _amfSearchLocalService;
}