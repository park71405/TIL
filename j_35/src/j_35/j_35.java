package j_35;
import java.util.Scanner;

public class j_35 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		
		int tmp;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(num[j] > num[j+1]) {
					tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(num[j] < 0 && num[j+1] < 0) {
					if(num[j] < num[j+1]) {
						tmp = num[j];
						num[j] = num[j+1];
						num[j+1] = tmp;
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(num[i] + " ");
		}
		
		scan.close();
	}
}
