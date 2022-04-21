#include <iostream>
#include <string>
#include <stdlib.h>
#include <cstdlib>
#include <ctime>
#include <Math.h>

using namespace std;

int num, *calif;

void PedirDatos(){
	cout<<"¿Cuantas calificaciones seran registradas?"<<endl;
	cin>>num;
	
	calif = new int[num];
	
	for(int i =0;i < num;i++){
		cout<<"Calificacion "<<i + 1<<": ";
		cin>>calif[i];
	}
}

int main(){
	
	PedirDatos();
	
	delete calif;
	
	system("pause");
	return 0;
	
}
