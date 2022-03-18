#include <iostream>
using namespace std;

int a[20][20];

int main(int argc, char** argv) {
	
	int n, m, i, t1, t2, t3, j;
	scanf("%d %d", &n, &m);
	
	for(i=1; i<=m; i++){
		scanf("%d %d %d", &t1, &t2, &t3);
		a[t1][t2] = t3;
	}
	
	for(i=1; i<=n; i++){
		for(j=1; j<=n; j++){
			printf("%d ", a[i][j]);
		}
		printf("\n");
	}
	
	
	return 0;
}
