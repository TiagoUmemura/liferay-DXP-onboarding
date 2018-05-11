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
 * Provides the local service utility for AmfAuditLog. This utility wraps
 * {@link com.liferay.docs.amfRegistrationService.service.impl.AmfAuditLogLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AmfAuditLogLocalService
 * @see com.liferay.docs.amfRegistrationService.service.base.AmfAuditLogLocalServiceBaseImpl
 * @see com.liferay.docs.amfRegistrationService.service.impl.AmfAuditLogLocalServiceImpl
 * @generated
 */
@ProviderType
public class AmfAuditLogLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.amfRegistrationService.service.impl.AmfAuditLogLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the amf audit log to the database. Also notifies the appropriate model listeners.
	*
	* @param amfAuditLog the amf audit log
	* @return the amf audit log that was added
	*/
	public static com.liferay.docs.amfRegistrationService.model.AmfAuditLog addAmfAuditLog(
		com.liferay.docs.amfRegistrationService.model.AmfAuditLog amfAuditLog) {
		return getService().addAmfAuditLog(amfAuditLog);
	}

	public static void addAuditLogEvent(
		com.liferay.docs.amfRegistrationService.dto.AmfAuditLogDTO amfAuditLogDTO) {
		getService().addAuditLogEvent(amfAuditLogDTO);
	}

	/**
	* Creates a new amf audit log with the primary key. Does not add the amf audit log to the database.
	*
	* @param amfAuditLogId the primary key for the new amf audit log
	* @return the new amf audit log
	*/
	public static com.liferay.docs.amfRegistrationService.model.AmfAuditLog createAmfAuditLog(
		long amfAuditLogId) {
		return getService().createAmfAuditLog(amfAuditLogId);
	}

	/**
	* Deletes the amf audit log from the database. Also notifies the appropriate model listeners.
	*
	* @param amfAuditLog the amf audit log
	* @return the amf audit log that was removed
	*/
	public static com.liferay.docs.amfRegistrationService.model.AmfAuditLog deleteAmfAuditLog(
		com.liferay.docs.amfRegistrationService.model.AmfAuditLog amfAuditLog) {
		return getService().deleteAmfAuditLog(amfAuditLog);
	}

	/**
	* Deletes the amf audit log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param amfAuditLogId the primary key of the amf audit log
	* @return the amf audit log that was removed
	* @throws PortalException if a amf audit log with the primary key could not be found
	*/
	public static com.liferay.docs.amfRegistrationService.model.AmfAuditLog deleteAmfAuditLog(
		long amfAuditLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAmfAuditLog(amfAuditLogId);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.amfRegistrationService.model.impl.AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.amfRegistrationService.model.impl.AmfAuditLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.liferay.docs.amfRegistrationService.model.AmfAuditLog fetchAmfAuditLog(
		long amfAuditLogId) {
		return getService().fetchAmfAuditLog(amfAuditLogId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the amf audit log with the primary key.
	*
	* @param amfAuditLogId the primary key of the amf audit log
	* @return the amf audit log
	* @throws PortalException if a amf audit log with the primary key could not be found
	*/
	public static com.liferay.docs.amfRegistrationService.model.AmfAuditLog getAmfAuditLog(
		long amfAuditLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAmfAuditLog(amfAuditLogId);
	}

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
	public static java.util.List<com.liferay.docs.amfRegistrationService.model.AmfAuditLog> getAmfAuditLogs(
		int start, int end) {
		return getService().getAmfAuditLogs(start, end);
	}

	/**
	* Returns the number of amf audit logs.
	*
	* @return the number of amf audit logs
	*/
	public static int getAmfAuditLogsCount() {
		return getService().getAmfAuditLogsCount();
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
	* Updates the amf audit log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param amfAuditLog the amf audit log
	* @return the amf audit log that was updated
	*/
	public static com.liferay.docs.amfRegistrationService.model.AmfAuditLog updateAmfAuditLog(
		com.liferay.docs.amfRegistrationService.model.AmfAuditLog amfAuditLog) {
		return getService().updateAmfAuditLog(amfAuditLog);
	}

	public static AmfAuditLogLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AmfAuditLogLocalService, AmfAuditLogLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AmfAuditLogLocalService.class);
}