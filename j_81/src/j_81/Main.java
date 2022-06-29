package j_81;

import java.io.*;
import java.util.StringTokenizer;

class Bus{
	int u;
	int v;
	int val;
	public Bus(int u,int v, int val) {
		this.u = u;
		this.v = v;
		this.val = val;
	}
}

public class Main {
	static int n,m;
	static Bus[] e;
	static long[] dist;
	static int INF = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		e = new Bus[m];
		
		
		// 1. ��� ��� ����
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int val = Integer.parseInt(st.nextToken());
			
			e[i] = new Bus(u,v,val);
		}
		
		// 2. �ִܰŸ� ���̺� �ʱ�ȭ
		dist = new long[n+1];
		for(int i=1; i<n+1; i++) {
			dist[i] = INF;
		}
		
		// �������� �˰��� ���� (true: ���� ��ȯ ����, false: ���� ��ȯ ����x)
		if(bellmanford(1)) { // ���� ��ȯ �����ϸ� -1 ��� 
			System.out.println(-1);
		}
		else {
			// 1�� ��带 ������ �ٸ� ��� ���� ���� ���� �ִܰŸ� ��� 
			for(int i=2; i<n+1; i++) {
				if(dist[i] == INF) {// ������ �� ������ -1 
					System.out.println("-1");
				}
				else { // �ִ� �Ÿ� ��� 
					System.out.println(dist[i]);
				}
			}
		}
		
	}
	static boolean bellmanford(int start){
		
		dist[start] = 0;
		
		// n�� �ݺ� (���� ���� ��ȯ üũ���Ϸ��� n-1�� �ݺ�)
		for(int i=0; i<n; i++) {
			// �� �ݺ����� ��� ������ Ȯ�� 
			for(int j=0; j<m; j++) {
				int cur = e[j].u;
				int next = e[j].v;
				int cost = e[j].val;
						
				if(dist[e[j].u] == INF) 
					continue;
				// ���� ������ ���ļ� �ٸ� ���� �̵��ϴ� �Ÿ��� ª�� ��� 
				if(dist[next] > (dist[cur] + cost)) {
					dist[next] = dist[cur] + cost;
							
					// n��° ���忡�� ���� ���ŵȴٸ� ���� ��ȯ ���� 
					if (i == n-1) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	
}
