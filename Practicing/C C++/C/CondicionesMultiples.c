//Condiciones multiples y ejercicio

#include <stdio.h>

int main(){
	
	int h, min, seg;
	
	printf("Introduce horas: ");
	scanf("%i", &h);
	
	printf("Introduce minutos: ");
	scanf("%i", &min);
	
	printf("Introduce segundos: ");
	scanf("%i", &seg);
	
	if(h <= 23 && min <= 59 && seg <= 59){
		seg ++;
		
		if(seg == 60){
			min++;
			seg = 0;
		}
		
		if(min == 60){
			h++;
			min = 0;
		}
		
		if(h == 24){
			h = 0;
		}
		
		printf("La hora es %i:%i:%i \n\n", h, min, seg);
	} else {
		printf("La hora no es correcta \n\n");
	}
	
	system("pause");
	return 0;
	
}
