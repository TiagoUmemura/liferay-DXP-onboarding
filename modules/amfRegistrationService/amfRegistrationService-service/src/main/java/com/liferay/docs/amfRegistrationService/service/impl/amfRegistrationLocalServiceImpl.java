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
import com.liferay.docs.amfRegistrationService.dto.AMFUser;
import com.liferay.docs.amfRegistrationService.service.base.amfRegistrationLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.model.Contact;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

	public void addAMFUser(AMFUser user) throws PortalException, ParseException {
		//if true throw a exception to AMFUserPortlet
		if(validationAMFUser(user)){
			throw new RegistrationException(listErrors);
		}

		String[] birthday = user.getBirthday().split("/");
		int birthdayMonth = Integer.parseInt(birthday[0]);
		int birthdayDay = Integer.parseInt(birthday[1]);
		int birthdayYear = Integer.parseInt(birthday[2]);


		User userAMF = userLocalService.addUser(
			0, user.getCompanyId(), false, user.getPassword1(), user.getPassword2(),false, user.getUsername(), user.getEmailAddress(), 0, null,
			user.getLocale(), user.getFirstName(), "", user.getLastName(), 0, 0, "male".equals(user.getGender()), birthdayMonth, birthdayDay, birthdayYear,
			"", null, null, null, null, false, new ServiceContext()
		);

		Address address = addressLocalService.addAddress(userAMF.getUserId(), Contact.class.getName(), userAMF.getContactId(), user.getAddress1(), user.getAddress2(), "",
				user.getCity(), user.getZip(), 0, 19,11002, false, true, new ServiceContext());

		Phone Homephone = phoneLocalService.addPhone(userAMF.getUserId(), Contact.class.getName(), userAMF.getContactId(), user.getHomePhone(), null, 11011, true, new ServiceContext());

		Phone Mobilephone = phoneLocalService.addPhone(userAMF.getUserId(), Contact.class.getName(), userAMF.getContactId(), user.getMobilePhone(), null, 11008, true, new ServiceContext());

	}

	private boolean validationAMFUser(AMFUser user) throws ParseException {
		listErrors.clear();
		validateFirstName(user.getFirstName());
		validateLastName(user.getLastName());
		validateEmail(user.getEmailAddress());
		validateUserName(user.getUsername());
		validateBrithday(user.getBirthday());
		validateHomePhone(user.getHomePhone());
		validateMobilePhone(user.getMobilePhone());
		validateAddress1(user.getAddress1());
		validateAddress2(user.getAddress2());
		validateState(user.getState());
		validateCity(user.getCity());
		validateZipCode(user.getZip());
		validateSecurityQuestion(user.getSecurityQuestion());
		validateSecurityAnswer(user.getSecurityAnswer());
		validateTermsOfUse(user.isAcceptedTou());
		validatePassword2(user.getPassword1(), user.getPassword2());
		validatePassword1(user.getPassword1());

		if(listErrors.isEmpty()){
			return false;
		}else{
			return true;
		}

	}

	private void validateFirstName(String name){
		if(name.matches("^.*[^a-zA-Z0-9 ].*$") || name.length() > 50 || name == null || name.equals("")){
 			listErrors.add("InvalidFirstName");
		}
	}

	private void validateLastName(String lastname){
		if(lastname.matches("^.*[^a-zA-Z0-9 ].*$") || lastname.length() > 50 || lastname == null || lastname.equals("")){
			listErrors.add("InvalidLastName");
		}
	}

	private void validateEmail(String email){
		if(!Validator.isEmailAddress(email) || email.length() > 255 || email == null || email.equals("")){
			listErrors.add("InvalidEmail");
		}
	}

	private void validateUserName(String userName){
		if(userName.matches("^.*[^a-zA-Z0-9 ].*$") || userName.length() < 4 || userName.length() > 16 || userName == null || userName.equals("")){
			listErrors.add("InvalidUserName");
		}
	}

	//birthday format MM/dd/YYYY
	private void validateBrithday(String birthday) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		Date birthDate = dateFormat.parse(birthday);

		long diff = date.getTime() - birthDate.getTime();
		long diffYears = (diff / (24 * 60 * 60 * 1000))/365;

		if(diffYears < 13){
			listErrors.add("InvalidBirthday");
		}
	}

	private void validateHomePhone(String homePhone){
		if(!Validator.isNumber(homePhone) || (homePhone.length() != 10) || homePhone == null || homePhone.equals("")){
			listErrors.add("InvalidHomePhone");
		}
	}

	private void validateMobilePhone(String mobilePhone){
		if(!Validator.isNumber(mobilePhone) || (mobilePhone.length() != 10) || mobilePhone == null || mobilePhone.equals("")){
			listErrors.add("InvalidMobilePhone");
		}
	}

	private void validateAddress1(String address1){
		if(address1.matches("^.*[^a-zA-Z0-9 ].*$") || address1.length() > 255 || address1 == null || address1.equals("")){
			listErrors.add("InvalidAddress1");
		}
	}

	private void validateAddress2(String address2){
		if(address2.matches("^.*[^a-zA-Z0-9 ].*$") || address2.length() > 255){
			listErrors.add("InvalidAddress2");
		}
	}

	private void validateCity(String city){
		if(city.matches("^.*[^a-zA-Z0-9 ].*$") || city.length() > 255 || city == null || city.equals("")){
			listErrors.add("InvalidCity");
		}
	}

	private void validateZipCode(String zipCode){
		if(!Validator.isNumber(zipCode) || zipCode.length() != 5){
			listErrors.add("InvalidZipCode");
		}
	}

	private void validateSecurityQuestion(String securityQuestion){
		if(securityQuestion == null || securityQuestion.equals("")){
			listErrors.add("InvalidSecurityQuestion");
		}
	}

	private void validateSecurityAnswer(String securityAnswer){
		if(securityAnswer == null || securityAnswer.equals("")){
			listErrors.add("InvalidSecurityAnswer");
		}
	}

	private void validateTermsOfUse (boolean acceptedTou){
		if(acceptedTou == false){
			listErrors.add("InvalidAcceptedTou");
		}
	}

	private void validatePassword2(String password1, String password2){
		if(!password1.equals(password2)){
			listErrors.add("InvalidPassword2");
		}
	}

	private void validatePassword1(String password1){
		if(!password1.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$")){
			listErrors.add("InvalidPassword1");
		}

	}

	private void validateState(String state){
		if(state == null || state.equals("")){
			listErrors.add("InvalidState");
		}
	}


	public static final String FIND_ALL_EVENTS = "allEventsLog";

}