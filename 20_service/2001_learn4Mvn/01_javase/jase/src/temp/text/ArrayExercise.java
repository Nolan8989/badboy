package temp.text;
/**
 * я╟ур13.
 * @author Administrator
 *
 */
public class ArrayExercise
{
	public static void main(String[] args)
	{
		System.out.println();
		System.out.print("The list is:");
    int list[]=new int[10];	  
	  for(int i=0;i<list.length;i++)
	  {
	 	  list[i]=(int)(Math.random()*100);
	 	  //list[i]=13;
	    System.out.print(list[i]+" ");
	  }
	  System.out.println();
	  int flag=listsear(13,list);
	  if (flag!=-1)
	    System.out.println("13 is found in list:"+flag);
	  else
	    System.out.println("13 is not found in list");
	}
	public static int listsear(int key,int[] list)
	{
		for(int j=0;j<list.length;j++)
		  if(key==list[j])
		    return j;
		return -1;
	}
}
	
	 
	 
	 
	
	

