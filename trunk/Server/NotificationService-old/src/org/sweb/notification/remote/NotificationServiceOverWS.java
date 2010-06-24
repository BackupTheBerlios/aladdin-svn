package org.sweb.notification.remote;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Date;

import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.sweb.notification.gateway.EmailGateway;
import org.sweb.notification.data.Email;
import javax.mail.NoSuchProviderException;
import javax.mail.MessagingException;
//import org.sweb.notification.exception.NotificationException;
//import org.sweb.notification.interfaces.INotificationManager;
import org.sweb.notification.interfaces.INotificationProducer;
import org.sweb.notification.interfaces.INotificationServiceOverWS;
//import org.sweb.schemata.MarshallTools;
//import org.sweb.servicehandling.exceptions.ServiceLocatorException;
//import org.sweb.servicehandling.utils.ServiceLocator;
//import org.sweb_project.serviceschemas.NotificationMessageType;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.ejb.Stateful;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
 
@WebService(endpointInterface="org.sweb.notification.interfaces.INotificationServiceOverWS")
public class NotificationServiceOverWS implements INotificationServiceOverWS {
	
	Logger log = Logger.getLogger(NotificationServiceOverWS.class);

	public boolean sendEmail (Email em) {
		Properties prop = new Properties();
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("META-INF/email.properties");
		try {
			prop.load(is);
		} catch (IOException e) {
			e.printStackTrace ();
			return false;
		}
		EmailGateway eg = EmailGateway.getInstance();
		try {
			Session sess = Session.getDefaultInstance(prop, null);
			Message msg = new MimeMessage(sess);
			msg.setFrom(new InternetAddress(em.getReplyTo ()));
			msg.setSubject(em.getSubject ());
			msg.setText(em.getBody ());
			msg.setSentDate(new Date());
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(em.getTo ()));
			eg.sendEmail (msg, prop);
		} catch (Exception e) {
			return false;
		}
		return true;
/*		if(MarshallTools.getDocID(msg)!=60||msg.getShortMessageNotification()==null){
			log.error("Message is not of NotficatioNmessageType");
			return true;
		}
		boolean result = false;
		try {
			ServiceLocator loc = ServiceLocator.getInstance();
			INotificationManager mgr = loc.getNotificationManager();
			
			log.info("got the NotificatioManager safely :) "+msg.getClass());
			
			INotificationProducer producer = null;
			Integer id = null;
			Properties prop=null;
				// EMAIL is made unavailable				
			if (false && msg.getEmailNotification()!=null) {
				log.info("Getting EMAIL Producer");
				id = mgr.createNotificationProducer(INotificationManager.PRODUCER_EMAIL);
				InputStream is = this.getClass().getClassLoader().getResourceAsStream("META-INF/email.properties");
				prop = new Properties();
				prop.load(is);
				
			} else if (true || msg.getShortMessageNotification() != null) {
				log.info("Getting SMS Producer");
				id = mgr.createNotificationProducer(INotificationManager.PRODUCER_SMS);
				InputStream is = this.getClass().getClassLoader().getResourceAsStream("META-INF/sms.properties");
				prop = new Properties();
				prop.load(is);
				//SOAP is made unavailable
			} else if (false && msg.getSOAPNotification() != null) {
				log.info("Getting SOAP Producer");
				id = mgr.createNotificationProducer(INotificationManager.PRODUCER_SOAP);
			}
			producer = mgr.getNotificationProducer(id);
			log.info("producer : "+producer);
			producer.configure(prop);
			log.info("configure producer");
			producer.send(msg);
			result = true;
		} catch (ServiceLocatorException e) {
			log.info(e.getMessage());
			// SMS is not reliable
			//return true;
		} catch (NotificationException e) {
			log.info(e.getMessage());
			// SMS is not reliable
			//return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return result;
*/
	}



}
