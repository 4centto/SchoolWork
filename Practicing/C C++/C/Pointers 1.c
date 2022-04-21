//Pointers
/***
Un pointer es una variable que almacena la direccion en memoria de otra variable

	-> Declaracion: tipo *identificador;
	-> Operadores: 
		*: Acceso al contenido
		&: Obtencion de la direccion
	
Esto, es porque al enviar datos a funciones, la funcion crea una copia de los argumentos, y no trabaja con los valores originales, sino, 
con los de la copia.

**/

//Intercambiar dos numeros con punteros

#include <stdio.h>

void Intecambia(int *x, int *y);

int main(){
	
	int a = 7, b = 8;
	
	printf("A = %i y B = %i, \n", a, b);
	Intercambia(&a, &b);
	printf("A = %i y B = %i, \n", a, b);
	
	system("pause");
	return 0;
	
}

void Intercambia(int *x, int *y){
	int z;
	z = *x;
	*x = *y;
	*y = z;
}




