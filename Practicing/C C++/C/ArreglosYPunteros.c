//Introducir datos numericos a un arreglo mediante punteros

#include <stdio.h>

void funcion();
void leer();

int main(){
	
	int vec[3];
	
	funcion(vec);
	leer(vec);
	
	system("pause");
	return 0;
	
}

void funcion(int *vec){
	int i = 0;
	for(i = 0; i < 3; i++){
		printf("Introduce un valor para la posicion %i: ", i + 1);
		scanf("%i", (vec + i));
	}
}

void leer(int *vec){
	int i = 0;
	for(i = 0; i < 3; i++){
		printf("[%i]", *(vec + i));
	}
}

/*
Numeros aleatorios:
int NumerosAleatorios(){
	srand(time(NULL));
	int aux = rand()%6;
	return (rand + 1);
}
