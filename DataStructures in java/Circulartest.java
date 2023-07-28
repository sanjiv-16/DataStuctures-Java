import java.util.*;
public class Circulartest {
	public static void main(String[] args) {
		circularLinked<Integer> list=new circularLinked<Integer>();
		list.InsertAtBeg(9);
		list.Display();
		list.InsertAtBeg(10);
		list.Display();
		list.InsertAtBeg(11);
		list.Display();
		list.InsertAtEnd(7);
		list.Display();
	}

}
