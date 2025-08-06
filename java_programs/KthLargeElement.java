package array;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargeElement {

	public static void main(String[] args) {
		int arr[]= {3,2,4,1,6,8};
		Scanner scan=new Scanner(System.in);
		int k=scan.nextInt();
		PriorityQueue<Integer> lar=new PriorityQueue<>();
		for (int i : arr) {
			lar.offer(i);
			if(lar.size()>k) {
				lar.poll();
			}
		}
		System.out.println(lar.peek());
	
		

	}

}
