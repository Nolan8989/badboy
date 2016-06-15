package norlando.entity;

public class Employee {
	private int id;
	private String name;
	private String salary;
	private String title;
	private String birthday;
	private String path;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Employee(int id, String name, String salary, String title,
			String birthday, String path) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.title = title;
		this.birthday = birthday;
		this.path = path;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
