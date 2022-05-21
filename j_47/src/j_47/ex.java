package j_47;

import java.util.Scanner;

public class ex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int i, j;
		int[][] map = new int[51][51];
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		
		int flag,cnt=0, k;
		
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				flag = 0;
				for(k=0; k<4; k++) {
					if(map[i + dx[k]][j + dy[k]] >= map[i][j]) {
						flag = 1;
						break;
					}
				}
				if(flag == 0)
					cnt++;
			}
		}
		
		System.out.println(cnt);
		scan.close();
	}
}
