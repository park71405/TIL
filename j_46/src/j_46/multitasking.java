package j_46;

import java.util.Scanner;

public class multitasking {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n+1];
		
		int i, tot=0;
		for(i=1; i<=n; i++) {
			a[i] = scan.nextInt();
			tot = tot + a[i];
		}
		
		int k = scan.nextInt();
		
		if(k >= tot) {
			System.out.println("-1");
			return;
		}
		
		int p=0, cnt=0;
		while(true) {
			p++;
			if(p > n)
				p = 1;
			if(a[p] == 0)
				continue;
			a[p]--;
			cnt++;
			if(cnt == k)
				break;
		}
		
		while(true) {
			p++;
			if(p > n)
				p = 1;
			if(a[p] != 0)
				break;
		}
		
		System.out.println(p);
		
		scan.close();
	}
}
