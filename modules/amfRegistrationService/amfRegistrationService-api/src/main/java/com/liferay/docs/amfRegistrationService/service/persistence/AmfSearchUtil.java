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

package com.liferay.docs.amfRegistrationService.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.amfRegistrationService.model.AmfSearch;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the amf search service. This utility wraps {@link com.liferay.docs.amfRegistrationService.service.persistence.impl.AmfSearchPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AmfSearchPersistence
 * @see com.liferay.docs.amfRegistrationService.service.persistence.impl.AmfSearchPersistenceImpl
 * @generated
 */
@ProviderType
public class AmfSearchUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(AmfSearch amfSearch) {
		getPersistence().clearCache(amfSearch);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AmfSearch> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AmfSearch> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AmfSearch> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AmfSearch> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AmfSearch update(AmfSearch amfSearch) {
		return getPersistence().update(amfSearch);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AmfSearch update(AmfSearch amfSearch,
		ServiceContext serviceContext) {
		return getPersistence().update(amfSearch, serviceContext);
	}

	/**
	* Returns all the amf searchs where amfSearchField = &#63;.
	*
	* @param amfSearchField the amf search field
	* @return the matching amf searchs
	*/
	public static List<AmfSearch> findByamfSearchFieldFinder(
		long amfSearchField) {
		return getPersistence().findByamfSearchFieldFinder(amfSearchField);
	}

	/**
	* Returns a range of all the amf searchs where amfSearchField = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param amfSearchField the amf search field
	* @param start the lower bound of the range of amf searchs
	* @param end the upper bound of the range of amf searchs (not inclusive)
	* @return the range of matching amf searchs
	*/
	public static List<AmfSearch> findByamfSearchFieldFinder(
		long amfSearchField, int start, int end) {
		return getPersistence()
				   .findByamfSearchFieldFinder(amfSearchField, start, end);
	}

	/**
	* Returns an ordered range of all the amf searchs where amfSearchField = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param amfSearchField the amf search field
	* @param start the lower bound of the range of amf searchs
	* @param end the upper bound of the range of amf searchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching amf searchs
	*/
	public static List<AmfSearch> findByamfSearchFieldFinder(
		long amfSearchField, int start, int end,
		OrderByComparator<AmfSearch> orderByComparator) {
		return getPersistence()
				   .findByamfSearchFieldFinder(amfSearchField, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the amf searchs where amfSearchField = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param amfSearchField the amf search field
	* @param start the lower bound of the range of amf searchs
	* @param end the upper bound of the range of amf searchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching amf searchs
	*/
	public static List<AmfSearch> findByamfSearchFieldFinder(
		long amfSearchField, int start, int end,
		OrderByComparator<AmfSearch> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByamfSearchFieldFinder(amfSearchField, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first amf search in the ordered set where amfSearchField = &#63;.
	*
	* @param amfSearchField the amf search field
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf search
	* @throws NoSuchAmfSearchException if a matching amf search could not be found
	*/
	public static AmfSearch findByamfSearchFieldFinder_First(
		long amfSearchField, OrderByComparator<AmfSearch> orderByComparator)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfSearchException {
		return getPersistence()
				   .findByamfSearchFieldFinder_First(amfSearchField,
			orderByComparator);
	}

	/**
	* Returns the first amf search in the ordered set where amfSearchField = &#63;.
	*
	* @param amfSearchField the amf search field
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf search, or <code>null</code> if a matching amf search could not be found
	*/
	public static AmfSearch fetchByamfSearchFieldFinder_First(
		long amfSearchField, OrderByComparator<AmfSearch> orderByComparator) {
		return getPersistence()
				   .fetchByamfSearchFieldFinder_First(amfSearchField,
			orderByComparator);
	}

	/**
	* Returns the last amf search in the ordered set where amfSearchField = &#63;.
	*
	* @param amfSearchField the amf search field
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf search
	* @throws NoSuchAmfSearchException if a matching amf search could not be found
	*/
	public static AmfSearch findByamfSearchFieldFinder_Last(
		long amfSearchField, OrderByComparator<AmfSearch> orderByComparator)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfSearchException {
		return getPersistence()
				   .findByamfSearchFieldFinder_Last(amfSearchField,
			orderByComparator);
	}

	/**
	* Returns the last amf search in the ordered set where amfSearchField = &#63;.
	*
	* @param amfSearchField the amf search field
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf search, or <code>null</code> if a matching amf search could not be found
	*/
	public static AmfSearch fetchByamfSearchFieldFinder_Last(
		long amfSearchField, OrderByComparator<AmfSearch> orderByComparator) {
		return getPersistence()
				   .fetchByamfSearchFieldFinder_Last(amfSearchField,
			orderByComparator);
	}

	/**
	* Removes all the amf searchs where amfSearchField = &#63; from the database.
	*
	* @param amfSearchField the amf search field
	*/
	public static void removeByamfSearchFieldFinder(long amfSearchField) {
		getPersistence().removeByamfSearchFieldFinder(amfSearchField);
	}

	/**
	* Returns the number of amf searchs where amfSearchField = &#63;.
	*
	* @param amfSearchField the amf search field
	* @return the number of matching amf searchs
	*/
	public static int countByamfSearchFieldFinder(long amfSearchField) {
		return getPersistence().countByamfSearchFieldFinder(amfSearchField);
	}

	/**
	* Caches the amf search in the entity cache if it is enabled.
	*
	* @param amfSearch the amf search
	*/
	public static void cacheResult(AmfSearch amfSearch) {
		getPersistence().cacheResult(amfSearch);
	}

	/**
	* Caches the amf searchs in the entity cache if it is enabled.
	*
	* @param amfSearchs the amf searchs
	*/
	public static void cacheResult(List<AmfSearch> amfSearchs) {
		getPersistence().cacheResult(amfSearchs);
	}

	/**
	* Creates a new amf search with the primary key. Does not add the amf search to the database.
	*
	* @param amfSearchField the primary key for the new amf search
	* @return the new amf search
	*/
	public static AmfSearch create(long amfSearchField) {
		return getPersistence().create(amfSearchField);
	}

	/**
	* Removes the amf search with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param amfSearchField the primary key of the amf search
	* @return the amf search that was removed
	* @throws NoSuchAmfSearchException if a amf search with the primary key could not be found
	*/
	public static AmfSearch remove(long amfSearchField)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfSearchException {
		return getPersistence().remove(amfSearchField);
	}

	public static AmfSearch updateImpl(AmfSearch amfSearch) {
		return getPersistence().updateImpl(amfSearch);
	}

	/**
	* Returns the amf search with the primary key or throws a {@link NoSuchAmfSearchException} if it could not be found.
	*
	* @param amfSearchField the primary key of the amf search
	* @return the amf search
	* @throws NoSuchAmfSearchException if a amf search with the primary key could not be found
	*/
	public static AmfSearch findByPrimaryKey(long amfSearchField)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfSearchException {
		return getPersistence().findByPrimaryKey(amfSearchField);
	}

	/**
	* Returns the amf search with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param amfSearchField the primary key of the amf search
	* @return the amf search, or <code>null</code> if a amf search with the primary key could not be found
	*/
	public static AmfSearch fetchByPrimaryKey(long amfSearchField) {
		return getPersistence().fetchByPrimaryKey(amfSearchField);
	}

	public static java.util.Map<java.io.Serializable, AmfSearch> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the amf searchs.
	*
	* @return the amf searchs
	*/
	public static List<AmfSearch> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the amf searchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf searchs
	* @param end the upper bound of the range of amf searchs (not inclusive)
	* @return the range of amf searchs
	*/
	public static List<AmfSearch> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the amf searchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf searchs
	* @param end the upper bound of the range of amf searchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of amf searchs
	*/
	public static List<AmfSearch> findAll(int start, int end,
		OrderByComparator<AmfSearch> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the amf searchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf searchs
	* @param end the upper bound of the range of amf searchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of amf searchs
	*/
	public static List<AmfSearch> findAll(int start, int end,
		OrderByComparator<AmfSearch> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the amf searchs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of amf searchs.
	*
	* @return the number of amf searchs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AmfSearchPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AmfSearchPersistence, AmfSearchPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AmfSearchPersistence.class);
}