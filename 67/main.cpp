#include <iostream>
using namespace std;

int map[30][30], ch[30];
int n, cost=2147000000;

void DFS(int v, int sum){
	int i;
	if(v == n){
		if(sum<cost) cost = sum;
	}
	else{
		for(i=1; i<=n; i++){
			if(map[v][i]>0 && ch[i]==0){
				ch[i]=1;
				DFS(i, sum+map[v][i]);
				ch[i]=0;
			}
		}
	}
}

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	
	int m, i, a, b, c;
	scanf("%d %d", &n, &m);
	for(i=1; i<=m; i++){
		scanf("%d %d %d", &a, &b, &c);
		map[a][b] = c;
	}
	
	ch[1] =1;
	DFS(1, 0);
	
	printf("%d", cost);
	
	return 0;
}
