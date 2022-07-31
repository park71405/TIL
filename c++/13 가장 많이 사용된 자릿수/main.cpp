#include <iostream>
using namespace std;

int num[10];

int main() {
	
	int n;
	
	cin >> n;
	
	int tmp;
	while(n > 0){
		tmp = n % 10;
		num[tmp]++;
		n = n/10;
	}
	
	int max = 0, t;
	for(int i=0; i<10; i++){
		if(max < num[i]){
			max = num[i];
			t = i;
		}
	}
	
	cout << t;
	
	return 0;
}
