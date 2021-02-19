import java.util.Scanner;
public class LS 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);  
	    System.out.println("Enter size of array");  
	    int n = in.nextInt();   
	    System.out.println("Enter elements");  
	    int [] array = new int[n];
	    for (int i=0; i<n; i++)
	      array[i] = in.nextInt();  
	    System.out.println("Enter key to search");  
	    int key=in.nextInt();  
	    int pos=LinearSearch(array,n,key);
	    if(pos==0)
	    	System.out.println("Element not found");
	    else
	    	System.out.println("Element found");
	}
	public static int LinearSearch(int array[], int n, int key)
	{
		for(int i=0;i<n;i++)
		  {
			  if(array[i]==key)
				  return i; 
		  }
		return 0;
	}
}
