package nolan.thread.syn;

public class TestSyn implements Runnable {


		private int tickets =20; 
		private boolean flag =true;
		@Override
		public void run() {
			while(flag){			
				test5();
				
			}
		}
		//�̰߳�ȫ ͬ����
		//cd 
		public synchronized void test5(){		
			 //b
				if(tickets>=0){ 				
						try {
							//ģ����ʱ
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
							System.out.println(Thread.currentThread().getName()+"-->��Ʊ"+tickets--);
				}else{
					flag =false;
				}
			}//a-->
		
		//�̰߳�ȫ ͬ����
		public void test4(){
			// c d 
			synchronized(this){
				//b
				if(tickets>=0){ //0
					
						try {
							//ģ����ʱ
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
							System.out.println(Thread.currentThread().getName()+"-->��Ʊ"+tickets--);
				}else{
					flag =false;
				}
			}//a -->
		}
		
		//��Χ��С,���̲߳���ȫ  
		// a b c d
		public void test3(){
			if(tickets>=0){ //1 
				//b c d				
				synchronized(this){
					//a 
					try {
						//ģ����ʱ
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"-->��Ʊ"+tickets--);
				}
			}else{
				flag =false;
			}
		}
		//ͬ������  ���̲߳���ȫ  ,û�е���ȫ��ͬ������
		public void test2(){
			synchronized((Integer)tickets){
				if(tickets>=0){
					try {
						//ģ����ʱ
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"-->��Ʊ"+tickets--);
				}else{
					flag =false;
				}
			}
		}
		
		//�̲߳���ȫ �����ܽ��ͬ������
		public void test1(){
			if(tickets>=0){
				try {
					//ģ����ʱ
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"-->��Ʊ"+tickets--);
			}else{
				flag =false;
			}
		}

		
		public static void main(String[] args) {
			//��ʵ��ɫ Ŀ��
			Runnable target =new TestSyn();
			//�����ɫ Thread +��ʵ��ɫ������
			Thread proxy1 =new Thread(target,"��ţA");
			Thread proxy2 =new Thread(target,"·�˼�"); 
			//������Ϊ
			proxy1.start(); //�����߳�
			proxy2.start();
			new Thread(target,"��ţc").start();
			new Thread(target,"��ţd").start();
		}
	}