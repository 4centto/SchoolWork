//Bloque 2.1: Estructuras selectivas.

#include <stdio.h>

int main(){
	
	int x = 0, y = 0, z = 0;
	
	printf("Dame el 1er valor: ");
	scanf("%i", &x);
	
	printf("Dame el 2do valor: ");
	scanf("%i", &y);
	
	printf("Dame el 3er valor: ");
	scanf("%i", &z);
	
	if(x > y && x > z){
		printf("%i es el mayor valor", x);
	} else if(y > z){
		printf("%i es el mayor valor", y);
	} else {
		printf("%i es el mayor valor", z);
	}
}
