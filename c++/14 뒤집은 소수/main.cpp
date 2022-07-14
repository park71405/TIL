#include <iostream>
using namespace std;

int reverse(int x){
	int sum=0, tmp;
	while(x > 0){
		tmp = x % 10;
		sum = sum*10 + tmp;
		x = x / 10;
	}
	return sum;
}

bool isPrime(int x){
	int i;
	for(i=2; i<=x/2; i++){
		if(x % i == 0){
			return false;
		}
	}
	return true;
}

int main() {
	
	int n;
	cin >> n;
	
	int tmp1, tmp2;
	bool tmp3;
	for(int i=1; i<=n; i++){
		cin >> tmp1;
		tmp2 = reverse(tmp1);
		tmp3 = isPrime(tmp2);
		if(tmp3){
			cout << tmp2 << " ";
		}
	}
	
	return 0;
}
