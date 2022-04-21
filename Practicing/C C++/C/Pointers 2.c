//Intercambiar los valores con una funcion

#include <stdio.h>

void Cambio(int *a, int *b);

int main(){
	
	int x = 5, y = 10;
	
	Cambio(&x, &y);
	
	printf("x: %i , y: %i .\n", x, y);
	
	system("pause");
	return 0;
	
}

void Cambio(int *a, int *b){
	
	int aux;
	aux = *a;
	*a = *b;
	*b = aux;
	
}
