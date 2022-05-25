package j_50;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int w = scan.nextInt();
		
		int[][] map = new int[h+1][w+1];
		
		int i, j;
		for(i=1; i<=h; i++) {
			for(j=1; j<=w; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int k, z, sum=0, max=0;
		for(i=1; i<=h+1-a; i++) {
			for(j=1; j<=w+1-b; j++) {
				sum=0;
				for(k=i; k<=i+a-1; k++) {
					for(z=j; z<=j+b-1; z++) {
						sum += map[k][z];
					}
				}
				if(sum > max) {
					max = sum;
				}
			}
		}
		
		System.out.println(max);
		
		scan.close();
	}
}
