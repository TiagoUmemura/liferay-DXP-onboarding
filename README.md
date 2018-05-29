# Setup
blade gw initBundle </br >
Copy and paste on portal-ext.properties: </br >
jdbc.default.driverClassName=org.mariadb.jdbc.Driver</br >
jdbc.default.password=liferay</br >
jdbc.default.url=jdbc:mariadb://localhost/lportal?useUnicode=true&characterEncoding=UTF-8&useFastDateParsing=false</br >
jdbc.default.username=root</br >
</br >
Mysql or MariaDB </br >

## Commands used on project
blade create -t service-builder -p com.liferay.docs.guestbook guestbook </br >
blade gw buildService </br>
blade create -t mvc-portlet -p guestbook.web.portlet -c GuestBookWebPortlet guestbook-web </br >

