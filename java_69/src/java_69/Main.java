package java_69;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n =7, m = 6;
		int v = 1;
		
		boolean visited[] = new boolean[n+1];
		
		LinkedList<Integer>[] adjList = new LinkedList[n+1];
		
		for(int i=0; i<=n; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
		
		for(int i=0; i<m; i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			adjList[v1].add(v2);
			adjList[v2].add(v1);
		}
		for(int i=1; i<=n; i++) {
			Collections.sort(adjList[i]);
		}
		
		bfs_list(v, adjList, visited);
		
		scan.close();
	}
	
	public static void bfs_list(int v, LinkedList<Integer>[] adjList, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[v] = true;
		queue.add(v);
		
		while(queue.size() != 0) {
			v = queue.poll();
			System.out.print(v + " ");
			
			Iterator<Integer> iter = adjList[v].listIterator();
			
			while(iter.hasNext()) {
				int w = iter.next();
				if(!visited[w]) {
					visited[w] = true;
					queue.add(w);
				}
			}
		}
	}
}