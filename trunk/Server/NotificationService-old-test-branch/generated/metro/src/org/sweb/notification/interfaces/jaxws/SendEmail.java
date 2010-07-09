
package org.sweb.notification.interfaces.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "sendEmail", namespace = "http://www.sweb-project.org/ns/nsws")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendEmail", namespace = "http://www.sweb-project.org/ns/nsws")
public class SendEmail {

    @XmlElement(name = "arg0", namespace = "")
    private org.sweb.notification.data.Email arg0;

    /**
     * 
     * @return
     *     returns Email
     */
    public org.sweb.notification.data.Email getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(org.sweb.notification.data.Email arg0) {
        this.arg0 = arg0;
    }

}
