This is a project created by Alexander Ahlquist
for the Full-Stack Java Engineer program at Per Scholas.


In order to run this application, you need to ensure that
the hibernate.cfg.xml file is configured properly for your system.
Check that line 12 has your username, and line 13 has your password.
This application was designed to work with MariaDB.

Open HeidiSQL and create a database named sms.
If you already have a database named sms, 
ensure that you drop all the tables inside of it.

Once you have an empty database named sms in HeidiSQL
and your hibernate.cfg.xml file is configured properly,
open the java file in the 
src/main/java/com.ahlquist.sms.app package named "SMSRunner.java"

Run the program once to initialize your tables, then input "2" to quit the program.
Using the file "sms_dummy_data.sql", run the query in HeidiSQL
to fill your tables with dummy-data which will let you test the 
SMSRunner.java application.

Now you can run the SMSRunner.java app.

Use the email "test"
and password "test" to test the application,
or use the correct combination of username and password which was populated into your tables.


JUNIT----------------
The jUnit I chose to test was the validateStudent method.
I used ss.getAllStudents(); to initialize the student list,
and then asserted that ss.validateStudent would return "true"
if I used the email "test" and password "test". This ensures 
that the login system will work properly if you enter the correct credentials! 


Thanks for checking out my project!