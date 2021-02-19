import java.util.*;
public class BSR 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array");  
	    int n = in.nextInt();   
	    System.out.println("Enter elements in sorted way");  
	    int [] array = new int[n];
	    for (int i=0; i<n; i++)
	      array[i] = in.nextInt();  
	    System.out.println("Enter key to search");  
	    int key=in.nextInt();
	    int pos = BSR(array,0,n-1,key);
	    if(pos==0)
	    	System.out.println("Element not found");
	    else
	    	System.out.println("Element found");
	}
	public static int BSR(int [] array, int i, int n, int key)
	{
		int mid = (i+n)/2;
		while(i<n)
		{
		if (key == array[mid])
			return mid;
		else 
			if(key<array[mid])
				return BSR(array, i, mid-1, key);
			else
				return BSR(array, mid+1, n, key);
		}
		if(key == array[mid])
			return mid;
		return 0;
	}
}
