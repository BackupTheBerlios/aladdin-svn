package org.sweb.notification.data;
public class Email {
	private String to;
	private String subject;
	private String body;
	private String replyTo;

	public String getTo () {return to;}
	public String getSubject () {return subject;}
	public String getBody () {return body;}
	public String getReplyTo () {return replyTo;}

	public void setTo (String a) {to = a;}
	public void setSubject (String a) {subject = a;}
	public void setBody (String a) {body = a;}
	public void setReplyTo (String a) {replyTo = a;}

}

