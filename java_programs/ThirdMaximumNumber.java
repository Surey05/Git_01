package array;

import java.util.TreeSet;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		TreeSet<Integer> third=new TreeSet<>();
		for (int i : arr) {
			third.add(i);
			if(third.size()>3) {
				third.pollFirst();
			}
		}
		if (third.size()<3) {
			System.out.println(third.last());
		}
		else {
			System.out.println(third.first());
		}

	}

}
