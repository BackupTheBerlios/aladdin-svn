package com.aladdin.nc;

import eu.aladdin_project.notificationcomponent.*;
import eu.aladdin_project.notificationcomponent.SendEventResponseDocument.SendEventResponse;
import eu.aladdin_project.xsd.Event;

import org.apache.log4j.Logger;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import java.util.Date;

public class NotificationComponentSkeleton implements NotificationComponentSkeletonInterface {
	
	Logger log = Logger.getLogger(NotificationComponentSkeleton.class);
	
	public SendEventResponseDocument sendEvent (SendEventDocument req) {
		SendEventResponseDocument respdoc = SendEventResponseDocument.Factory.newInstance();
		SendEventResponse resp = respdoc.addNewSendEventResponse();
		
		Properties prop = new Properties();
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("META-INF/email.properties");
		try {
			prop.load(is);
		} catch (IOException e) {
			e.printStackTrace ();
			resp.addNewOut().setStatus((short) 0);
			return respdoc;
		}
		EmailGateway eg = EmailGateway.getInstance();
		
		try {
			Session sess = Session.getDefaultInstance(prop, null);
			Message msg = new MimeMessage(sess);
			msg.setFrom(new InternetAddress("auto@aladdin-project.eu"));
			Event event = req.getSendEvent().getEvent();
			msg.setSubject(event.getSubject());
			msg.setText(event.getText());
			msg.setSentDate(new Date());
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(event.getTarget()));
			eg.sendEmail (msg, prop);
			resp.addNewOut().setStatus((short) 1);
		} catch (Exception e) {
			resp.addNewOut().setStatus((short) 0);
		}
		
		return respdoc;
    }
}
