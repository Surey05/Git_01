package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RowColumnZeroArray {
	public static void main(String args[]) {
		int mat[][]= {{0,2,3},{4,5,6},{7,8,9}};
		int row=mat.length;
		int col=mat[0].length;
		Set<Integer>rowzero= new HashSet<>();
		Set<Integer>colzero=new HashSet<>();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(mat[i][j]==0) {
					rowzero.add(i);
					colzero.add(j);
					
				}
			}
		}
		for(int i:rowzero) {
			for(int j=0;j<col;j++) {
				mat[i][j]=0;
			}
		}
		for(int i:colzero) {
			for(int j=0;j<row;j++) {
				mat[j][i]=0;
			}
		}
		for(int[] i:mat) {
			System.out.println(Arrays.toString(i));
			
		}
	}

}
