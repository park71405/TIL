#include <iostream>
using namespace std;

int main() {

	int a_sum=0, b_sum=0;
	
	int i, a[10], b[10], t;
	for(i=0; i<10; i++){
		cin >> a[i];
	}
	for(i=0; i<10; i++){
		cin >> b[i];
	}
	
	t = -1;
	for(i=0; i<10; i++){
		if(a[i] == b[i]){
			a_sum++;
			b_sum++;
		}else if(a[i] > b[i]){
			a_sum += 3;
			t = i;
		}else{
			b_sum += 3;
			t = i;
		}
	}
	
	cout << a_sum << " " << b_sum << endl;
	if(a_sum == b_sum){
		if(t == -1){
			cout << "D";
		}else{
			if(a[t] > b[t])
				cout << "A";
			else
				cout << "B";
		}
	}
	else if(a_sum > b_sum)
		cout << "A";
	else
		cout << "B";

	return 0;
}
