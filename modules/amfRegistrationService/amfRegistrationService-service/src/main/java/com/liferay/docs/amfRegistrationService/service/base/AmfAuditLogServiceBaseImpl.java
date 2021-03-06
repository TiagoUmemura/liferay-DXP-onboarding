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

package com.liferay.docs.amfRegistrationService.service.base;

import com.liferay.docs.amfRegistrationService.model.AmfAuditLog;
import com.liferay.docs.amfRegistrationService.service.AmfAuditLogService;
import com.liferay.docs.amfRegistrationService.service.persistence.AmfAuditLogPersistence;
import com.liferay.docs.amfRegistrationService.service.persistence.AmfSearchFinder;
import com.liferay.docs.amfRegistrationService.service.persistence.AmfSearchPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the amf audit log remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.docs.amfRegistrationService.service.impl.AmfAuditLogServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.docs.amfRegistrationService.service.impl.AmfAuditLogServiceImpl
 * @see com.liferay.docs.amfRegistrationService.service.AmfAuditLogServiceUtil
 * @generated
 */
public abstract class AmfAuditLogServiceBaseImpl extends BaseServiceImpl
	implements AmfAuditLogService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.docs.amfRegistrationService.service.AmfAuditLogServiceUtil} to access the amf audit log remote service.
	 */

	/**
	 * Returns the amf audit log local service.
	 *
	 * @return the amf audit log local service
	 */
	public com.liferay.docs.amfRegistrationService.service.AmfAuditLogLocalService getAmfAuditLogLocalService() {
		return amfAuditLogLocalService;
	}

	/**
	 * Sets the amf audit log local service.
	 *
	 * @param amfAuditLogLocalService the amf audit log local service
	 */
	public void setAmfAuditLogLocalService(
		com.liferay.docs.amfRegistrationService.service.AmfAuditLogLocalService amfAuditLogLocalService) {
		this.amfAuditLogLocalService = amfAuditLogLocalService;
	}

	/**
	 * Returns the amf audit log remote service.
	 *
	 * @return the amf audit log remote service
	 */
	public AmfAuditLogService getAmfAuditLogService() {
		return amfAuditLogService;
	}

	/**
	 * Sets the amf audit log remote service.
	 *
	 * @param amfAuditLogService the amf audit log remote service
	 */
	public void setAmfAuditLogService(AmfAuditLogService amfAuditLogService) {
		this.amfAuditLogService = amfAuditLogService;
	}

	/**
	 * Returns the amf audit log persistence.
	 *
	 * @return the amf audit log persistence
	 */
	public AmfAuditLogPersistence getAmfAuditLogPersistence() {
		return amfAuditLogPersistence;
	}

	/**
	 * Sets the amf audit log persistence.
	 *
	 * @param amfAuditLogPersistence the amf audit log persistence
	 */
	public void setAmfAuditLogPersistence(
		AmfAuditLogPersistence amfAuditLogPersistence) {
		this.amfAuditLogPersistence = amfAuditLogPersistence;
	}

	/**
	 * Returns the amf registration local service.
	 *
	 * @return the amf registration local service
	 */
	public com.liferay.docs.amfRegistrationService.service.AmfRegistrationLocalService getAmfRegistrationLocalService() {
		return amfRegistrationLocalService;
	}

	/**
	 * Sets the amf registration local service.
	 *
	 * @param amfRegistrationLocalService the amf registration local service
	 */
	public void setAmfRegistrationLocalService(
		com.liferay.docs.amfRegistrationService.service.AmfRegistrationLocalService amfRegistrationLocalService) {
		this.amfRegistrationLocalService = amfRegistrationLocalService;
	}

	/**
	 * Returns the amf search local service.
	 *
	 * @return the amf search local service
	 */
	public com.liferay.docs.amfRegistrationService.service.AmfSearchLocalService getAmfSearchLocalService() {
		return amfSearchLocalService;
	}

	/**
	 * Sets the amf search local service.
	 *
	 * @param amfSearchLocalService the amf search local service
	 */
	public void setAmfSearchLocalService(
		com.liferay.docs.amfRegistrationService.service.AmfSearchLocalService amfSearchLocalService) {
		this.amfSearchLocalService = amfSearchLocalService;
	}

	/**
	 * Returns the amf search persistence.
	 *
	 * @return the amf search persistence
	 */
	public AmfSearchPersistence getAmfSearchPersistence() {
		return amfSearchPersistence;
	}

	/**
	 * Sets the amf search persistence.
	 *
	 * @param amfSearchPersistence the amf search persistence
	 */
	public void setAmfSearchPersistence(
		AmfSearchPersistence amfSearchPersistence) {
		this.amfSearchPersistence = amfSearchPersistence;
	}

	/**
	 * Returns the amf search finder.
	 *
	 * @return the amf search finder
	 */
	public AmfSearchFinder getAmfSearchFinder() {
		return amfSearchFinder;
	}

	/**
	 * Sets the amf search finder.
	 *
	 * @param amfSearchFinder the amf search finder
	 */
	public void setAmfSearchFinder(AmfSearchFinder amfSearchFinder) {
		this.amfSearchFinder = amfSearchFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AmfAuditLogService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AmfAuditLog.class;
	}

	protected String getModelClassName() {
		return AmfAuditLog.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = amfAuditLogPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.docs.amfRegistrationService.service.AmfAuditLogLocalService.class)
	protected com.liferay.docs.amfRegistrationService.service.AmfAuditLogLocalService amfAuditLogLocalService;
	@BeanReference(type = AmfAuditLogService.class)
	protected AmfAuditLogService amfAuditLogService;
	@BeanReference(type = AmfAuditLogPersistence.class)
	protected AmfAuditLogPersistence amfAuditLogPersistence;
	@BeanReference(type = com.liferay.docs.amfRegistrationService.service.AmfRegistrationLocalService.class)
	protected com.liferay.docs.amfRegistrationService.service.AmfRegistrationLocalService amfRegistrationLocalService;
	@BeanReference(type = com.liferay.docs.amfRegistrationService.service.AmfSearchLocalService.class)
	protected com.liferay.docs.amfRegistrationService.service.AmfSearchLocalService amfSearchLocalService;
	@BeanReference(type = AmfSearchPersistence.class)
	protected AmfSearchPersistence amfSearchPersistence;
	@BeanReference(type = AmfSearchFinder.class)
	protected AmfSearchFinder amfSearchFinder;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}