// Dado un array de numeros enteros, imprimir la suma de todos

#include <stdio.h>

int ListaNumeros[10];

int main(){
	
	int i, suma = 0;
	
	for(i = 0; i < 10; i++){
		printf("Dame el valor %i: ", i + 1);
		scanf("%i", &ListaNumeros[i]);
		suma += ListaNumeros[i];
	}
	
	//Impresion
	for(i = 0; i < 10; i++){
		printf("[%i]", ListaNumeros[i]);
	}
	printf("\n");
	
	//Impresion de la suma
	printf("La suma es: %i. \n", suma);
	
	system("pause");
	return 0;
	
}
