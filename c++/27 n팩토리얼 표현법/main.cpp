#include <iostream>
#include <vector>
using namespace std;

int main() {

	int n, i, j, tmp;
	cin >> n;
	
	vector<int> ch(n+1);
	
	for(i=2; i<=n; i++){
		tmp = i;
		j = 2;
		while(1){
			if(tmp % j == 0){
				ch[j]++;
				tmp = tmp/j;
			}else
				j++;
			if(tmp == 1)
				break;
		}
	}
	
	cout << n << "! = ";
	for(j=2; j<=n; j++){
		if(ch[j] != 0)
			cout << ch[j] << " ";
	}
	

	return 0;
}
