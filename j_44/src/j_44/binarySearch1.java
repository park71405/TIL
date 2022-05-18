package j_44;

import java.util.Scanner;
import java.util.Arrays;

public class binarySearch1 {
	public static int Count(int len, int[] x, int n) {
		int i, cnt=1, pos=x[1];
		for(i=2; i<=n; i++) {
			if(x[i]-pos >= len) {
				cnt++;
				pos = x[i];
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int c = scan.nextInt();
		
		int[] x = new int[n+1];
		
		for(int i=1; i<=n; i++)
			x[i] = scan.nextInt();
		
		Arrays.sort(x);
		
		int lt=1, rt = x[n], mid, res = 0;
		
		while(lt <= rt) {
			mid = (lt+rt)/2;
			if(Count(mid, x, n) >= c) {
				res = mid;
				lt = mid + 1;
			}
			else
				rt = mid - 1;
		}
		
		System.out.println(res);
		
		
		scan.close();
	}
}
