// Bucles

#include <stdio.h>

int main(){
	
	int x, y;
	
	printf("Dame el primer valor: ");
	scanf("%i", &x);
	
	printf("Dame el segundo valor: ");
	scanf("%i", &y);
	
	if(x > y){
		int i = 0;
		for(i = y; i <= x; i++){
			printf("%i \n", i);
		}
	} else if(x < y){
		while(y >= x){
			printf("%i \n");
			y--;
		}
	} else {
		printf("Son iguales \n\n");
	}
	
	system("pause");
	return 0;
	
}
