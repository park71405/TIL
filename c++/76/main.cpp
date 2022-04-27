#include <iostream>
using namespace std;

int DFS(int n, int r){
	if(n == r || r == 0){
		return 1;
	}else{
		return DFS(n-1, r-1)+DFS(n-1, r);
	}
}

int main(int argc, char** argv) {
	freopen("input.txt","rt", stdin);
	
	int n, r;
	scanf("%d %d", &n, &r);
	printf("%d\n", DFS(n, r));

	return 0;
}
