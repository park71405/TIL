package j_33;

import java.util.Scanner;

public class j_33 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j, idx, tmp;
		int n = scan.nextInt();
		int[] num = new int[n];
		
		for(i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		
		for(i=0; i<n-1; i++) {
			idx = i;
			for(j=i+1; j<n; j++) {
				if(num[j]>num[idx]) {
					idx = j;
				}
			}
			tmp = num[idx];
			num[idx] = num[i];
			num[i] = tmp;
		}
		
		tmp=0;
		for(i=1; i<n; i++) {
			if(num[i-1] != num[i]) {
				tmp++;
			}
			if(tmp == 2) {
				System.out.println(num[i]);
				break;
			}
		}
		
		scan.close();
	}
}
