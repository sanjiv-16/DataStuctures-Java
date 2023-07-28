
public class QueueLinked {
	class Node{
		int data;
		Node next;
		public Node(int val) {
			data=val;
			next=null;
		}
	}
	Node front,rear;
	public QueueLinked() {
		front=null;
		rear=null;
	}
	public void enqueue(int val) {
		Node NewNode=new Node(val);
		if(front==null) 
			front=NewNode;
		else
			rear.next=NewNode;
		rear=NewNode;
	}
	public int Dequeue() {
		int temp=front.data;
		if(front==null)
			throw new IndexOutOfBoundsException();
		front=front.next;
		if(front==null) {
			rear=null;
		}
		
		return temp;
	}

}
