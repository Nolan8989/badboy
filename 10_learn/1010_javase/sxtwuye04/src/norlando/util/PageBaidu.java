package norlando.util;

public class PageBaidu {

	/**
	 * 数据库总行数
	 */
	private  int rowCount;
	
	
	/**
	 * 数据库查询起始行
	 */
	private int startRow;
	
	/**
	 *一页显示多少行  默认为10
	 */
	private int pageSize = 10;
	
	/**
	 * 当前点击导航
	 */
	private  int num;
	
	/**
	 * 中导航数 总页数
	 */
	private int navCount;
	
	/**
	 * 首页
	 */
	private int first=1;
	
	/**
	 *尾页 
	 */
	private int last;
	
	/**
	 *页面显示导航的起始 
	 */
	private int begin;
	
	/**
	 *页面要显示导航的结束 
	 */
	private int end;
	
	/**
	 * 上一页
	 */
	private int prev;
	
	/**
	 * 下一页
	 */
	private int next;


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


	public PageBaidu() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PageBaidu(int rowCount, int pageSize, int num) {
		super();
		this.rowCount = rowCount;
		this.pageSize = pageSize;
		this.navCount = (int) Math.ceil((this.rowCount * 1.0)/this.pageSize);
		this.num = Math.max(num, this.first);
		this.num = Math.min(this.navCount,this.num);
		this.startRow = (this.num - 1) * this.pageSize;
		this.last = this.navCount;
		this.next = Math.min((this.num +1), this.navCount);
		this.prev = Math.max(this.first, (this.num -1));
		this.end = this.num > (this.last - 9) ? this.last : (this.num + 9);
		this.begin = this.num <= 10? (this.first) :(this.num -10);
		
	}
	
//	756;
/*	
	public static void main( String agrs[]){
		 PageBaidu pb = new PageBaidu( 789,10,1);
		 System.out.println(pb.getBegin());
		System.out.println(pb.getEnd());
		System.out.println(pb.getStartRow());
	}
*/	
	
}















