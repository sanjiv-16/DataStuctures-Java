
public class Linearearch {
	public static int Find(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) { 
				return i;
			}
		}
		return -1;
	}
	public static boolean Contains(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) { 
				return true;
			}
		}
		return false;
	}
	public static int Find(String str,char tar) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==tar) { 
				return i;
			}
		}
		return -1;
	}
	public static int[] Find(int[][] arr,int target) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]==target) { 
				return new int[] {i,j};
				}
		}
		}
		return new int[] {};
	}
	public static int Max(int[] arr) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>=c) { 
				c=arr[i];
			}
		}
		return c;
	}
	public static int Fourdigit(int[] arr) {
		int res=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=999) {
				res++;
			}
			
		}
		return res;
	}
	public static int Min(int[] arr) {
		int c=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<=c) { 
				c=arr[i];
			}
		}
		return c;
	}
	public static int Length(String str) {
		
		return str.length();
	}

}
