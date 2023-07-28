
public class QueueArrays {
	static final int max=30;
	int num[];
	int front,rear;
	
	public QueueArrays() {
		num=new int[max];
		front=-1;
		rear=-1;
	}
	
	public void enqueue(int val) {
		if(rear==max-1) 
			throw new IndexOutOfBoundsException("array is full vdf");
		if(front==-1)
			front++;
		num[++rear]=val;
	}
	public int Dequeue() {
		if(front==-1 || front>rear ) 
			throw new IndexOutOfBoundsException("array ");
		return num[front++];
	}

}
