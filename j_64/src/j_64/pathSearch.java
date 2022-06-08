package j_64;

import java.util.Scanner;

public class pathSearch {
	static int[][] map = new int[21][21];
	static int[] ch = new int[30];
	static int n, cnt=0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		int m = scan.nextInt();
		
		int i, a, b;
		for(i=1; i<=m; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			map[a][b] = 1;
		}
		ch[1] = 1;
		DFS(1);
		
		System.out.println(cnt);
		
		scan.close();
	}
	static void DFS(int v) {
		int i;
		if(v == n) {
			cnt++;
		}else {
			for(i=1; i<=n; i++) {
				if(map[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}
}
