#include <iostream>
using namespace std; 
 
int main() {
	
	int n, t=0;
	cin >> n;
	
	int num[10];
	
	for(int i=1; i<=n; i++){
		int tmp = i;
		
		while(tmp > 0){
			t++;
			tmp = tmp/10;
		}
	}
	
	cout << t;
	
	return 0;
}
