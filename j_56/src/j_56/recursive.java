package j_56;

import java.util.Scanner;

public class recursive {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		DFS(n);
		
		scan.close();
	}
	
	public static void DFS(int n) {
		if(n == 0)
			return;
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}
}
