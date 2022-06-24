#include <iostream>
#include <algorithm>
using namespace std;
 
int main() {
	
	int n, m, i;
	cin >> n;
	
	int a[n];
	
	for(i=0; i<n; i++){
		cin >> a[i];
	}
	sort(a, a+n);
	
	cin >> m;
	
	int b[m];
	
	for(i=0; i<m; i++){
		cin >> b[i];
	}
	sort(b, b+m);
	
	int c[n+m];
	
	int p1=0, p2=0, p3=0;
	while(p1 < n && p2 < m){
		if(a[p1] == b[p2]){
			c[p3++] = a[p1++];
			p2++;
		}else if(a[p1] < b[p2]){
			p1++;
		}else
			p2++;
	}
	
	for(i=0; i<p3; i++){
		cout << c[i] << " ";
	}
	
	return 0;
}
