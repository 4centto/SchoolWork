#include <stdlib.h>
#include <iostream>
#include <cstdlib>
#include <ctime>
#include <Math.h>
#include <string>

using namespace std;

int main(){
	
	int numeros[] = {1, 2, 3, 4, 5};
	int *ptr = numeros;
	
	for(int i = 0; i < 5; i++){
		cout<<"Elemento del vector ["<<i<<"]: "<<*ptr++<<endl;
	}
	
	system("pause");
	return 0;
	
}
