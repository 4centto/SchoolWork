//Estructuras

#include <stdio.h>
#include <string.h>

typedef struct{ // Agrupa distintos tipos de variables
	char Nombre[50];
	int paginas;
	float precio;
}libro; // <------------------------------------> //
                                                  //
int main(){                                       //
                                                  //	
	int i;                                        //
	libro LBS[2]; // Se declara la variable tipo libro (2 libros que contienen cada uno Nombre, Paginas y Precio).
	
	//Insertar Valores
	for(i = 0; i < 2; i++){
		int paginas = 0;
		float precio = 0.0;
		char Nombre[50];
		
		fflush(stdin);
		
		printf("¿Cual es el nombre del libro %i? ", i + 1);
		fgets(Nombre, 50, stdin);
		
		printf("¿Cuantas paginas tiene el libro %i? ", i + 1);
		scanf("%i", &paginas);
		
		printf("¿Cuanto cuesta el libro %i? ", i + 1);
		scanf("%f", &precio);
		
		printf("\n");
		
		strcpy(LBS[i].Nombre, Nombre); // Se asigna el nombre
		LBS[i].paginas = paginas; // Se asignan las paginas
		LBS[i].precio = precio; // Se asigna el precio del libro		
	}
	
	//Leer valores
	for(i = 0; i < 2; i++){
		printf("* %s \n", LBS[i].Nombre); // Se imprime el nombre
		printf("* Paginas: %i. \n", LBS[i].paginas); // Se imprimen las paginas
		printf("* Costo: $%f. \n", LBS[i].precio); // Se imprime el precio
		printf("\n\n");
	}
	
	system("pause");
	return 0;
	
}
