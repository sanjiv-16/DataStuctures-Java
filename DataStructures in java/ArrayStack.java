
public class ArrayStack<T> {
	static final int max=30;
	T arr[] =(T[])new Object[max];
	int top;
	
	ArrayStack() {
		top=-1;
		
	}
	public void push(T val) {
		if(top==max-1) {
			throw new IndexOutOfBoundsException();
		}
		arr[++top]=val;
		
	}
	public T pop() {
		if(top==-1) {
			throw new IndexOutOfBoundsException();
		}
		return arr[top--];
	}
	public T peek() {
		return arr[top];
	}

}
