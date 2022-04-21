//Arreglos
//Darle valor a un arreglo de 10 enteros y leerlos

#include <stdio.h>

int main(){
	
	int vector[10], i = 0;
	
	for(i = 0; i < 10; i++){
		printf("Dame el valor %i: ", i + 1);
		scanf("%i", &vector[i]);
	}
	
	printf("Usted ingreso: ");
	for(i = 0; i < 10; i++){
		printf("%i", vector[i]);
	}
	printf("\n");
	
	system("pause");
	return 0;
	
}
