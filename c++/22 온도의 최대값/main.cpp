#include <iostream>
using namespace std;

int main() {

	int n, k;
	cin >> n >> k;
	
	int max=-2147000000, tmp;
	int a[n];
	for(int i=0; i<n; i++){
		cin >> a[i];
	}
	
	for(int i=0; i<n-1; i++){
		tmp = a[i] + a[i+1];
		if(tmp > max){
			max = tmp;
		}
	}
	
	cout << max;

	return 0;
}
