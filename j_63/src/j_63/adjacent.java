package j_63;

import java.util.Scanner;

public class adjacent {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			int[][] map = new int[21][21];
			
			int i, a, b, c;
			for(i=1; i<=m; i++) {
				a = scan.nextInt();
				b = scan.nextInt();
				c = scan.nextInt();
				map[a][b] = c;
			}
			
			int j;
			for(i=1; i<=n; i++) {
				for(j=1; j<=n; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			
			scan.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
