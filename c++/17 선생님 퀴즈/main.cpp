#include <iostream>
using namespace std;

int main() {
	
	int n;
	cin >> n;
	
	string str[n];
	
	int a, b, tmp;
	for(int i=0; i<n; i++){
		cin >> a >> b;
		tmp = ((a+1)*a)/2;
		if(b == tmp){
			str[i] = "YES";
		}else
			str[i] = "NO";
	}
	
	for(int i=0; i<n; i++){
		cout << str[i] << endl;
	}
	
	return 0;
}
