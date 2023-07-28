
public class BinarySearch {
	public static int find(int[] arr,int tar) {
		int start=0;
		int end=arr.length-1;
		boolean asc=false;
		if(arr[start]<arr[end])
			asc=true;
		while(start<=end) {
			int mid=(start+end)/2;
			if(asc) {
			if(tar<arr[mid])
				end=mid-1;
			else if(tar>arr[mid])
				start=mid+1;
			else
				return mid;
			}
			else {
				if(tar<arr[mid])
					start=mid+1;
				else if(tar>arr[mid])
					end=mid-1;
				else
					return mid;
			}
			
		}
		return -1;
	}

}
