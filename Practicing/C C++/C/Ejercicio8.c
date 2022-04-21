//Estructuras para materias y sus respectivos promedios

#include <stdio.h>
#include <string.h>

typedef struct{
	int promedio;
}Promedio;

typedef struct{
	Promedio promedio;
}Alumno;

typedef struct{
	char NombreMateria[50];
	Alumno alumno[5];
}Materia;

typedef struct{
	char NombreProfesor[50];
	Materia materia[2];
}Profesor;

typedef struct{
	Profesor profesor;
}Grupo;

Grupo grupo[2];

int i, j, k;

int main(){
	
	//Tomar datos
	for(i = 0; i < 2; i++){
		char nombre[50];
		char materia[50];
		
		//Nombre profesor
		printf("Profesor del grupo %i: ", i + 1);
		fflush(stdin);
		fgets(nombre, 50, stdin);
		
		strcpy(grupo[i].profesor.NombreProfesor, nombre);
		fflush(stdin);
		
		//Se obtienen los nombres de las materias
		for(j = 0; j < 2; j++){
			printf("Nombre de la materia %i: ", j + 1);
			fflush(stdin);
			fgets(materia, 50, stdin);
			
			strcpy(grupo[i].profesor.materia[j].NombreMateria, materia);
		}
		
		fflush(stdin);
		
		//Se obtiene el promedio de cada alumno en cada materia
		for(j = 0; j < 2; j++){
			for (k = 0; k < 5; k++){
				printf("Promedio del alumno %i en %s: ", k + 1, grupo[i].profesor.materia[j].NombreMateria);
				scanf("%i", &grupo[i].profesor.materia[j].alumno[k].promedio.promedio);
			}
		}
		
	}
	printf("\n\n");
	
	//Se imprimen los promedios
	for(i = 0; i < 2; i++){
		printf("%s", grupo[i].profesor.NombreProfesor);
		for(j = 0; j < 2; j++){
			printf("-%s", grupo[i].profesor.materia[j].NombreMateria);
			for(k = 0; k < 5; k++){
				
				printf("Alumno %i: %i. \n", k + 1, grupo[i].profesor.materia[j].alumno[k].promedio.promedio);
				
			}
			printf("-");
		}
		printf("\n<---------------------->\n");
	}
	
	system("pause");
	return 0;
	
}
