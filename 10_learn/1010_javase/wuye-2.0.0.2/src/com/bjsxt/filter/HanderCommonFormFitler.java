package com.bjsxt.filter;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.bjsxt.util.BeanUtil;
import com.bjsxt.util.DateUtil;
/**
 *	模拟struts 2 的对象注入
 *	从request 中获取对象属性
 */
public class HanderCommonFormFitler implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		String classPath = request.getParameter("beanName");//约定好的
		if(classPath != null){
			try {
				Class clazz  = Class.forName(classPath);
				Object obj = clazz.newInstance();
				Field[] fsArr = clazz.getFields();
				for(int i = 0 ; i<fsArr.length;i++){
					Class fType = fsArr[i].getType();
					String typeName = fType.getName();
					String fieldName = fsArr[i].getName();
					String value = request.getParameter(fieldName);
					
					if(null != value){
						String setname = BeanUtil.getSetterName(fieldName);
						Method m = clazz.getMethod(setname, fType);//方法名称+方法入参类型
						if ("int".equals(typeName)||"java.lang.Integer".equals(typeName)) {
							m.invoke(obj, Integer.parseInt(value));
						}else if("double".equals(typeName)||"java.lang.Double".equals(typeName)){
							m.invoke(obj, Double.parseDouble(value));
						}else if("float".equals(typeName)||"java.lang.Float".equals(typeName)){
							m.invoke(obj,Float.parseFloat(value));
						}else if("java.util.Date".equals(typeName)) {
							m.invoke(obj, DateUtil.strToDate(value));
						}else{
							m.invoke(obj, value);
						}
					}
				}
				
				request.setAttribute("beanObject", obj);
				chain.doFilter(request, response);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		/*String beanName = request.getParameter("beanName");//反射类路径
		if (beanName!=null) {//处理表单自动注入
			try {
				Class clazz = Class.forName(beanName);
				Object obj = clazz.newInstance();//所有数据是不是？？？
				Field[] fs = clazz.getDeclaredFields();
				for (int i = 0; i < fs.length; i++) {
					Class ftype = fs[i].getType();
					String fstr = ftype.getName();//属性类型名称
					String fieldName = fs[i].getName();//属性名称
					String value = request.getParameter(fieldName);
					
					if (value!=null) {
						String setname = BeanUtil.getSetterName(fieldName);
						Method m = clazz.getMethod(setname, ftype);
						if ("int".equals(fstr)||"java.lang.Integer".equals(fstr)) {
							m.invoke(obj, Integer.parseInt(value));
							
						}else if("double".equals(fstr)||"java.lang.Double".equals(fstr)){
							m.invoke(obj, Double.parseDouble(value));
							
						}else if("float".equals(fstr)||"java.lang.Float".equals(fstr)){
							m.invoke(obj,Float.parseFloat(value));
							
						}else if("java.util.Date".equals(fstr)) {
							m.invoke(obj, DateUtil.strToDate(value));
						}else{
							m.invoke(obj, value);
						}
					}
				}
				request.setAttribute("beanObject", obj);
				chain.doFilter(request, response);
				
			} catch ( Exception e) {
				e.printStackTrace();
			}
		}else{
			chain.doFilter(request, response);
		}*/
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
