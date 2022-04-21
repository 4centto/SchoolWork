//Rutas de escape

#include <stdio.h>

int main(){
	
	int i, j, k = 0, aux = 0;
	
	for(i = 2; i <= 2000; i++){
		k = 0;
		for(j = 2; j < i && k != 1; j++){
			
			if((i % j) == 0){
				
				k = 1;
				
			}
			
		}
		if(k != 1){
			printf("%i, \n", i);
		}
	}
	
	system("pause");
	return 0;
	
}
