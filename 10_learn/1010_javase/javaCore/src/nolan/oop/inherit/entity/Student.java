package nolan.oop.inherit.entity;


public class Student extends People {

		private String name;
		
		/**
		 * 子类父类都有的相同名称的属性
		 */
		private String age = "18";
		
		private String height = "1.7";

		public String getName() {
			return name;
		}

		public void setName(String name) {
			System.out.println("调用子类setName方法");
			this.name = name;
		}
		
		public String getHeight() {
			System.out.println("调用子类getHeight方法");
			return height;
		}

		public void setHeight(String height) {
			System.out.println("调用子类setHeight方法");
			this.height = height;
		}

		public String getAge() {
			System.out.println("调用子类getAge方法");
			return age;
		}

		public void setAge(String age) {
			System.out.println("调用子类setAge方法");
			super.setAge(age);
			this.age = age;
		}

	
		
		
		
}
