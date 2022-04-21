#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>

using namespace std;

//public, protected, private

class Animal{
	private:
		string nombre;
		
	public:
		Animal(string nombre){
			cout<<"Hola: "<<nombre<<endl;
		}
		void Ladrar(){
			cout<<"Woof!! "<<nombre<<endl;
		}
		void setNombre(string nombre = "No tengo nombre :("){
			this->nombre = nombre;
		}
		~Animal(){
			cout<<"He sido destruido"<<endl;
		}
};

int main(){
	
	//Cuando se pasan objetos por parametros es necesario que se usen punteros
	
	Animal animal("Lalo");
	animal.setNombre("Ivan");
	animal.Ladrar();
	
	Animal *a = &animal;
	a->Ladrar();	
	
	system("pause");
	return 0;
}
