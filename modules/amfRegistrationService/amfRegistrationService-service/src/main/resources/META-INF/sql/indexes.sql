create index IX_D95BED15 on AmfAuditLog (eventType[$COLUMN_LENGTH:75$], userId[$COLUMN_LENGTH:75$]);
create index IX_FA927C85 on AmfAuditLog (eventType[$COLUMN_LENGTH:75$], userName[$COLUMN_LENGTH:75$]);
create index IX_28770353 on AmfAuditLog (userName[$COLUMN_LENGTH:75$]);