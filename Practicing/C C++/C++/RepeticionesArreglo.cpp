#include <stdio.h>
#include <iostream>

using namespace std;

int main(){
	
	int arreglo[] = {0, 2, 0, 1, 3, 3, 0, 5, 2, 0, 1, 1, 2, 0, 4, 6}; //Los datos del usuario
	int aux[16]; //Arreglo auxiliar para guardar los valores que se repitan en la sucesion
	for(int i = 0; i < 16; i++){ //For para inicializar ese arreglo en 0's
		aux[i] = 0;
	}
	int aumento = 0; //Variable que calcula cuantas veces se repite un numero
	int posiciones = 0; //Variable que almacena cuantas posiciones recorrer en el arreglo auxiliar
	
	for(int i = 0; i < 16; i++){
		
		int numero = arreglo[i];
		aumento = 0;
		
		if(posiciones == 0){
			
			aux[posiciones] = numero;
			posiciones ++;
			
			for(int j = 0; j < 16; j++){
				if(arreglo[j] == numero){
					aumento ++;
				}
			}
			
			cout<<"El numero "<<numero<<" se repite "<<aumento<<" veces."<<endl;
			
		} else {
			
			int contAux = 0;
			for(int j = 0; j < posiciones; j++){
				if(aux[j] == numero){
					contAux ++;
				}
			}
			
			if(contAux == 0){
				
				aux[posiciones] = numero;
				posiciones ++;
				
				for(int j = 0; j < 16; j++){
					if(arreglo[j] == numero){
						aumento ++;
					}
				}
				
				cout<<"El numero "<<numero<<" se repite "<<aumento<<" veces."<<endl;
				
			}
			
			
		}
		
	}
	
	system("pause");
	return 0;
	
}
