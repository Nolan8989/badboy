package norlando.oop.keywords;


import java.util.*;
import java.sql.Date;




import norlando.oop.base.Point;
import static java.lang.Math.PI;//静态引入；

/**
 * 测试import和inport static 的使用；
 * @author Administrator
 *
 */
public class TestImport {
	public static void main(String[] args) {
//		com.bjsxt.oop.test.basic.Point p = new com.bjsxt.oop.test.basic.Point();
		Point p = new Point();
		
//		java.util.Date d  = new java.util.Date();   //导入外部类的快捷键：ctrl+shift+o(是o不是零)
		
		//测试导入类的静态属性
		System.out.println(Math.PI); 
		System.out.println(PI); 
		
		
		
	}
}
