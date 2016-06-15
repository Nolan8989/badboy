package norlando.vo;

public class UserVo {
	private int id ;
	private String username ;
	private int sex ; 
	private String email ;
	private String address;
	private int startPage;
	private int step;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public UserVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserVo(int id, String username, int sex, String email,
			String address, int startPage, int step) {
		super();
		this.id = id;
		this.username = username;
		this.sex = sex;
		this.email = email;
		this.address = address;
		this.startPage = startPage;
		this.step = step;
	}
}
