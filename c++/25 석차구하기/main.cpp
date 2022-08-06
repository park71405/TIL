#include <iostream>
#include <algorithm>
using namespace std;

int main() {

	int n, i, j;
	cin >> n;
	
	int a[n];
	for(i=0; i<n; i++){
		cin >> a[i];
	}
	
	int b[n];
	for(i=0; i<n; i++){
		b[i] = n;
		for(j=0; j<n; j++){
			if(i == j)
				continue;
			if(a[i] >= a[j]){
				b[i]--;
			}
		}
	}
	
	for(i=0; i<n; i++){
		cout << b[i] << " ";
	}

	return 0;
}
