#include <iostream>
using namespace std;

int main() {

	int n, i, j;
	cin >> n;
	
	int a[n];
	for(i=0; i<n; i++){
		cin >> a[i];
	}
	
	int tmp;
	for(i=0; i<n; i++){
		tmp =1;
		for(j=i-1; j>=0; j--){
			if(a[i] < a[j])
				tmp++;
		}
		cout << tmp << " ";
	}

	return 0;
}
