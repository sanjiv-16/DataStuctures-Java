import java.util.Iterator;

/*
 * 
 * 
 * generics <T> to define what type we are using 
 */
public class LinkedList<T> implements Iterable<T> {
	Node head;
	
	class Node{
		T data;
		Node next; //reference variable for node object
		
		Node(T val){
			data=val;
			next=null;
		}
	}
	LinkedList(){
		head=null;
		
	}
	public void insertAtBeg(T val){
		Node newNode=new Node(val);
		//when list is empty 
		if(head==null) {
			head=newNode;
		}
		// list is non empty
		else {
			newNode.next=head; //order is important first pointer should be marked
			head=newNode;
		}
	}
	public void display() {
		Node temp=head;
		System.out.println("");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	public void insertAtPos(T val,int pos) {
		if(pos==0) {
			insertAtBeg(val);
			return;
		}
		Node newNode = new Node(val);
		Node temp=head;
		for(int i=1;i<=pos-1;i++) {
			temp=temp.next;
			if(temp==null) {
				throw new IllegalArgumentException("Invalid position");
			}
		}//now it is in previous node 
		newNode.next=temp.next; //the pointer of prev pos denotes the the next value that mapped to new node so it linked between
		temp.next=newNode;
		
	}
	public void deleteAtPos(int pos) {
		if(head==null) {
			throw new IndexOutOfBoundsException("Deletion attented on empty set");
		}
		if(pos==0) {
			head=head.next;
			return;
		}
		Node temp=head;
		Node prev=null;
		for(int i=1;i<=pos;i++) {
			prev=temp;
			temp=temp.next;	
		}
		prev.next=temp.next;
	}
	public int GetIndex() {
		int count=0;
		Node temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return  count;
	}
	public void DeleteAtEnd() {
		Node temp=head;
		Node prev=null;
		while(temp.next!=null) {
			prev =temp;
			temp=temp.next;
		}
		prev.next=null;
	}
	public void InsertAtEnd(T val) {
		Node newNode = new Node(val);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		newNode.next=null;
		temp.next=newNode;
		
	}
	public int Search(T val) {
		Node temp=head;
		int pos=0;
		while(temp!=null) {
			pos++;
			if(temp.data==val) {
				
				return pos;
			}
			temp=temp.next;
		}
		return -1;
	}
	public boolean Contains(T val) {
		Node temp=head;
		
		while(temp!=null) {
			
			if(temp.data==val) {
				
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	public void reverse() {
		Node prev=null;
		Node current=head;
		Node next=head.next;
		while(current!=null) {
			next=current.next;
			current.next=prev;//reverse link 
			prev=current;
			current=next;
			
		}
		head=prev;
	}
	// we can't use for each loop
	// for(int a:list)
	//     System.out.println(a+" "); 
	// so we implementing iterator
	
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
	

}
