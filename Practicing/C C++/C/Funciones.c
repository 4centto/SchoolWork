//Calcular el numero mayor de dos numeros con una funcion

#include <stdio.h>

//Prototipo (Se puede considerar como una instacia de dicha funcion)
int Maxima();

//Funcion principal
int main(){
	
	int x = 3, y = 10;
	
	//Maxima(x, y); // Envia a x y a y como argumentos
	
	printf("El valor mayor es: %i. \n", Maxima(x, y));
	
	system("pause");
	return 0;
	
}

//Funcion
int Maxima(int x, int y){ // Recibe a x y a y como argumentos para utilizarlos

	int aux;

	if(x > y){
		aux = x;
	} else {
		aux = y;
	}
	
	return aux;
	
}
