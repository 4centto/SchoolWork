#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>

/*
	-try (Es el inicio de la estructura para obtener el error)
	-chatch (Cuando una excepcion en particular es lanzada)
	-throw (Lanzar una excepcion cuando un problema aparece dnetro del programa)
*/

int main(){
	
	int x;
	
	try{
		int motherAge = 29;
		int sonAge = 36;
		
		if(sonAge > motherAge){
			throw 99;
		}
		
	} catch (int x){
		cout<<"Hola";
	}
	
	system("pause");
	return 0;
	
}
