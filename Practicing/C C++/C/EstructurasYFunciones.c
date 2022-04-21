//Estructuras en funciones

#include <stdio.h>

typedef struct{
	int matematicas;
	int ingles;
	int fisica;
}Notas;

void darnotas(Notas *notas);

int main(){
	
	Notas notas[3];
	darnotas(notas);
	
	printf("Matematicas: %i. \n", notas[0].matematicas);
	printf("Ingles: %i. \n", notas[0].ingles);
	printf("Fisica: %i. \n", notas[0].fisica);
	
	system("pause");
	return 0;
	
}

void darnotas(Notas notas[]){
	printf("Introduzca la nota de matematicas: ");
	scanf("%i", &notas[0].matematicas);
	printf("Introduzca la nota de ingles: ");
	scanf("%i", &notas[0].ingles);
	printf("Introduzca la nota de fisica: ");
	scanf("%i", &notas[0].fisica);
	
	printf("Matematicas: %i. \n", notas[0].matematicas);
	printf("Ingles: %i. \n", notas[0].ingles);
	printf("Fisica: %i. \n", notas[0].fisica);
}
