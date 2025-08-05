package suree;

import java.util.Arrays;

public class PrefixSum {
	public static void main(String []args) {
		int ar[]= {2,5,8,10,20};
		int presum[]=new int[ar.length];
		presum[0]=ar[0];
		for(int i=1;i<ar.length;i++) {
			
			presum[i]=presum[i-1]+ar[i];
			
		}
		System.out.println(Arrays.toString(presum));
	}

}
