package j_41;

import java.util.Scanner;

public class j_41 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b=1, cnt=0, tmp, i;
		
		tmp = a;
		a--;
		while(a>0) {
			b++;
			a = a-b;
			if(a%b == 0) {
				for(i=1; i<b; i++) {
					System.out.printf("%d + ", (a/b)+i);
				}
				System.out.printf("%d = %d\n", (a/b)+i, tmp);
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
		scan.close();
	}
}
