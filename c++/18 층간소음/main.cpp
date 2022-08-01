#include <iostream>
using namespace std;

int main() {
	
	int n, m;
	cin >> n >> m;
	
	int tmp, cnt=0, flag=0, max = -1;
	for(int i=1; i<=n; i++){
		cin >> tmp;
		if(tmp > m){
			if(flag == 0){
				cnt = 1;
				flag = 1;
			}else{
				cnt++;
			}
		}else{
			flag = 0;
		}
		if(cnt > max){
			max = cnt;
		}
	}
	
	cout << max;
	
	return 0;
}
