//Estructuras de Estructuras
#include <stdio.h>
#include <string.h>

typedef struct{
	char nombre[50];
	int paginas;
	float precio;
}Libro;

typedef struct{
	Libro libro[10];
	int lleno_repisa;
}Repisa;

void consultar();
void anadir();

Repisa repisa;
int contador = 0;
int libros_dentro = 0;

int main(){
	
	int seleccion = 0;
	
	do{
		
		printf(" * �Que deseas hacer? * \n");
		printf(" 1. Consultar libros \n");
		printf(" 2. Anadir libro \n");
		scanf("%i", &seleccion);
		
		if(seleccion == 1){
			consultar();
		} else if(seleccion = 2){
			anadir();
		} else {
			printf("La opcion ingresada no existe \n\n");
		}
		
	} while(seleccion < 1 || seleccion > 2);
	
	system("pause");
	return 0;
	
}

void consultar(){
	int i = 0, j = 0;
	for(i = 0; i < libros_dentro; i++){

		printf("\n");
		printf("<---------------------------------------->");
		printf("%s", repisa.libro[i].nombre);
		printf("Paginas: %i \n", repisa.libro[i].paginas);
		printf("Costo: $%f \n", repisa.libro[i].precio);
		printf("<----------------------------------------> \n");
		printf("\n");
		
	}
	main();
}

void anadir(){
	int i = 0, j = 0, aux = 0;
	
	if(repisa.lleno_repisa <= 10){
	
		for(i = contador; i < 10 && aux == 0; i++){
			
			char nombre[50];
			int paginas = 0;
			float costo = 0;
			
			printf("Nombre del Libro: ");
			fflush(stdin);
			fgets(nombre, 50, stdin);
			
			printf("Paginas: ");
			fflush(stdin);
			scanf("%i", &paginas);
			
			printf("Costo: ");
			fflush(stdin);
			scanf("%f", &costo);
			
			strcpy(repisa.libro[i].nombre, nombre);
			repisa.libro[i].paginas = paginas;
			repisa.libro[i].precio = costo;
			repisa.lleno_repisa ++;
			aux = 1;
		}
		
		contador ++;
		libros_dentro ++;
	
	} else {
		printf("Compra una nueva repisa \n");
	}
	main();
}
