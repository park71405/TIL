package j_38;

import java.util.Scanner;

public class Inversion_Sequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, j, pos;
		int n = scan.nextInt();
		
		int[] a = new int[n+1];
		int[] b = new int[n+1];
		
		for(i=1; i<=n; i++) {
			a[i] = scan.nextInt();
			b[i] = 0;
		}
		
		for(i=n; i>=1; i--) {
			pos = i;
			for(j=1; j<=a[i]; j++) {
				b[pos] = b[pos+1];
				pos++;
			}
			b[pos] = i;
		}
		
		for(i=1; i<=n; i++) {
			System.out.print(b[i] + " ");
		}
		
		scan.close();
	}
}
