create index IX_D95BED15 on AmfAuditLog (eventType[$COLUMN_LENGTH:75$], userId);
create index IX_FA927C85 on AmfAuditLog (eventType[$COLUMN_LENGTH:75$], userName[$COLUMN_LENGTH:75$]);
create index IX_8CAFCF63 on AmfAuditLog (userId);
create index IX_28770353 on AmfAuditLog (userName[$COLUMN_LENGTH:75$]);