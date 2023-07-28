import java.util.Iterator;
public class DoublyLinked<T> implements Iterable<T> {
	Node head;
	Node tail;
	
	class Node{
		T data;
		Node prev;
		Node next; //reference variable for node object
		
		Node(T val){
			data=val;
			next=null;
			prev=null;
		}
	}
	DoublyLinked(){
		head=null;
		tail=null;
		
	}
	public Iterator<T> iterator(){
		return new Iterator<T>(){
			Node temp=head;
			
			public boolean hasNext() {
				return temp!=null;
				
			}
			public T next() {
				T val=temp.data;
				temp=temp.next;
				return val;
				
			}
		};
	}
	public void insertAtBeg(T val){
		Node newNode=new Node(val);
		newNode.next=head; 
		//when list is empty 
		if(head==null) {
			tail=newNode;
		}
		// list is non empty
		else {
			head.prev=newNode;
		}
		head=newNode;
	}
	public void display() {
		Node temp=head;
		System.out.println("");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	public void displayrev() {
		Node temp=tail;
		System.out.println("");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
		
	}
	public void insertAtpos(T val,int pos) {
		if(pos==0) {
			insertAtBeg(val);
			return;
		}
		Node newNode = new Node(val);
		Node temp=head;
		
		for(int i=1;i<pos;i++) {
			temp=temp.next;
			if(temp==null) {
				throw new IllegalArgumentException("Invalid position");
			}
		}//now it is in previous node 
		newNode.next=temp.next; //the pointer of prev pos denotes the the next value that mapped to new node so it linked between
		newNode.prev=temp;
		if(temp==tail) {
			tail=newNode;
		}
		else {
		  temp.next.prev=newNode;
		}
		temp.next=newNode;
		
		
		
	}
	public void deleteAtBeg() {
		if(head==null) {
			throw new IndexOutOfBoundsException("Deletion attented on empty set");
		}
		head=head.next;
		if(head==null) {
			tail=null;
		}
		else {
		head.prev=null;
		
		}
	}
	public void deleteAtPos(int pos) {
		if(head==null) {
			throw new IndexOutOfBoundsException("Deletion attented on empty set");
		}
		if(pos==0) {
			deleteAtBeg();
			return;
		}
		Node temp=head;
		Node prev=null;
		for(int i=1;i<=pos;i++) {
			prev=temp;
			temp=temp.next;	
			if(temp==null) {
				throw new IndexOutOfBoundsException("Invalid position");
			}
		}
		prev.next=temp.next;
		if(temp.next!=null) {
		temp.next.prev=prev;
		}
		else {
			tail=prev;
		}
		
	}
}