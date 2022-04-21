#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>

using namespace std;

class Enemigo{
	protected:
		int ataque;
		
	public:
		void setAtaque(int a){
			ataque = a;
		}

};

class Soldado : public Enemigo{
	public:
		void Atacar(){
			cout<<"PUM... -"<<this->ataque<<endl;
		}
};

int main(){
	
	Soldado soldado;
	soldado.setAtaque(20);
	soldado.Atacar();
	
	system("pause");
	return 0;
	
}
