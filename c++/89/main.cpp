#include <iostream>
#include <queue>
using namespace std;

int m, n, tom[1010][1010], res = -2147000000, dis[1010][1010];
int dx[4]={-1, 0, 1, 0};
int dy[4]={0, 1, 0, -1};

struct Loc{
	int x;
	int y;
	Loc(int a, int b){
		x = a;
		y = b;
	}
};

queue<Loc> Q;

int main() {
	
	freopen("input.txt", "rt", stdin);
	
	int i, j;
	scanf("%d %d", &m, &n);
	
	for(i=1; i<=m; i++){
		for(j=1; j<=n; j++){
			scanf("%d", &tom[i][j]);
			if(tom[i][j] == 1){
				Q.push(Loc(i, j));
			}
		}
	}
	
	while(!Q.empty()){
		Loc tmp = Q.front();
		Q.pop();
		for(i=0; i<4; i++){
			int xx = tmp.x + dx[i];
			int yy = tmp.y + dy[i];
			if(tom[xx][yy] == 0){
				if(xx>=1 && xx<=m && yy>=1 && yy<=n){
					Q.push(Loc(xx, yy));
					tom[xx][yy] = 1;
					dis[xx][yy] = dis[tmp.x][tmp.y] + 1;
				}
			}
		}
	}
	
	int f = 1;
	for(i=1; i<=m; i++){
		for(j=1; j<=n; j++){
			if(tom[i][j] == 0)
				f=0;
		}
	}
	if(f==1){
		for(i=1; i<=m; i++){
			for(j=1; j<=n; j++){
				if(res < dis[i][j])
					res = dis[i][j];
			}
		}
		printf("%d", res);
	}
	else
		printf("-1");
	
	return 0;
}
