// Ejercicio 1. Realiza un programa que imprima la suma de los números pares entre dos y mil.

#include <stdio.h>

//int main(){
	
//	int resultado = 0, i;
	
//	for(i = 2; i <= 2000; i++){
//		if((i % 2) == 0){
//			resultado += i;
//		}
//	}
	
//	printf("El resultado es: %i \n", resultado);
	
//	system("pause");
//	return 0;
	
//}

// Ejercicio 2. Realiza un programa que calcule la media de x numeros introducidos por teclado.

int main(){
	
	int nums = 0, i = 1, x = 0, aux = 0;
	
	printf("Introduce de cuantos numeros quieres calcular la media: ");
	scanf("%i", &nums);
	
	while(i <= nums){
		printf("Introduce el %i numero: ", i);
		scanf("%f", &x);
		
		aux += x;
		i ++;
	}
	
	float resultado = x / i;
	printf("La media es: %f \n", resultado);
	
	system("pause");
	return 0;
	
}
