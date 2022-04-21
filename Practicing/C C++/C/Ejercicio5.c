//Imprimir en un arreglo los primeros 100 numeros de una secuencia fibonacci

#include <stdio.h>

int Secuencia[100];

int main(){
	
	Secuencia[0] = 0;
	Secuencia[1] = 1;
	int i = 0;
	
	//Se calcula
	for(i = 0; i < 100; i++){
		Secuencia[i + 2] = Secuencia[i] + Secuencia[i + 1];
	}
	
	//Se imprime la secuencia
	for(i = 0; i < 100; i++){
		printf("[%i]", Secuencia[i]);
	}
	printf("\n");
	
	system("pause");
	return 0;
	
}
