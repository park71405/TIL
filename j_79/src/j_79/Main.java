package j_79;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
	public static class Edge {
		int vertex, weight;
		
		public Edge(int vertex, int weight) {
			this.vertex = vertex;
			this.weight = weight;
		}
	}
	
	public static int V, E, answer;
	public static boolean[] visited;
	public static int[] minEdge;
	public static List<Edge>[] edge;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		
		edge = new ArrayList[V + 1];
		
		for (int i = 0; i <= V; ++i) {
			edge[i] = new ArrayList<Edge>();
		}
		
		for (int i = 0; i < E; ++i) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			
			// 양방향으로 연결되있음을 주의
			edge[from].add(new Edge(to, weight));
			edge[to].add(new Edge(from, weight));
		}
		
		visited = new boolean[V + 1];
		minEdge = new int[V + 1];
		
		Arrays.fill(minEdge, Integer.MAX_VALUE);
		minEdge[1] = 0;
		answer = 0;
		
		for (int i = 1; i <= V; ++i) {
			int min = Integer.MAX_VALUE;
			int cur = 0;
			
			for (int j = 1; j <= V; ++j) {
				if (!visited[j] && min > minEdge[j]) {
					min = minEdge[j];
					cur = j;
				}
			}
			
			visited[cur] = true;
			answer += min;
			
			for (int j = 0; j < edge[cur].size(); ++j) {
				Edge e = edge[cur].get(j);
				
				if (!visited[e.vertex] && minEdge[e.vertex] > e.weight) {
					minEdge[e.vertex] = e.weight;
				}
			}
		}
		
		System.out.println(answer);
	}
}