import java.util.*;

public class Demo {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		 int[] arr= {9,2,8,1,5,3};
		 int[] arr1= {234,456,3456,876,4567,9876,998,1000};
		 String str="Sanjeevi";
		 System.out.println("Element 7 is present in "+ Linearearch.Find(arr, 7));
		 System.out.println("Element 7 is there?  "+ Linearearch.Contains(arr, 7));
		 System.out.println("Element 7 is present in string  "+ Linearearch.Find(str, 'a'));
		 System.out.println("Element 7 is present in  string "+ Linearearch.Find(str, 'k'));
		 System.out.println("No of Element in  string "+ Linearearch.Length(str));
		 System.out.println("Element max is  "+ Linearearch.Max(arr));
		 System.out.println("Element max is  "+ Linearearch.Min(arr));
		 System.out.println("Element fourdigit value is  "+ Linearearch.Fourdigit(arr1));
		 
		 int[][] twoDArr= {
				 {2,5,3},
				 {6,9,7},
				 {3,5,8}
		 };
		  int[] result=Linearearch.Find(twoDArr, 7);
		  System.out.println("Elements7 present in "+Arrays.toString(result));
	}

}
