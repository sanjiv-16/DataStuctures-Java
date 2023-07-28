public class QueueArrays2Test {
	public static void main(String[] args) {
		QueueArrays q=new QueueArrays();
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
	}

}
