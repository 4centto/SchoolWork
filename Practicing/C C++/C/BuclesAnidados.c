//Bucles anidados y como utilizarlos

#include <stdio.h>

int main(){
	
	int i, j;
	
	for(i = 1; i <= 10; i++){
		printf("Tabla del %i: \n", i);
		for(j = 1; j <= 10; j++){
			printf("%i x %i = %i \n", i, j, i * j);
		}
		printf("\n");
	}
	
	system("pause");
	return 0;
	
}
