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

import com.liferay.docs.amfRegistrationService.exception.NoSuchAmfSearchException;
import com.liferay.docs.amfRegistrationService.model.AmfSearch;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the amf search service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.docs.amfRegistrationService.service.persistence.impl.AmfSearchPersistenceImpl
 * @see AmfSearchUtil
 * @generated
 */
@ProviderType
public interface AmfSearchPersistence extends BasePersistence<AmfSearch> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AmfSearchUtil} to access the amf search persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the amf searchs where amfSearchField = &#63;.
	*
	* @param amfSearchField the amf search field
	* @return the matching amf searchs
	*/
	public java.util.List<AmfSearch> findByamfSearchFieldFinder(
		long amfSearchField);

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
	public java.util.List<AmfSearch> findByamfSearchFieldFinder(
		long amfSearchField, int start, int end);

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
	public java.util.List<AmfSearch> findByamfSearchFieldFinder(
		long amfSearchField, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfSearch> orderByComparator);

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
	public java.util.List<AmfSearch> findByamfSearchFieldFinder(
		long amfSearchField, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfSearch> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first amf search in the ordered set where amfSearchField = &#63;.
	*
	* @param amfSearchField the amf search field
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf search
	* @throws NoSuchAmfSearchException if a matching amf search could not be found
	*/
	public AmfSearch findByamfSearchFieldFinder_First(long amfSearchField,
		com.liferay.portal.kernel.util.OrderByComparator<AmfSearch> orderByComparator)
		throws NoSuchAmfSearchException;

	/**
	* Returns the first amf search in the ordered set where amfSearchField = &#63;.
	*
	* @param amfSearchField the amf search field
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf search, or <code>null</code> if a matching amf search could not be found
	*/
	public AmfSearch fetchByamfSearchFieldFinder_First(long amfSearchField,
		com.liferay.portal.kernel.util.OrderByComparator<AmfSearch> orderByComparator);

	/**
	* Returns the last amf search in the ordered set where amfSearchField = &#63;.
	*
	* @param amfSearchField the amf search field
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf search
	* @throws NoSuchAmfSearchException if a matching amf search could not be found
	*/
	public AmfSearch findByamfSearchFieldFinder_Last(long amfSearchField,
		com.liferay.portal.kernel.util.OrderByComparator<AmfSearch> orderByComparator)
		throws NoSuchAmfSearchException;

	/**
	* Returns the last amf search in the ordered set where amfSearchField = &#63;.
	*
	* @param amfSearchField the amf search field
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf search, or <code>null</code> if a matching amf search could not be found
	*/
	public AmfSearch fetchByamfSearchFieldFinder_Last(long amfSearchField,
		com.liferay.portal.kernel.util.OrderByComparator<AmfSearch> orderByComparator);

	/**
	* Removes all the amf searchs where amfSearchField = &#63; from the database.
	*
	* @param amfSearchField the amf search field
	*/
	public void removeByamfSearchFieldFinder(long amfSearchField);

	/**
	* Returns the number of amf searchs where amfSearchField = &#63;.
	*
	* @param amfSearchField the amf search field
	* @return the number of matching amf searchs
	*/
	public int countByamfSearchFieldFinder(long amfSearchField);

	/**
	* Caches the amf search in the entity cache if it is enabled.
	*
	* @param amfSearch the amf search
	*/
	public void cacheResult(AmfSearch amfSearch);

	/**
	* Caches the amf searchs in the entity cache if it is enabled.
	*
	* @param amfSearchs the amf searchs
	*/
	public void cacheResult(java.util.List<AmfSearch> amfSearchs);

	/**
	* Creates a new amf search with the primary key. Does not add the amf search to the database.
	*
	* @param amfSearchField the primary key for the new amf search
	* @return the new amf search
	*/
	public AmfSearch create(long amfSearchField);

	/**
	* Removes the amf search with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param amfSearchField the primary key of the amf search
	* @return the amf search that was removed
	* @throws NoSuchAmfSearchException if a amf search with the primary key could not be found
	*/
	public AmfSearch remove(long amfSearchField)
		throws NoSuchAmfSearchException;

	public AmfSearch updateImpl(AmfSearch amfSearch);

	/**
	* Returns the amf search with the primary key or throws a {@link NoSuchAmfSearchException} if it could not be found.
	*
	* @param amfSearchField the primary key of the amf search
	* @return the amf search
	* @throws NoSuchAmfSearchException if a amf search with the primary key could not be found
	*/
	public AmfSearch findByPrimaryKey(long amfSearchField)
		throws NoSuchAmfSearchException;

	/**
	* Returns the amf search with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param amfSearchField the primary key of the amf search
	* @return the amf search, or <code>null</code> if a amf search with the primary key could not be found
	*/
	public AmfSearch fetchByPrimaryKey(long amfSearchField);

	@Override
	public java.util.Map<java.io.Serializable, AmfSearch> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the amf searchs.
	*
	* @return the amf searchs
	*/
	public java.util.List<AmfSearch> findAll();

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
	public java.util.List<AmfSearch> findAll(int start, int end);

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
	public java.util.List<AmfSearch> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfSearch> orderByComparator);

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
	public java.util.List<AmfSearch> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfSearch> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the amf searchs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of amf searchs.
	*
	* @return the number of amf searchs
	*/
	public int countAll();
}