#include <iostream>
#include <algorithm>
using namespace std;
 
int main() {

	int n;
	cin >> n;
	int a[n+1], b[n];
	int i;
	for(i=1; i<=n; i++){
		cin >> a[i];
	}
	
	int tmp;
	for(i=1; i<n; i++){
		tmp = a[i] - a[i+1];
		tmp = abs(tmp);
		b[tmp] = 1;
	}
	
	for(i=1; i<n; i++){
		if(b[i] != 1){
			cout << "NO";
			return 0;
		}
	}
	cout << "YES";

	return 0;
}
