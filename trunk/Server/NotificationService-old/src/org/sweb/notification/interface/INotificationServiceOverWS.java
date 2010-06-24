package org.sweb.notification.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.sweb.notification.data.Email;
@WebService(name="I_NotificationService", targetNamespace="http://www.sweb-project.org/ns/nsws")
public interface INotificationServiceOverWS {
	@WebMethod
	public boolean sendEmail(Email msg);
}
