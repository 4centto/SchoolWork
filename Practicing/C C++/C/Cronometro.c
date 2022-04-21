//Cronometro metodo sleep()

#include <stdio.h>
#include <windows.h>

int main(){
	
	int h, m, s, x = 1000;
	
	for(h = 0; h < 24; h++){
		for(m = 0; m < 60; m++){
			for(s = 0; s < 60; s++){
				
				printf("%02i:%02i:%02i \r", h, m, s); // \r sobrescribe los datos
				Sleep(x);
				
			}
		}
	}
	
	system("pause");
	return 0;
	
}
