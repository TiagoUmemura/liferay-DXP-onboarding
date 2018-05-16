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

import com.liferay.docs.amfRegistrationService.exception.NoSuchAmfSearchException;
import com.liferay.docs.amfRegistrationService.model.AmfSearch;
import com.liferay.docs.amfRegistrationService.model.impl.AmfSearchImpl;
import com.liferay.docs.amfRegistrationService.model.impl.AmfSearchModelImpl;
import com.liferay.docs.amfRegistrationService.service.persistence.AmfSearchPersistence;

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
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the amf search service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AmfSearchPersistence
 * @see com.liferay.docs.amfRegistrationService.service.persistence.AmfSearchUtil
 * @generated
 */
@ProviderType
public class AmfSearchPersistenceImpl extends BasePersistenceImpl<AmfSearch>
	implements AmfSearchPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AmfSearchUtil} to access the amf search persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AmfSearchImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
			AmfSearchModelImpl.FINDER_CACHE_ENABLED, AmfSearchImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
			AmfSearchModelImpl.FINDER_CACHE_ENABLED, AmfSearchImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
			AmfSearchModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_AMFSEARCHFIELDFINDER =
		new FinderPath(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
			AmfSearchModelImpl.FINDER_CACHE_ENABLED, AmfSearchImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByamfSearchFieldFinder",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AMFSEARCHFIELDFINDER =
		new FinderPath(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
			AmfSearchModelImpl.FINDER_CACHE_ENABLED, AmfSearchImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByamfSearchFieldFinder",
			new String[] { Long.class.getName() },
			AmfSearchModelImpl.AMFSEARCHFIELD_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_AMFSEARCHFIELDFINDER = new FinderPath(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
			AmfSearchModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByamfSearchFieldFinder", new String[] { Long.class.getName() });

	/**
	 * Returns all the amf searchs where amfSearchField = &#63;.
	 *
	 * @param amfSearchField the amf search field
	 * @return the matching amf searchs
	 */
	@Override
	public List<AmfSearch> findByamfSearchFieldFinder(long amfSearchField) {
		return findByamfSearchFieldFinder(amfSearchField, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<AmfSearch> findByamfSearchFieldFinder(long amfSearchField,
		int start, int end) {
		return findByamfSearchFieldFinder(amfSearchField, start, end, null);
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
	@Override
	public List<AmfSearch> findByamfSearchFieldFinder(long amfSearchField,
		int start, int end, OrderByComparator<AmfSearch> orderByComparator) {
		return findByamfSearchFieldFinder(amfSearchField, start, end,
			orderByComparator, true);
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
	@Override
	public List<AmfSearch> findByamfSearchFieldFinder(long amfSearchField,
		int start, int end, OrderByComparator<AmfSearch> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AMFSEARCHFIELDFINDER;
			finderArgs = new Object[] { amfSearchField };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_AMFSEARCHFIELDFINDER;
			finderArgs = new Object[] {
					amfSearchField,
					
					start, end, orderByComparator
				};
		}

		List<AmfSearch> list = null;

		if (retrieveFromCache) {
			list = (List<AmfSearch>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AmfSearch amfSearch : list) {
					if ((amfSearchField != amfSearch.getAmfSearchField())) {
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

			query.append(_SQL_SELECT_AMFSEARCH_WHERE);

			query.append(_FINDER_COLUMN_AMFSEARCHFIELDFINDER_AMFSEARCHFIELD_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AmfSearchModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(amfSearchField);

				if (!pagination) {
					list = (List<AmfSearch>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AmfSearch>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first amf search in the ordered set where amfSearchField = &#63;.
	 *
	 * @param amfSearchField the amf search field
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching amf search
	 * @throws NoSuchAmfSearchException if a matching amf search could not be found
	 */
	@Override
	public AmfSearch findByamfSearchFieldFinder_First(long amfSearchField,
		OrderByComparator<AmfSearch> orderByComparator)
		throws NoSuchAmfSearchException {
		AmfSearch amfSearch = fetchByamfSearchFieldFinder_First(amfSearchField,
				orderByComparator);

		if (amfSearch != null) {
			return amfSearch;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("amfSearchField=");
		msg.append(amfSearchField);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAmfSearchException(msg.toString());
	}

	/**
	 * Returns the first amf search in the ordered set where amfSearchField = &#63;.
	 *
	 * @param amfSearchField the amf search field
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching amf search, or <code>null</code> if a matching amf search could not be found
	 */
	@Override
	public AmfSearch fetchByamfSearchFieldFinder_First(long amfSearchField,
		OrderByComparator<AmfSearch> orderByComparator) {
		List<AmfSearch> list = findByamfSearchFieldFinder(amfSearchField, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last amf search in the ordered set where amfSearchField = &#63;.
	 *
	 * @param amfSearchField the amf search field
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching amf search
	 * @throws NoSuchAmfSearchException if a matching amf search could not be found
	 */
	@Override
	public AmfSearch findByamfSearchFieldFinder_Last(long amfSearchField,
		OrderByComparator<AmfSearch> orderByComparator)
		throws NoSuchAmfSearchException {
		AmfSearch amfSearch = fetchByamfSearchFieldFinder_Last(amfSearchField,
				orderByComparator);

		if (amfSearch != null) {
			return amfSearch;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("amfSearchField=");
		msg.append(amfSearchField);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAmfSearchException(msg.toString());
	}

	/**
	 * Returns the last amf search in the ordered set where amfSearchField = &#63;.
	 *
	 * @param amfSearchField the amf search field
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching amf search, or <code>null</code> if a matching amf search could not be found
	 */
	@Override
	public AmfSearch fetchByamfSearchFieldFinder_Last(long amfSearchField,
		OrderByComparator<AmfSearch> orderByComparator) {
		int count = countByamfSearchFieldFinder(amfSearchField);

		if (count == 0) {
			return null;
		}

		List<AmfSearch> list = findByamfSearchFieldFinder(amfSearchField,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the amf searchs where amfSearchField = &#63; from the database.
	 *
	 * @param amfSearchField the amf search field
	 */
	@Override
	public void removeByamfSearchFieldFinder(long amfSearchField) {
		for (AmfSearch amfSearch : findByamfSearchFieldFinder(amfSearchField,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(amfSearch);
		}
	}

	/**
	 * Returns the number of amf searchs where amfSearchField = &#63;.
	 *
	 * @param amfSearchField the amf search field
	 * @return the number of matching amf searchs
	 */
	@Override
	public int countByamfSearchFieldFinder(long amfSearchField) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_AMFSEARCHFIELDFINDER;

		Object[] finderArgs = new Object[] { amfSearchField };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_AMFSEARCH_WHERE);

			query.append(_FINDER_COLUMN_AMFSEARCHFIELDFINDER_AMFSEARCHFIELD_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(amfSearchField);

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

	private static final String _FINDER_COLUMN_AMFSEARCHFIELDFINDER_AMFSEARCHFIELD_2 =
		"amfSearch.amfSearchField = ?";

	public AmfSearchPersistenceImpl() {
		setModelClass(AmfSearch.class);
	}

	/**
	 * Caches the amf search in the entity cache if it is enabled.
	 *
	 * @param amfSearch the amf search
	 */
	@Override
	public void cacheResult(AmfSearch amfSearch) {
		entityCache.putResult(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
			AmfSearchImpl.class, amfSearch.getPrimaryKey(), amfSearch);

		amfSearch.resetOriginalValues();
	}

	/**
	 * Caches the amf searchs in the entity cache if it is enabled.
	 *
	 * @param amfSearchs the amf searchs
	 */
	@Override
	public void cacheResult(List<AmfSearch> amfSearchs) {
		for (AmfSearch amfSearch : amfSearchs) {
			if (entityCache.getResult(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
						AmfSearchImpl.class, amfSearch.getPrimaryKey()) == null) {
				cacheResult(amfSearch);
			}
			else {
				amfSearch.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all amf searchs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AmfSearchImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the amf search.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AmfSearch amfSearch) {
		entityCache.removeResult(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
			AmfSearchImpl.class, amfSearch.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AmfSearch> amfSearchs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AmfSearch amfSearch : amfSearchs) {
			entityCache.removeResult(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
				AmfSearchImpl.class, amfSearch.getPrimaryKey());
		}
	}

	/**
	 * Creates a new amf search with the primary key. Does not add the amf search to the database.
	 *
	 * @param amfSearchField the primary key for the new amf search
	 * @return the new amf search
	 */
	@Override
	public AmfSearch create(long amfSearchField) {
		AmfSearch amfSearch = new AmfSearchImpl();

		amfSearch.setNew(true);
		amfSearch.setPrimaryKey(amfSearchField);

		return amfSearch;
	}

	/**
	 * Removes the amf search with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param amfSearchField the primary key of the amf search
	 * @return the amf search that was removed
	 * @throws NoSuchAmfSearchException if a amf search with the primary key could not be found
	 */
	@Override
	public AmfSearch remove(long amfSearchField)
		throws NoSuchAmfSearchException {
		return remove((Serializable)amfSearchField);
	}

	/**
	 * Removes the amf search with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the amf search
	 * @return the amf search that was removed
	 * @throws NoSuchAmfSearchException if a amf search with the primary key could not be found
	 */
	@Override
	public AmfSearch remove(Serializable primaryKey)
		throws NoSuchAmfSearchException {
		Session session = null;

		try {
			session = openSession();

			AmfSearch amfSearch = (AmfSearch)session.get(AmfSearchImpl.class,
					primaryKey);

			if (amfSearch == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAmfSearchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(amfSearch);
		}
		catch (NoSuchAmfSearchException nsee) {
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
	protected AmfSearch removeImpl(AmfSearch amfSearch) {
		amfSearch = toUnwrappedModel(amfSearch);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(amfSearch)) {
				amfSearch = (AmfSearch)session.get(AmfSearchImpl.class,
						amfSearch.getPrimaryKeyObj());
			}

			if (amfSearch != null) {
				session.delete(amfSearch);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (amfSearch != null) {
			clearCache(amfSearch);
		}

		return amfSearch;
	}

	@Override
	public AmfSearch updateImpl(AmfSearch amfSearch) {
		amfSearch = toUnwrappedModel(amfSearch);

		boolean isNew = amfSearch.isNew();

		AmfSearchModelImpl amfSearchModelImpl = (AmfSearchModelImpl)amfSearch;

		Session session = null;

		try {
			session = openSession();

			if (amfSearch.isNew()) {
				session.save(amfSearch);

				amfSearch.setNew(false);
			}
			else {
				amfSearch = (AmfSearch)session.merge(amfSearch);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!AmfSearchModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { amfSearchModelImpl.getAmfSearchField() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_AMFSEARCHFIELDFINDER,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AMFSEARCHFIELDFINDER,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((amfSearchModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AMFSEARCHFIELDFINDER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						amfSearchModelImpl.getOriginalAmfSearchField()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_AMFSEARCHFIELDFINDER,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AMFSEARCHFIELDFINDER,
					args);

				args = new Object[] { amfSearchModelImpl.getAmfSearchField() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_AMFSEARCHFIELDFINDER,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AMFSEARCHFIELDFINDER,
					args);
			}
		}

		entityCache.putResult(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
			AmfSearchImpl.class, amfSearch.getPrimaryKey(), amfSearch, false);

		amfSearch.resetOriginalValues();

		return amfSearch;
	}

	protected AmfSearch toUnwrappedModel(AmfSearch amfSearch) {
		if (amfSearch instanceof AmfSearchImpl) {
			return amfSearch;
		}

		AmfSearchImpl amfSearchImpl = new AmfSearchImpl();

		amfSearchImpl.setNew(amfSearch.isNew());
		amfSearchImpl.setPrimaryKey(amfSearch.getPrimaryKey());

		amfSearchImpl.setAmfSearchField(amfSearch.getAmfSearchField());

		return amfSearchImpl;
	}

	/**
	 * Returns the amf search with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the amf search
	 * @return the amf search
	 * @throws NoSuchAmfSearchException if a amf search with the primary key could not be found
	 */
	@Override
	public AmfSearch findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAmfSearchException {
		AmfSearch amfSearch = fetchByPrimaryKey(primaryKey);

		if (amfSearch == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAmfSearchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return amfSearch;
	}

	/**
	 * Returns the amf search with the primary key or throws a {@link NoSuchAmfSearchException} if it could not be found.
	 *
	 * @param amfSearchField the primary key of the amf search
	 * @return the amf search
	 * @throws NoSuchAmfSearchException if a amf search with the primary key could not be found
	 */
	@Override
	public AmfSearch findByPrimaryKey(long amfSearchField)
		throws NoSuchAmfSearchException {
		return findByPrimaryKey((Serializable)amfSearchField);
	}

	/**
	 * Returns the amf search with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the amf search
	 * @return the amf search, or <code>null</code> if a amf search with the primary key could not be found
	 */
	@Override
	public AmfSearch fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
				AmfSearchImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AmfSearch amfSearch = (AmfSearch)serializable;

		if (amfSearch == null) {
			Session session = null;

			try {
				session = openSession();

				amfSearch = (AmfSearch)session.get(AmfSearchImpl.class,
						primaryKey);

				if (amfSearch != null) {
					cacheResult(amfSearch);
				}
				else {
					entityCache.putResult(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
						AmfSearchImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
					AmfSearchImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return amfSearch;
	}

	/**
	 * Returns the amf search with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param amfSearchField the primary key of the amf search
	 * @return the amf search, or <code>null</code> if a amf search with the primary key could not be found
	 */
	@Override
	public AmfSearch fetchByPrimaryKey(long amfSearchField) {
		return fetchByPrimaryKey((Serializable)amfSearchField);
	}

	@Override
	public Map<Serializable, AmfSearch> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AmfSearch> map = new HashMap<Serializable, AmfSearch>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AmfSearch amfSearch = fetchByPrimaryKey(primaryKey);

			if (amfSearch != null) {
				map.put(primaryKey, amfSearch);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
					AmfSearchImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AmfSearch)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_AMFSEARCH_WHERE_PKS_IN);

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

			for (AmfSearch amfSearch : (List<AmfSearch>)q.list()) {
				map.put(amfSearch.getPrimaryKeyObj(), amfSearch);

				cacheResult(amfSearch);

				uncachedPrimaryKeys.remove(amfSearch.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AmfSearchModelImpl.ENTITY_CACHE_ENABLED,
					AmfSearchImpl.class, primaryKey, nullModel);
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
	 * Returns all the amf searchs.
	 *
	 * @return the amf searchs
	 */
	@Override
	public List<AmfSearch> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AmfSearch> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<AmfSearch> findAll(int start, int end,
		OrderByComparator<AmfSearch> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<AmfSearch> findAll(int start, int end,
		OrderByComparator<AmfSearch> orderByComparator,
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

		List<AmfSearch> list = null;

		if (retrieveFromCache) {
			list = (List<AmfSearch>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_AMFSEARCH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_AMFSEARCH;

				if (pagination) {
					sql = sql.concat(AmfSearchModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AmfSearch>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AmfSearch>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the amf searchs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AmfSearch amfSearch : findAll()) {
			remove(amfSearch);
		}
	}

	/**
	 * Returns the number of amf searchs.
	 *
	 * @return the number of amf searchs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_AMFSEARCH);

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
		return AmfSearchModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the amf search persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AmfSearchImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_AMFSEARCH = "SELECT amfSearch FROM AmfSearch amfSearch";
	private static final String _SQL_SELECT_AMFSEARCH_WHERE_PKS_IN = "SELECT amfSearch FROM AmfSearch amfSearch WHERE amfSearchField IN (";
	private static final String _SQL_SELECT_AMFSEARCH_WHERE = "SELECT amfSearch FROM AmfSearch amfSearch WHERE ";
	private static final String _SQL_COUNT_AMFSEARCH = "SELECT COUNT(amfSearch) FROM AmfSearch amfSearch";
	private static final String _SQL_COUNT_AMFSEARCH_WHERE = "SELECT COUNT(amfSearch) FROM AmfSearch amfSearch WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "amfSearch.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AmfSearch exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AmfSearch exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(AmfSearchPersistenceImpl.class);
}