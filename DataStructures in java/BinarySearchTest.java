import java.util.*;
public class BinarySearchTest {
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,7,9,11,15,19,21};
		Arrays.sort(arr);
		int[] arrr= {20,19,18,14,13,11,9,5,2};
		
		System.out.println(BinarySearch.find(arr,5));
		System.out.println(BinarySearch.find(arrr,24));
		
	}

}
