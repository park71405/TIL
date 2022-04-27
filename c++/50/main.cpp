#include <iostream>
using namespace std;

int main(int argc, char** argv) {

	int h, w, i, j, tmp, sum, a, b, x, y, max;
	scanf("%d %d", &h, &w);
	
	int num[h][w];
	
	for(i=0; i<h; i++){
		for(j=0; j<w; j++){
			scanf("%d", &num[i][j]);
		}
	}
	
	scanf("%d %d", &a, &b);
	max = 0;
	for(i=0; i<h-a+1; i++){
		for(j=0; j<w-b+1; j++){
			tmp = 0;
			for(x=i; x<i+a; x++){
				for(y=j; y<j+b; y++){
					tmp += num[x][y];
				}
			}
			if(tmp > max){
				max = tmp;
			}
			
		}
	}
	
	printf("%d", max);

	return 0;
}
