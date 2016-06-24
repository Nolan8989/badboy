package nolan.util.list;

/**
 * 链表的实现：
 *1. 链表。
 *2. 定义节点类存储：前一个节点、后一个节点、当前数据
 *3. 链表优势：增加、删除速度快。  
 *4. 链表劣势：查询速度慢。
 * @author Administrator
 *
 */
public class MyLinkedList {
	
	MyNode first;
	MyNode last;
	private int size;
	/**
	 * 添加对象。
	 * @param object
	 */
	public void add(Object object){
		MyNode mn = new MyNode();
		if(first == null){
			mn.setObject(object);
			first = mn;
			last = mn;
		}else{
			mn.setPrevious(last); //
			last.setNext(mn);
			mn.setObject(object);
			last = mn;
		}
		size++;
		
	}
	/**
	 * 返回链表长度。
	 * @return
	 */
	public int size(){
		return size;
	}
	/**
	 * 根据索引返回对象。
	 * @param index
	 * @return
	 */
	public Object get(int index){   //2
		rangeCheck(index);
		
		// 0 1 2 3 4
		MyNode temp = node(index);
		if(temp!=null){
			return temp.getObject();
		}
		return null;
	}
	
	/**
	 * 实现了根据索引找到对应的MyNode。
	 * @param index
	 * @return
	 */
	private MyNode node(int index) {
		MyNode temp = null;
		if(first!=null){
			
			
			//这里模仿了jdk中的实现：index小于size/2则从0开始找，否则，则从末尾开始找。
			if(index <= size>>2){
				temp = first;
				for(int i=0;i<index;i++){
					temp = temp.getNext();
				}
			}else{
				temp = last;
				for(int i=size-1;i >index;i--){
					temp = temp.getPrevious();
				}
			}
			
		}
		return temp;
	}
	/**
	 * 根据索引移除制定的MyNode。
	 * @param index
	 */
	public void remove(int index){
		MyNode temp = node(index);
		
		if(temp!=null){
			MyNode up = temp.previous; //找到他的上一个MyNode;
			MyNode down = temp.next;	//找到他的下一MyNode;
			up.next = down;	//断掉上一个MyNode 对它的指向；指到它的下一个MyNode；
			down.previous = up;//断掉下一个MyNode 对它的指向；指到它的上一个MyNode；
			size--;
		}
		
	}
	/**
	 * 在所索引处，添加对象。
	 * @param index
	 * @param object
	 */
	public void add(int index,Object object){
		MyNode temp = node(index);
		
		MyNode newNode = new MyNode();
		newNode.setObject(object);
		
		if(temp!=null){
			MyNode up = temp.previous; //找到第index 个MyNode的上一个MyNode up。
			up.next = newNode; //把up的下一个指向指到新的要添加的MyNode。
			newNode.previous = up; //要添加的MyNode的上一个指向指到up。
			
			newNode.next = temp; 
			temp.previous = newNode;
			
			size++;
		}
	}
	
	
	private void rangeCheck(int index){
		if(index<0||index>=size){
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList mll = new MyLinkedList();
		mll.add("aaa");
		mll.add("bbb");
		mll.add("ccc");
		mll.add("ddd");
		mll.add("ccc");
		mll.add("eee");
		mll.add("fff");
		
		System.out.println(mll.size());
		
		System.out.println(mll.get(0));
		System.out.println(mll.get(1));
		System.out.println(mll.get(2));
		System.out.println(mll.get(3));
		System.out.println(mll.get(4));
		System.out.println(mll.get(5));
		System.out.println(mll.get(6));
			
		
		
	}

}

class MyNode{
	public MyNode getPrevious() {
		return previous;
	}

	public void setPrevious(MyNode previous) {
		this.previous = previous;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

	MyNode previous;
	Object object;
	MyNode next;
	
	public MyNode(){
		
	}
	
	public MyNode(MyNode presious,Object object,MyNode next){
		super();
		this.previous = previous;
		this.object = object;
		this.next = next;
	}
}
