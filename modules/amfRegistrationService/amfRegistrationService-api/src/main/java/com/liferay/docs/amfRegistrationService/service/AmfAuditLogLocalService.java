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

import com.liferay.docs.amfRegistrationService.dto.AmfAuditLogDTO;
import com.liferay.docs.amfRegistrationService.model.AmfAuditLog;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for AmfAuditLog. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see AmfAuditLogLocalServiceUtil
 * @see com.liferay.docs.amfRegistrationService.service.base.AmfAuditLogLocalServiceBaseImpl
 * @see com.liferay.docs.amfRegistrationService.service.impl.AmfAuditLogLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AmfAuditLogLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AmfAuditLogLocalServiceUtil} to access the amf audit log local service. Add custom service methods to {@link com.liferay.docs.amfRegistrationService.service.impl.AmfAuditLogLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the amf audit log to the database. Also notifies the appropriate model listeners.
	*
	* @param amfAuditLog the amf audit log
	* @return the amf audit log that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public AmfAuditLog addAmfAuditLog(AmfAuditLog amfAuditLog);

	public void addAuditLogEvent(AmfAuditLogDTO amfAuditLogDTO);

	public int countByLoginAndLogout();

	public int countByLoginAndLogout(long userId);

	public int countByRegistration();

	public int countByRegistration(long userId);

	public int countByUserId(long userId);

	/**
	* Creates a new amf audit log with the primary key. Does not add the amf audit log to the database.
	*
	* @param amfAuditLogId the primary key for the new amf audit log
	* @return the new amf audit log
	*/
	public AmfAuditLog createAmfAuditLog(long amfAuditLogId);

	/**
	* Deletes the amf audit log from the database. Also notifies the appropriate model listeners.
	*
	* @param amfAuditLog the amf audit log
	* @return the amf audit log that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public AmfAuditLog deleteAmfAuditLog(AmfAuditLog amfAuditLog);

	/**
	* Deletes the amf audit log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param amfAuditLogId the primary key of the amf audit log
	* @return the amf audit log that was removed
	* @throws PortalException if a amf audit log with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public AmfAuditLog deleteAmfAuditLog(long amfAuditLogId)
		throws PortalException;

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.amfRegistrationService.model.impl.AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.amfRegistrationService.model.impl.AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AmfAuditLog fetchAmfAuditLog(long amfAuditLogId);

	public List<AmfAuditLog> findByLoginAndLogout(int start, int end);

	public List<AmfAuditLog> findByLoginAndLogout(long userId, int start,
		int end);

	public List<AmfAuditLog> findByRegistration(int start, int end);

	public List<AmfAuditLog> findByRegistration(long userId, int start, int end);

	public List<AmfAuditLog> findByUserId(long userId);

	public List<AmfAuditLog> findByUserId(long userId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	* Returns the amf audit log with the primary key.
	*
	* @param amfAuditLogId the primary key of the amf audit log
	* @return the amf audit log
	* @throws PortalException if a amf audit log with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AmfAuditLog getAmfAuditLog(long amfAuditLogId)
		throws PortalException;

	/**
	* Returns a range of all the amf audit logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.amfRegistrationService.model.impl.AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of amf audit logs
	* @param end the upper bound of the range of amf audit logs (not inclusive)
	* @return the range of amf audit logs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AmfAuditLog> getAmfAuditLogs(int start, int end);

	/**
	* Returns the number of amf audit logs.
	*
	* @return the number of amf audit logs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getAmfAuditLogsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Updates the amf audit log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param amfAuditLog the amf audit log
	* @return the amf audit log that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public AmfAuditLog updateAmfAuditLog(AmfAuditLog amfAuditLog);
}