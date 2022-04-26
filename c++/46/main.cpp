#include <iostream>
using namespace std;

int main(){
	
	int n, i, k, j, cnt;
	scanf("%d", &n);
	int a[n];
	for(i=0; i<n; i++){
		scanf("%d", &a[i]);
	}
	
	scanf("%d", &k);
	
	i=0, cnt=0;
	while(1){
		i++;
		if(i == n)
			i = 0;
		if(a[i] == 0) continue;
		a[i]--;
		cnt++;
		if(cnt == k)
			break;
	}
	
	printf("%d", i+1);
	
	return 0;
}
