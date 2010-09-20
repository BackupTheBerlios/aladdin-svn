package eu.aladdin_project;

import org.zkoss.util.resource.Labels;

public class SystemDictionary {
	
	public static String getUsertypeLabel(String dic){
		int dictn = Integer.parseInt(dic);
		String ret="error.no";
		switch(dictn){
		case USERTYPE_ADMIN_INT:
			ret= USERTYPE_ADMIN_LBL;
			break;
		case USERTYPE_CLINICIAN_INT:
			ret= USERTYPE_CLINICIAN_LBL;
			break;
		}
		return Labels.getLabel(ret);
	}
	
	public static String getTaskStatusLabel(String dic){
		int dictn = Integer.parseInt(dic);
		String ret="error.no";
		switch(dictn){
		case TASK_STATUS_CANCELLED_INT:
			ret= TASK_STATUS_CANCELLED_LBL;
			break;
		case TASK_STATUS_COMPLETED_INT:
			ret= TASK_STATUS_COMPLETED_LBL;
			break;
		case TASK_STATUS_PENDING_INT:
			ret= TASK_STATUS_PENDING_LBL;
			break;
		}
		return Labels.getLabel(ret);
	}
	public static String getTaskTypeLabel(String dic){
		int dictn = Integer.parseInt(dic);
		String ret="error.no";
		switch(dictn){
		case TASK_TYPE_ACTMONITOR_INT:
			ret= TASK_TYPE_ACTMONITOR_LBL;
			break;
		case TASK_TYPE_BLOODPRESSURE_MEASUREMENT_INT:
			ret= TASK_TYPE_BLOODPRESSURE_MEASUREMENT_LBL;
			break;
		case TASK_TYPE_CARERQS_INT:
			ret= TASK_TYPE_CARERQS_LBL;
			break;
		case TASK_TYPE_COGGAME_INT:
			ret= TASK_TYPE_COGGAME_LBL;
			break;
		case TASK_TYPE_EXERCISE_INT:
			ret= TASK_TYPE_EXERCISE_LBL;
			break;
		case TASK_TYPE_PATIENTQS_INT:
			ret= TASK_TYPE_PATIENTQS_LBL;
			break;
		case TASK_TYPE_WEIGHT_MEASUREMENT_INT:
			ret= TASK_TYPE_WEIGHT_MEASUREMENT_LBL;
			break;
		}
		return Labels.getLabel(ret);
	}
	public static String getGenderLabel(String dic){
		System.out.println("GENDER: "+dic);
		int dictn = Integer.parseInt(dic);
		String ret="error.no";
		switch(dictn){
		case GENDER_MALE_INT:
			ret= GENDER_MALE_LBL;
			break;
		case GENDER_FEMALE_INT:
			ret= GENDER_FEMALE_LBL;
			break;
		}
		return Labels.getLabel(ret);
	}
	public static String getMaritalStatuspeLabel(String dic){
		int dictn = Integer.parseInt(dic);
		String ret="error.no";
		switch(dictn){
		case MARITAL_DIVORCED_INT:
			ret= MARITAL_DIVORCED_LBL;
			break;
		case MARITAL_MARRIED_INT:
			ret= MARITAL_MARRIED_LBL;
			break;
		case MARITAL_SINGLE_INT:
			ret= MARITAL_SINGLE_LBL;
			break;
		case MARITAL_WIDOW_INT:
			ret= MARITAL_WIDOW_LBL;
			break;
		}
		return Labels.getLabel(ret);
	}
	public static String getLivingWithLabel(String dic){
		int dictn = Integer.parseInt(dic);
		String ret="error.no";
		switch(dictn){
		case LIVING_ALONE_INT:
			ret= LIVING_ALONE_LBL;
			break;
		case LIVING_PARTER_SONDAUGHTER_INT:
			ret= LIVING_PARTER_SONDAUGHTER_LBL;
			break;
		case LIVING_PARTER_SONDAUGHTER_SDLAW_GRANDSON_INT:
			ret= LIVING_PARTER_SONDAUGHTER_SDLAW_GRANDSON_LBL;
			break;
		case LIVING_PARTER_SONDAUGHTER_SDLAW_INT:
			ret= LIVING_PARTER_SONDAUGHTER_SDLAW_LBL;
			break;
		case LIVING_PARTNER_INT:
			ret= LIVING_PARTNER_LBL;
			break;
		case LIVING_SONDAUGHTER_INT:
			ret= LIVING_SONDAUGHTER_LBL;
			break;
		}
		return Labels.getLabel(ret);
	}
	public static String getWarningTypeLabel(String dic){
		int dictn = Integer.parseInt(dic);
		String ret="error.no";
		switch(dictn){
		case WARNING_AUTO_INT:
			ret= WARNING_AUTO_LBL;
			break;
		case WARNING_MANUAL_INT:
			ret= WARNING_MANUAL_LBL;
			break;
		}
		return Labels.getLabel(ret);
	}
	public static String getWarningEffectLabel(String dic){
		int dictn = Integer.parseInt(dic);
		String ret="error.no";
		switch(dictn){
		case EFFECT_WARNING_STROKE_INT:
			ret= EFFECT_WARNING_STROKE_LBL;
			break;
		}
		return Labels.getLabel(ret);
	}
	public static String getWarningIndicatorLabel(String dic){
		int dictn = Integer.parseInt(dic);
		String ret="error.no";
		switch(dictn){
		case INDICATOR_WARNING_BLODDPRESSURE_INT:
			ret= INDICATOR_WARNING_BLODDPRESSURE_LBL;
			break;
		case INDICATOR_WARNING_WEIGHT_INT:
			ret= INDICATOR_WARNING_WEIGHT_LBL;
			break;
		}
		return Labels.getLabel(ret);
	}
	public static String getWarningEmergencyLevelLabel(String dic){
		int dictn = Integer.parseInt(dic);
		String ret="error.no";
		switch(dictn){
		case EMERGENCYLEVEL_WARNING_ATTENTION_INT:
			ret= EMERGENCYLEVEL_WARNING_ATTENTION_LBL;
			break;
		case EMERGENCYLEVEL_WARNING_IMMEDIATE_INT:
			ret= EMERGENCYLEVEL_WARNING_IMMEDIATE_LBL;
			break;
		}
		return Labels.getLabel(ret);
	}
	
