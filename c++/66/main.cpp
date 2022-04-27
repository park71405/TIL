#include <iostream>
using namespace std;

int map[21][21], ch[21];
int cnt=0;

void DFS(int v){
	if(v == 5){
		cnt++;
	}
	else{
		for(int i=2; i<=5; i++){
			if(map[v][i] == 1 && ch[i] == 0){
				ch[i] = 1;
				DFS(i);
				ch[i] = 0;
			}
		}
	}
}

int main(int argc, char** argv) {

	int n, m, i, p1, p2;
	scanf("%d %d", &n, &m);

	for(i=1; i<=m; i++){
		scanf("%d %d", &p1, &p2);
		map[p1][p2] = 1;
	}
	
	ch[1] = 1;
	DFS(1);
	
	printf("%d", cnt);

	return 0;
}
