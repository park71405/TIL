package j_62;

import java.util.Scanner;

public class merge {	
	
	static int[] a = new int[101];
	static int[] tmp = new int[101];
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		int n = scan.nextInt();
			
		int i;
		for(i=1; i<=n; i++) {
			a[i] = scan.nextInt();
		}
			
		divide(1, n);
			
		for(i=1; i<=n; i++) {
			System.out.print(a[i] + " ");
		}
			
		scan.close();
	}
	
	static void divide(int lt, int rt) {
		int mid;
		int p1, p2, p3;
		if(lt < rt) {
			mid = (lt + rt)/2;
			divide(lt, mid);
			divide(mid+1, rt);
			p1 = lt;
			p2 = mid + 1;
			p3 = lt;
			while(p1 <= mid && p2 <= rt) {
				if(a[p1] < a[p2])
					tmp[p3++] = a[p1++];
				else
					tmp[p3++] = a[p2++];
			}
			while(p1 <= mid)
				tmp[p3++] = a[p1++];
			while(p2 <= rt)
				tmp [p3++] = a[p2++];
			for(int i=lt; i <= rt; i++) {
				a[i] = tmp[i];
			}
		}
	}
}
