package j_77;

import java.util.*;

public class Main {
	static int[] unf = new int[1001];
	
	static int Find(int v) {
		if(v == unf[v])
			return v;
		else
			return unf[v] = Find(unf[v]);
	}
	
	static void Union(int a, int b) {
		a = Find(a);
		b = Find(b);
		if(a != b)
			unf[a] = b;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int i;
		
		for(i=1; i<=n; i++) {
			unf[i] = i;
		}
		
		int a, b;
		for(i=1; i<=m; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			Union(a, b);
		}
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		int fa = Find(a);
		int fb = Find(b);
		if(fa == fb)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		scan.close();
	}
}
