//Insertar y eliminar elementos en un array

#include <stdio.h>

int seleccion = 0, i, j;
int arreglo[10];
int numero = 0, aux = 0;

int main(){
	
	while(seleccion != 3){
		
		printf("1. Insertar \n");
		printf("2. Eliminar \n");
		printf("3. Salir \n");
		
		for(i = 0; i < 10; i++){
			printf("[%i]", arreglo[i]);
		}
		printf("\n\n");
		
		printf("¿Que deseas hacer? \n");
		scanf("%i", &seleccion);
		printf("\n");
		
		switch(seleccion){
			case 1:
				printf("Dame tu numero: ");
				scanf("%i", &numero);
				for(i = 0; i < 10 && aux == 0; i++){
					if(arreglo[i] == NULL){
						arreglo[i] = numero;
						aux = 1;
					}
				}
				aux = 0;
				break;
				
			case 2:
				printf("Dame tu numero: ");
				scanf("%i", &numero);
				// Se busca el numero
				for(i = 0; i < 10 && aux == 0; i++){
					if(arreglo[i] == numero){
						arreglo[i] = 0;
						//Se recorren los numeros
						for(j = i; j < (10 - i) ; j++){
							if(arreglo[j + 1] != NULL){
								arreglo[j] = arreglo[j + 1];
								arreglo[j + 1] = 0;
							}
						}
					}
				}
				aux = 0;
				break;
				
			case 3:
				printf("\n\n");
				break;
				
			default:
				printf("La opcion no existe, vuelve a intentarlo :( \n");
		}
		
		
	}
	
	system("pause");
	return 0;
	
}
