import java.util.*;
public class Stack 
{
	int arr[];
	int top=-1;
	int capacity;
	int size = 5;
	Stack(int size)
	{
		arr= new int[size];
	}
	public static void main(String [] args)
	{	
		Stack stack = new Stack(5);
		stack.push(5);
		stack.push(10);
		stack.push(8);
		stack.push(7);
		System.out.println("Stack after inserting 5, 10, 8 and 7 : ");
		stack.printStack();
		stack.pop();
		System.out.println("Stack after removing top element ");
		stack.printStack();
		stack.push(3);
		stack.push(6);
		System.out.println("Stack after inserting 3 and 6 : ");
		stack.printStack();
		stack.pop();
		System.out.println("Stack after removing top element ");
		stack.printStack();
	}
	public void printStack() 
	{
	    for (int i = 0; i <= top; i++) 
	    {
	      System.out.println(arr[i]);
	    }
	  }
	void push(int item)
	{
		if(top>=size-1)
			System.out.println("Item cannot be pushed");
		else
			top=top+1;
		    arr[top]=item;
	}
    void pop()
	{
		if (top==-1)
			System.out.println("Stack is empty");
		else
		    top=top-1;
	}
}