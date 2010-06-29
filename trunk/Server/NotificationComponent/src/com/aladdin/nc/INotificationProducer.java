package com.aladdin.nc;

/**
 * an interface representing a notification producer
 * to be implemented by every producer
 * 
 * @author <a href="mailto:Maximilian.Schmidt@fokus.fraunhofer.de"> <font  size="-1">Maximilian Schmidt </font> </a> <font size="-1"> FHI FOKUS (C)  </font>
 *
 */
//@Local
public interface INotificationProducer {
	
	/**
	 * JNDI bindings
	 */
	public static final String JNDI_LOCAL_EMAIL 	= "sweb/local/EmailNotificationProducer";
	public static final String JNDI_LOCAL_SMS 		= "sweb/local/SMSNotificationProducer";
	public static final String JNDI_LOCAL_SOAP 		= "sweb/local/SOAPNotificationProducer";
	
	/**
	 * eMail properties - optional (fallback to SWEB defaults)
	 */
	public static final String PROPERTY_EMAIL_HOST			= "mail.smtp.host";
	public static final String PROPERTY_EMAIL_USER			= "mail.smtp.user";
	public static final String PROPERTY_EMAIL_PASS			= "mail.smtp.pass";
	public static final String PROPERTY_EMAIL_AUTH			= "mail.smtp.auth";
	
	/**
	 *  SMS properties 
	 */
	
	public static final String PROPERTY_SMS_USER			= "sms.gateway.user";
	public static final String PROPERTY_SMS_PASS			= "sms.gateway.pass";
	public static final String PROPERTY_SMS_ENDPOINTURL 	= "sms.gateway.enpointurl";
	public static final String PROPERTY_SMS_WSDL_URL 		= "sms.gateway.wsdl_url";
	public static final String PROPERTY_SMS_LOCAL_PART 		= "sms.gateway.local_part";
	public static final String PROPERTY_SMS_NAMESPACE_URI   = "sms.gateway.namespace_uri";
	
	
	
	
	
	/**
	 * configures the producer with properties
	 * 
	 * @param config configuration via properties 
	 */
//	void configure(Properties config)
//	throws NotificationException;
	
	/**
	 * starts the producers with a specific timeout
	 * and a date when the message will be sent
	 * 
	 * @param sendDate		The date at which the message should be sent
	 * @param expireDate	The date at which the producer expires
	 * @param msg			The message to send
	 * @throws NotificationException
	 */
//	void start(Date sendDate, Date expireDate, NotificationMessageType msg)
//	throws NotificationException;
	
	/**
	 * stops the producer, deleting all timers and without any notification done
	 * @throws NotificationException
	 */
//	void stop()
//	throws NotificationException;
	
	/**
	 * notify the user via eMail with a given message
	 * 
	 * @param msg	message to be send
	 * @throws NotificationException
	 */
//	void send(NotificationMessageType msg)
//	throws NotificationException;
	
	/**
	 * receive a structured version of the notification message to send
	 * 
	 * @return notification message
	 */
//	NotificationMessageType getNotificationMessage();
}