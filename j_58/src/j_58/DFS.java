package j_58;

import java.util.Scanner;

public class DFS {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DFS(1);
		
		scan.close();
	}
	
	public static void DFS(int n) {
		if(n == 8)
			return;
		else {
			System.out.print(n + " ");
			DFS(n+1);
		}
	}
}
