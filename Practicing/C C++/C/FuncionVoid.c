// Funciones tipo void

#include <stdio.h>

void Factorial();

int main(){
	
	Factorial();
	
	system("pause");
	return 0;
	
}

void Factorial(){
	int x = 5, i = 1, resultado = 1;
	for(i = 1; i <= x; i++){
		resultado = resultado * i;
	}
	printf("El factorial de %i es: %i. \n", x, resultado);
}
