#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>

using namespace std;

class Figura{
	public:
		Figura(){};
		void Hola(){
			cout<<"Figura"<<endl;
		}
};

class Cuadrado : public Figura{
	public:
		Cuadrado(){};
			
};

int main(){
	
	Cuadrado c;
	c.Hola();
	
	system("pause");
	return 0;
	
}
