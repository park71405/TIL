#include <iostream>
using namespace std;

int main() {
	
	int n;
	cin >> n;
	
	int i, j, a[n], idx, tmp;
	
	for(i=0; i<n; i++)
		cin >> a[i];
	
	for(i=0; i<n; i++){
		idx = i;
		for(j=i+1; j<n; j++){
			if(a[j] < a[idx])
				idx = j;
		}
		tmp = a[i];
		a[i] = a[idx];
		a[idx] = tmp;
	}
	
	for(i=0; i<n; i++){
		cout << a[i] << " ";
	}
	
	return 0;
}
