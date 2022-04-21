//Secuencia Fibonacci
#include <stdio.h>

int main(){
	
	int uno = 0, dos = 1, aux = 0, stop = 0, i = 0;
	
	printf("¿Cual valor de la secuencia quieres saber? ");
	scanf("%i", &stop);
	
	printf("%i, %i, ", uno, dos);
	for(i = 0; i <= stop - 3; i++){
		aux = uno + dos;
		printf("%i, ", aux);
		uno = dos;
		dos = aux;
	}
	
	//printf("El valor %i de la sucesion es: %i \n\n", stop, aux);
	
	system("pause");
	return 0;
	
}
