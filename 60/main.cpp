#include <iostream>
using namespace std;

int total, n, a[11];
bool flag = false;

void DFS(int L, int sum){
	if(flag == true){
		return;
	}
	if(L == n+1){
		if(sum == (total-sum)){
			flag = true;
		}
	}
	else{
		DFS(L+1, sum+a[L]);
		DFS(L+1, sum);
	}
}

int main(int argc, char** argv) {

	int i;
	scanf("%d", &n);

	for(i=1; i<=n; i++){
		scanf("%d", &a[i]);
		total += a[i];
	}
	
	DFS(1, 0);
	
	if(flag) printf("YES");
	else printf("NO");

	return 0;
}
