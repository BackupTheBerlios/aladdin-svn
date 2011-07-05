package eu.aladdin_project.controllers.details.measurements;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.encoders.EncoderUtil;
import org.jfree.chart.encoders.ImageFormat;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.zkoss.image.AImage;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zul.Button;
import org.zkoss.zul.Filedownload;
import org.zkoss.zul.Image;
import org.zkoss.zul.Window;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Timebox;


import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.Measurement;
import eu.aladdin_project.xsd.OperationResult;

public class MeasurementPopupController extends Window{
	private static final long serialVersionUID = 2129003366036217191L;
	private String patientid;
	
	public MeasurementPopupController(){
	}
	
	@SuppressWarnings("unused")
	public void setPatientid(String patientid){
		this.patientid = patientid;
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		String loggeduser = (String)Sessions.getCurrent().getAttribute("userid");
		try{
			OperationResult user = proxy.getUserIdByPersonId(this.patientid, SystemDictionary.USERTYPE_PATIENT_INT, loggeduser);
		}catch(Exception e){
			e.printStackTrace();
			Executions.sendRedirect("");
		}
	}
	
	public void setFrom(Date from){
		((Datebox)getFellow("dfrom")).setValue(from);
		((Timebox)getFellow("tfrom")).setValue(from);
	}
	
	public void setTo(Date to){
		((Datebox)getFellow("dto")).setValue(to);
		((Timebox)getFellow("tto")).setValue(to);
	}
	
