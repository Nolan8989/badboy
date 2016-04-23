package norlando.base;

public class TeatByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 34;
		byte b = 36;
		System.out.println(Byte.compare(b, a));
		try{
			
			System.out.println((int)Byte.decode("a"));
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException");
			}
		}

}
