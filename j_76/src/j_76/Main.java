package j_76;

import java.util.*;

public class Main {
	static int[][] dy = new int[21][21];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int r = scan.nextInt();
		
		int tmp = DFS(n, r);
		System.out.println(tmp);
		
		scan.close();
	}
	
	static int DFS(int n, int r) {
		if(dy[n][r] > 0)
			return dy[n][r];
		if(n == r || r==0)
			return 1;
		else
			return dy[n][r] = DFS(n-1, r) + DFS(n-1, r-1);
	}
}
