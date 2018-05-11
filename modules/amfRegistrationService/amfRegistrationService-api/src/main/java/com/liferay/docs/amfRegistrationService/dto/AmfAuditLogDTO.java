package com.liferay.docs.amfRegistrationService.dto;

import java.util.Date;

public class AmfAuditLogDTO {
    private long userId;
    private String userName;
    private String ipAddress;
    private String eventType;
    private Date dateTime;

    public AmfAuditLogDTO(long userId, String userName, String ipAddress, String eventType, Date dateTime) {
        this.userId = userId;
        this.userName = userName;
        this.ipAddress = ipAddress;
        this.eventType = eventType;
        this.dateTime = dateTime;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
