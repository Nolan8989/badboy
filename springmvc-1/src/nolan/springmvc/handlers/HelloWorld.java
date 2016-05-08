package nolan.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorld {
	
	
	@RequestMapping("/helloworld") //1、映射请求的URL
	public String hello(){
		
		System.out.println("hello world!");
		/**
		 * 2、返回值会通过视图解析器解析为实际的物理视图，
		 * 对于InternalResourceViewResolver 视图解析器，会做如下的解析
		 * 通过 prefix + returnVal + 后缀 这样的方式得到实际的物理视图, 然会做转发操作
		 * 
		 * /WEB-INF/views/success.jsp
		 */
		return "success"; 
		
		
	}

}
