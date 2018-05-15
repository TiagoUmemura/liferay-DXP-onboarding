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

import com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException;
import com.liferay.docs.amfRegistrationService.model.AmfAuditLog;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the amf audit log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.docs.amfRegistrationService.service.persistence.impl.AmfAuditLogPersistenceImpl
 * @see AmfAuditLogUtil
 * @generated
 */
@ProviderType
public interface AmfAuditLogPersistence extends BasePersistence<AmfAuditLog> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AmfAuditLogUtil} to access the amf audit log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the amf audit logs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching amf audit logs
	*/
	public java.util.List<AmfAuditLog> findByuserId(long userId);

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
	public java.util.List<AmfAuditLog> findByuserId(long userId, int start,
		int end);

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
	public java.util.List<AmfAuditLog> findByuserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

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
	public java.util.List<AmfAuditLog> findByuserId(long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first amf audit log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public AmfAuditLog findByuserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException;

	/**
	* Returns the first amf audit log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public AmfAuditLog fetchByuserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

	/**
	* Returns the last amf audit log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public AmfAuditLog findByuserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException;

	/**
	* Returns the last amf audit log in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public AmfAuditLog fetchByuserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

	/**
	* Returns the amf audit logs before and after the current amf audit log in the ordered set where userId = &#63;.
	*
	* @param amfAuditLogId the primary key of the current amf audit log
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next amf audit log
	* @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	*/
	public AmfAuditLog[] findByuserId_PrevAndNext(long amfAuditLogId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException;

	/**
	* Removes all the amf audit logs where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByuserId(long userId);

	/**
	* Returns the number of amf audit logs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching amf audit logs
	*/
	public int countByuserId(long userId);

	/**
	* Returns all the amf audit logs where eventType = &#63;.
	*
	* @param eventType the event type
	* @return the matching amf audit logs
	*/
	public java.util.List<AmfAuditLog> findByeventType(
		java.lang.String eventType);

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
	public java.util.List<AmfAuditLog> findByeventType(
		java.lang.String eventType, int start, int end);

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
	public java.util.List<AmfAuditLog> findByeventType(
		java.lang.String eventType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

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
	public java.util.List<AmfAuditLog> findByeventType(
		java.lang.String eventType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first amf audit log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public AmfAuditLog findByeventType_First(java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException;

	/**
	* Returns the first amf audit log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public AmfAuditLog fetchByeventType_First(java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

	/**
	* Returns the last amf audit log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public AmfAuditLog findByeventType_Last(java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException;

	/**
	* Returns the last amf audit log in the ordered set where eventType = &#63;.
	*
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public AmfAuditLog fetchByeventType_Last(java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

	/**
	* Returns the amf audit logs before and after the current amf audit log in the ordered set where eventType = &#63;.
	*
	* @param amfAuditLogId the primary key of the current amf audit log
	* @param eventType the event type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next amf audit log
	* @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	*/
	public AmfAuditLog[] findByeventType_PrevAndNext(long amfAuditLogId,
		java.lang.String eventType,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException;

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
	public java.util.List<AmfAuditLog> findByeventType(
		java.lang.String[] eventTypes);

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
	public java.util.List<AmfAuditLog> findByeventType(
		java.lang.String[] eventTypes, int start, int end);

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
	public java.util.List<AmfAuditLog> findByeventType(
		java.lang.String[] eventTypes, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

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
	public java.util.List<AmfAuditLog> findByeventType(
		java.lang.String[] eventTypes, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the amf audit logs where eventType = &#63; from the database.
	*
	* @param eventType the event type
	*/
	public void removeByeventType(java.lang.String eventType);

	/**
	* Returns the number of amf audit logs where eventType = &#63;.
	*
	* @param eventType the event type
	* @return the number of matching amf audit logs
	*/
	public int countByeventType(java.lang.String eventType);

	/**
	* Returns the number of amf audit logs where eventType = any &#63;.
	*
	* @param eventTypes the event types
	* @return the number of matching amf audit logs
	*/
	public int countByeventType(java.lang.String[] eventTypes);

	/**
	* Returns all the amf audit logs where eventType = &#63; and userName = &#63;.
	*
	* @param eventType the event type
	* @param userName the user name
	* @return the matching amf audit logs
	*/
	public java.util.List<AmfAuditLog> findByEventTypeAndUserName(
		java.lang.String eventType, java.lang.String userName);

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
	public java.util.List<AmfAuditLog> findByEventTypeAndUserName(
		java.lang.String eventType, java.lang.String userName, int start,
		int end);

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
	public java.util.List<AmfAuditLog> findByEventTypeAndUserName(
		java.lang.String eventType, java.lang.String userName, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

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
	public java.util.List<AmfAuditLog> findByEventTypeAndUserName(
		java.lang.String eventType, java.lang.String userName, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first amf audit log in the ordered set where eventType = &#63; and userName = &#63;.
	*
	* @param eventType the event type
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public AmfAuditLog findByEventTypeAndUserName_First(
		java.lang.String eventType, java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException;

	/**
	* Returns the first amf audit log in the ordered set where eventType = &#63; and userName = &#63;.
	*
	* @param eventType the event type
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public AmfAuditLog fetchByEventTypeAndUserName_First(
		java.lang.String eventType, java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

	/**
	* Returns the last amf audit log in the ordered set where eventType = &#63; and userName = &#63;.
	*
	* @param eventType the event type
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public AmfAuditLog findByEventTypeAndUserName_Last(
		java.lang.String eventType, java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException;

	/**
	* Returns the last amf audit log in the ordered set where eventType = &#63; and userName = &#63;.
	*
	* @param eventType the event type
	* @param userName the user name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public AmfAuditLog fetchByEventTypeAndUserName_Last(
		java.lang.String eventType, java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

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
	public AmfAuditLog[] findByEventTypeAndUserName_PrevAndNext(
		long amfAuditLogId, java.lang.String eventType,
		java.lang.String userName,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException;

	/**
	* Removes all the amf audit logs where eventType = &#63; and userName = &#63; from the database.
	*
	* @param eventType the event type
	* @param userName the user name
	*/
	public void removeByEventTypeAndUserName(java.lang.String eventType,
		java.lang.String userName);

	/**
	* Returns the number of amf audit logs where eventType = &#63; and userName = &#63;.
	*
	* @param eventType the event type
	* @param userName the user name
	* @return the number of matching amf audit logs
	*/
	public int countByEventTypeAndUserName(java.lang.String eventType,
		java.lang.String userName);

	/**
	* Returns all the amf audit logs where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @return the matching amf audit logs
	*/
	public java.util.List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId);

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
	public java.util.List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId, int start, int end);

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
	public java.util.List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

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
	public java.util.List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String eventType, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first amf audit log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public AmfAuditLog findByEventTypeAndUserId_First(
		java.lang.String eventType, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException;

	/**
	* Returns the first amf audit log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public AmfAuditLog fetchByEventTypeAndUserId_First(
		java.lang.String eventType, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

	/**
	* Returns the last amf audit log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log
	* @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	*/
	public AmfAuditLog findByEventTypeAndUserId_Last(
		java.lang.String eventType, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException;

	/**
	* Returns the last amf audit log in the ordered set where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	*/
	public AmfAuditLog fetchByEventTypeAndUserId_Last(
		java.lang.String eventType, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

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
	public AmfAuditLog[] findByEventTypeAndUserId_PrevAndNext(
		long amfAuditLogId, java.lang.String eventType, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException;

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
	public java.util.List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String[] eventTypes, long userId);

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
	public java.util.List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String[] eventTypes, long userId, int start, int end);

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
	public java.util.List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String[] eventTypes, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

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
	public java.util.List<AmfAuditLog> findByEventTypeAndUserId(
		java.lang.String[] eventTypes, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the amf audit logs where eventType = &#63; and userId = &#63; from the database.
	*
	* @param eventType the event type
	* @param userId the user ID
	*/
	public void removeByEventTypeAndUserId(java.lang.String eventType,
		long userId);

	/**
	* Returns the number of amf audit logs where eventType = &#63; and userId = &#63;.
	*
	* @param eventType the event type
	* @param userId the user ID
	* @return the number of matching amf audit logs
	*/
	public int countByEventTypeAndUserId(java.lang.String eventType, long userId);

	/**
	* Returns the number of amf audit logs where eventType = any &#63; and userId = &#63;.
	*
	* @param eventTypes the event types
	* @param userId the user ID
	* @return the number of matching amf audit logs
	*/
	public int countByEventTypeAndUserId(java.lang.String[] eventTypes,
		long userId);

	/**
	* Caches the amf audit log in the entity cache if it is enabled.
	*
	* @param amfAuditLog the amf audit log
	*/
	public void cacheResult(AmfAuditLog amfAuditLog);

	/**
	* Caches the amf audit logs in the entity cache if it is enabled.
	*
	* @param amfAuditLogs the amf audit logs
	*/
	public void cacheResult(java.util.List<AmfAuditLog> amfAuditLogs);

	/**
	* Creates a new amf audit log with the primary key. Does not add the amf audit log to the database.
	*
	* @param amfAuditLogId the primary key for the new amf audit log
	* @return the new amf audit log
	*/
	public AmfAuditLog create(long amfAuditLogId);

	/**
	* Removes the amf audit log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param amfAuditLogId the primary key of the amf audit log
	* @return the amf audit log that was removed
	* @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	*/
	public AmfAuditLog remove(long amfAuditLogId)
		throws NoSuchAmfAuditLogException;

	public AmfAuditLog updateImpl(AmfAuditLog amfAuditLog);

	/**
	* Returns the amf audit log with the primary key or throws a {@link NoSuchAmfAuditLogException} if it could not be found.
	*
	* @param amfAuditLogId the primary key of the amf audit log
	* @return the amf audit log
	* @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	*/
	public AmfAuditLog findByPrimaryKey(long amfAuditLogId)
		throws NoSuchAmfAuditLogException;

	/**
	* Returns the amf audit log with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param amfAuditLogId the primary key of the amf audit log
	* @return the amf audit log, or <code>null</code> if a amf audit log with the primary key could not be found
	*/
	public AmfAuditLog fetchByPrimaryKey(long amfAuditLogId);

	@Override
	public java.util.Map<java.io.Serializable, AmfAuditLog> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the amf audit logs.
	*
	* @return the amf audit logs
	*/
	public java.util.List<AmfAuditLog> findAll();

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
	public java.util.List<AmfAuditLog> findAll(int start, int end);

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
	public java.util.List<AmfAuditLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator);

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
	public java.util.List<AmfAuditLog> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the amf audit logs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of amf audit logs.
	*
	* @return the number of amf audit logs
	*/
	public int countAll();
}