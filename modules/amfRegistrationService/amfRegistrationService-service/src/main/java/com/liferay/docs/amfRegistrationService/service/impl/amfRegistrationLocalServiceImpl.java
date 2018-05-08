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

import com.liferay.docs.amfRegistrationService.exceptions.RegistrationException;
import com.liferay.docs.amfRegistrationService.model.AMFUser;
import com.liferay.docs.amfRegistrationService.service.base.amfRegistrationLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;

import java.util.ArrayList;

/**
 * The implementation of the amf registration local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.amfRegistrationService.service.amfRegistrationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see amfRegistrationLocalServiceBaseImpl
 * @see com.liferay.docs.amfRegistrationService.service.amfRegistrationLocalServiceUtil
 */
public class amfRegistrationLocalServiceImpl
	extends amfRegistrationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.docs.amfRegistrationService.service.amfRegistrationLocalServiceUtil} to access the amf registration local service.
	 */
	private ArrayList<String> listErrors = new ArrayList<String>();

	public void addAMFUser(AMFUser user) throws PortalException {

		if(validationAMFUser(user)){
			throw new RegistrationException(listErrors);
		}

		String[] birthday = user.getBirthday().split("/");
		int birthdayMonth = Integer.parseInt(birthday[0]);
		int birthdayDay = Integer.parseInt(birthday[1]);
		int birthdayYear = Integer.parseInt(birthday[2]);

		/*
		User userAMF = userLocalService.addUser(
			0, user.getCompanyId(), false, user.getPassword1(), user.getPassword2(),false, user.getUsername(), user.getEmailAddress(), 0, null,
			user.getLocale(), user.getFirstName(), "", user.getLastName(), 0, 0, "male".equals(user.getGender()), birthdayMonth, birthdayDay, birthdayYear,
			"", null, null, null, null, false, new ServiceContext()
		);

		Address address = addressLocalService.addAddress(userAMF.getUserId(), Contact.class.getName(), userAMF.getContactId(), user.getAddress1(), user.getAddress2(), "",
				user.getCity(), user.getZip(), 0, 19,11002, false, true, new ServiceContext());

		Phone Homephone = phoneLocalService.addPhone(userAMF.getUserId(), Contact.class.getName(), userAMF.getContactId(), user.getHomePhone(), null, 11011, true, new ServiceContext());

		Phone Mobilephone = phoneLocalService.addPhone(userAMF.getUserId(), Contact.class.getName(), userAMF.getContactId(), user.getMobilePhone(), null, 11008, true, new ServiceContext());
		*/
	}

	private boolean validationAMFUser(AMFUser user){
		validateFirstName(user.getFirstName());
		validateLastName(user.getLastName());

		if(listErrors.isEmpty()){
			return false;
		}else{
			return true;
		}

	}

	private void validateFirstName(String name){
		if(name.matches("^.*[^a-zA-Z0-9 ].*$") || name.length() > 50 || name == null || name == ""){
 			listErrors.add("InvalidFirstName");
		}
	}

	private void validateLastName(String name){
		if(name.matches("^.*[^a-zA-Z0-9 ].*$") || name.length() > 50 || name == null || name == ""){
			listErrors.add("InvalidLastName");
		}
	}
}