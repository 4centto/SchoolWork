// Metodo 1.6: Ordenamietno por metodo burbuja.
// Intercambiar los valores de dos numeros enteros introducidos por teclado

#include <stdio.h>

int main(){
	
	int x, y, z;
	
	printf("Dame el valor de x: ");
	scanf("%i", &x);
	
	printf("Dame el valor de y: ");
	scanf("%i", &y);
	
	z = x;
	x = y;
	y = z;
	
	printf("El valor de x es: %i\n", x);
	printf("El valor de y es: %i\n", y);
	
	
	system("pause");
	return 0;
	
}
