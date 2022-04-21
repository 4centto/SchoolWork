//Prueba Punteros Rapidisima
#include <stdio.h>

void Ingresar(int *arreglo);
void Imprimir(int *arreglo);

int i;

int main(){
	
	int a[] = {0, 0, 0, 0, 0};
	
	printf("Valor del arreglo: ");
	for(i = 0; i < 5; i++){
		printf("[%i]", a[i]);
	}
	printf("\n");
	
	//Ahora se envia a una funcion para que se le ingresen valores
	Ingresar(a);
	
	//Ahora se imprime el arreglo restante
	Imprimir(a);
	
	system("pause");
	return 0;
	
}

void Ingresar(int *arreglo){
	for(i = 0; i < 5; i++){
		printf("Dame el valor %i: ", i + 1);
		scanf("%i", (arreglo + i));
	}
	printf("\n");
}

void Imprimir(int *arreglo){
	printf("Nuevo arreglo: ");
	for(i = 0; i < 5; i++){
		printf("[%i]", *(arreglo + i));
	}
	printf("\n\n");
}
