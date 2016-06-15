package com.bjsxt.tag;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloTag  extends TagSupport{

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		try {
			String token = UUID.randomUUID().toString();
			pageContext.getSession().setAttribute("token", token);
			
			
			
			pageContext.getOut().print("<input type='hidden' name='token' value='"+token+"'   />"  );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EVAL_BODY_INCLUDE;
	}

}
