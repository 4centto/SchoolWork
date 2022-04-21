//Vcetores de Estructuras y Ejemplo de Traductos Ingles/Español

#include <stdio.h>
#include <string.h>
#define N 50

typedef struct{
	char eng[N];
	char spn[N];
	int lleno;
}Traductor;

Traductor trad[N];

void anadir();
void traducir();
void vacio();
void tradu();

int main(){
	
	int op;
	char key;
	
	vacio();
	
	do{
		
		do{
			
			printf("¿Que deseas hacer? \n");
			printf("\t1. Anadir palabras al traductor \n");
			printf("\t2. Buscar traduccion de una palabra \n");
			scanf("%i", &op);
			
		} while(op < 1 || op > 2);
		
		switch(op){
			
			case 1:
				anadir();
				break;
				
			case 2:
				traducir();
				break;
		}
		
		printf("Introduce si deseas realizar otra opcion: (S/N) \n\n");
		scanf("%c", &key);
		
	} while(key == 'S' || key == 's');
	
	system("pause");
	return 0;
	
}

void anadir(){
	int i = 0, aux = 0;
	for(i = 0; i < N && aux == 0; i++){
		if(trad[i].lleno == 0){
			printf("Introduce la palabra en Ingles: ");
			fflush(stdin);
			fgets(trad[i].eng, N, stdin);
			cambio(trad[i].eng);
			
			printf("Introduce la palabra en Espanol: ");
			fflush(stdin);
			fgets(trad[i].spn, N, stdin);
			cambio(trad[i].spn);
			
			trad[i].lleno = 1;
			aux = 1;
		}
	}
}

void cambio(char palabra[N]){
	int i = 0;
	for(i = 0; i < N; i++){
		if(palabra[i] == '\n'){
			palabra[i] = '.';
		}
	}
}

void traducir(){
	int op;
	do{
			
		printf("¿Que deseas hacer? \n");
		printf("\t1. Traducir de Ingles-Espanol \n");
		printf("\t2. Traducir de Espanol-Ingles \n");
		scanf("%i", &op);
			
	} while(op < 1 || op > 2);
		
	switch(op){
			
		case 1:
			tradu(op);	
			break;
				
		case 2:
			tradu(op);
			break;
	}
}

void tradu(int op){
	int i = 0, j = 0, temp = 0;
	char aux[N];
	
	printf("Introduce la palabra que deseas buscar: ");
	fflush(stdin);
	fgets(aux, N, stdin);
	cambio(aux);
	
	if(op == 1){ // Buscar en inlges
		for(i = 0; i < N && temp == 0; i++){
			j = strcmp(aux, trad[i].eng);
			if(j == 0){
				printf("La traduccion de %s es %s. \n", trad[i].eng, trad[i].spn);
				temp = 1;
			}
		}
	} else { // Buscar en español
		for(i = 0; i < N && temp == 0; i++){
			j = strcmp(aux, trad[i].spn);
			if(j == 0){
				printf("La traduccion de %s es %s. \n", trad[i].spn, trad[i].eng);
				temp = 1;
			}
		}
	}
}

void vacio(){
	int i = 0;
	for(i = 0; i < N; i++){
		trad[i].lleno = 0;
	}
}
