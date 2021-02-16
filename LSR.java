import java.util.Scanner;
public class LSR 
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
		int key = in.nextInt();
		int pos=LSRecursion(array, n-1, key, 0);
		if(pos!=-1)
			System.out.println("Element found");
		else
			System.out.println("Element not found");
	}
	public static int LSRecursion(int array[], int n, int key, int i)
	{
		if(n<i)
			return -1;
		if(array[i] == key)
				return i;
		return LSRecursion(array, n, key, i+1);		
	}
}