//Realiza un programa en C que lea un numero entero entre 1 y 4 y devuelva el dia de la
//semana correspondiente. Para 1 lunes, para 2 martes, etc.

#include <stdio.h>

int main(){
	
	int dia = 1;
	
	printf("Dame el dia de la semana: ");
	scanf("%i", &dia);
	
	switch(dia){
			case 1:
				printf("Lunes \n");
				break;
			case 2:
				printf("Martes \n");
				break;
			case 3:
				printf("Miercoles \n");
				break;
			case 4:
				printf("Jueves \n");
				break;
			case 5:
				printf("Viernes \n");
				break;
	}
	
	system("pause");
	return 0;
	
}
