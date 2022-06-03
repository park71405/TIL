package j_59;

import java.util.Scanner;

public class DFS {
	static int[] ch = new int[100];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		DFS1(1, n);
		
		scan.close();
	}
	
	public static void DFS1(int L, int n) {
		int i;
		
		if(L == n+1) {
			for(i=1; i<=n; i++) {
				if(ch[i] == 1)
					System.out.print(i + " ");
			}
			System.out.println();
		}
		else {
			ch[L] = 1;
			DFS1(L+1, n);
			ch[L] = 0;
			DFS1(L+1, n);
		}
	}
}
