#include <iostream>
using namespace std;

int main() {

	int n;
	cin >> n;
	
	int a[n];
	int i;
	for(i=0; i<n; i++){
		cin >> a[i];
	}
	
	int max = -1, cnt=0, t, flag=0;
	for(i=1; i<n; i++){
		if(a[i-1] <= a[i]){
			if(flag == 0){
				cnt = 1;
				flag = 1;
			}else{
				flag = 1;
				cnt++;
			}
		}else{
			flag = 0;
		}
		if(cnt > max){
			max = cnt;
		}
	}
	
	cout << max+1;

	return 0;
}
