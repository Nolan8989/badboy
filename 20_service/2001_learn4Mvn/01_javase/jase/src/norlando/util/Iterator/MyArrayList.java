package norlando.util.Iterator;

import java.util.Iterator;

/**
 * 遍历的实现  迭代器
 * @author Administrator
 *
 */
public class MyArrayList {
	private String[] elements={"a","b","c","d","e","s"};
	private int size =6; //实际大小
	
	//内部类
	public class MyIt implements java.util.Iterator<String>{		
		//指针
		private int coursor =-1;
		/**
		 * 判断是否存在下一个元素
		 * @return
		 */
		public boolean hasNext(){
			if(coursor<size-1){ 
				return true;
			}
			return false;
		}
		/**
		 * 获取元素 ,游标后移
		 */
		public String next(){
			return elements[++coursor];
		}
		@Override
		public void remove() {
			
		}
	}
	
	public Iterator<String> iterator(){
		return new MyIt();
	}
	
}
