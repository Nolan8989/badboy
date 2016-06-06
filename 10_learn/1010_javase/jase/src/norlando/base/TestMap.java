package norlando.base;
import java.util.HashMap;
import java.util.Map;


public class TestMap {

	public static void main(String[] args) {
		//Map<String,Integer> map =  new HashMap();
		//map.put("OPQ", 444);
		//System.out.println((map.get("OPQ")).intValue());
		
		String[] strs = {"oabc", "","eew"};
		for(int i = 0; i<strs.length;i++){
			String str = strs[i];
			if(str.length() != 0){
			System.out.println(str);}
		}
	}

}