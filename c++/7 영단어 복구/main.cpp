#include <iostream>
#include <stdio.h>
using namespace std; 

int main() {
	
	char a[101], b[101];
	gets(a);
	int p=0;
	
	for(int i=0; a[i]!='\0'; i++){
		if(a[i] != ' '){
			if(a[i] >= 65 && a[i] <= 90){
				b[p++] = a[i] + 32;
			}
			else b[p++] = a[i];
		}
	}
	
	b[p] = '\0';
	
	cout << b;
	
	return 0;
}
