package array;

public class TwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int target = 7;
		int f=0;
		int l=arr.length-1;
		while(f<l) {
			int sum=arr[f]+arr[l];
			if(sum==target) {
				System.out.println(arr[f]+","+arr[l]+"="+target);
				f++;
				l--; 	
			}
			else if (sum<target)
				f++;
			else 
				l--;
		}
	}

}
