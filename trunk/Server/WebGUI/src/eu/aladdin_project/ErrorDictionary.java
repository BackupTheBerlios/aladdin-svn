package eu.aladdin_project;

public class ErrorDictionary {
	public final static int UNKOW_ERROR = 0;
	public final static int USERTYPE_NOT_ALLOWED = 1;
	public final static int INVALID_CREDENTIALS = 2;
	public final static int EXPIRED_SESSION = 3;
	public final static int UNKNOWN_SERVER_RESPONSE = 4;
	
	
	public static String UNKOW_ERROR_LBL = "error.unknow";
	public static String USERTYPE_NOT_ALLOWED_LBL = "error.wrong.type";
	public static String INVALID_CREDENTIALS_LBL = "error.invalid.credentials";
	public static String EXPIRED_SESSION_LBL = "error.expired.session";
	public static String UNKNOWN_SERVER_RESPONSE_LBL = "error.unknow.response";
	
	
	public static String getErrorLabel(int errorcode){
		switch(errorcode){
		case UNKOW_ERROR:
			return UNKOW_ERROR_LBL;
		case USERTYPE_NOT_ALLOWED:
			return USERTYPE_NOT_ALLOWED_LBL;
		case INVALID_CREDENTIALS:
			return INVALID_CREDENTIALS_LBL;
		case EXPIRED_SESSION:
			return EXPIRED_SESSION_LBL;
		case UNKNOWN_SERVER_RESPONSE:
			return UNKNOWN_SERVER_RESPONSE_LBL;
		default:
			return UNKOW_ERROR_LBL;
		}
	}

}
