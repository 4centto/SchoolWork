//Pointers con arrays
//Introducir valores numericos en un array mediante punteros

#include <stdio.h>

int i;

void Funcion();
void Leer();

int main(){
	
	int vec[3];
	
	Funcion(vec);
	Leer(vec);
	
	system("pause");
	return 0;
	
}

void Funcion(int *vec){
	for(i = 0; i < 3; i++){
		printf("Introduce el valor %i: ", i + 1);
		scanf("%i", (vec + i)); // Cuando se introducen valores en arreglos no es necesario el *
	}
}

void Leer(int *vec){
	for(i = 0; i < 3; i++){
		printf("[%i]", *(vec + i)); // Cuando se leen archivos de un arreglo, si es necesario usar el *
	}
	printf("\n");
}
