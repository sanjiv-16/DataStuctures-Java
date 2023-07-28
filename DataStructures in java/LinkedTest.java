import java.util.Iterator;

public class LinkedTest {
	public static void main(String[] args) {
		LinkedList <Integer>list=new LinkedList<Integer>();// we use wrapper class so oly fully typed Integer
		// we can also implement stringlist by just changint  <String> class
		
		list.insertAtBeg(9);
		list.display();
		list.insertAtBeg(5);
		list.display();
		list.insertAtPos(12,1);
		list.display();
		list.insertAtPos(10,0);
		list.display();
		list.insertAtPos(11,4);
		list.display();
		list.insertAtPos(17,3);
		list.display();
		list.insertAtPos(14,2);
		list.display();
		list.deleteAtPos(3);
		list.display();
		list.deleteAtPos(0);
		list.display();
		int index=list.GetIndex();
		System.out.println("");
		System.out.println(index);
		list.DeleteAtEnd();
		list.display();
		list.InsertAtEnd(19);
		list.display();
		System.out.println(list.Search(19));
		System.out.println(list.Contains(5));
		
		for(int a:list)
			System.out.println(a+" ");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
		     System.out.println(it.next()+" ");
		}
		list.reverse();
		list.display();
		
		
		
		
		
		
			
	}

}
