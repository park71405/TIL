package j_40;

import java.util.Scanner;
import java.util.Arrays;

public class two_pointer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		int n = scan.nextInt();
		int[] a = new int[n];
		for(i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		int m = scan.nextInt();
		int[] b = new int[m];
		for(i=0; i<m; i++) {
			b[i] = scan.nextInt();
		}
		Arrays.sort(b);
		int[] c = new int[n+m];
		int pos1=0, pos2=0, pos3=0;
		while(pos1 < n && pos2 < m) {
			if(a[pos1] == b[pos2]) {
				c[pos3++] = a[pos1++];
				pos2++;
			}
			else if(a[pos1] < b[pos2]) {
				pos1++;
			}
			else
				pos2++;
		}
		
		for(i=0; i<pos3; i++)
			System.out.print(c[i] + " ");
		
		scan.close();
	}
}
