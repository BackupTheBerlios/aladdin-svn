package com.aladdin.nc;
import eu.aladdin_project.notificationcomponent.*;
import eu.aladdin_project.notificationcomponent.SendEventResponseDocument.SendEventResponse;

public class NotificationComponentSkeleton implements NotificationComponentSkeletonInterface {
	public SendEventResponseDocument sendEvent (SendEventDocument req) {
		SendEventResponseDocument respdoc = SendEventResponseDocument.Factory.newInstance();
		SendEventResponse resp = respdoc.addNewSendEventResponse();
		resp.addNewOut().setStatus((short) -1);
		return respdoc;
    }
}
    