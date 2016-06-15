package norlando.entity;

public class Role {
	private String name;
	private String description;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
