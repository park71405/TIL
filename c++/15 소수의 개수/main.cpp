#include <iostream>
using namespace std;

int main() {
	
	int n, cnt=0;
	cin >> n;
	
	int flag=0;
	for(int i=2; i<=n; i++){
		flag = 0;
		for(int j=2; j*j<=i; j++){
			if(i%j == 0){
				flag =1;
				break;
			}
		}
		if(flag == 0){
			cnt++;
		}
	}
	
	cout << cnt;
	
	return 0;
}
