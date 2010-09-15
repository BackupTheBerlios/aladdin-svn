package eu.aladdin_project.controllers.task;

import java.util.Date;

import org.zkoss.calendar.Calendars;
import org.zkoss.calendar.event.CalendarsEvent;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zul.api.Datebox;

import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Timebox;
import org.zkoss.zul.Window;

public class CalendarController extends GenericForwardComposer {
	
	public Window bookEventWin;
	public Calendars cal;
	
	public void onEventCreate(CalendarsEvent event) throws InterruptedException{
		bookEventWin = (Window)Executions.createComponents("bookEvent.zul", self.getParent(), null);
		bookEventWin.setAttribute("calendars", cal);
		bookEventWin.setAttribute("calevent", event);
		Date setting = event.getBeginDate();
		setting.setTime(setting.getTime()+43200000);
		((Datebox)bookEventWin.getFellow("datetask")).setValue(setting);
		((Timebox)bookEventWin.getFellow("timetask")).setValue(setting);
		bookEventWin.setVisible(true);
		bookEventWin.doModal();
	}
	
	public void onEventEdit(CalendarsEvent event) throws InterruptedException{
		System.out.println("AAAAA");
		bookEventWin = (Window)Executions.createComponents("bookEvent.zul", self.getParent(), null);
		bookEventWin.setAttribute("calendars", cal);
		bookEventWin.setAttribute("calevent", event);
		System.out.println("BBBBB");
		Date setting = event.getCalendarEvent().getBeginDate();
		System.out.println("CCCCC");
		setting.setTime(setting.getTime()+43200000);
		System.out.println("CCCCC");
		((Datebox)bookEventWin.getFellow("datetask")).setValue(setting);
		((Timebox)bookEventWin.getFellow("timetask")).setValue(setting);
		System.out.println("DDDDD");
		bookEventWin.setVisible(true);
		bookEventWin.doModal();
	}
	
}
