package eu.aladdin_project.controllers.details.measurements;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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


import eu.aladdin_project.SystemDictionary;
import eu.aladdin_project.StorageComponent.StorageComponentProxy;
import eu.aladdin_project.xsd.Measurement;
import eu.aladdin_project.xsd.OperationResult;

public class MeasurementPopupController extends Window{
	
	private String patientid;
	private String patientuserid;
	private Date measurementfrom;
	private Date measurementto;
	
	public MeasurementPopupController(){
		
	}
	
	public void setPatientid(String patientid){
		this.patientid = patientid;
		StorageComponentProxy proxy = SystemDictionary.getSCProxy();
		String loggeduser = (String)Sessions.getCurrent().getAttribute("userid");
		try{
			OperationResult user = proxy.getUserIdByPersonId(this.patientid, SystemDictionary.USERTYPE_PATIENT_INT, loggeduser);
			this.patientuserid = user.getCode();
		}catch(Exception e){
			e.printStackTrace();
			Executions.sendRedirect("");
		}
	}
	
	public void setFrom(Date from){
		this.measurementfrom = from;
		((Datebox)getFellow("measurementfrom")).setValue(this.measurementfrom);
	}
	
	public void setTo(Date to){
		this.measurementto = to;
		((Datebox)getFellow("measurementto")).setValue(this.measurementto);
	}
	
	public void generateImage() throws RemoteException{
		StorageComponentProxy sc = SystemDictionary.getSCProxy();
		String loggeduser = (String)Sessions.getCurrent().getAttribute("userid");
		String mtype = (String)((Listbox)getFellow("measurementtype")).getSelectedItem().getValue();
		Calendar calto = new GregorianCalendar();
		calto.setTime(this.measurementto);
		Calendar calfrom = new GregorianCalendar();
		calfrom.setTime(this.measurementfrom);
		int typeofmint = -1;
		if(SystemDictionary.TASK_TYPE_BLOODPRESSURE_MEASUREMENT.equals(mtype)){
			typeofmint = SystemDictionary.MEASUREMENT_BLODDPRESSURE_INT;
		}else if(SystemDictionary.TASK_TYPE_WEIGHT_MEASUREMENT.equals(mtype)){
			typeofmint = SystemDictionary.MEASUREMENT_WEIGHT_INT;
		}else{
			//TODO Exit
		}
		Measurement[] measures = sc.getPatientMeasurement(this.patientid, typeofmint, calfrom, calto, loggeduser);
				
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		if(measures != null && measures.length > 0){
			for(int i = 0; i < measures.length; i++){
				dataset.addValue(measures[i].getValue(), measures[i].getType().getDescription(), measures[i].getDateTime().get(Calendar.DATE)+"/"+measures[i].getDateTime().get(Calendar.MONTH));
			}
		}else{
			//TODO Sample data
			dataset.addValue(70,"Weight Measurement", "1");
			dataset.addValue(72,"Weight Measurement", "5");
			dataset.addValue(74,"Weight Measurement", "10");
			dataset.addValue(74,"Weight Measurement", "14");
			dataset.addValue(76,"Weight Measurement", "20");
			dataset.addValue(78,"Weight Measurement", "24");
			dataset.addValue(78,"Weight Measurement", "30");
		}
		
		JFreeChart chart = ChartFactory.createLineChart("Weight Measurements","Day of month", "Weight", dataset, PlotOrientation.VERTICAL, false, false, false);
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
			BufferedImage bi = chart.createBufferedImage(500, 300, BufferedImage.TRANSLUCENT , null);
			byte[] bytes = EncoderUtil.encode(bi, ImageFormat.PNG, true);
			AImage image = new AImage("Line Chart", bytes);
			((Image)getFellow("imagemeas")).setContent(image);
			Button downbutton = (Button)getFellow("measurementdownloadbutton");
			downbutton.addEventListener("onClick", new DownloadListener(image,"monitor.png"));
		}catch(Exception e){
			e.printStackTrace();
		}
		
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
