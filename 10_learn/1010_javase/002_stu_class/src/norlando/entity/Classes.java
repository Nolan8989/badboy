package norlando.entity;

public class Classes {
	private int id;
	private String classname;
	private String classdesc;
	public Classes(int id, String classname, String classdesc) {
		super();
		this.id = id;
		this.classname = classname;
		this.classdesc = classdesc;
	}
	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getClassdesc() {
		return classdesc;
	}
	public void setClassdesc(String classdesc) {
		this.classdesc = classdesc;
	}
	
}
