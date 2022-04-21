// Ciclo do while
// Hacer un bucle que nos pregunte su queremos continuar y hasta que no se escriba la "s" no pare.

#include <stdio.h>

int main(){
	
	char c;
	
	do{
		
		printf("Dame la letra: \n");
		fflush(stdin);
		scanf("%c", &c);
		
	} while(c != 's' && c && 'S');
	
	system("pause");
	return 0;
	
}
