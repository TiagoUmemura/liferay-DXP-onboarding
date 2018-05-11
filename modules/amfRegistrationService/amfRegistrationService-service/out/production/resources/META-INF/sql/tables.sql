create table AmfAuditLog (
	amfAuditLogId LONG not null primary key,
	userId LONG,
	userName VARCHAR(75) null,
	dateTime DATE null,
	eventType VARCHAR(75) null,
	ipAddress VARCHAR(75) null
);