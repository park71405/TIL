#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;

int n, r, cnt=0;
int a[16], res[16], ch[16];

void DFS(int L){
	if(L == r){
		for(int j=0; j<L; j++){
			printf("%d ", res[j]);
		}
		cnt++;
		puts("");
	}
	else{
		for(int i=1; i<=n; i++){
			if(ch[i] == 0){
				res[L] = a[i];
				ch[i] = 1;
				DFS(L+1);
				ch[i] = 0;
			}
		}
	}
}


int main(int argc, char** argv) {
	freopen("input.txt", "rt", stdin);
	int i;
	scanf("%d %d", &n, &r);
	
	for(i=1; i<=n; i++){
		scanf("%d", &a[i]);
	}
	
	DFS(0);
	printf("%d\n", cnt);

	return 0;
}
