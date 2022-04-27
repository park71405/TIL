#include <iostream>
using namespace std;

void ss(int n, int i){
	if(n == i){
		printf("%d", n);
	}
	else{
		printf("%d ", i);
		i++;
		ss(n, i);	
	}
}

int main(int argc, char** argv) {

	int n, i;
	scanf("%d", &n);
	
	ss(n, 1);

	return 0;
}
