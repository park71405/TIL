#include <iostream>
#include <string.h>
using namespace std;

int main(){
	
	char input1[100], input2[100], cnt=0;
	scanf("%s", &input1);
	scanf("%s", &input2);
	
	int len1 = strlen(input1);
	int len2 = strlen(input2);
	
	if(len1 != len2){
		printf("NO");
		return 0;
	}
	
	for(int i=0; i<len1; i++){
		for(int j=0; j<len2; j++){
			if(input1[i] == input2[j]){
				cnt++;
				input2[j] = 0;
				break;
			}
		}
	}	
	if(cnt == len1){
		printf("YES");
	}
	else{
		printf("NO");
	}
	
	return 0;
}
