//Impresion de un año con arrays

#include <stdio.h>

int Promedios[2][5][30];
int i, j, k;

int main(){
	
	//Llenado
	for(i = 0; i < 2; i++){
		for(j = 0; j < 5; j++){
			for(k = 0; k < 30; k++){
				Promedios[i][j][k] = 9;
			}
		}
	}
	
	//Impresion
	for(i = 0; i < 2; i++){
		printf("Profesor %i. \n", i + 1);
		for(j = 0; j < 5; j++){
			printf("Materia %i: ", j + 1);
			for(k = 0; k < 30; k++){
				printf("[%i]", Promedios[i][j][k]);
			}
			printf("\n");
		}
		printf("\n");
	}
	
	system("pause");
	return 0;
	
}
