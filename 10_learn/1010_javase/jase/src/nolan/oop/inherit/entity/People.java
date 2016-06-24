package nolan.oop.inherit.entity;

public class People {

	private String nose;
	
	private String mouth;
	
	private String age = "99";
	
	private String height = "1.6";

	
	
	
	public String getHeight() {
		System.err.println("调用父类getHeight方法");
		return height;
	}

	public void setHeight(String height) {
		System.err.println("调用父类setHeight方法");
		this.height = height;
	}

	public String getNose() {
		return nose;
	}

	public void setNose(String nose) {
		this.nose = nose;
	}

	public String getMouth() {
		return mouth;
	}

	public void setMouth(String mouth) {
		this.mouth = mouth;
	}

	public String getAge() {
		System.err.println("父类的age");
		return age;
	}

	public void setAge(String age) {
		System.err.println("调用父类setAge方法");
		this.age = age;
	}
	
	
}
