package j_61;

import java.util.Scanner;

public class recursive {
	static int n, m, cnt=0;
	static int[] a = new int[11];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		m = scan.nextInt();
		
		int i;
		for(i=1; i<=n; i++) {
			a[i] = scan.nextInt();
		}
		
		DFS(1, 0);
		if(cnt == 0)
			System.out.println("-1");
		else
			System.out.println(cnt);
		
		scan.close();
	}
	
	static void DFS(int L, int sum) {
		if(L == n+1) {
			if(sum == m) {
				cnt++;
			}
		}else {
			DFS(L+1, sum+a[L]);
			DFS(L+1, sum);
			DFS(L+1, sum-a[L]);
		}
	}
}
