package j_80;

import java.util.*;

class Node{
	int idx;
	int cost;
	
	Node(int idx, int cost){
		this.idx = idx;
		this.cost = cost;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int V = scan.nextInt();
		int E = scan.nextInt();
		
		int start = 1;
		
		ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
		
		for(int i=0; i<V+1; i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i=0; i<E; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int cost = scan.nextInt();
			
			graph.get(a).add(new Node(b, cost));
		}
		
		boolean[] visited = new boolean[V+1];
		int[] dist = new int[V+1];
		
		for(int i=0; i<V+1; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[start] = 0;
		
		for(int i=0; i<V; i++) {
			int nodeValue = Integer.MAX_VALUE;
			int nodeIdx = 0;
			for(int j=1; j<V+1; j++) {
				if(!visited[j] && dist[j] < nodeValue) {
					nodeValue = dist[j];
					nodeIdx = j;
				}
			}
			visited[nodeIdx] = true;
			
			for(int j=0; j<graph.get(nodeIdx).size(); j++) {
				Node adjNode = graph.get(nodeIdx).get(j);
				if(dist[adjNode.idx] > dist[nodeIdx] + adjNode.cost) {
					dist[adjNode.idx] = dist[nodeIdx] + adjNode.cost;
				}
			}
		}
		
		for(int i=2; i<V+1; i++) {
			System.out.print(i + " : ");
			if(dist[i] == Integer.MAX_VALUE) {
				System.out.println("impossible");
			}
			else {
				System.out.println(dist[i]);
			}
		}
		
		
		scan.close();
	}
}
