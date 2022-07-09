#include <iostream>
using namespace std;

int main() {
	
	int n, i;
	cin >> n;
	
	int a[n];
	for(i=0; i<n; i++)
		cin >> a[i];
	
	int max = a[n-1], cnt=0;
	for(i=n-2; i>=0; i--){
		if(a[i] >= max){
			max = a[i];
			cnt++;
		}
	}
	
	cout << cnt;
	
	return 0;
}
