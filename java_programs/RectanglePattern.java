package array;

import java.util.Scanner;

public class RectanglePattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int h=scan.nextInt();
		int w=scan.nextInt();
		for ( int i=0;i<h;i++) {System.out.println();
			
			for ( int j=0;j<w;j++) {
				if (i==0 || i==h-1 || j==0 || j==w-1) {
					System.out.print("#");
				}else {
					System.out.print(" ");}
				
			}
			
		}
	}

}
