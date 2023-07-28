import java.util.*;
public class StackLinkedtest {
	public static void main(String[] args) {
		StackLinked<Integer> Stack=new StackLinked<Integer>();
		Stack.push(5);
		Stack.push(6);
		Stack.push(7);
		Stack.push(8);
		System.out.println("popped "+Stack.pop());
		System.out.println("peeked "+Stack.peek());
		System.out.println("popped "+Stack.pop());
	}

}
