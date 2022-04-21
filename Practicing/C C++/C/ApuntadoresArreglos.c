//Apuntadores con arreglos

#include <stdio.h>

void LlenadoDeArreglo(int *arreglo, int longitud);
void Impresion(int *arreglo);

int main(){
	
	int a[5];
	
	LlenadoDeArreglo(a, 5);
	printf("\n\n");
	Impresion(a);
	
	system("pause");
	return 0;
	
}

void LlenadoDeArreglo(int *arreglo, int longitud){
	int i;
	for(i= 0; i < longitud; i++){
		printf("Dame el valor %i: ", i + 1);
		scanf("%i", (arreglo + i));
	}
	
}

void Impresion(int *arreglo){
	int i;
	for(i = 0; i < 5; i++){
		printf("El valor %i es: %i. \n", i + 1, *(arreglo + i));
	}
}