	public static String getMeasurementTypeLabel(String dic){
		int dictn = Integer.parseInt(dic);
		String ret="error.no";
		switch(dictn){
		case MEASUREMENT_BLODDPRESSURE_INT:
			ret= MEASUREMENT_BLODDPRESSURE_LBL;
			break;
		case MEASUREMENT_WEIGHT_INT:
			ret= MEASUREMENT_WEIGHT_LBL;
			break;
		}
		return Labels.getLabel(ret);
	}
	
	public final static String USERTYPE_ADMIN = "1";
	public final static int USERTYPE_ADMIN_INT = 1;
	public final static String USERTYPE_ADMIN_LBL = "dic.usertype.admin";
	public final static String USERTYPE_CLINICIAN = "2";
	public final static int USERTYPE_CLINICIAN_INT = 2;
	public final static String USERTYPE_CLINICIAN_LBL = "dic.usertype.clinician";
	
	public final static String TASK_STATUS_PENDING = "1";
	public final static int TASK_STATUS_PENDING_INT = 1;
	public final static String TASK_STATUS_PENDING_LBL = "dic.task.status.pending";
	public final static String TASK_STATUS_CANCELLED = "2";
	public final static int TASK_STATUS_CANCELLED_INT = 2;
	public final static String TASK_STATUS_CANCELLED_LBL = "dic.task.status.cancelled";
	public final static String TASK_STATUS_COMPLETED = "3";
	public final static int TASK_STATUS_COMPLETED_INT = 3;
	public final static String TASK_STATUS_COMPLETED_LBL = "dic.task.status.completed";
	
	public final static String TASK_TYPE_PATIENTQS = "1";
	public final static int TASK_TYPE_PATIENTQS_INT = 1;
	public final static String TASK_TYPE_PATIENTQS_LBL = "dic.task.type.patientqs";
	public final static String TASK_TYPE_CARERQS = "2";
	public final static int TASK_TYPE_CARERQS_INT = 2;
	public final static String TASK_TYPE_CARERQS_LBL = "dic.task.type.carers";
	public final static String TASK_TYPE_BLOODPRESSURE_MEASUREMENT = "3";
	public final static int TASK_TYPE_BLOODPRESSURE_MEASUREMENT_INT = 3;
	public final static String TASK_TYPE_BLOODPRESSURE_MEASUREMENT_LBL = "dic.task.type.bloodpressure.mes";
	public final static String TASK_TYPE_WEIGHT_MEASUREMENT = "4";
	public final static int TASK_TYPE_WEIGHT_MEASUREMENT_INT = 4;
	public final static String TASK_TYPE_WEIGHT_MEASUREMENT_LBL = "dic.task.type.weight.mes";
	public final static String TASK_TYPE_COGGAME = "5";
	public final static int TASK_TYPE_COGGAME_INT = 5;
	public final static String TASK_TYPE_COGGAME_LBL = "dic.task.type.coggame";
	public final static String TASK_TYPE_ACTMONITOR = "6";
	public final static int TASK_TYPE_ACTMONITOR_INT = 6;
	public final static String TASK_TYPE_ACTMONITOR_LBL = "dic.task.type.activity.mon";
	public final static String TASK_TYPE_EXERCISE = "7";
	public final static int TASK_TYPE_EXERCISE_INT = 7;
	public final static String TASK_TYPE_EXERCISE_LBL = "dic.task.type.exercise";
	
	public final static String GENDER_MALE = "1";
	public final static int GENDER_MALE_INT = 1;
	public final static String GENDER_MALE_LBL = "dic.gender.male";
	public final static String GENDER_FEMALE = "2";
	public final static int GENDER_FEMALE_INT = 2;
	public final static String GENDER_FEMALE_LBL = "dic.gender.female";
	