	@SuppressWarnings("deprecation")
	public void generateImage() throws RemoteException{
		StorageComponentProxy sc = SystemDictionary.getSCProxy();
		String loggeduser = (String)Sessions.getCurrent().getAttribute("userid");
		String mtype = (String)((Listbox)getFellow("measurementtype")).getSelectedItem().getValue();
		
		Date from = ((Datebox)getFellow("dfrom")).getValue();
		from.setHours(((Timebox)getFellow("tfrom")).getValue().getHours());
		from.setMinutes(((Timebox)getFellow("tfrom")).getValue().getMinutes());
		from.setSeconds(((Timebox)getFellow("tfrom")).getValue().getSeconds());
		
		Date to = ((Datebox)getFellow("dto")).getValue();
		to.setHours(((Timebox)getFellow("tto")).getValue().getHours());
		to.setMinutes(((Timebox)getFellow("tto")).getValue().getMinutes());
		to.setSeconds(((Timebox)getFellow("tto")).getValue().getSeconds());
		
		Calendar calto = new GregorianCalendar();
		calto.setTime(to);
		Calendar calfrom = new GregorianCalendar();
		calfrom.setTime(from);
		
		DefaultCategoryDataset dataset = this.fillData(mtype, calfrom, calto, loggeduser, sc);
		String title = "";
		String axis  ="";
		
		if (mtype.equals(SystemDictionary.TASK_TYPE_WEIGHT_MEASUREMENT)) {
			title ="Weight Measurements";
			axis = "Weight";
		} else if (mtype.equals(SystemDictionary.TASK_TYPE_ACTMONITOR)) {
			title ="Activity Monitor";
			axis = "steps";
		} else if (mtype.equals(SystemDictionary.TASK_TYPE_BLOODPRESSURE_MEASUREMENT)) {
			title ="Blood pressure measurements";
			axis = "Blood pressure";
		}
		
		JFreeChart chart = ChartFactory.createLineChart(title,"Day and hour", axis, dataset, PlotOrientation.VERTICAL, false, false, false);
		chart.setBackgroundPaint(Color.white);
		
		CategoryPlot cplot = chart.getCategoryPlot();
		cplot.setBackgroundPaint(Color.white);
		cplot.setRangeGridlinePaint(Color.lightGray);
		
		LineAndShapeRenderer renderer = (LineAndShapeRenderer)cplot.getRenderer();
		renderer.setSeriesShapesVisible(0,true);
		renderer.setDrawOutlines(true);
		renderer.setUseFillPaint(true);
		NumberAxis rangeAxis = (NumberAxis)cplot.getRangeAxis();
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		try{
			BufferedImage bi = chart.createBufferedImage(1200, 600, BufferedImage.TRANSLUCENT , null);
			byte[] bytes = EncoderUtil.encode(bi, ImageFormat.PNG, true);
			AImage image = new AImage("Line Chart", bytes);
			((Image)getFellow("imagemeas")).setContent(image);
			Button downbutton = (Button)getFellow("measurementdownloadbutton");
			downbutton.addEventListener("onClick", new DownloadListener(image,"monitor.png"));
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	private DefaultCategoryDataset fillData(String typeofint, Calendar calfrom, Calendar calto, String loggeduser, StorageComponentProxy sc) throws RemoteException{
		int typeofmint = -1;
		if(SystemDictionary.TASK_TYPE_BLOODPRESSURE_MEASUREMENT.equals(typeofint)){
			//SystemDictionary.MEASUREMENT_BLODDPRESSURE_INT;
			typeofmint = 11;
			//typeofmint = 12;
		}else if(SystemDictionary.TASK_TYPE_WEIGHT_MEASUREMENT.equals(typeofint)){
			typeofmint = SystemDictionary.MEASUREMENT_WEIGHT_INT;
		}else if(SystemDictionary.TASK_TYPE_ACTMONITOR.equals(typeofint)){
			typeofmint = SystemDictionary.MEASUREMENT_ACTIVITY_MONITOR_INT;
		}
		Measurement[] measures = sc.getPatientMeasurement(this.patientid, typeofmint, calfrom, calto, loggeduser);
		SystemDictionary.webguiLog("INFO", "Measures: "+measures);
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		if(measures != null && measures.length > 0){
			List<Measurement> measurementlist = Arrays.asList(measures);
			List<Measurement> tmp = new ArrayList<Measurement>();
			
			for (int i = 0; i < measurementlist.size(); i++) {
				if (
						measurementlist.get(i).getDateTime().compareTo(calfrom) >= 0 &&
						measurementlist.get(i).getDateTime().compareTo(calto) <= 0
					)
					tmp.add(measurementlist.get(i));
			}
			
			measurementlist = tmp;
			
			Collections.sort(measurementlist, new MeasurementDateSort());
			Iterator<Measurement> it = measurementlist.iterator();
			while(it.hasNext()){
				Measurement mnext = it.next();
				SimpleDateFormat sdf = new SimpleDateFormat("HH dd/MM");
				dataset.addValue(mnext.getValue(), "original", sdf.format(mnext.getDateTime().getTime()));
				if (mnext.getValue() > 0) SystemDictionary.webguiLog("INFO", "DATE: "+sdf.format(mnext.getDateTime().getTime())+"\nMEASUREMENT: "+mnext.getValue());
			}
		}else{
			//TODO Sample data
			dataset.addValue(0,"Weight Measurement", "1");
			dataset.addValue(0,"Weight Measurement", "5");
			dataset.addValue(0,"Weight Measurement", "10");
			dataset.addValue(0,"Weight Measurement", "15");
			dataset.addValue(0,"Weight Measurement", "20");
			dataset.addValue(0,"Weight Measurement", "25");
			dataset.addValue(0,"Weight Measurement", "30");
		}
		if(typeofmint == 11){
			measures = sc.getPatientMeasurement(this.patientid, 12, calfrom, calto, loggeduser);
			//dataset = new DefaultCategoryDataset();
			if(measures != null && measures.length > 0){
				List<Measurement> measurementlist = Arrays.asList(measures);
				Collections.sort(measurementlist, new MeasurementDateSort());
				Iterator<Measurement> it = measurementlist.iterator();
				while(it.hasNext()){
					Measurement mnext = it.next();
					dataset.addValue(mnext.getValue(), "diastolic", mnext.getDateTime().get(Calendar.DATE)+"/"+(mnext.getDateTime().get(Calendar.MONTH)+1));
				}
			}
		}
		return dataset;
	}
	
	private class DownloadListener implements EventListener{
		
		private AImage input;
		private String filename;
		
		public DownloadListener(AImage in, String fname){
			this.input = in;
			this.filename = fname;
		}
		
		public void onEvent(Event arg0) throws Exception {
			if(this.input != null){
				Filedownload.save(input,filename);
			}
		}
		

	}

}
