package com.liferay.docs.amfRegistrationService.service.persistence.impl;

import com.liferay.docs.amfRegistrationService.dto.AmfUserSearchDTO;
import com.liferay.docs.amfRegistrationService.model.AmfSearch;
import com.liferay.docs.amfRegistrationService.service.persistence.AmfSearchFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AmfSearchFinderImpl extends AmfSearchFinderBaseImpl implements AmfSearchFinder {
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
}
