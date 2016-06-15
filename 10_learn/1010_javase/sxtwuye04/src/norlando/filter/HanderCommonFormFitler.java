package norlando.filter;

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

import norlando.util.BeanUtil;

/**
 * 模拟struts 属性注入
 * @author Administrator
 *
 */
public class HanderCommonFormFitler implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
			String beanName= request.getParameter("beanName");
			if(beanName != null){
				try {
					Class clazz = Class.forName(beanName);
					Object obj = clazz.newInstance();
					Field[] fs = clazz.getDeclaredFields();
					for (int i = 0; i < fs.length; i++) {
						Class ftype = fs[i].getType();
						String tstr = ftype.getName();
						String fieldName = fs[i].getName();
						String value = request.getParameter(fieldName);
						if(value != null){
							String setname = BeanUtil.getSetterName(fieldName);
							Method m = clazz.getMethod(setname, ftype);
							if("int".equals(tstr) || "java.lang.Integer".equals(tstr)){
								m.invoke(obj, Integer.parseInt(value));
							}else if("double".equals(tstr) || "java.lang.Double".equals(tstr)){
								m.invoke(obj, Double.parseDouble(value));
							}else if ("float".equals(tstr) || "java.lang.Float".equals(tstr)){
								m.invoke(obj, Float.parseFloat(value));
							}else {
								m.invoke(obj, value);
							}
						}
						
					}
					request.setAttribute("beanObject", obj);
					chain.doFilter(request, response);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}else{
				chain.doFilter(request, response);
			}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
