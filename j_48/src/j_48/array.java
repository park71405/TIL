package j_48;

import java.util.Scanner;
import java.lang.Math;

public class array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, j;
		int[][] a = new int[10][10];
		int sum, ave, min, res = 0, tmp;
		
		for(i=1; i<=9; i++) {
			sum = 0;
			for(j=1; j<=9; j++) {
				a[i][j] = scan.nextInt();
				sum += a[i][j];
			}
			ave = (int) ((sum/9.0)+0.5);
			System.out.print(ave);
			min = 2147000000;
			for(j=1; j<=9; j++) {
				tmp = Math.abs(a[i][j] - ave);
				if(tmp < min) {
					min = tmp;
					res = a[i][j];
				}
				else if(tmp == min) {
					if(a[i][j] > res)
						res = a[i][j];
				}
			}
			System.out.println(" " + res);
		}
		
		scan.close();
	}
}
