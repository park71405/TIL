package j_34;
import java.util.Scanner;

public class Bubble_sort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, j, tmp;
		int n = scan.nextInt();
		int[] a = new int[n];
		for(i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		
		for(i=0; i<n-1; i++) {
			for(j=0; j<n-i-1; j++) {
				if(a[j] > a[j+1]) {
					tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		
		for(i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		
		scan.close();
	}
}
