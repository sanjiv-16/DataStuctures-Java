import java.util.*;
public class QueueArraysTest {
	public static void main(String[] args) {
		QueueArrays q=new QueueArrays();
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		System.out.println("Dequeue: "+q.Dequeue());
		System.out.println("Dequeue: "+q.Dequeue());
		System.out.println("Dequeue: "+q.Dequeue());
		q.enqueue(6);
		q.enqueue(7);
		System.out.println("Dequeue: "+q.Dequeue());
		System.out.println("Dequeue: "+q.Dequeue());
	}

}
