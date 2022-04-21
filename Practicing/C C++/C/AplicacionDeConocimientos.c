//Bloque 1.5: Aplicacion de conocimientos.

#include <stdio.h>
#include <math.h>

int main(){
	
	int x = 10, y = 2;
	
	//Operaciones basicas
	
	x += y;
	printf("El valor de x + y: %i\n", x);
	
	x -= y;
	printf("El valor de x - y: %i\n", x);
	
	x *= y;
	printf("El valor de x * y: %i\n", x);
	
	x /= y;
	printf("El valor de x / y: %i\n", x);
	
	//x = x % y;
	//printf("El resto de x / y: %i\n", x);
	
	x = pow(y, x);
	printf("El valor de x ** y: %i\n", x);
	
	x = sqrt(x);
	printf("La raiz cuadrada de x: %i\n", x);
	
	//Operadores de incremento
	x++;
	printf("El valor de x++: %i\n", x);
	
	x--;
	printf("El valor de x--: %i\n", x);
	
	system("pause");
	return 0;
	
}
