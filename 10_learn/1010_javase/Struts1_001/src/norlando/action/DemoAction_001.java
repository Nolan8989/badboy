package norlando.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import norlando.formbean.User;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class DemoAction_001 extends Action{
	
	
	/* mapping 应该是对应的是配置文件struts-config.xml中的配置
	 * from 
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		System.out.println("hi  struts1.......");
		
		//引入po 类 需要在配置文件当中 设置name="user"
		User user = (User) form;
		System.out.println(user.getName());
		
		//可以像servlet设置request属性.
		request.setAttribute("user", user);
		
		
//		String name =mapping.getName();
//		System.out.println(name); //user
		
		
		//跳转
		return mapping.findForward("success");
	}
}
