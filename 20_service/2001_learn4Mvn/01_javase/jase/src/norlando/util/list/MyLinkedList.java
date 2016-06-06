package norlando.util.list;

/**
 * �����ʵ�֣�
 *1. ����
 *2. ����ڵ���洢��ǰһ���ڵ㡢��һ���ڵ㡢��ǰ����
 *3. �������ƣ����ӡ�ɾ���ٶȿ졣  
 *4. �������ƣ���ѯ�ٶ�����
 * @author Administrator
 *
 */
public class MyLinkedList {
	
	MyNode first;
	MyNode last;
	private int size;
	/**
	 * ��Ӷ���
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
	 * ���������ȡ�
	 * @return
	 */
	public int size(){
		return size;
	}
	/**
	 * �����������ض���
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
	 * ʵ���˸��������ҵ���Ӧ��MyNode��
	 * @param index
	 * @return
	 */
	private MyNode node(int index) {
		MyNode temp = null;
		if(first!=null){
			
			
			//����ģ����jdk�е�ʵ�֣�indexС��size/2���0��ʼ�ң��������ĩβ��ʼ�ҡ�
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
	 * ���������Ƴ��ƶ���MyNode��
	 * @param index
	 */
	public void remove(int index){
		MyNode temp = node(index);
		
		if(temp!=null){
			MyNode up = temp.previous; //�ҵ�������һ��MyNode;
			MyNode down = temp.next;	//�ҵ�������һMyNode;
			up.next = down;	//�ϵ���һ��MyNode ������ָ��ָ��������һ��MyNode��
			down.previous = up;//�ϵ���һ��MyNode ������ָ��ָ��������һ��MyNode��
			size--;
		}
		
	}
	/**
	 * ��������������Ӷ���
	 * @param index
	 * @param object
	 */
	public void add(int index,Object object){
		MyNode temp = node(index);
		
		MyNode newNode = new MyNode();
		newNode.setObject(object);
		
		if(temp!=null){
			MyNode up = temp.previous; //�ҵ���index ��MyNode����һ��MyNode up��
			up.next = newNode; //��up����һ��ָ��ָ���µ�Ҫ��ӵ�MyNode��
			newNode.previous = up; //Ҫ��ӵ�MyNode����һ��ָ��ָ��up��
			
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
