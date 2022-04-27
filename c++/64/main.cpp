#include <iostream>
using namespace std;

int a[21][21], ch[30];
int n, cnt=0;

void DFS(int v){
	int i;
	if(v == n){
		cnt++;
	}
	else{
		for(i=1; i<=n; i++){
			if(a[v][i] == 1 && ch[i] == 0){
				ch[i] = 1;
				DFS(i);
				ch[i] = 0;
			}
		}
	}
}

int main(int argc, char** argv) {

	int m, i, j, p1, p2;
	scanf("%d %d", &n,&m);
	
	for(i=1; i<=m; i++){
		scanf("%d %d", &p1, &p2);
		a[p1][p2] = 1;
	}
	ch[1] = 1;
	DFS(1);
	
	printf("%d", cnt);

	return 0;
}
