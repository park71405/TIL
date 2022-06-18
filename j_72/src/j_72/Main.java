package j_72;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		Queue<Integer> Q = new LinkedList<>();
		
		for(int i=1; i<=n; i++)
			Q.add(i);
		
		int tmp=0, num;
		while(Q.size() > 1) {
			tmp++;
			num = Q.poll();
			if(tmp == k) {
				tmp = 0;
			}
			else {
				Q.add(num);
			}
		}
		
		System.out.println(Q.poll());
		
		scan.close();
	}
}
