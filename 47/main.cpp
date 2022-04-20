#include <iostream>
using namespace std;

int main(){
	
	int n, i, j, sum;
	scanf("%d", &n);
	
	int a[n+2][n+2];
	
	for(i=1; i<=n; i++){
		for(j=1; j<=n; j++){
			scanf("%d", &a[i][j]);
		}
	}
	
	for(i=0; i<n+2; i++){
		a[0][i] = 0;
		a[n+1][i] = 0;
		a[i][0] = 0;
		a[i][n+1] = 0;	
	}
	
	sum =0;
	
	for(i=1; i<n+1; i++){
		for(j=1; j<n+1; j++){
			if(a[i-1][j] < a[i][j] && a[i+1][j] < a[i][j]){
				if(a[i][j-1] < a[i][j] && a[i][j+1] < a[i][j]){
					sum++;
				}
			}
		}
	}
	printf("%d", sum);
	
	
	return 0;
}
