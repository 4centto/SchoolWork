//Bloque 1.4: Operaciones con Variables

#include <stdio.h>
#define PI 3.141516

int main(){
	
	const int x = 5;
	int y;
	
	printf("El valor de x es: %i\n", x);
	printf("Dame el valor de y: \n");
	scanf("%i", &y);
	
	int resultado = x * y;
	
	printf("EL resultado es: %i\n", resultado);
	
	system("pause");
	return 0;
	
}
