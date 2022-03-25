#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>
using namespace std;

int main(int argc, char** argv) {
	
	int a;
	priority_queue<int> pQ;
	
	while(true){
		scanf("%d", &a);
		if(a == -1)
			break;
		if(a == 0){
			if(pQ.empty())
				printf("-1\n");
			else{
				printf("%d\n", pQ.top());
				pQ.pop();
			}
		}
		else
			pQ.push(a);
	}
	
	return 0;
}
