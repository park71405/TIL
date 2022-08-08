#include <iostream>
#include <algorithm>
using namespace std;
 
int main() {
	
	int n;
	cin >> n;
	
	int a[n], i;
	for(i=0; i<n; i++){
		cin >> a[i];
	}
	
	sort(a, a+n);
	
	int t=1;
	for(i=n-1; i>0; i--){
		if(a[i] != a[i-1]){
			t++;
		}
		if(t == 3){
			cout << a[i-1];
			break;
		}
	}
	
	return 0;
}
