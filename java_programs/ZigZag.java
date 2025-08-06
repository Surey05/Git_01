package array;

import java.util.Scanner;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PAYPALISHIRING";
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		
		
		if(row==1 || s.length()<=row) {
			System.out.println(s);
			return;
		}
		StringBuilder[] rows=new StringBuilder[row];
		for(int i=0;i<row;i++) {
			rows[i]=new StringBuilder();
		}
		int index=0;
		int step=-1;
		
		for(char c: s.toCharArray()) {
			rows[index].append(c);
			if(index==0) {
				step=1;
			}
			else if(index == row-1) {
				step=-1;
			}
			index+=step;
			
		}
		StringBuilder result=new StringBuilder();
		for(StringBuilder sb:rows) {
			result.append(sb);
		}
		System.out.println(result.toString()); 

	}

}
