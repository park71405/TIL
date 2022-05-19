package j_45;

import java.util.Scanner;

public class binary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] v = new int[n+1];
		
		int p=0, i, bp=0, cnt=0;
		while(true) {
			p++;
			if(p>n)
				p = 1;
			if(v[p] == 0) {
				cnt++;
				if(cnt == k) {
					v[p] = 1;
					cnt = 0;
					bp++;
				}
			}
			if(bp == n-1)
				break;
		}
		
		for(i=1; i<=n; i++) {
			if(v[i] == 0) {
				System.out.println(i);
				break;
			}
		}
	
		
		scan.close();
	}
}
