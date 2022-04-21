//Hacer una estructura de estructuras de promedios de materias

#include <stdio.h>
#include <string.h>

typedef struct{
	float calificacion;
}Promedios;

typedef struct{
	char nombre[50];
	Promedios promedios[5];
}Materia;

int main(){
	
	int i = 0;
	float promedio = 0;
	char nombre[50];
	Materia materia;
	
	printf("Ingresa el nombre tu materia: ");
	fflush(stdin);
	fgets(nombre, 50, stdin);
	strcpy(materia.nombre, nombre);
	
	//Pedir los datos de las calificaciones de los alumnos
	for(i = 0; i < 5; i++){
		printf("-> Calificacion del alumno %i: ", i + 1);
		scanf("%f", &materia.promedios[i].calificacion);
	}
	printf("\n\n");
	printf("<-----------------------> \n");
	
	//Impresion de los datos
	for(i = 0; i < 5; i++){
		printf("Alumno %i: %f \n", i + 1, materia.promedios[i].calificacion);
	}
	
	//Impresion y obtencion del promedio
	for(i = 0; i < 5; i++){
		promedio += materia.promedios[i].calificacion;
	}
	
	promedio = promedio / 5;
	
	printf("El promedio grupal es: %f \n\n", promedio);
	
	system("pause");
	return 0;
	
}
