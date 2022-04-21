//Bloque 1.3: Variables

#include <stdio.h>

int main(){
	//Las variables siempre hay que dclararlas antes de usarlas
	int x; // Un entero es un numero sin decimales
	float y; // Un flotante es un numero con varios decimales
	double y2; //Un flotante mas largo
	char z;
	
	y = 5.0; // 2^16
	x = 5; // 2 ^32
	y2 = 20.9; // 2^64
	z = 'a';
	
	printf("Valor de x: %i\nValor de y: %f\nValor de y2: %f\nValor de z: %c\n", x, y, y2, z);


	return 0;
	
}
