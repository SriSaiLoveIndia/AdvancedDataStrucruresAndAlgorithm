import java.util.*;
public class Queue 
{
	int arr[];
	int front = -1, rear = -1;
	int size = 10;
	Queue(int size)
	{
		arr= new int[size];
	}
	int rear()
	{
		return rear;
	}
	int front()
	{
		return front;
	}
	void enQueue(int item)
	{
		if( rear >= (size))
			System.out.println("Cannot ENQUEUE");
		else
			if(front == -1)
			{
				front = rear = 0;
				arr[rear]=item;
			}
			else
			{
				rear++;
				arr[rear] = item;
			}
	}
	void deQueue()
	{
		if(front == -1 && rear == -1)
			System.out.println("Cannot DEQUEUE");
		else
		{
			if(front==rear)
				front=rear=-1;
			else
				front=front+1;			
		}
	}
	public void printQueue() 
	{
	    for (int i = front; i <= rear; i++) 
	    {
	      System.out.println(arr[i]);
	    }
	  }
	public static void main(String[] args) 
	{
		Queue queue = new Queue(10);
		queue.enQueue(9);
		queue.enQueue(4);
		queue.enQueue(6);
		queue.enQueue(2);
		queue.enQueue(7);
		System.out.println("Queue after inserting 9, 4, 6, 2 and 7 ");
		queue.printQueue();
		queue.deQueue();
		System.out.println("Queue after deleting ");
		queue.printQueue();
		System.out.println("Rear pointer is at : "+queue.rear());
		System.out.println("Front pointer is at : "+queue.front());
		System.out.println("Queue : ");
		queue.printQueue();
		queue.deQueue();
		System.out.println("Queue after deleting ");
		queue.printQueue();
		queue.enQueue(3);
		System.out.println("Queue after inserting 3 ");
		queue.printQueue();
	}
}