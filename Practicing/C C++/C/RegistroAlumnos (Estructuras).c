//Crear un formulario de registro
// OJO!! No funciona del todo bien, puede haber mejoras pero todavia no las encuentro

#include <stdio.h>
#include <string.h>

typedef struct{
	char nombre[50];
	char Materias[8][50];
	float promedio[8];
}Alumnos;

int main(){
	
	int i, j, cant = 0;
	
	printf("¿Cuantos alumnos seran ingresados? ");
	scanf("%i", &cant);
	
	Alumnos alumnos[cant];
	
	//Se piden los datos del alumno
	for(i = 0; i < cant; i++){
		
		char nombre[50];
		fflush(stdin);
		printf("Nombre del Alumno: ");
		fgets(nombre, 50, stdin);
		
		strcpy(alumnos[i].nombre, nombre);
		
		printf("* Materias  \n");
		
		// Se piden las materias y su promedio
		for(j = 0; j < 8; j++){
			
			char materia[50];
			float promedio = 0;
			
			fflush(stdin);
			printf("Materia %i: ", j + 1); // Materias
			fgets(materia, 50, stdin);
			
			fflush(stdin);
			printf("Promedio de %s: ", materia);
			scanf("%f", &promedio);
			
			strcpy(alumnos[i].Materias[j], materia);
			alumnos[i].promedio[j] = promedio;
		}
		
	}
	
	//Impresion de los datos
	for(i = 0; i < 2; i++){
		printf("> %s <", alumnos[i].nombre);
		printf("\n");
		for(j = 0; j < 8; j++){
			printf(" %s : %f", alumnos[i].Materias[j], alumnos[i].promedio[j]);
			printf("\n");
		}
	}
	
	system("pause");
	return 0;
	
}
