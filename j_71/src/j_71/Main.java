package j_71;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		int e = scan.nextInt();
		
		int[] d = {1, -1, 5};
		int ch[] = new int[10001];
		Queue<Integer> Q = new LinkedList<>();
		ch[s] = 1;
		Q.add(s);
		
		int x, pos, i;
		while(!Q.isEmpty()) {
			x = Q.poll();
			for(i=0; i<3; i++) {
				pos = x + d[i];
				if(pos <= 0 || pos > 10000)
					continue;
				if(pos == e) {
					System.out.println(ch[x]);
					System.exit(0);
				}
				if(ch[pos] == 0) {
					ch[pos] = ch[x] + 1;
					Q.add(pos);
				}
			}
		}
		
		scan.close();
	}
}
