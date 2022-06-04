package j_60;

import java.util.Scanner;

public class recursive {
	
	static int a[] = new int[11]; 
	static int n, total=0;
	static boolean flag = false;
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();
			int i;
			for(i=0; i<n; i++) {
				a[i] = scan.nextInt();
				total += a[i];
			}
			DFS(1, 0);
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
			
			scan.close();
		}
	}
	
	static void DFS(int L, int sum) {
		if(sum > (total/2))
			return;
		if(flag == true)
			return;
		if(L == n+1) {
			if(sum == (total-sum)) {
				flag = true;
			}
		}
		else {
			DFS(L+1, sum+a[L]);
			DFS(L+1, sum);
		}
		
	}
}
