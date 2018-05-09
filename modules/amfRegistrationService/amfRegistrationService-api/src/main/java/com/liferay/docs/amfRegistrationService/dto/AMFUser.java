package com.liferay.docs.amfRegistrationService.dto;

import java.util.Locale;

public class AMFUser {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String username;
    private String gender;
    private String birthday;
    private String password1;
    private String password2;

    private String homePhone;
    private String mobilePhone;

    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;

    private String securityQuestion;
    private String securityAnswer;
    private boolean acceptedTou;
    private long companyId;
    private Locale locale;

    public AMFUser(String firtName, String lastName, String emailAddress, String username, String gender, String birthday, String password1, String password2, String homePhone, String mobilePhone, String address1, String address2, String city, String state, String zip, String securityQuestion, String securityAnswer, boolean acceptedTou, long companyId, Locale locale) {
        this.firstName = firtName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.username = username;
        this.gender = gender;
        this.birthday = birthday;
        this.password1 = password1;
        this.password2 = password2;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
        this.acceptedTou = acceptedTou;
        this.companyId = companyId;
        this.locale = locale;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firtName) {
        this.firstName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public boolean isAcceptedTou() {
        return acceptedTou;
    }

    public void setAcceptedTou(boolean acceptedTou) {
        this.acceptedTou = acceptedTou;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}
