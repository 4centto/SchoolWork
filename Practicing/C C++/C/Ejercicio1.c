// Dado el radio de un circulo calcular el area y la circunferencia

#include <stdio.h>
#include <math.h>
#define PI 3.141516

int radio = 0;

int main(){
	
	printf("Cual es el radio del circulo? ");
	scanf("%i", &radio);
	
	printf("El Area es: %f. \n", PI * pow(radio, 2));
	printf("La circunferencia es: %f.\n", PI * radio * 2);
	
	system("pause");
	return 0;
	
}
