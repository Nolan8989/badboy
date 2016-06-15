package norlando.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class GsonUtil {
	private   Gson gson =  new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
	private static GsonUtil gsonUtil  = new GsonUtil();
	
	private GsonUtil() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Gson getGson() {
		return gson;
	}


 


	public static GsonUtil getGsonUtil(){
		
		return gsonUtil;
	}
}
