package j_65;

import java.util.Scanner;

public class Search {	
	static int[][] map = new int[10][10];
	static int[][] ch = new int[10][10];
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, j;
		for(i=1; i<=7; i++) {
			for(j=1; j<=7; j++) {
				map[i][j] = scan.nextInt(); 
			}
		}
		
		ch[1][1] = 1;
		DFS(1, 1);
		
		System.out.println(cnt);
		
		scan.close();
	}
	static void DFS(int x, int y) {
		int xx, yy, i;
		if(x == 7 && y == 7) {
			cnt++;
		}
		else {
			for(i=0; i<4; i++) {
				xx = x + dx[i];
				yy = y + dy[i];
				if(xx < 1 || xx > 7 || yy < 1 || yy > 7)
					continue;
				if(map[xx][yy] == 0 && ch[xx][yy] == 0) {
					ch[xx][yy] = 1;
					DFS(xx, yy);
					ch[xx][yy] = 0;
				}
			}
		}
	}
}
