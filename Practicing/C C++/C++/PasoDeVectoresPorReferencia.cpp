#include <stdlib.h>
#include <string>
#include <iostream>
#include <cstdlib>
#include <Math.h>
#include <ctime>

using namespace std;

void HallarMaximo(int *vector){
	for(int i = 0; i < 5; i++){
		cout<<*vector++<<endl;
	}
}

int main(){
	
	int numeros[] = {12, 22, 32, 42, 52};
	
	HallarMaximo(numeros);
	
	system("pause");
	return 0;
	
}
