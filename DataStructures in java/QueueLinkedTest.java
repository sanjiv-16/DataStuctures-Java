public class QueueLinkedTest {
	public static void main(String[] args) {
		QueueLinked q=new QueueLinked();
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(7);
		System.out.println("Dequeue: "+q.Dequeue());
		System.out.println("Dequeue: "+q.Dequeue());
		System.out.println("Dequeue: "+q.Dequeue());
		q.enqueue(5);
		q.enqueue(8);
		System.out.println("Dequeue: "+q.Dequeue());
		System.out.println("Dequeue: "+q.Dequeue());
		System.out.println("Dequeue: "+q.Dequeue());
	}

}
