package j_32_selection_sort;

import java.util.Scanner;

public class selection{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		int tmp, idx;
		for(int i=0; i<n-1; i++) {
			idx = i;
			for(int j=i+1; j<n; j++) {
				if(num[j] < num[idx])
					idx = j;
			}
			tmp = num[i];
			num[i] = num[idx];
			num[idx] = tmp; 
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(num[i] + " ");
		}
		
		scan.close();
	}
}

