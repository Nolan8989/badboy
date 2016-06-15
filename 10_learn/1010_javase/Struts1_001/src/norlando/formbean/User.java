package norlando.formbean;

import org.apache.struts.action.ActionForm;
/**
 * struts1 实现表单属性注入的时候必须要有Po类继承ActionForm 
 * @author Administrator
 *
 */
public class User extends ActionForm {

	private Integer id;
	private String name;
	private String phone;
	
	
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
	public User(Integer id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	
	
}
