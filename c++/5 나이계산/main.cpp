#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	
	char a[20];
	int year, age;
	cin >> a;
	if(a[7] == '1' || a[7] == '2')
		year = 1900 + ((a[0]-48)*10 + (a[1]-48));
	else
		year = 2000 + ((a[0]-48)*10 + (a[1]-48));
	
	age = 2019 - year + 1;
	
	cout << age << " ";
	
	if(a[7] == '1' || a[7] == '3')
		cout << "M";
	else
		cout << "W";
	
	return 0;
}
