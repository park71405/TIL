#include <iostream>
using namespace std;

int digit_sum(int num){
	int tmp, sum=0;
	while(num > 0){
		tmp = num%10;
		sum += tmp;
		num = num/10;
	}
	return sum;
}

int main() {
	
	int n;
	cin >> n;
	int num, sum, res, max = -2147000000;
	int i;
	for(i=1; i<n; i++){
		cin >> num;
		sum = digit_sum(num);
		if(sum > max){
			max = sum;
			res = num;
		}else if(sum == max){
			if(num > res)
				res = num;
		}
	}
	
	cout << res;
	
	return 0;
}
