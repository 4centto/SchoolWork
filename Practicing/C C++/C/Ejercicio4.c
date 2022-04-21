//Multiplicar dos arreglos

#include <stdio.h>

int Uno[] = {1, 134, 14, 14, 2};
int Dos[] = {65, 2, 2, 3, 5};
int Producto[5];

int main(){
	
	int i;
	for(i = 0; i < 5; i++){
		printf("[%i]", Uno[i]);
	}
	printf("\n");
	for(i = 0; i < 5; i++){
		printf("[%i]", Dos[i]);
	}
	printf("\n");
	//Multiplicacion
	for(i = 0; i < 5; i++){
		Producto[i] = Uno[i] * Dos[i];
	}
	//Impresion
	for(i = 0; i < 5; i++){
		printf("[%i]", Producto[i]);
	}
	printf("\n");
	
	system("pause");
	return 0;
	
}
