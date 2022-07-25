#include <iostream>
using namespace std;

int main() {

	int n, tmp=0;
	cin >> n;
	
	int num[n+1];
	for(int i=1; i<=n; i++){
		tmp =0;
		for(int j=1; j<=i; j++){
			if(i%j == 0){
				tmp++;
			}	
		}
		num[i] = tmp;
	}

	for(int i=1; i<=n; i++){
		cout << num[i] << " ";
	}

	return 0;
}
