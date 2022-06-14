package j_70;

import java.util.*;

public class Main {
	static int ch[] = new int[30];
	static int dis[] = new int[30];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n, m, a, b, x;
		ArrayList<ArrayList<Integer>> map;
		Queue<Integer> Q = new LinkedList<>();
		
		n = scan.nextInt();
		m = scan.nextInt();
		
		map = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			map.add(new ArrayList<Integer>());
		}
		
		for(int i=1; i<=m; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			map.get(a).add(b);
		}
		Q.add(1);
		ch[1] = 1;
		while(!Q.isEmpty()) {
			x = Q.poll();
			for(int i : map.get(x)) {
				if(ch[i] == 0) {
					ch[i] = 1;
					Q.add(i);
					dis[i] = dis[x]+1;
				}
			}
		}
		
		for(int i=2; i<=n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
		
		scan.close();
	}
}
