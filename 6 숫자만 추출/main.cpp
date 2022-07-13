#include <iostream>
using namespace std; 

int main() {
	
	string str;
	cin >> str;
	int sum=0;
	
	for(int i=0; i<str.size(); i++){
		if(str[i]>= 48 && str[i] <= 57){
			sum = sum*10 + (str[i]-48);
		}	
	}
	
	cout << sum;
	
	
	return 0;
}
