
public class StackLinked<T> {
	class Node{
		T data;
		Node next;
		Node(T val){
			data=val;
			next=null;
		}
	}
	Node top;
	StackLinked(){
		top=null;
	}
	public void push(T val) {
		Node newnode=new Node(val);
		newnode.next=top;
		top=newnode;
		
	}
	public T pop() {
		if(top==null) {
			throw new IndexOutOfBoundsException();
		}
		T temp=top.data;
		top=top.next;
		return temp;
	}
	public T peek() {
		if(top==null) {
			throw new IndexOutOfBoundsException();
		}
		T temp=top.data;
		
		return temp;
		
	}

}
