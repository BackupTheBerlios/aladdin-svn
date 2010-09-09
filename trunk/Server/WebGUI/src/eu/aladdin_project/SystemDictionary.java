package eu.aladdin_project;

public class SystemDictionary {
	
	public static String getUsertypeLabel(String dic){
		int dictn = Integer.parseInt(dic);
		switch(dictn){
		case USERTYPE_ADMIN_INT:
			return USERTYPE_ADMIN_LBL;
		case USERTYPE_CLINICIAN_INT:
			return USERTYPE_CLINICIAN_LBL;
		default:
			return null;
		}
	}
	
	public static String getTaskStatusLabel(String dic){
		int dictn = Integer.parseInt(dic);
		switch(dictn){
		case TASK_STATUS_CANCELLED_INT:
			return TASK_STATUS_CANCELLED_LBL;
		case TASK_STATUS_COMPLETED_INT:
			return TASK_STATUS_COMPLETED_LBL;
		case TASK_STATUS_PENDING_INT:
			return TASK_STATUS_PENDING_LBL;
		default:
			return null;
		}
	}
	public static String getTaskTypeLabel(String dic){
		int dictn = Integer.parseInt(dic);
		switch(dictn){
		case TASK_TYPE_ACTMONITOR_INT:
			return TASK_TYPE_ACTMONITOR_LBL;
		case TASK_TYPE_BLOODPRESSURE_MEASUREMENT_INT:
			return TASK_TYPE_BLOODPRESSURE_MEASUREMENT_LBL;
		case TASK_TYPE_CARERQS_INT:
			return TASK_TYPE_CARERQS_LBL;
		case TASK_TYPE_COGGAME_INT:
			return TASK_TYPE_COGGAME_LBL;
		case TASK_TYPE_EXERCISE_INT:
			return TASK_TYPE_EXERCISE_LBL;
		case TASK_TYPE_PATIENTQS_INT:
			return TASK_TYPE_PATIENTQS_LBL;
		case TASK_TYPE_WEIGHT_MEASUREMENT_INT:
			return TASK_TYPE_WEIGHT_MEASUREMENT_LBL;
		default:
			return null;
		}
	}
	public static String getGenderLabel(String dic){
		int dictn = Integer.parseInt(dic);
		switch(dictn){
		case GENDER_MALE_INT:
			return GENDER_MALE_LBL;
		case GENDER_FEMALE_INT:
			return GENDER_FEMALE_LBL;
		default:
			return null;
		}
	}
	public static String getMaritalStatuspeLabel(String dic){
		int dictn = Integer.parseInt(dic);
		switch(dictn){
		case MARITAL_DIVORCED_INT:
			return MARITAL_DIVORCED_LBL;
		case MARITAL_MARRIED_INT:
			return MARITAL_MARRIED_LBL;
		case MARITAL_SINGLE_INT:
			return MARITAL_SINGLE_LBL;
		case MARITAL_WIDOW_INT:
			return MARITAL_WIDOW_LBL;
		default:
			return null;
		}
	}
	public static String getLivingWithLabel(String dic){
		int dictn = Integer.parseInt(dic);
		switch(dictn){
		case LIVING_ALONE_INT:
			return LIVING_ALONE_LBL;
		case LIVING_PARTER_SONDAUGHTER_INT:
			return LIVING_PARTER_SONDAUGHTER_LBL;
		case LIVING_PARTER_SONDAUGHTER_SDLAW_GRANDSON_INT:
			return LIVING_PARTER_SONDAUGHTER_SDLAW_GRANDSON_LBL;
		case LIVING_PARTER_SONDAUGHTER_SDLAW_INT:
			return LIVING_PARTER_SONDAUGHTER_SDLAW_LBL;
		case LIVING_PARTNER_INT:
			return LIVING_PARTNER_LBL;
		case LIVING_SONDAUGHTER_INT:
			return LIVING_SONDAUGHTER_LBL;
		default:
			return null;
		}
	}
	public static String getWarningTypeLabel(String dic){
		int dictn = Integer.parseInt(dic);
		switch(dictn){
		case WARNING_AUTO_INT:
			return WARNING_AUTO_LBL;
		case WARNING_MANUAL_INT:
			return WARNING_MANUAL_LBL;
		default:
			return null;
		}
	}
	public static String getWarningEffectLabel(String dic){
		int dictn = Integer.parseInt(dic);
		switch(dictn){
		case EFFECT_WARNING_STROKE_INT:
			return EFFECT_WARNING_STROKE_LBL;
		default:
			return null;
		}
	}
	public static String getWarningIndicatorLabel(String dic){
		int dictn = Integer.parseInt(dic);
		switch(dictn){
		case INDICATOR_WARNING_BLODDPRESSURE_INT:
			return INDICATOR_WARNING_BLODDPRESSURE_LBL;
		case INDICATOR_WARNING_WEIGHT_INT:
			return INDICATOR_WARNING_WEIGHT_LBL;
		default:
			return null;
		}
	}
	public static String getWarningEmergencyLevelLabel(String dic){
		int dictn = Integer.parseInt(dic);
		switch(dictn){
		case EMERGENCYLEVEL_WARNING_ATTENTION_INT:
			return EMERGENCYLEVEL_WARNING_ATTENTION_LBL;
		case EMERGENCYLEVEL_WARNING_IMMEDIATE_INT:
			return EMERGENCYLEVEL_WARNING_IMMEDIATE_LBL;
		default:
			return null;
		}
	}
	
	public static String getMeasurementTypeLabel(String dic){
		int dictn = Integer.parseInt(dic);
		switch(dictn){
		case MEASUREMENT_BLODDPRESSURE_INT:
			return MEASUREMENT_BLODDPRESSURE_LBL;
		case MEASUREMENT_WEIGHT_INT:
			return MEASUREMENT_WEIGHT_LBL;
		default:
			return null;
		}
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
