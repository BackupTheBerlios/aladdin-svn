package eu.aladdin_project.controllers.task;

import java.util.Date;

import org.zkoss.calendar.Calendars;
import org.zkoss.calendar.event.CalendarsEvent;
import org.zkoss.calendar.impl.SimpleCalendarEvent;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zul.api.Datebox;

import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Timebox;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Button;
import org.zkoss.zul.Window;
import org.zkoss.zul.Row;

import eu.aladdin_project.SystemDictionary;

public class CalendarController extends GenericForwardComposer {
	
	public Window bookEventWin;
	public Calendars cal;
	
	public void onEventCreate(CalendarsEvent event) throws InterruptedException{
		bookEventWin = (Window)Executions.createComponents("bookEvent.zul", self.getParent(), null);
		bookEventWin.setAttribute("calendars", cal);
		bookEventWin.setAttribute("calevent", event);
		bookEventWin.getFellow("qsrow").setVisible(true);
		Date setting = event.getBeginDate();
		setting.setTime(setting.getTime()+43200000);
		((Datebox)bookEventWin.getFellow("datetask")).setValue(setting);
		((Timebox)bookEventWin.getFellow("timetask")).setValue(setting);
		((Button)bookEventWin.getFellow("savebutton")).setVisible(true);
		((Listbox)bookEventWin.getFellow("tasktypesel")).setSelectedIndex(0);
		bookEventWin.setTitle("New Task");
		bookEventWin.setVisible(true);
		bookEventWin.doModal();
	}
	
	public void onEventEdit(CalendarsEvent event) throws InterruptedException{
		bookEventWin = (Window)Executions.createComponents("bookEvent.zul", self.getParent(), null);
		bookEventWin.setAttribute("calendars", cal);
		bookEventWin.setAttribute("calevent", event);
		Date setting = event.getCalendarEvent().getBeginDate();
		SimpleCalendarEvent scevent = (SimpleCalendarEvent)event.getCalendarEvent();
		System.out.println("CCCCC");
		((Datebox)bookEventWin.getFellow("datetask")).setValue(setting);
		((Datebox)bookEventWin.getFellow("datetask")).setReadonly(true);
		((Datebox)bookEventWin.getFellow("datetask")).setButtonVisible(false);
		((Timebox)bookEventWin.getFellow("timetask")).setValue(setting);
		((Timebox)bookEventWin.getFellow("timetask")).setReadonly(true);
		((Timebox)bookEventWin.getFellow("timetask")).setButtonVisible(false);
		((Textbox)bookEventWin.getFellow("taskidfield")).setValue(scevent.getParams().get("task"));
		((Row)bookEventWin.getFellow("rowtaskid")).setVisible(true);
		((Textbox)bookEventWin.getFellow("taskstatusfield")).setValue(SystemDictionary.getTaskStatusLabel(scevent.getParams().get("status")));
		((Row)bookEventWin.getFellow("rowtaskstatus")).setVisible(true);
		((Textbox)bookEventWin.getFellow("addressedid")).setValue(scevent.getParams().get("objid"));
		((Button)bookEventWin.getFellow("cancelbutton")).setVisible(true);
		((Textbox)bookEventWin.getFellow("tasktypetext")).setValue(scevent.getContent());
		((Textbox)bookEventWin.getFellow("tasktypetext")).setVisible(true);
		((Combobox)bookEventWin.getFellow("addressedtext")).setVisible(false);
		((Listbox)bookEventWin.getFellow("tasktypesel")).setVisible(false);
		bookEventWin.setTitle("View Task");
		bookEventWin.setVisible(true);
		bookEventWin.doModal();
	}
	
}
