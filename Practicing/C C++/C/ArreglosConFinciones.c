//Vectores con funciones
#include <stdio.h>

void fun();
void imprimir();

int main(){
	
	int v[2];
	
	fun(v);
	imprimir(v);
	
	system("pause");
	return 0;
	
}

void fun(int a[]){
	int i = 0;
	for(i = 0; i < 2; i++){
		printf("Dame el valor %i: ", i + 1);
		scanf("%i", &a[i]);
	}
}

void imprimir(int a[]){
	int i = 0;
	for(i = 0; i < 2; i++){
		printf("El valor %i es: %i. \n", i + 1, a[i]);
	}
}
