/*primer programa de clases 
este programa hace una clase llamada rectangulo que tenga los siguientes atributos:
largo y ancho, y los siguientes metodos:perimetro() y area ()*/

#include<iostream>
#include<stdlib.h>
using namespace std;

class Rectangulo{
	private: 
		float largo,ancho;
	public:
		Rectangulo(float,float);
		void perimetro();
		void area();
		
};
Rectangulo::Rectangulo(float _largo, float _ancho){
 	largo = _largo;
 	ancho = _ancho;
} 
	
void Rectangulo::perimetro(){
	float _perimetro;
	_perimetro = (2*ancho) + (2*largo);
	cout<<"El perimetro es: "<<_perimetro<<endl;
}

void Rectangulo::area(){
	float _area;
	_area = largo * ancho; 
	cout<<"El area es: "<<_area<<endl; 
}


int main(){
	float _largo,_ancho,_area,_perimetro;
	
	cout<<"Digite el valor del largo: "<<endl;
	cin>>_largo;
	cout<<"Digite el valor para calcular el ancho: "<<endl;
	cin>>_ancho;	 
	
	Rectangulo R1(_largo, _ancho);
	R1.area();
	R1.perimetro();	
	
	system("pause");
	return 0;
}
