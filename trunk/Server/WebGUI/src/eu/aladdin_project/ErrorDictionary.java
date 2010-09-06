package eu.aladdin_project;

public class ErrorDictionary {
	public final static int USERTYPE_NOT_ALLOWED = 1;
	public final static int INVALID_CREDENTIALS = 2;
	
	public static String UNKOW_ERROR_LBL = "error.unknow";
	public static String USERTYPE_NOT_ALLOWED_LBL = "error.wrong.type";
	public static String INVALID_CREDENTIALS_LBL = "error.invalid.credentials";
	
	
	public static String getErrorLabel(int errorcode){
		switch(errorcode){
		case USERTYPE_NOT_ALLOWED:
			return USERTYPE_NOT_ALLOWED_LBL;
		case INVALID_CREDENTIALS:
			return INVALID_CREDENTIALS_LBL;
		default:
			return UNKOW_ERROR_LBL;
		}
	}

}
