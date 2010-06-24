package org.sweb.notification.gateway;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.xml.namespace.QName;

import org.sweb.notification.interfaces.INotificationProducer;
import org.sweb_project.serviceschemas.ShortMessageType;

import sms.ISmsNotificationService;
import sms.SmsServiceImplService;




public class SMSGateway {

	private static SMSGateway singleton = null;
	
	public static SMSGateway getInstance() {
		if (singleton == null) {
			singleton = new SMSGateway();
		}
		return singleton;
	}
	
	public void sendSMS(ShortMessageType msg,Properties config) {
		
		
		 // Stuff contained either in global config or config
		 URL wsdlURL=null;
		 String namespaceURI=null;
		 String localpart=null;
		 String user=null;
		 String pass=null;
		

		 
				 
		 if(config.containsKey(INotificationProducer.PROPERTY_SMS_USER))
			 user = config.getProperty(INotificationProducer.PROPERTY_SMS_USER);
		 
		 if(config.containsKey(INotificationProducer.PROPERTY_SMS_PASS))
			 pass = config.getProperty(INotificationProducer.PROPERTY_SMS_PASS);
		
		 try {
		
			if(config.containsKey(INotificationProducer.PROPERTY_SMS_WSDL_URL))
			
					wsdlURL = new URL(config.getProperty(INotificationProducer.PROPERTY_SMS_WSDL_URL));
				
				
		 } catch (MalformedURLException e) {
	
			e.printStackTrace();
		 }
		 
		 if(config.containsKey(INotificationProducer.PROPERTY_SMS_NAMESPACE_URI))
			 namespaceURI = config.getProperty(INotificationProducer.PROPERTY_SMS_NAMESPACE_URI);
		 
		 if(config.containsKey(INotificationProducer.PROPERTY_SMS_LOCAL_PART))
			 localpart = config.getProperty(INotificationProducer.PROPERTY_SMS_LOCAL_PART);
		 
		 // Now we got everything and use it.
	
	 	 QName serviceName = new QName(namespaceURI,localpart);
		 SmsServiceImplService sms = new SmsServiceImplService(wsdlURL,serviceName);
		 ISmsNotificationService isms = (ISmsNotificationService) sms.getSmsServiceImplPort();
			
		 isms.sendSMS("tel:"+msg.getPhoneNumber(), msg.getMessage(), user, pass);
		 
		 
		
		
		
	}
	
}
