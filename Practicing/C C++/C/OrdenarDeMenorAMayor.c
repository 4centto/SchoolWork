//Ordenar un vector de mayor a menor
#include <stdio.h>

void Ordenar();
void Imprimir();

int main(){
	
	int v[10] = {3,78,4,5,7,1,36,7,8,10};
	
	Ordenar(v);
	Imprimir(v);
	
	system("pause");
	return 0;
	
}

void Ordenar(int a[]){
	int i, j, aux;
	
	for(i = 0; i < 10; i++){
		for(j = 0; j < 10; j++){
			if(a[i] < a[j]){
				aux = a[j];
				a[j] = a[i];
				a[i] = aux;
			}
		}
	}
}

void Imprimir(int a[]){
	int i = 0;
	for(i = 0; i < 10; i++){
		printf("[%i]", a[i]);
	}
	printf("\n");
}
