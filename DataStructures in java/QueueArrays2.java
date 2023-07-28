
public class QueueArrays2 {
	static final int max=30;
	int num[];
	int rear;
	
	public QueueArrays2() {
		num=new int[max];
		
		rear=-1;
	}
	
	public void enqueue(int val) {
		if(rear==max-1) 
			throw new IndexOutOfBoundsException("array is full vdf");
		
		num[++rear]=val;
	}
	public int Dequeue() {
		if(rear==-1 ) 
			throw new IndexOutOfBoundsException("array ");
		int temp=num[rear];//the array space is note wasted here by shifting towards front for each de queue
		for(int i=1;i<max;i++) {
			num[i-1]=num[i];
		}
		return temp;
	}

}
