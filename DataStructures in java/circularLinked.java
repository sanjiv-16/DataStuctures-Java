
public class circularLinked<T> {
	Node last;
	class Node{
		T data;
		Node next;
		
		public Node(T val) {
			data=val;
			next=null;
		}
			
	}
	circularLinked(){
		last=null;
	}
	public void InsertAtBeg(T val) {
		Node newNode=new Node(val);
		if(last==null) {
			newNode.next=newNode;
			last=newNode;
		}
		else {
			
			newNode.next=last.next;
			last.next=newNode;
			
		}
	}
	public void InsertAtEnd(T val) {
		Node newNode=new Node(val);
		if(last==null) {
			newNode.next=newNode;
			last=newNode;
		}
		else {
			
			newNode.next=last.next;
			last.next=newNode;
			last=newNode;
			
		}
	}
	public void Display() {
		Node temp=last.next;
		do {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}while(temp!=last.next);// as no head we use do while
		System.out.println("");
	}

}














