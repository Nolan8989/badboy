package norlando.test;

public class TestBean {
		private String uname;
		
		private static String email;
		
		String favs;
		
		public String addr;

		public String getUname() {
			return uname;
		}

		public void setUname(String uname) {
			this.uname = uname;
		}

		public static String getEmail() {
			return email;
		}

		public static void setEmail(String email) {
			TestBean.email = email;
		}

		public String getFavs() {
			return favs;
		}

		public void setFavs(String favs) {
			this.favs = favs;
		}

		public String getAddr() {
			return addr;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}
		
		
		private void add(int a,int b){
			
			System.out.println("enclosing_type.enclosing_method()"+(a+b));
		}
		
		
		public static void add2(int a,int b){
			
			System.out.println("enclosing_type.enclosing_method()"+(a+b));
		}
		
		public int mulitple(int a,int b){
			System.out.println(a*b);
			return a*b;
			
		}
		
		public static int mulitple2(int a,int b){
			System.out.println(a*b);
			return a*b;
			
		}
}
