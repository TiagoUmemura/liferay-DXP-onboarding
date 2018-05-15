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
 * Provides a wrapper for {@link AmfAuditLogLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AmfAuditLogLocalService
 * @generated
 */
@ProviderType
public class AmfAuditLogLocalServiceWrapper implements AmfAuditLogLocalService,
	ServiceWrapper<AmfAuditLogLocalService> {
	public AmfAuditLogLocalServiceWrapper(
		AmfAuditLogLocalService amfAuditLogLocalService) {
		_amfAuditLogLocalService = amfAuditLogLocalService;
	}

	/**
	* Adds the amf audit log to the database. Also notifies the appropriate model listeners.
	*
	* @param amfAuditLog the amf audit log
	* @return the amf audit log that was added
	*/
	@Override
	public com.liferay.docs.amfRegistrationService.model.AmfAuditLog addAmfAuditLog(
		com.liferay.docs.amfRegistrationService.model.AmfAuditLog amfAuditLog) {
		return _amfAuditLogLocalService.addAmfAuditLog(amfAuditLog);
	}

	@Override
	public void addAuditLogEvent(
		com.liferay.docs.amfRegistrationService.dto.AmfAuditLogDTO amfAuditLogDTO) {
		_amfAuditLogLocalService.addAuditLogEvent(amfAuditLogDTO);
	}

	@Override
	public int countByLoginAndLogout() {
		return _amfAuditLogLocalService.countByLoginAndLogout();
	}

	@Override
	public int countByLoginAndLogout(long userId) {
		return _amfAuditLogLocalService.countByLoginAndLogout(userId);
	}

	@Override
	public int countByRegistration() {
		return _amfAuditLogLocalService.countByRegistration();
	}

	@Override
	public int countByRegistration(long userId) {
		return _amfAuditLogLocalService.countByRegistration(userId);
	}

	@Override
	public int countByUserId(long userId) {
		return _amfAuditLogLocalService.countByUserId(userId);
	}

	/**
	* Creates a new amf audit log with the primary key. Does not add the amf audit log to the database.
	*
	* @param amfAuditLogId the primary key for the new amf audit log
	* @return the new amf audit log
	*/
	@Override
	public com.liferay.docs.amfRegistrationService.model.AmfAuditLog createAmfAuditLog(
		long amfAuditLogId) {
		return _amfAuditLogLocalService.createAmfAuditLog(amfAuditLogId);
	}

	/**
	* Deletes the amf audit log from the database. Also notifies the appropriate model listeners.
	*
	* @param amfAuditLog the amf audit log
	* @return the amf audit log that was removed
	*/
	@Override
	public com.liferay.docs.amfRegistrationService.model.AmfAuditLog deleteAmfAuditLog(
		com.liferay.docs.amfRegistrationService.model.AmfAuditLog amfAuditLog) {
		return _amfAuditLogLocalService.deleteAmfAuditLog(amfAuditLog);
	}

	/**
	* Deletes the amf audit log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param amfAuditLogId the primary key of the amf audit log
	* @return the amf audit log that was removed
	* @throws PortalException if a amf audit log with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.amfRegistrationService.model.AmfAuditLog deleteAmfAuditLog(
		long amfAuditLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfAuditLogLocalService.deleteAmfAuditLog(amfAuditLogId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfAuditLogLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _amfAuditLogLocalService.dynamicQuery();
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
		return _amfAuditLogLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _amfAuditLogLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _amfAuditLogLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _amfAuditLogLocalService.dynamicQueryCount(dynamicQuery);
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
		return _amfAuditLogLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.docs.amfRegistrationService.model.AmfAuditLog fetchAmfAuditLog(
		long amfAuditLogId) {
		return _amfAuditLogLocalService.fetchAmfAuditLog(amfAuditLogId);
	}

	@Override
	public java.util.List<com.liferay.docs.amfRegistrationService.model.AmfAuditLog> findByLoginAndLogout(
		int start, int end) {
		return _amfAuditLogLocalService.findByLoginAndLogout(start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.amfRegistrationService.model.AmfAuditLog> findByLoginAndLogout(
		long userId, int start, int end) {
		return _amfAuditLogLocalService.findByLoginAndLogout(userId, start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.amfRegistrationService.model.AmfAuditLog> findByRegistration(
		int start, int end) {
		return _amfAuditLogLocalService.findByRegistration(start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.amfRegistrationService.model.AmfAuditLog> findByRegistration(
		long userId, int start, int end) {
		return _amfAuditLogLocalService.findByRegistration(userId, start, end);
	}

	@Override
	public java.util.List<com.liferay.docs.amfRegistrationService.model.AmfAuditLog> findByUserId(
		long userId) {
		return _amfAuditLogLocalService.findByUserId(userId);
	}

	@Override
	public java.util.List<com.liferay.docs.amfRegistrationService.model.AmfAuditLog> findByUserId(
		long userId, int start, int end) {
		return _amfAuditLogLocalService.findByUserId(userId, start, end);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _amfAuditLogLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the amf audit log with the primary key.
	*
	* @param amfAuditLogId the primary key of the amf audit log
	* @return the amf audit log
	* @throws PortalException if a amf audit log with the primary key could not be found
	*/
	@Override
	public com.liferay.docs.amfRegistrationService.model.AmfAuditLog getAmfAuditLog(
		long amfAuditLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfAuditLogLocalService.getAmfAuditLog(amfAuditLogId);
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
	@Override
	public java.util.List<com.liferay.docs.amfRegistrationService.model.AmfAuditLog> getAmfAuditLogs(
		int start, int end) {
		return _amfAuditLogLocalService.getAmfAuditLogs(start, end);
	}

	/**
	* Returns the number of amf audit logs.
	*
	* @return the number of amf audit logs
	*/
	@Override
	public int getAmfAuditLogsCount() {
		return _amfAuditLogLocalService.getAmfAuditLogsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _amfAuditLogLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _amfAuditLogLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _amfAuditLogLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the amf audit log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param amfAuditLog the amf audit log
	* @return the amf audit log that was updated
	*/
	@Override
	public com.liferay.docs.amfRegistrationService.model.AmfAuditLog updateAmfAuditLog(
		com.liferay.docs.amfRegistrationService.model.AmfAuditLog amfAuditLog) {
		return _amfAuditLogLocalService.updateAmfAuditLog(amfAuditLog);
	}

	@Override
	public AmfAuditLogLocalService getWrappedService() {
		return _amfAuditLogLocalService;
	}

	@Override
	public void setWrappedService(
		AmfAuditLogLocalService amfAuditLogLocalService) {
		_amfAuditLogLocalService = amfAuditLogLocalService;
	}

	private AmfAuditLogLocalService _amfAuditLogLocalService;
}