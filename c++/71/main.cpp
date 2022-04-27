#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>
using namespace std;

int ch[10001], d[3]={1, -1, 5};

int main(int argc, char** argv) {
	freopen("input.txt", "rt", stdin);
	int s, e, x, pos, i;
	queue<int> Q;
	scanf("%d %d", &s, &e);
	
	ch[s] = 1;
	Q.push(s);
	while(!Q.empty()){
		x = Q.front();
		Q.pop();
		for(i=0; i<3; i++){
			pos = x + d[i];
			if(pos == e){
				printf("%d\n", ch[x]);
				exit(0);
			}
			if(ch[pos]==0){
				ch[pos] = ch[x]+1;
				Q.push(pos);
			}
		}
	}
	
	

	return 0;
}
