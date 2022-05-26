package j_52;

import java.util.Scanner;

public class Ugly_Number {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			
			int[] a = new int[1500];
			a[1] = 1;
			int p2=1, p3=1, p5=1;
			int i, min=0;
			for(i=2; i<=n; i++) {
				if(a[p2]*2 < a[p3]*3)
					min = a[p2]*2;
				else 
					min = a[p3]*3;
				if(a[p5]*5 < min)
					min = a[p5]*5;
				if(min == a[p2]*2)
					p2++;
				if(min == a[p3]*3)
					p3++;
				if(min == a[p5]*5)
					p5++;
				a[i] = min;
			}
			
			System.out.println(a[n]);
			
			scan.close();
		}
	}
}
