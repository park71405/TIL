package j_67;

import java.util.*;

public class Main {
	static int n, cost = 2147000000;
	static int[][] map = new int[30][30];
	static int[] ch = new int[30];
	
	public static void DFS(int v, int sum) {
		int i;
		if(v == n) {
			if(sum < cost)
				cost = sum;
		}else {
			for(i=1; i<=n; i++) {
				if(map[v][i] > 0 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i, sum+map[v][i]);
					ch[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m, i, a, b, c;
		n = scan.nextInt();
		m = scan.nextInt();
		
		for(i=1; i<=m; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			map[a][b] = c;
		}
		
		ch[1] = 1;
		DFS(1, 0);
		
		System.out.println(cost);
		
		scan.close();
	}
}
