// 1. Calcular el factorial de dos numeros con una funcion

#include <stdio.h>

int Factorial();

int main(){
	
	int numeros[2], i = 0;
	
	printf("Dame dos numeros: \n");
	scanf("%i %i", &numeros[0], &numeros[1]);
	
	for(i = 0; i < 2; i++){
		printf("El factorial de %i es: %i. \n", numeros[i], Factorial(numeros[i]));
	}
	
	system("pause");
	return 0;
	
}

int Factorial(int numero){
	int i = 1, aux = 1;
	for(i = 1; i <= numero; i++){
		aux = aux * i;
	}
	return aux;
}
