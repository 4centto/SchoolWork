//Pruebas de punteros

#include <stdio.h>

void CalculraDistancia(int *x, int *y);

int main(){
	
	int x, y;
	
	printf("Dame el valor de x: ");
	scanf("%i", &x);
	
	printf("Dame el valor de y: ");
	scanf("%i", &y);
	
	printf("\n");
	
	CalcularDistancia(&x, &y);
	
	printf("El nuevo valor de x es: %i. \n", x);
	printf("El nuevo valor de y es: %i. \n", y);
	
	system("pause");
	return 0;
	
}

void CalcularDistancia(int *x, int *y){
	int newX, newY;
	
	printf("Dame el nuevo valor de x: ");
	scanf("%i", &newX);
	printf("Dame el nuevo valor de y: ");
	scanf("%i", &newY);
	
	*x = newY;
	*y = newX;
	
}
