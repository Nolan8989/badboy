package test;
import java.math.BigInteger;
import java.util.ArrayList;
public class Ex5_8
{
	public static void main(String[] args){	
		ArrayList alist=factorial(11);
		for(int i=0;i<alist.size();i++)
	    System.out.println(i+"!="+alist.get(i));
	}
	
	
	public static  ArrayList factorial(int x){
	    ArrayList alist=new ArrayList();
	    alist.add(BigInteger.valueOf(1));
	    for(int i=alist.size();i<x;i++)//==for(int i=1;i<x,i++)
	    {
	    	BigInteger lastfact=(BigInteger)alist.get(i-1);
	    	BigInteger nextfact=lastfact.multiply(BigInteger.valueOf(i));//multiplyΪInteger��˻��ķ���
	    	alist.add(nextfact);
	    }
	    return alist;
	  }
}


