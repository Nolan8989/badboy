package nolan.oop.inherit.entity;


public class Student extends People {

		private String name;
		
		/**
		 * ���ุ�඼�е���ͬ���Ƶ�����
		 */
		private String age = "18";
		
		private String height = "1.7";

		public String getName() {
			return name;
		}

		public void setName(String name) {
			System.out.println("��������setName����");
			this.name = name;
		}
		
		public String getHeight() {
			System.out.println("��������getHeight����");
			return height;
		}

		public void setHeight(String height) {
			System.out.println("��������setHeight����");
			this.height = height;
		}

		public String getAge() {
			System.out.println("��������getAge����");
			return age;
		}

		public void setAge(String age) {
			System.out.println("��������setAge����");
			super.setAge(age);
			this.age = age;
		}

	
		
		
		
}
