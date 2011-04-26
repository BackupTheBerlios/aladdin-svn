package eu.aladdin_project.controllers.details.measurements;

import java.util.Comparator;

import eu.aladdin_project.xsd.Measurement;

public class MeasurementDateSort implements Comparator<Measurement>{

	public int compare(Measurement arg0, Measurement arg1) {
		Double result = new Double(""+(arg0.getDateTime().getTimeInMillis()-arg1.getDateTime().getTimeInMillis())); 
		return result.intValue();
	}

}
