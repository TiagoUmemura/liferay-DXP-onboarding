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

package com.liferay.docs.amfRegistrationService.service.impl;

import com.liferay.docs.amfRegistrationService.dto.AmfUserSearchDTO;
import com.liferay.docs.amfRegistrationService.service.base.AmfSearchLocalServiceBaseImpl;
import com.liferay.docs.amfRegistrationService.service.persistence.AmfSearchPersistence;
import com.liferay.docs.amfRegistrationService.service.persistence.impl.AmfSearchPersistenceImpl;
import com.liferay.portal.kernel.dao.orm.PortalCustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the amf search local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.amfRegistrationService.service.AmfSearchLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AmfSearchLocalServiceBaseImpl
 * @see com.liferay.docs.amfRegistrationService.service.AmfSearchLocalServiceUtil
 */
public class AmfSearchLocalServiceImpl extends AmfSearchLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.docs.amfRegistrationService.service.AmfSearchLocalServiceUtil} to access the amf search local service.
	 */
	public List<AmfUserSearchDTO> findUserByZipCode(String zipCode, int start, int end){
		Session session = null;
		try {
			session = amfSearchPersistence.openSession();
			String sql = CustomSQLUtil.get(amfSearchPersistence.getClass(),"userByZipCode");
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(zipCode);
			qPos.add(start);
			qPos.add(end);

			List<Object[]> objectList = (List<Object[]>)q.list();

			List<AmfUserSearchDTO> usersSearchDTO = new ArrayList<>();
			if(objectList != null) {

				for(Object[] object : objectList){
					AmfUserSearchDTO userDTO = new AmfUserSearchDTO();

					BigInteger useridBI = (BigInteger)object[0];
					userDTO.setUserId(useridBI.longValue());

					userDTO.setFirstName((String)object[1]);
					userDTO.setLastName((String)object[2]);
					userDTO.setUserName((String)object[3]);
					userDTO.setEmailAddress((String)object[4]);
					userDTO.setZip((String)object[5]);
					usersSearchDTO.add(userDTO);
				}
			}

			return usersSearchDTO;

		}catch (Exception e) {
			throw e;
		}finally {
			amfSearchPersistence.closeSession(session);
		}
	}

	public int countUserByZipCode(String zipCode){
		Session session = null;
		try {
			session = amfSearchPersistence.openSession();
			String sql = CustomSQLUtil.get(amfSearchPersistence.getClass(),"countByZipCode");
			SQLQuery q = session.createSQLQuery(sql);
			q.setCacheable(false);

			QueryPos qPos = QueryPos.getInstance(q);
			qPos.add(zipCode);

			BigInteger total = (BigInteger)q.uniqueResult();
			return total.intValue();

		}catch (Exception e) {
			throw e;
		}finally {
			amfSearchPersistence.closeSession(session);
		}
	}

	@Override
	public void findByZip() {

	}


}