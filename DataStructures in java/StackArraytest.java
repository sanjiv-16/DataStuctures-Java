import java.util.*;
public class StackArraytest {

	public static void main(String [] args) {
		ArrayStack<Integer> Stack=new ArrayStack<Integer>();
		 
		Stack.push(5);
		Stack.push(6);
		Stack.push(7);
		System.out.println("popped "+Stack.pop());
		System.out.println("peeked "+Stack.peek());
		System.out.println("popped "+Stack.pop());
		
	}
}
