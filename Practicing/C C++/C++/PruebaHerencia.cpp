#include <stdio.h>
#include <cstdlib>
#include <iostream>
#include <ctime>
#include <stdlib.h>
#include <conio.h>

using namespace std;

/* CLASE FIGURA */
class Figura{
	private:
		int ancho;
		int alto;
		
	public:
		Figura( void );
		Figura( int, int );
		int getAncho( void );
		void setAncho( int );
		int getAlto( void );
		int setAlto( int );
};

//Metodos de la clase figura
Figura::Figura(){
	this->ancho = 0;
	this->alto = 0;
}

Figura::Figura(int ancho, int alto){
	this->ancho = ancho;
	this->alto = alto;
}

int Figura::getAlto(){
	return this->alto;
}

Figura::setAlto(int alto){
	this->alto = alto;
}

int Figura::getAncho(){
	return this->ancho;
}

void Figura::setAncho(int ancho){
	this->ancho = ancho;
}

/* CLASE CUADRADO */
class Cuadrado:public Figura{
	public:
		int calcularArea( void );
};

int Cuadrado::calcularArea(){
	return (this->getAlto() * this->getAncho());
} 

int main(){
	
	Cuadrado cuadrado;
	cuadrado.setAlto(20);
	cuadrado.setAncho(20);
	
	cout<<cuadrado.calcularArea()<<endl;
	
	system("pause");
	return 0;
	
}
