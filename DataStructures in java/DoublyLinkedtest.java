public class DoublyLinkedtest {
	public static void main(String[] args) {
		DoublyLinked <Integer>list=new DoublyLinked<Integer>();// we use wrapper class so oly fully typed Integer
		// we can also implement stringlist by just changint  <String> class
		
		list.insertAtBeg(9);
		list.insertAtBeg(6);
		list.insertAtBeg(5);
		list.display();
		list.displayrev();
		list.insertAtpos(10,2);
		list.display();
		
		list.insertAtpos(11,4);
		list.display();
		list.deleteAtPos(4);
		list.display();
		list.displayrev();
}
}
