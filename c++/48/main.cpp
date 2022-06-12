#include <iostream>
#include <stdlib.h>
using namespace std;

int main(int argc, char** argv) {
	
	int i, j, num[9][9], sum, avg, tmp, min, res;
	
	for(i=0; i<9; i++){
		for(j=0; j<9; j++)
			scanf("%d", &num[i][j]);
	}
	
	for(i=0; i<9; i++){
		sum=0;
		for(j=0; j<9; j++){
			sum += num[i][j];
		}
		avg = (sum/9.0)+0.5;
		min = 2147000000;
		for(j=0; j<9; j++){
			tmp = abs(avg - num[i][j]);
			if(min > tmp){
				min = tmp;
				res = num[i][j];
			}
			else if(tmp == min){
				if(num[i][j] > res)
					res = num[i][j];
			}
		}
		printf("%d %d\n", avg, res);
	}
	
	return 0;
}
