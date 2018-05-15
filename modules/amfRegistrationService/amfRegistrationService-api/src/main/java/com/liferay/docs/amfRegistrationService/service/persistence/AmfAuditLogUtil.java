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

import com.liferay.docs.amfRegistrationService.model.AmfAuditLog;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the amf audit log service. This utility wraps {@link com.liferay.docs.amfRegistrationService.service.persistence.impl.AmfAuditLogPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AmfAuditLogPersistence
 * @see com.liferay.docs.amfRegistrationService.service.persistence.impl.AmfAuditLogPersistenceImpl
 * @generated
 */
@ProviderType
public class AmfAuditLogUtil {
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
	public static void clearCache(AmfAuditLog amfAuditLog) {
		getPersistence().clearCache(amfAuditLog);
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
	public static List<AmfAuditLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AmfAuditLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AmfAuditLog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AmfAuditLog update(AmfAuditLog amfAuditLog) {
		return getPersistence().update(amfAuditLog);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AmfAuditLog update(AmfAuditLog amfAuditLog,
		ServiceContext serviceContext) {
		return getPersistence().update(amfAuditLog, serviceContext);
	}

	/**
	* Returns all the amf audit logs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching amf audit logs
	*/
	public static List<AmfAuditLog> findByuserId(long userId) {
		return getPersistence().findByuserId(userId);
	}

	/**
	* Returns a range of all the amf audit logs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @return the range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByuserId(long userId, int start, int end) {
		return getPersistence().findByuserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the amf audit logs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByuserId(long userId, int start,
		int end, OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence()
				   .findByuserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the amf audit logs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByuserId(long userId, int start,
		int end, OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByuserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first amf audit log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public static AmfAuditLog findByuserId_First(long userId,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException {
		return getPersistence().findByuserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first amf audit log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public static AmfAuditLog fetchByuserId_First(long userId,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence().fetchByuserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last amf audit log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public static AmfAuditLog findByuserId_Last(long userId,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException {
		return getPersistence().findByuserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last amf audit log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public static AmfAuditLog fetchByuserId_Last(long userId,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence().fetchByuserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the amf audit logs before and after the current amf audit log in the ordered set where userId = &#63;.
	*
	* @param amfAuditLogId the primary key of the current amf audit log
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next amf audit log
	* @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	*/
	public static AmfAuditLog[] findByuserId_PrevAndNext(long amfAuditLogId,
		long userId, OrderByComparator<AmfAuditLog> orderByComparator)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException {
		return getPersistence()
				   .findByuserId_PrevAndNext(amfAuditLogId, userId,
			orderByComparator);
	}

	/**
	* Removes all the amf audit logs where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByuserId(long userId) {
		getPersistence().removeByuserId(userId);
	}

	/**
	* Returns the number of amf audit logs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching amf audit logs
	*/
	public static int countByuserId(long userId) {
		return getPersistence().countByuserId(userId);
	}

	/**
	* Returns all the amf audit logs where eventType = &#63;.
	*
	* @param eventType the event type
	* @return the matching amf audit logs
	*/
	public static List<AmfAuditLog> findByeventType(java.lang.String eventType) {
		return getPersistence().findByeventType(eventType);
	}

	/**
	* Returns a range of all the amf audit logs where eventType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @return the range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByeventType(
		java.lang.String eventType, int start, int end) {
		return getPersistence().findByeventType(eventType, start, end);
	}

	/**
	* Returns an ordered range of all the amf audit logs where eventType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByeventType(
		java.lang.String eventType, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence()
				   .findByeventType(eventType, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the amf audit logs where eventType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByeventType(
		java.lang.String eventType, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByeventType(eventType, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first amf audit log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public static AmfAuditLog findByeventType_First(
		java.lang.String eventType,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException {
		return getPersistence()
				   .findByeventType_First(eventType, orderByComparator);
	}

	/**
	* Returns the first amf audit log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public static AmfAuditLog fetchByeventType_First(
		java.lang.String eventType,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence()
				   .fetchByeventType_First(eventType, orderByComparator);
	}

	/**
	* Returns the last amf audit log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public static AmfAuditLog findByeventType_Last(java.lang.String eventType,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException {
		return getPersistence()
				   .findByeventType_Last(eventType, orderByComparator);
	}

	/**
	* Returns the last amf audit log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public static AmfAuditLog fetchByeventType_Last(
		java.lang.String eventType,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence()
				   .fetchByeventType_Last(eventType, orderByComparator);
	}

	/**
	* Returns the amf audit logs before and after the current amf audit log in the ordered set where eventType = &#63;.
	*
	* @param amfAuditLogId the primary key of the current amf audit log
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next amf audit log
	* @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	*/
	public static AmfAuditLog[] findByeventType_PrevAndNext(
		long amfAuditLogId, java.lang.String eventType,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException {
		return getPersistence()
				   .findByeventType_PrevAndNext(amfAuditLogId, eventType,
			orderByComparator);
	}

	/**
	* Returns all the amf audit logs where eventType = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventTypes the event types
	* @return the matching amf audit logs
	*/
	public static List<AmfAuditLog> findByeventType(
		java.lang.String[] eventTypes) {
		return getPersistence().findByeventType(eventTypes);
	}

	/**
	* Returns a range of all the amf audit logs where eventType = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventTypes the event types
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @return the range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByeventType(
		java.lang.String[] eventTypes, int start, int end) {
		return getPersistence().findByeventType(eventTypes, start, end);
	}

	/**
	* Returns an ordered range of all the amf audit logs where eventType = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventTypes the event types
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByeventType(
		java.lang.String[] eventTypes, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence()
				   .findByeventType(eventTypes, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the amf audit logs where eventType = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByeventType(
		java.lang.String[] eventTypes, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByeventType(eventTypes, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Removes all the amf audit logs where eventType = &#63; from the database.
	*
	* @param eventType the event type
	*/
	public static void removeByeventType(java.lang.String eventType) {
		getPersistence().removeByeventType(eventType);
	}

	/**
	* Returns the number of amf audit logs where eventType = &#63;.
	*
	* @param eventType the event type
	* @return the number of matching amf audit logs
	*/
	public static int countByeventType(java.lang.String eventType) {
		return getPersistence().countByeventType(eventType);
	}

	/**
	* Returns the number of amf audit logs where eventType = any &#63;.
	*
	* @param eventTypes the event types
	* @return the number of matching amf audit logs
	*/
	public static int countByeventType(java.lang.String[] eventTypes) {
		return getPersistence().countByeventType(eventTypes);
	}

	/**
	* Returns all the amf audit logs where eventType = &#63; and userName = &#63;.
	*
	* @param eventType the event type
	* @param userName the user name
	* @return the matching amf audit logs
	*/
	public static List<AmfAuditLog> findByEventTypeAndUserName(
		java.lang.String eventType, java.lang.String userName) {
		return getPersistence().findByEventTypeAndUserName(eventType, userName);
	}

	/**
	* Returns a range of all the amf audit logs where eventType = &#63; and userName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param userName the user name
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @return the range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByEventTypeAndUserName(
		java.lang.String eventType, java.lang.String userName, int start,
		int end) {
		return getPersistence()
				   .findByEventTypeAndUserName(eventType, userName, start, end);
	}

	/**
	* Returns an ordered range of all the amf audit logs where eventType = &#63; and userName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param userName the user name
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByEventTypeAndUserName(
		java.lang.String eventType, java.lang.String userName, int start,
		int end, OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence()
				   .findByEventTypeAndUserName(eventType, userName, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the amf audit logs where eventType = &#63; and userName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param userName the user name
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByEventTypeAndUserName(
		java.lang.String eventType, java.lang.String userName, int start,
		int end, OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByEventTypeAndUserName(eventType, userName, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first amf audit log in the ordered set where eventType = &#63; and userName = &#63;.
	*
	* @param eventType the event type
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public static AmfAuditLog findByEventTypeAndUserName_First(
		java.lang.String eventType, java.lang.String userName,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException {
		return getPersistence()
				   .findByEventTypeAndUserName_First(eventType, userName,
			orderByComparator);
	}

	/**
	* Returns the first amf audit log in the ordered set where eventType = &#63; and userName = &#63;.
	*
	* @param eventType the event type
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public static AmfAuditLog fetchByEventTypeAndUserName_First(
		java.lang.String eventType, java.lang.String userName,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence()
				   .fetchByEventTypeAndUserName_First(eventType, userName,
			orderByComparator);
	}

	/**
	* Returns the last amf audit log in the ordered set where eventType = &#63; and userName = &#63;.
	*
	* @param eventType the event type
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public static AmfAuditLog findByEventTypeAndUserName_Last(
		java.lang.String eventType, java.lang.String userName,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException {
		return getPersistence()
				   .findByEventTypeAndUserName_Last(eventType, userName,
			orderByComparator);
	}

	/**
	* Returns the last amf audit log in the ordered set where eventType = &#63; and userName = &#63;.
	*
	* @param eventType the event type
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public static AmfAuditLog fetchByEventTypeAndUserName_Last(
		java.lang.String eventType, java.lang.String userName,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence()
				   .fetchByEventTypeAndUserName_Last(eventType, userName,
			orderByComparator);
	}

	/**
	* Returns the amf audit logs before and after the current amf audit log in the ordered set where eventType = &#63; and userName = &#63;.
	*
	* @param amfAuditLogId the primary key of the current amf audit log
	* @param eventType the event type
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next amf audit log
	* @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	*/
	public static AmfAuditLog[] findByEventTypeAndUserName_PrevAndNext(
		long amfAuditLogId, java.lang.String eventType,
		java.lang.String userName,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException {
		return getPersistence()
				   .findByEventTypeAndUserName_PrevAndNext(amfAuditLogId,
			eventType, userName, orderByComparator);
	}

	/**
	* Removes all the amf audit logs where eventType = &#63; and userName = &#63; from the database.
	*
	* @param eventType the event type
	* @param userName the user name
	*/
	public static void removeByEventTypeAndUserName(
		java.lang.String eventType, java.lang.String userName) {
		getPersistence().removeByEventTypeAndUserName(eventType, userName);
	}

	/**
	* Returns the number of amf audit logs where eventType = &#63; and userName = &#63;.
	*
	* @param eventType the event type
	* @param userName the user name
	* @return the number of matching amf audit logs
	*/
	public static int countByEventTypeAndUserName(java.lang.String eventType,
		java.lang.String userName) {
		return getPersistence().countByEventTypeAndUserName(eventType, userName);
	}

	/**
	* Returns all the amf audit logs where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @return the matching amf audit logs
	*/
	public static List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId) {
		return getPersistence().findByEventTypeAndUserId(eventType, userId);
	}

	/**
	* Returns a range of all the amf audit logs where eventType = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @return the range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId, int start, int end) {
		return getPersistence()
				   .findByEventTypeAndUserId(eventType, userId, start, end);
	}

	/**
	* Returns an ordered range of all the amf audit logs where eventType = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence()
				   .findByEventTypeAndUserId(eventType, userId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the amf audit logs where eventType = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByEventTypeAndUserId(eventType, userId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first amf audit log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public static AmfAuditLog findByEventTypeAndUserId_First(
		java.lang.String eventType, long userId,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException {
		return getPersistence()
				   .findByEventTypeAndUserId_First(eventType, userId,
			orderByComparator);
	}

	/**
	* Returns the first amf audit log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public static AmfAuditLog fetchByEventTypeAndUserId_First(
		java.lang.String eventType, long userId,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence()
				   .fetchByEventTypeAndUserId_First(eventType, userId,
			orderByComparator);
	}

	/**
	* Returns the last amf audit log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public static AmfAuditLog findByEventTypeAndUserId_Last(
		java.lang.String eventType, long userId,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException {
		return getPersistence()
				   .findByEventTypeAndUserId_Last(eventType, userId,
			orderByComparator);
	}

	/**
	* Returns the last amf audit log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public static AmfAuditLog fetchByEventTypeAndUserId_Last(
		java.lang.String eventType, long userId,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence()
				   .fetchByEventTypeAndUserId_Last(eventType, userId,
			orderByComparator);
	}

	/**
	* Returns the amf audit logs before and after the current amf audit log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param amfAuditLogId the primary key of the current amf audit log
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next amf audit log
	* @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	*/
	public static AmfAuditLog[] findByEventTypeAndUserId_PrevAndNext(
		long amfAuditLogId, java.lang.String eventType, long userId,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException {
		return getPersistence()
				   .findByEventTypeAndUserId_PrevAndNext(amfAuditLogId,
			eventType, userId, orderByComparator);
	}

	/**
	* Returns all the amf audit logs where eventType = any &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventTypes the event types
	* @param userId the user ID
	* @return the matching amf audit logs
	*/
	public static List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String[] eventTypes, long userId) {
		return getPersistence().findByEventTypeAndUserId(eventTypes, userId);
	}

	/**
	* Returns a range of all the amf audit logs where eventType = any &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventTypes the event types
	* @param userId the user ID
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @return the range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String[] eventTypes, long userId, int start, int end) {
		return getPersistence()
				   .findByEventTypeAndUserId(eventTypes, userId, start, end);
	}

	/**
	* Returns an ordered range of all the amf audit logs where eventType = any &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventTypes the event types
	* @param userId the user ID
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String[] eventTypes, long userId, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence()
				   .findByEventTypeAndUserId(eventTypes, userId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the amf audit logs where eventType = &#63; and userId = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching amf audit logs
	*/
	public static List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String[] eventTypes, long userId, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByEventTypeAndUserId(eventTypes, userId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the amf audit logs where eventType = &#63; and userId = &#63; from the database.
	*
	* @param eventType the event type
	* @param userId the user ID
	*/
	public static void removeByEventTypeAndUserId(java.lang.String eventType,
		long userId) {
		getPersistence().removeByEventTypeAndUserId(eventType, userId);
	}

	/**
	* Returns the number of amf audit logs where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @return the number of matching amf audit logs
	*/
	public static int countByEventTypeAndUserId(java.lang.String eventType,
		long userId) {
		return getPersistence().countByEventTypeAndUserId(eventType, userId);
	}

	/**
	* Returns the number of amf audit logs where eventType = any &#63; and userId = &#63;.
	*
	* @param eventTypes the event types
	* @param userId the user ID
	* @return the number of matching amf audit logs
	*/
	public static int countByEventTypeAndUserId(java.lang.String[] eventTypes,
		long userId) {
		return getPersistence().countByEventTypeAndUserId(eventTypes, userId);
	}

	/**
	* Caches the amf audit log in the entity cache if it is enabled.
	*
	* @param amfAuditLog the amf audit log
	*/
	public static void cacheResult(AmfAuditLog amfAuditLog) {
		getPersistence().cacheResult(amfAuditLog);
	}

	/**
	* Caches the amf audit logs in the entity cache if it is enabled.
	*
	* @param amfAuditLogs the amf audit logs
	*/
	public static void cacheResult(List<AmfAuditLog> amfAuditLogs) {
		getPersistence().cacheResult(amfAuditLogs);
	}

	/**
	* Creates a new amf audit log with the primary key. Does not add the amf audit log to the database.
	*
	* @param amfAuditLogId the primary key for the new amf audit log
	* @return the new amf audit log
	*/
	public static AmfAuditLog create(long amfAuditLogId) {
		return getPersistence().create(amfAuditLogId);
	}

	/**
	* Removes the amf audit log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param amfAuditLogId the primary key of the amf audit log
	* @return the amf audit log that was removed
	* @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	*/
	public static AmfAuditLog remove(long amfAuditLogId)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException {
		return getPersistence().remove(amfAuditLogId);
	}

	public static AmfAuditLog updateImpl(AmfAuditLog amfAuditLog) {
		return getPersistence().updateImpl(amfAuditLog);
	}

	/**
	* Returns the amf audit log with the primary key or throws a {@link NoSuchAmfAuditLogException} if it could not be found.
	*
	* @param amfAuditLogId the primary key of the amf audit log
	* @return the amf audit log
	* @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	*/
	public static AmfAuditLog findByPrimaryKey(long amfAuditLogId)
		throws com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException {
		return getPersistence().findByPrimaryKey(amfAuditLogId);
	}

	/**
	* Returns the amf audit log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param amfAuditLogId the primary key of the amf audit log
	* @return the amf audit log, or <code>null</code> if a amf audit log with the primary key could not be found
	*/
	public static AmfAuditLog fetchByPrimaryKey(long amfAuditLogId) {
		return getPersistence().fetchByPrimaryKey(amfAuditLogId);
	}

	public static java.util.Map<java.io.Serializable, AmfAuditLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the amf audit logs.
	*
	* @return the amf audit logs
	*/
	public static List<AmfAuditLog> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the amf audit logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @return the range of amf audit logs
	*/
	public static List<AmfAuditLog> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the amf audit logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of amf audit logs
	*/
	public static List<AmfAuditLog> findAll(int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the amf audit logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of amf audit logs
	*/
	public static List<AmfAuditLog> findAll(int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the amf audit logs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of amf audit logs.
	*
	* @return the number of amf audit logs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AmfAuditLogPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AmfAuditLogPersistence, AmfAuditLogPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AmfAuditLogPersistence.class);
}