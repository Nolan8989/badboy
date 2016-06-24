package nolan.usuallyclass.string;

import java.util.Arrays;

final public class MyString {
	//String str = new String();
	private final char value[];
	
	
	public MyString() {
        this.value = new char[0];
        
    }
	
	public int length(){
		return value.length;
	}
	
	
	public MyString(String str){
		int count = str.length();
		this.value = new char[count];
		for(int i=0;i<count;i++){
			value[i] = str.charAt(i);
		}
	}
	
	public MyString(char[] value){
		this.value = Arrays.copyOf(value, value.length);
	}
	
	public char charAt(int index){
		if(index<0 && index>this.length()){
			throw new StringIndexOutOfBoundsException(index);
		}
		return value[index];	
			
	}
	
	
	public boolean equals(Object object){
		if (this == object) {
            return true;
        }
		if(object instanceof MyString){
			MyString anObject = (MyString) object;
			char a[] = this.value;
			char b[] = anObject.value;
			int c = value.length;
			int d = b.length;
			if(c!=d){
				return false;
			}else{
				int i = 0;
				while(i<c){
					if(a[i] != b[i]){
						return false;
					}
					i++;
				}
				return true;
			}
			
			
		}
		return false;
	}
	
	
}
