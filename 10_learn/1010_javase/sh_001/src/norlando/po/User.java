package norlando.po;

public class User {
	
	private Integer id;
	private String name;
	private String password;
	private Integer role;
	private String phone;
	public User(Integer id, String name, String password, Integer role,
			String phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.role = role;
		this.phone = phone;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
