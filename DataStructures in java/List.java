import java.util.*;
class Listfunc{
	private static final int initial=16;
	private int arr[];
	private int size;
	private int capacity;
	
	Listfunc(){
		size=0;
		arr=new int[initial];
		capacity=initial;
	}
	public void add(int val) {
		if(size==capacity) {
			ExpandArray();
		}
		arr[size++]=val;
	}
	private void ExpandArray() {
		capacity*=2;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	private void SrinkArray() {
		capacity/=2;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	public void Display() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	public void InsertAt(int val,int pos) {
		if(size==capacity) {
			ExpandArray();
		}
		for(int i=size-1;i>=pos;i--) {
			arr[i+1]=arr[i];
		}
		arr[pos]=val;
		size++;
		
	}
	public void Delete(int pos) {
		for(int i=pos+1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		size--;
		if(capacity >initial && capacity >3*size) {
			SrinkArray();
		}
	}
	
	
}

public class List {
	public static void main(String [] args) {
		int val,pos;
		Scanner scan=new Scanner(System.in);
		Listfunc list=new Listfunc();
		
		while(true) {
			System.out.println("...........MENU...........");
			System.out.println("Enter your choice:");
			System.out.println("1.insert to end");
			System.out.println("2. display the array");
			System.out.println("3.insert at specific position");
			System.out.println("4. Delete an element ");
			System.out.println("5. exit");
			
		
		int choice=scan.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter your data:");
		val=scan.nextInt();
		list.add(val);
		break;
		case 2: list.Display();
		break;
		case 3: System.out.println("Enter position starts at 0:");
		pos=scan.nextInt();
		System.out.println("Enter your data: ");
		val=scan.nextInt();
		list.InsertAt(val,pos);
		break;
		case 4:
			System.out.println("Enter position to delete: ");
			pos=scan.nextInt();
			list.Delete(pos);
			break;
		case 5: 
			System.exit(0);
		
		
		default: System.out.println("Invalid choice");
		
			
			
		}

	}
	}

}
