#include <iostream>
#include <queue>
#include <algorithm>
using namespace std;

int n, map[10][10], dis[10][10];
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
	
	freopen("input.txt","rt", stdin);
	
	int i, j;
	
	for(i=1; i<8; i++){
		for(j=1; j<8; j++){
			scanf("%d", &map[i][j]);
		}
	}
	Q.push(Loc(1,1));
	map[1][1] = 1;
	
	while(!Q.empty()){
		Loc tmp = Q.front();
		Q.pop();
		for(int i=0; i<4; i++){
			int xx = tmp.x + dx[i];
			int yy = tmp.y + dy[i];
			if(map[xx][yy] == 0 && xx>=1 && xx<=7 && yy>=1 && yy<=7){
				Q.push(Loc(xx, yy));
				map[xx][yy] = 1;
				dis[xx][yy] = dis[tmp.x][tmp.y] + 1;
			}
		}
	}
	printf("%d", dis[7][7]);
	
	return 0;
}
