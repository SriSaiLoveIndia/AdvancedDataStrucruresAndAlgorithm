package linkedlist;
import java.util.LinkedList;
public class linkedlist 
{
	public static void main(String [] args)
	{
			LinkedList linkedlist = new LinkedList();
			linkedlist.add("S");
			linkedlist.add("R");
			linkedlist.add("I");
			linkedlist.add("S");
			linkedlist.add("A");
			linkedlist.add("I");
			System.out.println(linkedlist);
			linkedlist.addFirst("__");
			System.out.println(linkedlist);
			linkedlist.addLast("__");
			System.out.println(linkedlist);
			System.out.println("Linked List size is : "+linkedlist.size());
			System.out.println(linkedlist.removeLast());
			System.out.println(linkedlist.removeFirst());
			System.out.println(linkedlist);
			System.out.println("Element at positionn 3 is : "+linkedlist.get(3));
			System.out.println("Last element is :"+linkedlist.getLast());
			System.out.println(linkedlist);		
	}
}
