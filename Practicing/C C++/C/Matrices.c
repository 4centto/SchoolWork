//Matrices
#include <stdio.h>

void Llenado();
void Impresion();

int main(){
	
	int matriz[2][5][5];
	
	Llenado(matriz);
	Impresion(matriz);
	
	system("pause");
	return 0;
	
}

void Llenado(int matriz[][5][5]){
	int i, j, k, aux = 0;
	for(i = 0; i < 2; i ++){
		for(j = 0; j < 5; j++){
			for(k = 0; k < 5; k ++){
				srand(time(NULL));
				aux = rand()%10;
				matriz[i][j][k] = aux;	
			}
		}
	}
}

void Impresion(int matriz[][5][5]){
	int i, j, k;
	for(i = 0; i < 2; i ++){
		printf("Tabla %i \n", i + 1);
		for(j = 0; j < 5; j++){
			for(k = 0; k < 5; k++){
				printf("[%i]", matriz[i][j][k]);
			}
			printf("\n");
		}
		printf("\n");
	}
}
