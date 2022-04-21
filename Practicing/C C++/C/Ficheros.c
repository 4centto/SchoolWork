//Ficheros

#include <stdio.h>

int main(){
	
	//Abrir y cerra fichero
	char aux;
	char aux2[100];
	FILE *f;
	f = fopen("Ficheros.txt", "r");
	
	if(f == NULL){
		
		printf("No se ha podido abrir el fichero");
		exit(1);
		
	} else {
		
		while(aux != EOF){ // Empieza a Programar EOF (En Of File)
		
			aux = fgetc(f);
			printf("%c", aux);
		}
		
		printf("\n");
		fclose(f);
	}
	
	f = fopen("Ficheros.txt", "r");
	
	if(f == NULL){
		
		printf("No se ha podido abrir el fichero");
		exit(1);
		
	} else {
		
		while(!feof(f)){ // Empieza a Programar EOF (En Of File)
		
			fgets(aux2, 100, f);
			printf("%s", aux2);
		
		}
		
		printf("\n");
		fclose(f);

	}

	system("pause");
	return 0;
	
}
