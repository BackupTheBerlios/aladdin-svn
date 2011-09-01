package com.aladdin.nc;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import org.apache.log4j.Logger;


/**
 * a gateway for sending mail, implemented as a singelton
 * @author   <a href="mailto:Maximilian.Schmidt@fokus.fraunhofer.de"> <font  size="-1">Maximilian Schmidt </font> </a> <font size="-1"> FHI FOKUS (C)  </font>
 */ 
public class EmailGateway {
	private static EmailGateway singleton;
	
	/**
	 * get an instance - the one and only instance allowed
	 * 
	 * @return the repository instance 
	 */
	public synchronized static EmailGateway getInstance() {
		if (singleton == null) singleton = new EmailGateway();
		return singleton;
	}
	
	/**
	 * send out the given message and in case of failure, send it 
	 * back to the sender
	 * 
	 * @param msg	message to be send out
	 * @throws NotificationException
	 */
	public void sendEmail(Message msg, Properties config) throws Exception {
		Logger log = Logger.getLogger(this.getClass());
			
		/*
		 * receive properties
		 */
		String host = config.getProperty(INotificationProducer.PROPERTY_EMAIL_HOST);
		String user = config.getProperty(INotificationProducer.PROPERTY_EMAIL_USER);
		String pass = config.getProperty(INotificationProducer.PROPERTY_EMAIL_PASS);
		String auth = config.getProperty(INotificationProducer.PROPERTY_EMAIL_AUTH);
		
		/*
		 * if no mailhost specified, search for config file
		 * - otherwise no mail could be send 
		 * (falling back to localhost is NOT an option)
		 */
//		if (host == null) {
			
//			Config eConfig = null;
			
			// set up new properties			
//			try {
//				eConfig = Config.getInstance();
//			} catch (ConfigException e3) {
//				throw new NotificationException("Configuration not avaiable",e3);
//			}
			
			
			/* read properties */
//			try {
//				
//				host = eConfig.getProperty(Config.SWEB_NOTIF_EMAIL_SMTP_HOST);
//			} catch (ConfigException e1) {
//				throw new NotificationException("cannot read email properties",e1);
//			}
			
//			try {
//				user = eConfig.getProperty(Config.SWEB_NOTIF_EMAIL_SMTP_USER);
//				pass = eConfig.getProperty(Config.SWEB_NOTIF_EMAIL_SMTP_PASS);
//				auth = eConfig.getProperty(Config.SWEB_NOTIF_EMAIL_SMTP_AUTH);
//			} catch (ConfigException e4) {
//				e4.printStackTrace();
//			}
			
			/* check whether configuration complete */
//			if (host == null) {
//				throw new NotificationException("Gateway: Host not specified");
//			}
//		}
		
		if (log.isDebugEnabled()) { 
			log.debug("host     = "+host);
			log.debug("auth     = "+auth);
			log.debug("user     = "+user);
			log.debug("password = "+pass);
		}
		
		/*
		 * get a new session and configure it
		 */
		Session session = Session.getDefaultInstance(config,null);
		Transport trans = null;
		try {
			/*
			 * get an new smtp transport layer
			 */
			trans = session.getTransport("smtp");
		} catch (NoSuchProviderException e2) {
			throw new Exception (e2.toString ());
		}
		
		try {
			/*
			 * check for authentication parameters
			 */
			if (auth != null && auth.equals("true")) {
				if (user == null || pass == null) throw new Exception("Gateway: user or pass not specified");
				
				
				/*
				 * transport authorization
				 */
				trans.connect(host,user,pass);
				/*
				 * send out
				 */
				if (log.isDebugEnabled()) log.debug("sending message out ...");
				trans.sendMessage(msg,msg.getAllRecipients());
			} else {
				/*
				 * no authentication -> user and password left empty
				 */
				trans.connect(host,null,null);
				/*
				 * send out
				 */
				if (log.isDebugEnabled()) log.debug("sending message out ...");
				trans.sendMessage(msg,msg.getAllRecipients());
			}
			
		} catch (MessagingException e) {
			throw e;
		} finally {
			try {
				/*
				 * close transport layer
				 */
				trans.close();
			} catch (MessagingException e1) {
				throw e1;
			}
		}
	}
	
}
