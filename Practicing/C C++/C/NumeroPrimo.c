//Saber si un numero es primo

#include <stdio.h>

int main(){
	
	int n = 0, i = 0;
	
	printf("Dame un numero entero: ");
	scanf("%i", &n);
	
	for(i = 0; i <= n; i++){
		if((i % 2) == 0){
			printf("El numero %i NO es primo. \n", i);
		} else {
			printf("El numero %i es primo. \n", i);
		}
	}
	
	system("pause");
	return 0;
	
}
