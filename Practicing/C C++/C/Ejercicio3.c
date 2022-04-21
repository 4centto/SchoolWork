// Determinar cuentas veces se repite un numero dentro de un arreglo

#include <stdio.h>
#include <string.h>

int ListaNumeros[10];

int main(){
	
	int i, num = 0, acum = 0;
	
	//Llenado
	for(i = 0; i < 10; i++){
		srand(time(NULL));
		int aux = (rand()%10) + 1;
		ListaNumeros[i] = aux;
	}
	
	//Impresion
	for(i = 0; i < 10; i++){
		printf("[%i]", ListaNumeros[i]);
	}
	printf("\n");
	
	printf("\nDame un numero: ");
	scanf("%i", &num);
	
	for(i = 0; i < 10; i++){
		if(ListaNumeros[i] == num){
			acum ++;
		}
	}
	
	printf("El %i se encuentra %i veces", num, acum);
	
	system("pause");
	return 0;
	
}
