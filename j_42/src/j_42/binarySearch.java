package j_42;

import java.util.Scanner;
import java.util.Arrays;

public class binarySearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i;
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] a = new int[n];
		for(i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		
		int p1=0, p2=n, p3;
		while(true) {
			p3 = (p1+p2)/2;
			if(a[p3] < m) {
				p1 = p3 + 1;
			}
			else if(a[p3] > m) {
				p2 = p3 - 1;
			}
			if(a[p3] == m) {
				break;
			}
		}
		
		System.out.printf("%d", p3+1);
		
		scan.close();
	}
}
