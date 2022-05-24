package j_49;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] map = new int[n+1][n+1];
		int[] a = new int[n+1];
		int[] b = new int[n+1];
		
		int i, j;
		for(i=1; i<=n; i++) {
			a[i] = scan.nextInt();
			for(j=1; j<=n; j++) {
				map[j][i] = a[i];
			}
		}
		
		for(i=1; i<=n; i++) {
			b[i] = scan.nextInt();
			for(j=1; j<=n; j++) {
				if(b[i] < map[n+1-i][j]) {
					map[n+1-i][j] = b[i];
				}
			}
		}
		
		int sum = 0;
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				sum += map[i][j];
			}
		}
		
		System.out.println(sum);
		
		scan.close();
	}
}
