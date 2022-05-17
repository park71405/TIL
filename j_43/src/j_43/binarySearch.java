package j_43;

import java.util.Scanner;

public class binarySearch {
	
	public static int Count(int s, int n, int[] a) {
		int i, cnt=1, sum=0;
		for(i=1; i<=n; i++) {
			if(sum+a[i] > s) {
				cnt++;
				sum=a[i];
			}
			else 
				sum += a[i];
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, lt=1, rt=0, mid, res = 0;
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] a = new int[n+1];
		for(i=1; i<=n; i++) {
			a[i] = scan.nextInt();
			rt += a[i];
		}
		
		while(lt<=rt) {
			mid = (lt+rt)/2;
			if(Count(mid, n, a) <= m) {
				res = mid;
				rt = mid - 1;
			}
			else {
				lt = mid + 1;
			}
		}
		
		System.out.println(res);
		
		scan.close();
	}
}
