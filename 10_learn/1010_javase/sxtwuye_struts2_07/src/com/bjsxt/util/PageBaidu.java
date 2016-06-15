package com.bjsxt.util;

/**
 * @author hadoop
 *
 */
public class PageBaidu {
	/**
	 * ���ݿ�������
	 */
	private  int rowCount;
	
	
	/**
	 * ���ݿ��ѯ��ʼ��
	 */
	private int startRow;
	
	/**
	 *һҳ��ʾ������ 
	 */
	private int pageSize = 10;
	
	
	/**
	 * ��ǰ�������
	 */
	private  int num;

	
	/**
	 * �е�����
	 */
	private int navCount;
	
	
	/**
	 * ��ҳ
	 */
	private int first=1;
	
	/**
	 *βҳ 
	 */
	private int last;
	
	
	
	/**
	 *ҳ����ʾ��������ʼ 
	 */
	private int begin;
	
	/**
	 *ҳ��Ҫ��ʾ�����Ľ��� 
	 */
	private int end;
	
	/**
	 * ��һҳ
	 */
	private int prev;
	
	
	/**
	 * ��һҳ
	 */
	private int next;
	
//	756;

	public PageBaidu(int rowCount, int pageSize, int num) {
		super();
		this.rowCount = rowCount;
		this.pageSize = pageSize;
		
		this.navCount=(int) Math.ceil(this.rowCount*1.0/this.pageSize);
		
		this.num=Math.max(num, this.first);
		this.num=Math.min(this.navCount, this.num);
		
		this.startRow=(this.num-1)*this.pageSize;
		
		this.last= this.navCount;
		this.prev= Math.max(this.num-1,this.first);
		this.next=Math.min(this.last, this.num+1);
		
		this.begin=(this.num-this.first)<=10?this.first:(this.num-10);
		this.end = (this.last-this.num )<9?(this.last):(this.num+9);
		
//		this.num = num;
	}
	
	
	public static void main(String[] args) {
		PageBaidu pageBaidu = new PageBaidu(756, 10, 8);
		
		System.out.println(pageBaidu.getBegin());
		System.out.println(pageBaidu.getEnd());
		
		System.out.println(pageBaidu.getNum());
		System.out.println(pageBaidu.getNext());
		System.out.println(pageBaidu.getPrev());
	}


	public int getRowCount() {
		return rowCount;
	}


	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}


	public int getStartRow() {
		return startRow;
	}


	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getNavCount() {
		return navCount;
	}


	public void setNavCount(int navCount) {
		this.navCount = navCount;
	}


	public int getFirst() {
		return first;
	}


	public void setFirst(int first) {
		this.first = first;
	}


	public int getLast() {
		return last;
	}


	public void setLast(int last) {
		this.last = last;
	}


	public int getBegin() {
		return begin;
	}


	public void setBegin(int begin) {
		this.begin = begin;
	}


	public int getEnd() {
		return end;
	}


	public void setEnd(int end) {
		this.end = end;
	}


	public int getPrev() {
		return prev;
	}


	public void setPrev(int prev) {
		this.prev = prev;
	}


	public int getNext() {
		return next;
	}


	public void setNext(int next) {
		this.next = next;
	}
	
	
	
	
}
