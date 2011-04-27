package eu.aladdin_project.controllers.details.measurements;

import java.util.Comparator;

import eu.aladdin_project.xsd.Measurement;

public class MeasurementDateSort implements Comparator<Measurement>{

	public int compare(Measurement arg0, Measurement arg1) {
		return arg0.getDateTime().compareTo(arg1.getDateTime());
	}

}
