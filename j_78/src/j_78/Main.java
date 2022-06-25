package j_78;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int v, e;
	static int[][] graph;
	
	static int[] parent;
	
	static int final_cost;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		v = scan.nextInt();
		e = scan.nextInt();
		graph = new int[e][3];
		for(int i=0; i<e; i++) {
			graph[i][0] = scan.nextInt();
			graph[i][1] = scan.nextInt();
			graph[i][2] = scan.nextInt();
		}
		parent = new int[v];
		final_cost = 0;
		
		Arrays.sort(graph, (o1, o2) -> Integer.compare(o1[2], o2[2]));
		
		for(int i=0; i<v; i++) {
			parent[i] = i;
		}
		
		for(int i=0; i<e; i++) {
			if(find(graph[i][0] - 1) != find(graph[i][1] - 1)) {
				union(graph[i][0]-1, graph[i][1]-1);
				final_cost += graph[i][2];
				continue;
			}
		}
		System.out.println(final_cost);
		scan.close();
	}
	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a > b) {
			parent[a] = b;
		}else {
			parent[b] = a;
		}
	}
	
	private static int find(int x) {
		if(parent[x] == x) {
			return x;
		}else {
			return find(parent[x]);
		}
	}
}
