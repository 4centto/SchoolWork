#include <iostream>
#include <cstdlib>
#include <string>
#include <ctime>
#include <fstream>

using namespace std;

int main(){
	
	string linea;
	
	// 1. Se debe abrir el archivo antes de hacer cualquier cosa
	ofstream Archivo; // ofstream Archivo("texto.txt");
	Archivo.open("texto.txt");
	
	if(Archivo.is_open()){ // Verificar si el archivo puede ser accedido
		Archivo<<"Un texto sin mas! \nPuras pruebas de escritura en un archivo";
	} else {
		cout<<"Algo salio mal"<<endl;
	}
	
	while(getline(Archivo, linea)){
		cout<<linea;
	}
	
	Archivo.close();
	
	system("pause");
	return 0;
	
}
