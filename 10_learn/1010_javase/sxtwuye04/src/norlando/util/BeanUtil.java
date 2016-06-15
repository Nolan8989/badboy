package norlando.util;

public class BeanUtil {
	public static String getSetterName(String fieldName){
		
		return "set"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
	}
	
	public static String getBooleanGetterName(String fieldName){
		
		return "is"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
	}
	
	
	public static String getGetterName(String fieldName){
		
		return "get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
	}
}
