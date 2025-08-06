package array;

public class LarSecondEle {
	public static void main(String [] args) {
		int array[]= {12,33,44,65,7,45};
		int lar=Integer.MIN_VALUE,sec=Integer.MIN_VALUE;
		for(int check=0;check < array.length;check++) {
			if (array[check]>lar) {
				sec=lar;
				lar=array[check];
			}
			else if (array[check]<lar && array[check]>sec) {
				sec=array[check];
				
			}
		}
		System.out.println(sec);
	}

}
