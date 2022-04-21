//Calcular el factorial de un numero

#include <stdio.h>

int main(){
	
	int x = 0, i, resultado = 1;
	
	printf("Dame el numero: ");
	scanf("%i", &x);
	
	for(i = 1; i <= x; i++){
		resultado = resultado * i;
	}
	
	printf("El factorial de %i es: %i \n", x, resultado);
	
	system("pause");
	return 0;
	
}
