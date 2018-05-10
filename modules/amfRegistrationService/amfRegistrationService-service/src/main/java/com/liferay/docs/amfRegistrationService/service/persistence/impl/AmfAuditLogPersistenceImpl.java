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

import aQute.bnd.annotation.ProviderType;

import com.liferay.docs.amfRegistrationService.exception.NoSuchAmfAuditLogException;
import com.liferay.docs.amfRegistrationService.model.AmfAuditLog;
import com.liferay.docs.amfRegistrationService.model.impl.AmfAuditLogImpl;
import com.liferay.docs.amfRegistrationService.model.impl.AmfAuditLogModelImpl;
import com.liferay.docs.amfRegistrationService.service.persistence.AmfAuditLogPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the amf audit log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AmfAuditLogPersistence
 * @see com.liferay.docs.amfRegistrationService.service.persistence.AmfAuditLogUtil
 * @generated
 */
@ProviderType
public class AmfAuditLogPersistenceImpl extends BasePersistenceImpl<AmfAuditLog>
	implements AmfAuditLogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AmfAuditLogUtil} to access the amf audit log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AmfAuditLogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, AmfAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, AmfAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERNAME = new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, AmfAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByuserName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERNAME =
		new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, AmfAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByuserName",
			new String[] { String.class.getName() },
			AmfAuditLogModelImpl.USERNAME_COLUMN_BITMASK |
			AmfAuditLogModelImpl.DATETIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERNAME = new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the amf audit logs where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the matching amf audit logs
	 */
	@Override
	public List<AmfAuditLog> findByuserName(String userName) {
		return findByuserName(userName, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the amf audit logs where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of amf audit logs
	 * @param end the upper bound of the range of amf audit logs (not inclusive)
	 * @return the range of matching amf audit logs
	 */
	@Override
	public List<AmfAuditLog> findByuserName(String userName, int start, int end) {
		return findByuserName(userName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the amf audit logs where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of amf audit logs
	 * @param end the upper bound of the range of amf audit logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching amf audit logs
	 */
	@Override
	public List<AmfAuditLog> findByuserName(String userName, int start,
		int end, OrderByComparator<AmfAuditLog> orderByComparator) {
		return findByuserName(userName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the amf audit logs where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of amf audit logs
	 * @param end the upper bound of the range of amf audit logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching amf audit logs
	 */
	@Override
	public List<AmfAuditLog> findByuserName(String userName, int start,
		int end, OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERNAME;
			finderArgs = new Object[] { userName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERNAME;
			finderArgs = new Object[] { userName, start, end, orderByComparator };
		}

		List<AmfAuditLog> list = null;

		if (retrieveFromCache) {
			list = (List<AmfAuditLog>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AmfAuditLog amfAuditLog : list) {
					if (!Objects.equals(userName, amfAuditLog.getUserName())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_AMFAUDITLOG_WHERE);

			boolean bindUserName = false;

			if (userName == null) {
				query.append(_FINDER_COLUMN_USERNAME_USERNAME_1);
			}
			else if (userName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_USERNAME_USERNAME_3);
			}
			else {
				bindUserName = true;

				query.append(_FINDER_COLUMN_USERNAME_USERNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AmfAuditLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUserName) {
					qPos.add(userName);
				}

				if (!pagination) {
					list = (List<AmfAuditLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AmfAuditLog>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first amf audit log in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching amf audit log
	 * @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	 */
	@Override
	public AmfAuditLog findByuserName_First(String userName,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException {
		AmfAuditLog amfAuditLog = fetchByuserName_First(userName,
				orderByComparator);

		if (amfAuditLog != null) {
			return amfAuditLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userName=");
		msg.append(userName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAmfAuditLogException(msg.toString());
	}

	/**
	 * Returns the first amf audit log in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	 */
	@Override
	public AmfAuditLog fetchByuserName_First(String userName,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		List<AmfAuditLog> list = findByuserName(userName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last amf audit log in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching amf audit log
	 * @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	 */
	@Override
	public AmfAuditLog findByuserName_Last(String userName,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException {
		AmfAuditLog amfAuditLog = fetchByuserName_Last(userName,
				orderByComparator);

		if (amfAuditLog != null) {
			return amfAuditLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userName=");
		msg.append(userName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAmfAuditLogException(msg.toString());
	}

	/**
	 * Returns the last amf audit log in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	 */
	@Override
	public AmfAuditLog fetchByuserName_Last(String userName,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		int count = countByuserName(userName);

		if (count == 0) {
			return null;
		}

		List<AmfAuditLog> list = findByuserName(userName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the amf audit logs before and after the current amf audit log in the ordered set where userName = &#63;.
	 *
	 * @param amfAuditLogId the primary key of the current amf audit log
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next amf audit log
	 * @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	 */
	@Override
	public AmfAuditLog[] findByuserName_PrevAndNext(long amfAuditLogId,
		String userName, OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException {
		AmfAuditLog amfAuditLog = findByPrimaryKey(amfAuditLogId);

		Session session = null;

		try {
			session = openSession();

			AmfAuditLog[] array = new AmfAuditLogImpl[3];

			array[0] = getByuserName_PrevAndNext(session, amfAuditLog,
					userName, orderByComparator, true);

			array[1] = amfAuditLog;

			array[2] = getByuserName_PrevAndNext(session, amfAuditLog,
					userName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AmfAuditLog getByuserName_PrevAndNext(Session session,
		AmfAuditLog amfAuditLog, String userName,
		OrderByComparator<AmfAuditLog> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_AMFAUDITLOG_WHERE);

		boolean bindUserName = false;

		if (userName == null) {
			query.append(_FINDER_COLUMN_USERNAME_USERNAME_1);
		}
		else if (userName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_USERNAME_USERNAME_3);
		}
		else {
			bindUserName = true;

			query.append(_FINDER_COLUMN_USERNAME_USERNAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AmfAuditLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUserName) {
			qPos.add(userName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(amfAuditLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AmfAuditLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the amf audit logs where userName = &#63; from the database.
	 *
	 * @param userName the user name
	 */
	@Override
	public void removeByuserName(String userName) {
		for (AmfAuditLog amfAuditLog : findByuserName(userName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(amfAuditLog);
		}
	}

	/**
	 * Returns the number of amf audit logs where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the number of matching amf audit logs
	 */
	@Override
	public int countByuserName(String userName) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERNAME;

		Object[] finderArgs = new Object[] { userName };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_AMFAUDITLOG_WHERE);

			boolean bindUserName = false;

			if (userName == null) {
				query.append(_FINDER_COLUMN_USERNAME_USERNAME_1);
			}
			else if (userName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_USERNAME_USERNAME_3);
			}
			else {
				bindUserName = true;

				query.append(_FINDER_COLUMN_USERNAME_USERNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUserName) {
					qPos.add(userName);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERNAME_USERNAME_1 = "amfAuditLog.userName IS NULL";
	private static final String _FINDER_COLUMN_USERNAME_USERNAME_2 = "amfAuditLog.userName = ?";
	private static final String _FINDER_COLUMN_USERNAME_USERNAME_3 = "(amfAuditLog.userName IS NULL OR amfAuditLog.userName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENTTYPE =
		new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, AmfAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByeventType",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPE =
		new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, AmfAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByeventType",
			new String[] { String.class.getName() },
			AmfAuditLogModelImpl.EVENTTYPE_COLUMN_BITMASK |
			AmfAuditLogModelImpl.DATETIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EVENTTYPE = new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByeventType",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_EVENTTYPE =
		new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByeventType",
			new String[] { String.class.getName() });

	/**
	 * Returns all the amf audit logs where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @return the matching amf audit logs
	 */
	@Override
	public List<AmfAuditLog> findByeventType(String eventType) {
		return findByeventType(eventType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<AmfAuditLog> findByeventType(String eventType, int start,
		int end) {
		return findByeventType(eventType, start, end, null);
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
	@Override
	public List<AmfAuditLog> findByeventType(String eventType, int start,
		int end, OrderByComparator<AmfAuditLog> orderByComparator) {
		return findByeventType(eventType, start, end, orderByComparator, true);
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
	@Override
	public List<AmfAuditLog> findByeventType(String eventType, int start,
		int end, OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPE;
			finderArgs = new Object[] { eventType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENTTYPE;
			finderArgs = new Object[] { eventType, start, end, orderByComparator };
		}

		List<AmfAuditLog> list = null;

		if (retrieveFromCache) {
			list = (List<AmfAuditLog>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AmfAuditLog amfAuditLog : list) {
					if (!Objects.equals(eventType, amfAuditLog.getEventType())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_AMFAUDITLOG_WHERE);

			boolean bindEventType = false;

			if (eventType == null) {
				query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_1);
			}
			else if (eventType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_3);
			}
			else {
				bindEventType = true;

				query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AmfAuditLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEventType) {
					qPos.add(eventType);
				}

				if (!pagination) {
					list = (List<AmfAuditLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AmfAuditLog>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first amf audit log in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching amf audit log
	 * @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	 */
	@Override
	public AmfAuditLog findByeventType_First(String eventType,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException {
		AmfAuditLog amfAuditLog = fetchByeventType_First(eventType,
				orderByComparator);

		if (amfAuditLog != null) {
			return amfAuditLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("eventType=");
		msg.append(eventType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAmfAuditLogException(msg.toString());
	}

	/**
	 * Returns the first amf audit log in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	 */
	@Override
	public AmfAuditLog fetchByeventType_First(String eventType,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		List<AmfAuditLog> list = findByeventType(eventType, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last amf audit log in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching amf audit log
	 * @throws NoSuchAmfAuditLogException if a matching amf audit log could not be found
	 */
	@Override
	public AmfAuditLog findByeventType_Last(String eventType,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException {
		AmfAuditLog amfAuditLog = fetchByeventType_Last(eventType,
				orderByComparator);

		if (amfAuditLog != null) {
			return amfAuditLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("eventType=");
		msg.append(eventType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAmfAuditLogException(msg.toString());
	}

	/**
	 * Returns the last amf audit log in the ordered set where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	 */
	@Override
	public AmfAuditLog fetchByeventType_Last(String eventType,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		int count = countByeventType(eventType);

		if (count == 0) {
			return null;
		}

		List<AmfAuditLog> list = findByeventType(eventType, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public AmfAuditLog[] findByeventType_PrevAndNext(long amfAuditLogId,
		String eventType, OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException {
		AmfAuditLog amfAuditLog = findByPrimaryKey(amfAuditLogId);

		Session session = null;

		try {
			session = openSession();

			AmfAuditLog[] array = new AmfAuditLogImpl[3];

			array[0] = getByeventType_PrevAndNext(session, amfAuditLog,
					eventType, orderByComparator, true);

			array[1] = amfAuditLog;

			array[2] = getByeventType_PrevAndNext(session, amfAuditLog,
					eventType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AmfAuditLog getByeventType_PrevAndNext(Session session,
		AmfAuditLog amfAuditLog, String eventType,
		OrderByComparator<AmfAuditLog> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_AMFAUDITLOG_WHERE);

		boolean bindEventType = false;

		if (eventType == null) {
			query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_1);
		}
		else if (eventType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_3);
		}
		else {
			bindEventType = true;

			query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AmfAuditLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEventType) {
			qPos.add(eventType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(amfAuditLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AmfAuditLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
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
	@Override
	public List<AmfAuditLog> findByeventType(String[] eventTypes) {
		return findByeventType(eventTypes, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<AmfAuditLog> findByeventType(String[] eventTypes, int start,
		int end) {
		return findByeventType(eventTypes, start, end, null);
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
	@Override
	public List<AmfAuditLog> findByeventType(String[] eventTypes, int start,
		int end, OrderByComparator<AmfAuditLog> orderByComparator) {
		return findByeventType(eventTypes, start, end, orderByComparator, true);
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
	@Override
	public List<AmfAuditLog> findByeventType(String[] eventTypes, int start,
		int end, OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		if (eventTypes == null) {
			eventTypes = new String[0];
		}
		else if (eventTypes.length > 1) {
			eventTypes = ArrayUtil.distinct(eventTypes,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(eventTypes, NULL_SAFE_STRING_COMPARATOR);
		}

		if (eventTypes.length == 1) {
			return findByeventType(eventTypes[0], start, end, orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { StringUtil.merge(eventTypes) };
		}
		else {
			finderArgs = new Object[] {
					StringUtil.merge(eventTypes),
					
					start, end, orderByComparator
				};
		}

		List<AmfAuditLog> list = null;

		if (retrieveFromCache) {
			list = (List<AmfAuditLog>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENTTYPE,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AmfAuditLog amfAuditLog : list) {
					if (!ArrayUtil.contains(eventTypes,
								amfAuditLog.getEventType())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_AMFAUDITLOG_WHERE);

			if (eventTypes.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < eventTypes.length; i++) {
					String eventType = eventTypes[i];

					if (eventType == null) {
						query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_1);
					}
					else if (eventType.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_3);
					}
					else {
						query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_2);
					}

					if ((i + 1) < eventTypes.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AmfAuditLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				for (String eventType : eventTypes) {
					if ((eventType != null) && !eventType.isEmpty()) {
						qPos.add(eventType);
					}
				}

				if (!pagination) {
					list = (List<AmfAuditLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AmfAuditLog>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENTTYPE,
					finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENTTYPE,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the amf audit logs where eventType = &#63; from the database.
	 *
	 * @param eventType the event type
	 */
	@Override
	public void removeByeventType(String eventType) {
		for (AmfAuditLog amfAuditLog : findByeventType(eventType,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(amfAuditLog);
		}
	}

	/**
	 * Returns the number of amf audit logs where eventType = &#63;.
	 *
	 * @param eventType the event type
	 * @return the number of matching amf audit logs
	 */
	@Override
	public int countByeventType(String eventType) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EVENTTYPE;

		Object[] finderArgs = new Object[] { eventType };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_AMFAUDITLOG_WHERE);

			boolean bindEventType = false;

			if (eventType == null) {
				query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_1);
			}
			else if (eventType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_3);
			}
			else {
				bindEventType = true;

				query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEventType) {
					qPos.add(eventType);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of amf audit logs where eventType = any &#63;.
	 *
	 * @param eventTypes the event types
	 * @return the number of matching amf audit logs
	 */
	@Override
	public int countByeventType(String[] eventTypes) {
		if (eventTypes == null) {
			eventTypes = new String[0];
		}
		else if (eventTypes.length > 1) {
			eventTypes = ArrayUtil.distinct(eventTypes,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(eventTypes, NULL_SAFE_STRING_COMPARATOR);
		}

		Object[] finderArgs = new Object[] { StringUtil.merge(eventTypes) };

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_EVENTTYPE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_AMFAUDITLOG_WHERE);

			if (eventTypes.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < eventTypes.length; i++) {
					String eventType = eventTypes[i];

					if (eventType == null) {
						query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_1);
					}
					else if (eventType.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_3);
					}
					else {
						query.append(_FINDER_COLUMN_EVENTTYPE_EVENTTYPE_2);
					}

					if ((i + 1) < eventTypes.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				for (String eventType : eventTypes) {
					if ((eventType != null) && !eventType.isEmpty()) {
						qPos.add(eventType);
					}
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_EVENTTYPE,
					finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_EVENTTYPE,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EVENTTYPE_EVENTTYPE_1 = "amfAuditLog.eventType IS NULL";
	private static final String _FINDER_COLUMN_EVENTTYPE_EVENTTYPE_2 = "amfAuditLog.eventType = ?";
	private static final String _FINDER_COLUMN_EVENTTYPE_EVENTTYPE_3 = "(amfAuditLog.eventType IS NULL OR amfAuditLog.eventType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENTTYPEANDUSERNAME =
		new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, AmfAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByEventTypeAndUserName",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPEANDUSERNAME =
		new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, AmfAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByEventTypeAndUserName",
			new String[] { String.class.getName(), String.class.getName() },
			AmfAuditLogModelImpl.EVENTTYPE_COLUMN_BITMASK |
			AmfAuditLogModelImpl.USERNAME_COLUMN_BITMASK |
			AmfAuditLogModelImpl.DATETIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EVENTTYPEANDUSERNAME = new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByEventTypeAndUserName",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the amf audit logs where eventType = &#63; and userName = &#63;.
	 *
	 * @param eventType the event type
	 * @param userName the user name
	 * @return the matching amf audit logs
	 */
	@Override
	public List<AmfAuditLog> findByEventTypeAndUserName(String eventType,
		String userName) {
		return findByEventTypeAndUserName(eventType, userName,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AmfAuditLog> findByEventTypeAndUserName(String eventType,
		String userName, int start, int end) {
		return findByEventTypeAndUserName(eventType, userName, start, end, null);
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
	@Override
	public List<AmfAuditLog> findByEventTypeAndUserName(String eventType,
		String userName, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return findByEventTypeAndUserName(eventType, userName, start, end,
			orderByComparator, true);
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
	@Override
	public List<AmfAuditLog> findByEventTypeAndUserName(String eventType,
		String userName, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPEANDUSERNAME;
			finderArgs = new Object[] { eventType, userName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENTTYPEANDUSERNAME;
			finderArgs = new Object[] {
					eventType, userName,
					
					start, end, orderByComparator
				};
		}

		List<AmfAuditLog> list = null;

		if (retrieveFromCache) {
			list = (List<AmfAuditLog>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AmfAuditLog amfAuditLog : list) {
					if (!Objects.equals(eventType, amfAuditLog.getEventType()) ||
							!Objects.equals(userName, amfAuditLog.getUserName())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_AMFAUDITLOG_WHERE);

			boolean bindEventType = false;

			if (eventType == null) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_EVENTTYPE_1);
			}
			else if (eventType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_EVENTTYPE_3);
			}
			else {
				bindEventType = true;

				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_EVENTTYPE_2);
			}

			boolean bindUserName = false;

			if (userName == null) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_USERNAME_1);
			}
			else if (userName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_USERNAME_3);
			}
			else {
				bindUserName = true;

				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_USERNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AmfAuditLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEventType) {
					qPos.add(eventType);
				}

				if (bindUserName) {
					qPos.add(userName);
				}

				if (!pagination) {
					list = (List<AmfAuditLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AmfAuditLog>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public AmfAuditLog findByEventTypeAndUserName_First(String eventType,
		String userName, OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException {
		AmfAuditLog amfAuditLog = fetchByEventTypeAndUserName_First(eventType,
				userName, orderByComparator);

		if (amfAuditLog != null) {
			return amfAuditLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("eventType=");
		msg.append(eventType);

		msg.append(", userName=");
		msg.append(userName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAmfAuditLogException(msg.toString());
	}

	/**
	 * Returns the first amf audit log in the ordered set where eventType = &#63; and userName = &#63;.
	 *
	 * @param eventType the event type
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	 */
	@Override
	public AmfAuditLog fetchByEventTypeAndUserName_First(String eventType,
		String userName, OrderByComparator<AmfAuditLog> orderByComparator) {
		List<AmfAuditLog> list = findByEventTypeAndUserName(eventType,
				userName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public AmfAuditLog findByEventTypeAndUserName_Last(String eventType,
		String userName, OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException {
		AmfAuditLog amfAuditLog = fetchByEventTypeAndUserName_Last(eventType,
				userName, orderByComparator);

		if (amfAuditLog != null) {
			return amfAuditLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("eventType=");
		msg.append(eventType);

		msg.append(", userName=");
		msg.append(userName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAmfAuditLogException(msg.toString());
	}

	/**
	 * Returns the last amf audit log in the ordered set where eventType = &#63; and userName = &#63;.
	 *
	 * @param eventType the event type
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	 */
	@Override
	public AmfAuditLog fetchByEventTypeAndUserName_Last(String eventType,
		String userName, OrderByComparator<AmfAuditLog> orderByComparator) {
		int count = countByEventTypeAndUserName(eventType, userName);

		if (count == 0) {
			return null;
		}

		List<AmfAuditLog> list = findByEventTypeAndUserName(eventType,
				userName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public AmfAuditLog[] findByEventTypeAndUserName_PrevAndNext(
		long amfAuditLogId, String eventType, String userName,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException {
		AmfAuditLog amfAuditLog = findByPrimaryKey(amfAuditLogId);

		Session session = null;

		try {
			session = openSession();

			AmfAuditLog[] array = new AmfAuditLogImpl[3];

			array[0] = getByEventTypeAndUserName_PrevAndNext(session,
					amfAuditLog, eventType, userName, orderByComparator, true);

			array[1] = amfAuditLog;

			array[2] = getByEventTypeAndUserName_PrevAndNext(session,
					amfAuditLog, eventType, userName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AmfAuditLog getByEventTypeAndUserName_PrevAndNext(
		Session session, AmfAuditLog amfAuditLog, String eventType,
		String userName, OrderByComparator<AmfAuditLog> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_AMFAUDITLOG_WHERE);

		boolean bindEventType = false;

		if (eventType == null) {
			query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_EVENTTYPE_1);
		}
		else if (eventType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_EVENTTYPE_3);
		}
		else {
			bindEventType = true;

			query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_EVENTTYPE_2);
		}

		boolean bindUserName = false;

		if (userName == null) {
			query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_USERNAME_1);
		}
		else if (userName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_USERNAME_3);
		}
		else {
			bindUserName = true;

			query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_USERNAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AmfAuditLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEventType) {
			qPos.add(eventType);
		}

		if (bindUserName) {
			qPos.add(userName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(amfAuditLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AmfAuditLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the amf audit logs where eventType = &#63; and userName = &#63; from the database.
	 *
	 * @param eventType the event type
	 * @param userName the user name
	 */
	@Override
	public void removeByEventTypeAndUserName(String eventType, String userName) {
		for (AmfAuditLog amfAuditLog : findByEventTypeAndUserName(eventType,
				userName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(amfAuditLog);
		}
	}

	/**
	 * Returns the number of amf audit logs where eventType = &#63; and userName = &#63;.
	 *
	 * @param eventType the event type
	 * @param userName the user name
	 * @return the number of matching amf audit logs
	 */
	@Override
	public int countByEventTypeAndUserName(String eventType, String userName) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EVENTTYPEANDUSERNAME;

		Object[] finderArgs = new Object[] { eventType, userName };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_AMFAUDITLOG_WHERE);

			boolean bindEventType = false;

			if (eventType == null) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_EVENTTYPE_1);
			}
			else if (eventType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_EVENTTYPE_3);
			}
			else {
				bindEventType = true;

				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_EVENTTYPE_2);
			}

			boolean bindUserName = false;

			if (userName == null) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_USERNAME_1);
			}
			else if (userName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_USERNAME_3);
			}
			else {
				bindUserName = true;

				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERNAME_USERNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEventType) {
					qPos.add(eventType);
				}

				if (bindUserName) {
					qPos.add(userName);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERNAME_EVENTTYPE_1 = "amfAuditLog.eventType IS NULL AND ";
	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERNAME_EVENTTYPE_2 = "amfAuditLog.eventType = ? AND ";
	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERNAME_EVENTTYPE_3 = "(amfAuditLog.eventType IS NULL OR amfAuditLog.eventType = '') AND ";
	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERNAME_USERNAME_1 = "amfAuditLog.userName IS NULL";
	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERNAME_USERNAME_2 = "amfAuditLog.userName = ?";
	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERNAME_USERNAME_3 = "(amfAuditLog.userName IS NULL OR amfAuditLog.userName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENTTYPEANDUSERID =
		new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, AmfAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEventTypeAndUserId",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPEANDUSERID =
		new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, AmfAuditLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByEventTypeAndUserId",
			new String[] { String.class.getName(), String.class.getName() },
			AmfAuditLogModelImpl.EVENTTYPE_COLUMN_BITMASK |
			AmfAuditLogModelImpl.USERID_COLUMN_BITMASK |
			AmfAuditLogModelImpl.DATETIME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EVENTTYPEANDUSERID = new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByEventTypeAndUserId",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_EVENTTYPEANDUSERID =
		new FinderPath(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countByEventTypeAndUserId",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the amf audit logs where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @return the matching amf audit logs
	 */
	@Override
	public List<AmfAuditLog> findByEventTypeAndUserId(String eventType,
		String userId) {
		return findByEventTypeAndUserId(eventType, userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<AmfAuditLog> findByEventTypeAndUserId(String eventType,
		String userId, int start, int end) {
		return findByEventTypeAndUserId(eventType, userId, start, end, null);
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
	@Override
	public List<AmfAuditLog> findByEventTypeAndUserId(String eventType,
		String userId, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return findByEventTypeAndUserId(eventType, userId, start, end,
			orderByComparator, true);
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
	@Override
	public List<AmfAuditLog> findByEventTypeAndUserId(String eventType,
		String userId, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPEANDUSERID;
			finderArgs = new Object[] { eventType, userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENTTYPEANDUSERID;
			finderArgs = new Object[] {
					eventType, userId,
					
					start, end, orderByComparator
				};
		}

		List<AmfAuditLog> list = null;

		if (retrieveFromCache) {
			list = (List<AmfAuditLog>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AmfAuditLog amfAuditLog : list) {
					if (!Objects.equals(eventType, amfAuditLog.getEventType()) ||
							!Objects.equals(userId, amfAuditLog.getUserId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_AMFAUDITLOG_WHERE);

			boolean bindEventType = false;

			if (eventType == null) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_1);
			}
			else if (eventType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_3);
			}
			else {
				bindEventType = true;

				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_2);
			}

			boolean bindUserId = false;

			if (userId == null) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_1);
			}
			else if (userId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_3);
			}
			else {
				bindUserId = true;

				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AmfAuditLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEventType) {
					qPos.add(eventType);
				}

				if (bindUserId) {
					qPos.add(userId);
				}

				if (!pagination) {
					list = (List<AmfAuditLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AmfAuditLog>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public AmfAuditLog findByEventTypeAndUserId_First(String eventType,
		String userId, OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException {
		AmfAuditLog amfAuditLog = fetchByEventTypeAndUserId_First(eventType,
				userId, orderByComparator);

		if (amfAuditLog != null) {
			return amfAuditLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("eventType=");
		msg.append(eventType);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAmfAuditLogException(msg.toString());
	}

	/**
	 * Returns the first amf audit log in the ordered set where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	 */
	@Override
	public AmfAuditLog fetchByEventTypeAndUserId_First(String eventType,
		String userId, OrderByComparator<AmfAuditLog> orderByComparator) {
		List<AmfAuditLog> list = findByEventTypeAndUserId(eventType, userId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public AmfAuditLog findByEventTypeAndUserId_Last(String eventType,
		String userId, OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException {
		AmfAuditLog amfAuditLog = fetchByEventTypeAndUserId_Last(eventType,
				userId, orderByComparator);

		if (amfAuditLog != null) {
			return amfAuditLog;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("eventType=");
		msg.append(eventType);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAmfAuditLogException(msg.toString());
	}

	/**
	 * Returns the last amf audit log in the ordered set where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching amf audit log, or <code>null</code> if a matching amf audit log could not be found
	 */
	@Override
	public AmfAuditLog fetchByEventTypeAndUserId_Last(String eventType,
		String userId, OrderByComparator<AmfAuditLog> orderByComparator) {
		int count = countByEventTypeAndUserId(eventType, userId);

		if (count == 0) {
			return null;
		}

		List<AmfAuditLog> list = findByEventTypeAndUserId(eventType, userId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public AmfAuditLog[] findByEventTypeAndUserId_PrevAndNext(
		long amfAuditLogId, String eventType, String userId,
		OrderByComparator<AmfAuditLog> orderByComparator)
		throws NoSuchAmfAuditLogException {
		AmfAuditLog amfAuditLog = findByPrimaryKey(amfAuditLogId);

		Session session = null;

		try {
			session = openSession();

			AmfAuditLog[] array = new AmfAuditLogImpl[3];

			array[0] = getByEventTypeAndUserId_PrevAndNext(session,
					amfAuditLog, eventType, userId, orderByComparator, true);

			array[1] = amfAuditLog;

			array[2] = getByEventTypeAndUserId_PrevAndNext(session,
					amfAuditLog, eventType, userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AmfAuditLog getByEventTypeAndUserId_PrevAndNext(Session session,
		AmfAuditLog amfAuditLog, String eventType, String userId,
		OrderByComparator<AmfAuditLog> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_AMFAUDITLOG_WHERE);

		boolean bindEventType = false;

		if (eventType == null) {
			query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_1);
		}
		else if (eventType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_3);
		}
		else {
			bindEventType = true;

			query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_2);
		}

		boolean bindUserId = false;

		if (userId == null) {
			query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_1);
		}
		else if (userId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_3);
		}
		else {
			bindUserId = true;

			query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AmfAuditLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEventType) {
			qPos.add(eventType);
		}

		if (bindUserId) {
			qPos.add(userId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(amfAuditLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AmfAuditLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
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
	@Override
	public List<AmfAuditLog> findByEventTypeAndUserId(String[] eventTypes,
		String userId) {
		return findByEventTypeAndUserId(eventTypes, userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<AmfAuditLog> findByEventTypeAndUserId(String[] eventTypes,
		String userId, int start, int end) {
		return findByEventTypeAndUserId(eventTypes, userId, start, end, null);
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
	@Override
	public List<AmfAuditLog> findByEventTypeAndUserId(String[] eventTypes,
		String userId, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return findByEventTypeAndUserId(eventTypes, userId, start, end,
			orderByComparator, true);
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
	@Override
	public List<AmfAuditLog> findByEventTypeAndUserId(String[] eventTypes,
		String userId, int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		if (eventTypes == null) {
			eventTypes = new String[0];
		}
		else if (eventTypes.length > 1) {
			eventTypes = ArrayUtil.distinct(eventTypes,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(eventTypes, NULL_SAFE_STRING_COMPARATOR);
		}

		if (eventTypes.length == 1) {
			return findByEventTypeAndUserId(eventTypes[0], userId, start, end,
				orderByComparator);
		}

		boolean pagination = true;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderArgs = new Object[] { StringUtil.merge(eventTypes), userId };
		}
		else {
			finderArgs = new Object[] {
					StringUtil.merge(eventTypes), userId,
					
					start, end, orderByComparator
				};
		}

		List<AmfAuditLog> list = null;

		if (retrieveFromCache) {
			list = (List<AmfAuditLog>)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENTTYPEANDUSERID,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AmfAuditLog amfAuditLog : list) {
					if (!ArrayUtil.contains(eventTypes,
								amfAuditLog.getEventType()) ||
							!Objects.equals(userId, amfAuditLog.getUserId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_SELECT_AMFAUDITLOG_WHERE);

			if (eventTypes.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < eventTypes.length; i++) {
					String eventType = eventTypes[i];

					if (eventType == null) {
						query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_4);
					}
					else if (eventType.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_6);
					}
					else {
						query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_5);
					}

					if ((i + 1) < eventTypes.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(WHERE_AND);
			}

			boolean bindUserId = false;

			if (userId == null) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_1);
			}
			else if (userId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_3);
			}
			else {
				bindUserId = true;

				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_2);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AmfAuditLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				for (String eventType : eventTypes) {
					if ((eventType != null) && !eventType.isEmpty()) {
						qPos.add(eventType);
					}
				}

				if (bindUserId) {
					qPos.add(userId);
				}

				if (!pagination) {
					list = (List<AmfAuditLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AmfAuditLog>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENTTYPEANDUSERID,
					finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENTTYPEANDUSERID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the amf audit logs where eventType = &#63; and userId = &#63; from the database.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 */
	@Override
	public void removeByEventTypeAndUserId(String eventType, String userId) {
		for (AmfAuditLog amfAuditLog : findByEventTypeAndUserId(eventType,
				userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(amfAuditLog);
		}
	}

	/**
	 * Returns the number of amf audit logs where eventType = &#63; and userId = &#63;.
	 *
	 * @param eventType the event type
	 * @param userId the user ID
	 * @return the number of matching amf audit logs
	 */
	@Override
	public int countByEventTypeAndUserId(String eventType, String userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EVENTTYPEANDUSERID;

		Object[] finderArgs = new Object[] { eventType, userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_AMFAUDITLOG_WHERE);

			boolean bindEventType = false;

			if (eventType == null) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_1);
			}
			else if (eventType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_3);
			}
			else {
				bindEventType = true;

				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_2);
			}

			boolean bindUserId = false;

			if (userId == null) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_1);
			}
			else if (userId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_3);
			}
			else {
				bindUserId = true;

				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEventType) {
					qPos.add(eventType);
				}

				if (bindUserId) {
					qPos.add(userId);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of amf audit logs where eventType = any &#63; and userId = &#63;.
	 *
	 * @param eventTypes the event types
	 * @param userId the user ID
	 * @return the number of matching amf audit logs
	 */
	@Override
	public int countByEventTypeAndUserId(String[] eventTypes, String userId) {
		if (eventTypes == null) {
			eventTypes = new String[0];
		}
		else if (eventTypes.length > 1) {
			eventTypes = ArrayUtil.distinct(eventTypes,
					NULL_SAFE_STRING_COMPARATOR);

			Arrays.sort(eventTypes, NULL_SAFE_STRING_COMPARATOR);
		}

		Object[] finderArgs = new Object[] { StringUtil.merge(eventTypes), userId };

		Long count = (Long)finderCache.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_EVENTTYPEANDUSERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler();

			query.append(_SQL_COUNT_AMFAUDITLOG_WHERE);

			if (eventTypes.length > 0) {
				query.append(StringPool.OPEN_PARENTHESIS);

				for (int i = 0; i < eventTypes.length; i++) {
					String eventType = eventTypes[i];

					if (eventType == null) {
						query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_4);
					}
					else if (eventType.equals(StringPool.BLANK)) {
						query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_6);
					}
					else {
						query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_5);
					}

					if ((i + 1) < eventTypes.length) {
						query.append(WHERE_OR);
					}
				}

				query.append(StringPool.CLOSE_PARENTHESIS);

				query.append(WHERE_AND);
			}

			boolean bindUserId = false;

			if (userId == null) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_1);
			}
			else if (userId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_3);
			}
			else {
				bindUserId = true;

				query.append(_FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_2);
			}

			query.setStringAt(removeConjunction(query.stringAt(query.index() -
						1)), query.index() - 1);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				for (String eventType : eventTypes) {
					if ((eventType != null) && !eventType.isEmpty()) {
						qPos.add(eventType);
					}
				}

				if (bindUserId) {
					qPos.add(userId);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_EVENTTYPEANDUSERID,
					finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_EVENTTYPEANDUSERID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_1 = "amfAuditLog.eventType IS NULL AND ";
	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_2 = "amfAuditLog.eventType = ? AND ";
	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_3 = "(amfAuditLog.eventType IS NULL OR amfAuditLog.eventType = '') AND ";
	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_4 = "(" +
		removeConjunction(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_1) + ")";
	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_5 = "(" +
		removeConjunction(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_2) + ")";
	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_6 = "(" +
		removeConjunction(_FINDER_COLUMN_EVENTTYPEANDUSERID_EVENTTYPE_3) + ")";
	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_1 = "amfAuditLog.userId IS NULL";
	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_2 = "amfAuditLog.userId = ?";
	private static final String _FINDER_COLUMN_EVENTTYPEANDUSERID_USERID_3 = "(amfAuditLog.userId IS NULL OR amfAuditLog.userId = '')";

	public AmfAuditLogPersistenceImpl() {
		setModelClass(AmfAuditLog.class);
	}

	/**
	 * Caches the amf audit log in the entity cache if it is enabled.
	 *
	 * @param amfAuditLog the amf audit log
	 */
	@Override
	public void cacheResult(AmfAuditLog amfAuditLog) {
		entityCache.putResult(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogImpl.class, amfAuditLog.getPrimaryKey(), amfAuditLog);

		amfAuditLog.resetOriginalValues();
	}

	/**
	 * Caches the amf audit logs in the entity cache if it is enabled.
	 *
	 * @param amfAuditLogs the amf audit logs
	 */
	@Override
	public void cacheResult(List<AmfAuditLog> amfAuditLogs) {
		for (AmfAuditLog amfAuditLog : amfAuditLogs) {
			if (entityCache.getResult(
						AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
						AmfAuditLogImpl.class, amfAuditLog.getPrimaryKey()) == null) {
				cacheResult(amfAuditLog);
			}
			else {
				amfAuditLog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all amf audit logs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AmfAuditLogImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the amf audit log.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AmfAuditLog amfAuditLog) {
		entityCache.removeResult(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogImpl.class, amfAuditLog.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AmfAuditLog> amfAuditLogs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AmfAuditLog amfAuditLog : amfAuditLogs) {
			entityCache.removeResult(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
				AmfAuditLogImpl.class, amfAuditLog.getPrimaryKey());
		}
	}

	/**
	 * Creates a new amf audit log with the primary key. Does not add the amf audit log to the database.
	 *
	 * @param amfAuditLogId the primary key for the new amf audit log
	 * @return the new amf audit log
	 */
	@Override
	public AmfAuditLog create(long amfAuditLogId) {
		AmfAuditLog amfAuditLog = new AmfAuditLogImpl();

		amfAuditLog.setNew(true);
		amfAuditLog.setPrimaryKey(amfAuditLogId);

		return amfAuditLog;
	}

	/**
	 * Removes the amf audit log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param amfAuditLogId the primary key of the amf audit log
	 * @return the amf audit log that was removed
	 * @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	 */
	@Override
	public AmfAuditLog remove(long amfAuditLogId)
		throws NoSuchAmfAuditLogException {
		return remove((Serializable)amfAuditLogId);
	}

	/**
	 * Removes the amf audit log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the amf audit log
	 * @return the amf audit log that was removed
	 * @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	 */
	@Override
	public AmfAuditLog remove(Serializable primaryKey)
		throws NoSuchAmfAuditLogException {
		Session session = null;

		try {
			session = openSession();

			AmfAuditLog amfAuditLog = (AmfAuditLog)session.get(AmfAuditLogImpl.class,
					primaryKey);

			if (amfAuditLog == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAmfAuditLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(amfAuditLog);
		}
		catch (NoSuchAmfAuditLogException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected AmfAuditLog removeImpl(AmfAuditLog amfAuditLog) {
		amfAuditLog = toUnwrappedModel(amfAuditLog);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(amfAuditLog)) {
				amfAuditLog = (AmfAuditLog)session.get(AmfAuditLogImpl.class,
						amfAuditLog.getPrimaryKeyObj());
			}

			if (amfAuditLog != null) {
				session.delete(amfAuditLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (amfAuditLog != null) {
			clearCache(amfAuditLog);
		}

		return amfAuditLog;
	}

	@Override
	public AmfAuditLog updateImpl(AmfAuditLog amfAuditLog) {
		amfAuditLog = toUnwrappedModel(amfAuditLog);

		boolean isNew = amfAuditLog.isNew();

		AmfAuditLogModelImpl amfAuditLogModelImpl = (AmfAuditLogModelImpl)amfAuditLog;

		Session session = null;

		try {
			session = openSession();

			if (amfAuditLog.isNew()) {
				session.save(amfAuditLog);

				amfAuditLog.setNew(false);
			}
			else {
				amfAuditLog = (AmfAuditLog)session.merge(amfAuditLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!AmfAuditLogModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { amfAuditLogModelImpl.getUserName() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERNAME, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERNAME,
				args);

			args = new Object[] { amfAuditLogModelImpl.getEventType() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_EVENTTYPE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPE,
				args);

			args = new Object[] {
					amfAuditLogModelImpl.getEventType(),
					amfAuditLogModelImpl.getUserName()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_EVENTTYPEANDUSERNAME,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPEANDUSERNAME,
				args);

			args = new Object[] {
					amfAuditLogModelImpl.getEventType(),
					amfAuditLogModelImpl.getUserId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_EVENTTYPEANDUSERID,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPEANDUSERID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((amfAuditLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						amfAuditLogModelImpl.getOriginalUserName()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERNAME, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERNAME,
					args);

				args = new Object[] { amfAuditLogModelImpl.getUserName() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERNAME, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERNAME,
					args);
			}

			if ((amfAuditLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						amfAuditLogModelImpl.getOriginalEventType()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EVENTTYPE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPE,
					args);

				args = new Object[] { amfAuditLogModelImpl.getEventType() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EVENTTYPE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPE,
					args);
			}

			if ((amfAuditLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPEANDUSERNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						amfAuditLogModelImpl.getOriginalEventType(),
						amfAuditLogModelImpl.getOriginalUserName()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EVENTTYPEANDUSERNAME,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPEANDUSERNAME,
					args);

				args = new Object[] {
						amfAuditLogModelImpl.getEventType(),
						amfAuditLogModelImpl.getUserName()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EVENTTYPEANDUSERNAME,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPEANDUSERNAME,
					args);
			}

			if ((amfAuditLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPEANDUSERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						amfAuditLogModelImpl.getOriginalEventType(),
						amfAuditLogModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EVENTTYPEANDUSERID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPEANDUSERID,
					args);

				args = new Object[] {
						amfAuditLogModelImpl.getEventType(),
						amfAuditLogModelImpl.getUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EVENTTYPEANDUSERID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENTTYPEANDUSERID,
					args);
			}
		}

		entityCache.putResult(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
			AmfAuditLogImpl.class, amfAuditLog.getPrimaryKey(), amfAuditLog,
			false);

		amfAuditLog.resetOriginalValues();

		return amfAuditLog;
	}

	protected AmfAuditLog toUnwrappedModel(AmfAuditLog amfAuditLog) {
		if (amfAuditLog instanceof AmfAuditLogImpl) {
			return amfAuditLog;
		}

		AmfAuditLogImpl amfAuditLogImpl = new AmfAuditLogImpl();

		amfAuditLogImpl.setNew(amfAuditLog.isNew());
		amfAuditLogImpl.setPrimaryKey(amfAuditLog.getPrimaryKey());

		amfAuditLogImpl.setAmfAuditLogId(amfAuditLog.getAmfAuditLogId());
		amfAuditLogImpl.setUserId(amfAuditLog.getUserId());
		amfAuditLogImpl.setUserName(amfAuditLog.getUserName());
		amfAuditLogImpl.setDateTime(amfAuditLog.getDateTime());
		amfAuditLogImpl.setEventType(amfAuditLog.getEventType());
		amfAuditLogImpl.setIpAddress(amfAuditLog.getIpAddress());

		return amfAuditLogImpl;
	}

	/**
	 * Returns the amf audit log with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the amf audit log
	 * @return the amf audit log
	 * @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	 */
	@Override
	public AmfAuditLog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAmfAuditLogException {
		AmfAuditLog amfAuditLog = fetchByPrimaryKey(primaryKey);

		if (amfAuditLog == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAmfAuditLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return amfAuditLog;
	}

	/**
	 * Returns the amf audit log with the primary key or throws a {@link NoSuchAmfAuditLogException} if it could not be found.
	 *
	 * @param amfAuditLogId the primary key of the amf audit log
	 * @return the amf audit log
	 * @throws NoSuchAmfAuditLogException if a amf audit log with the primary key could not be found
	 */
	@Override
	public AmfAuditLog findByPrimaryKey(long amfAuditLogId)
		throws NoSuchAmfAuditLogException {
		return findByPrimaryKey((Serializable)amfAuditLogId);
	}

	/**
	 * Returns the amf audit log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the amf audit log
	 * @return the amf audit log, or <code>null</code> if a amf audit log with the primary key could not be found
	 */
	@Override
	public AmfAuditLog fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
				AmfAuditLogImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AmfAuditLog amfAuditLog = (AmfAuditLog)serializable;

		if (amfAuditLog == null) {
			Session session = null;

			try {
				session = openSession();

				amfAuditLog = (AmfAuditLog)session.get(AmfAuditLogImpl.class,
						primaryKey);

				if (amfAuditLog != null) {
					cacheResult(amfAuditLog);
				}
				else {
					entityCache.putResult(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
						AmfAuditLogImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
					AmfAuditLogImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return amfAuditLog;
	}

	/**
	 * Returns the amf audit log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param amfAuditLogId the primary key of the amf audit log
	 * @return the amf audit log, or <code>null</code> if a amf audit log with the primary key could not be found
	 */
	@Override
	public AmfAuditLog fetchByPrimaryKey(long amfAuditLogId) {
		return fetchByPrimaryKey((Serializable)amfAuditLogId);
	}

	@Override
	public Map<Serializable, AmfAuditLog> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AmfAuditLog> map = new HashMap<Serializable, AmfAuditLog>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AmfAuditLog amfAuditLog = fetchByPrimaryKey(primaryKey);

			if (amfAuditLog != null) {
				map.put(primaryKey, amfAuditLog);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
					AmfAuditLogImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AmfAuditLog)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_AMFAUDITLOG_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (AmfAuditLog amfAuditLog : (List<AmfAuditLog>)q.list()) {
				map.put(amfAuditLog.getPrimaryKeyObj(), amfAuditLog);

				cacheResult(amfAuditLog);

				uncachedPrimaryKeys.remove(amfAuditLog.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AmfAuditLogModelImpl.ENTITY_CACHE_ENABLED,
					AmfAuditLogImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the amf audit logs.
	 *
	 * @return the amf audit logs
	 */
	@Override
	public List<AmfAuditLog> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AmfAuditLog> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<AmfAuditLog> findAll(int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<AmfAuditLog> findAll(int start, int end,
		OrderByComparator<AmfAuditLog> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<AmfAuditLog> list = null;

		if (retrieveFromCache) {
			list = (List<AmfAuditLog>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_AMFAUDITLOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_AMFAUDITLOG;

				if (pagination) {
					sql = sql.concat(AmfAuditLogModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AmfAuditLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AmfAuditLog>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the amf audit logs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AmfAuditLog amfAuditLog : findAll()) {
			remove(amfAuditLog);
		}
	}

	/**
	 * Returns the number of amf audit logs.
	 *
	 * @return the number of amf audit logs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_AMFAUDITLOG);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AmfAuditLogModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the amf audit log persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AmfAuditLogImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_AMFAUDITLOG = "SELECT amfAuditLog FROM AmfAuditLog amfAuditLog";
	private static final String _SQL_SELECT_AMFAUDITLOG_WHERE_PKS_IN = "SELECT amfAuditLog FROM AmfAuditLog amfAuditLog WHERE amfAuditLogId IN (";
	private static final String _SQL_SELECT_AMFAUDITLOG_WHERE = "SELECT amfAuditLog FROM AmfAuditLog amfAuditLog WHERE ";
	private static final String _SQL_COUNT_AMFAUDITLOG = "SELECT COUNT(amfAuditLog) FROM AmfAuditLog amfAuditLog";
	private static final String _SQL_COUNT_AMFAUDITLOG_WHERE = "SELECT COUNT(amfAuditLog) FROM AmfAuditLog amfAuditLog WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "amfAuditLog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AmfAuditLog exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AmfAuditLog exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(AmfAuditLogPersistenceImpl.class);
}