	public final static String MARITAL_WIDOW = "1";
	public final static int MARITAL_WIDOW_INT = 1;
	public final static String MARITAL_WIDOW_LBL = "dic.marital.widow";
	public final static String MARITAL_MARRIED = "2";
	public final static int MARITAL_MARRIED_INT = 2;
	public final static String MARITAL_MARRIED_LBL = "dic.marital.married";
	public final static String MARITAL_SINGLE = "3";
	public final static int MARITAL_SINGLE_INT = 3;
	public final static String MARITAL_SINGLE_LBL = "dic.marital.single";
	public final static String MARITAL_DIVORCED = "4";
	public final static int MARITAL_DIVORCED_INT = 4;
	public final static String MARITAL_DIVORCED_LBL = "dic.marital.divorced";
	
	public final static String LIVING_ALONE = "0";
	public final static int LIVING_ALONE_INT = 0;
	public final static String LIVING_ALONE_LBL = "dic.living.alone";
	public final static String LIVING_SONDAUGHTER = "1";
	public final static int LIVING_SONDAUGHTER_INT = 1;
	public final static String LIVING_SONDAUGHTER_LBL = "dic.living.sd";
	public final static String LIVING_PARTNER = "2";
	public final static int LIVING_PARTNER_INT = 2;
	public final static String LIVING_PARTNER_LBL = "dic.living.partner";
	public final static String LIVING_PARTER_SONDAUGHTER = "3";
	public final static int LIVING_PARTER_SONDAUGHTER_INT = 3;
	public final static String LIVING_PARTER_SONDAUGHTER_LBL = "dic.living.partner.sd";
	public final static String LIVING_PARTER_SONDAUGHTER_SDLAW = "4";
	public final static int LIVING_PARTER_SONDAUGHTER_SDLAW_INT = 4;
	public final static String LIVING_PARTER_SONDAUGHTER_SDLAW_LBL = "dic.living.partner.sdlaw";
	public final static String LIVING_PARTER_SONDAUGHTER_SDLAW_GRANDSON = "5";
	public final static int LIVING_PARTER_SONDAUGHTER_SDLAW_GRANDSON_INT = 5;
	public final static String LIVING_PARTER_SONDAUGHTER_SDLAW_GRANDSON_LBL = "dic.living.partner.sdlaw.gs";
	
	public final static String WARNING_MANUAL = "1";
	public final static int WARNING_MANUAL_INT = 1;
	public final static String WARNING_MANUAL_LBL = "dic.warning.manual";
	public final static String WARNING_AUTO = "2";
	public final static int WARNING_AUTO_INT = 2;
	public final static String WARNING_AUTO_LBL = "dic.warning.auto";
	
	public final static String EFFECT_WARNING_STROKE = "1";
	public final static int EFFECT_WARNING_STROKE_INT = 1;
	public final static String EFFECT_WARNING_STROKE_LBL = "dic.warning.effect.stroke";
	
	public final static String INDICATOR_WARNING_BLODDPRESSURE = "1";
	public final static int INDICATOR_WARNING_BLODDPRESSURE_INT = 1;
	public final static String INDICATOR_WARNING_BLODDPRESSURE_LBL = "dic.warning.indicator.bloodpressure";
	public final static String INDICATOR_WARNING_WEIGHT = "2";
	public final static int INDICATOR_WARNING_WEIGHT_INT = 2;
	public final static String INDICATOR_WARNING_WEIGHT_LBL = "dic.warning.indicator.weight";
	
	public final static String RISKLEVEL_WARNING_HIGH = "1";
	public final static int RISKLEVEL_WARNING_HIGH_INT = 1;
	public final static String RISKLEVEL_WARNING_HIGH_LBL = "dic.warning.risklevel.high";
	public final static String RISKLEVEL_WARNING_LOW = "2";
	public final static int RISKLEVEL_WARNING_LOW_INT = 2;
	public final static String RISKLEVEL_WARNING_LOW_LBL = "dic.warning.risklevel.low";
	
	public final static String EMERGENCYLEVEL_WARNING_IMMEDIATE = "1";
	public final static int EMERGENCYLEVEL_WARNING_IMMEDIATE_INT = 1;
	public final static String EMERGENCYLEVEL_WARNING_IMMEDIATE_LBL = "dic.warning.emergencylevel.immediate";
	public final static String EMERGENCYLEVEL_WARNING_ATTENTION = "2";
	public final static int EMERGENCYLEVEL_WARNING_ATTENTION_INT = 2;
	public final static String EMERGENCYLEVEL_WARNING_ATTENTION_LBL = "dic.warning.emergencylevel.attention";
	
	public final static String MEASUREMENT_BLODDPRESSURE = "1";
	public final static int MEASUREMENT_BLODDPRESSURE_INT = 1;
	public final static String MEASUREMENT_BLODDPRESSURE_LBL = "dic.task.type.bloodpressure.mes";
	public final static String MEASUREMENT_WEIGHT = "2";
	public final static int MEASUREMENT_WEIGHT_INT = 2;
	public final static String MEASUREMENT_WEIGHT_LBL = "dic.task.type.weight.mes";
}
