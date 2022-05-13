package j_39;

import java.util.Scanner;

public class j_39 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i;
		int n = scan.nextInt();
		int[] a = new int[n+1];
		for(i=1; i<=n; i++)
			a[i] = scan.nextInt();
		
		int m = scan.nextInt();
		int[] b = new int[m+1];
		for(i=1; i<=m; i++)
			b[i] = scan.nextInt();
		
		int[] c = new int[n+m+2];
		
		int p1 = 1, p2=1, p3=1;
		while(p1 <= n && p2 <= m) {
			if(a[p1] < b[p2]) {
				c[p3++] = a[p1++];
			}
			else {
				c[p3++] = b[p2++];
			}
		}
		while(p1<=n)
			c[p3++] = a[p1++];
		while(p2<=m)
			c[p3++] = b[p2++];
		
		for(i=1; i<p3; i++)
			System.out.print(c[i] + " ");
		
		scan.close();
	}
}
