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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for AmfSearch. This utility wraps
 * {@link com.liferay.docs.amfRegistrationService.service.impl.AmfSearchLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AmfSearchLocalService
 * @see com.liferay.docs.amfRegistrationService.service.base.AmfSearchLocalServiceBaseImpl
 * @see com.liferay.docs.amfRegistrationService.service.impl.AmfSearchLocalServiceImpl
 * @generated
 */
@ProviderType
public class AmfSearchLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.amfRegistrationService.service.impl.AmfSearchLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the amf search to the database. Also notifies the appropriate model listeners.
	*
	* @param amfSearch the amf search
	* @return the amf search that was added
	*/
	public static com.liferay.docs.amfRegistrationService.model.AmfSearch addAmfSearch(
		com.liferay.docs.amfRegistrationService.model.AmfSearch amfSearch) {
		return getService().addAmfSearch(amfSearch);
	}

	public static int countUserByZipCode(java.lang.String zipCode) {
		return getService().countUserByZipCode(zipCode);
	}

	/**
	* Creates a new amf search with the primary key. Does not add the amf search to the database.
	*
	* @param amfSearchField the primary key for the new amf search
	* @return the new amf search
	*/
	public static com.liferay.docs.amfRegistrationService.model.AmfSearch createAmfSearch(
		long amfSearchField) {
		return getService().createAmfSearch(amfSearchField);
	}

	/**
	* Deletes the amf search from the database. Also notifies the appropriate model listeners.
	*
	* @param amfSearch the amf search
	* @return the amf search that was removed
	*/
	public static com.liferay.docs.amfRegistrationService.model.AmfSearch deleteAmfSearch(
		com.liferay.docs.amfRegistrationService.model.AmfSearch amfSearch) {
		return getService().deleteAmfSearch(amfSearch);
	}

	/**
	* Deletes the amf search with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param amfSearchField the primary key of the amf search
	* @return the amf search that was removed
	* @throws PortalException if a amf search with the primary key could not be found
	*/
	public static com.liferay.docs.amfRegistrationService.model.AmfSearch deleteAmfSearch(
		long amfSearchField)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAmfSearch(amfSearchField);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.docs.amfRegistrationService.model.AmfSearch fetchAmfSearch(
		long amfSearchField) {
		return getService().fetchAmfSearch(amfSearchField);
	}

	public static void findByZip() {
		getService().findByZip();
	}

	public static java.util.List<com.liferay.docs.amfRegistrationService.dto.AmfUserSearchDTO> findUserByZipCode(
		java.lang.String zipCode, int start, int end) {
		return getService().findUserByZipCode(zipCode, start, end);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the amf search with the primary key.
	*
	* @param amfSearchField the primary key of the amf search
	* @return the amf search
	* @throws PortalException if a amf search with the primary key could not be found
	*/
	public static com.liferay.docs.amfRegistrationService.model.AmfSearch getAmfSearch(
		long amfSearchField)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAmfSearch(amfSearchField);
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
	public static java.util.List<com.liferay.docs.amfRegistrationService.model.AmfSearch> getAmfSearchs(
		int start, int end) {
		return getService().getAmfSearchs(start, end);
	}

	/**
	* Returns the number of amf searchs.
	*
	* @return the number of amf searchs
	*/
	public static int getAmfSearchsCount() {
		return getService().getAmfSearchsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the amf search in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param amfSearch the amf search
	* @return the amf search that was updated
	*/
	public static com.liferay.docs.amfRegistrationService.model.AmfSearch updateAmfSearch(
		com.liferay.docs.amfRegistrationService.model.AmfSearch amfSearch) {
		return getService().updateAmfSearch(amfSearch);
	}

	public static AmfSearchLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AmfSearchLocalService, AmfSearchLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AmfSearchLocalService.class);
}