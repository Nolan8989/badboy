package com.bjsxt.test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bjsxt.po.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;

public class TestGson {
	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		List favs = new ArrayList();
		favs.add("eat");
		favs.add("books");
		favs.add("sleep");
		user.setFavs(favs);
		
		user.setPwd("123123");
		user.setUname("liuergou");
		Map<String, String> addr =  new HashMap<String, String>();
		addr.put("country", "china");
		user.setAddr(addr);

		//1.把一个目标转成json字符串.
	/*	Gson gson = new Gson();
		System.out.println(gson.toJson(user));
	*/
		
		
		//2.把一个目标转成json字符串,但是可以过滤掉java对象中不必要的属性.需要在java 类属性前中加入@Expose
//		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
//		System.out.println("TestGson.main()"+gson.toJson(user));
		

		
		
//		List<User> users = new ArrayList<User>();
//		
//		users.add(user);
//		users.add(user);
//		System.out.println("TestGson.main()"+gson.toJson(users));

		
		
		
/*		//把json字符串转成 java对象.
		String userstr = "{'id':1,'uname':'liuergou','pwd':'123123','favs':['����','books','��С����'],'addr':{'country':'china'}}";
		
		Gson gson = new Gson();
		User u2 = gson.fromJson(userstr, User.class);
//		System.out.println(u2.getUname());
		String userstr2 = "[{'id':1,'uname':'liuergou','pwd':'123123','favs':['����','books','��С����'],'addr':{'country':'china'}},{'id':3,'uname':'cai20','pwd':'123123','favs':['����','books','��С����'],'addr':{'country':'china'}}]";
		Type listType = new TypeToken<List<User>>() {}.getType();
		List list = gson.fromJson(userstr2, listType);
		System.out.println(((User)list.get(0)).getUname());
		String userstr3 = "{u1:{'id':1,'uname':'liuergou','pwd':'123123','favs':['����','books','��С����'],'addr':{'country':'china'}},u2:{'id':3,'uname':'cai20','pwd':'123123','favs':['����','books','��С����'],'addr':{'country':'china'}}}";
*/		
	}
}
