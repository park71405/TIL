package j_37;
import java.util.Scanner;



public class j_37 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s, n, i, j, pos, tmp;
		s = scan.nextInt();
		n = scan.nextInt();
		
		int[] cache = new int[n];
		
		for(i=0; i<n; i++) {
			tmp = scan.nextInt();
			pos = -1;
			for(j=0; j<s; j++)
				if(cache[j] == tmp)
					pos = j;
			if(pos == -1) {
				for(j=s-1; j>=1; j--)
					cache[j] = cache[j-1];
			}
			else {
				for(j=pos; j>=1; j--)
					cache[j] = cache[j-1];
			}
			cache[j] = tmp;
		}
		
		for(i=0; i<s; i++)
			System.out.print(cache[i] + " ");
		
		scan.close();
	}
}
