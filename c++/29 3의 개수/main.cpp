#include <iostream>
using namespace std;

int main() {
	
	int n, i;
	cin >> n;
	
	int tmp, t, cnt=0;
	for(i=1; i<n; i++){
		tmp = i;
		while(tmp > 0){
			t = tmp%10;
			tmp = tmp / 10;
			if(t == 3){
				cnt++;
			}
		}
	}
	cout << cnt;
	
	return 0;
}
