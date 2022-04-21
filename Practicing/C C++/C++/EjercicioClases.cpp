#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>

using namespace std;

class Cola{
	private:
		int size;
		int *arreglo = new int[100];
		
	public:
		void Agregar(int x){
			arreglo[size] = x;
			size ++;
		}
		void Eliminar(){
			if(size == 0){
				cout<<"La lista esta vacia"<<endl;
			} else {
				for(int i = 0; i < size - 1; i++){
					arreglo[i] = arreglo[i + 1];
				}
				size --;
			}
		}
		void Imprimir(){
			if(size == 0){
				cout<<"La lista esta vacia"<<endl;
			} else {
				for(int i = 0; i < size; i++){
					cout<<"["<<arreglo[i]<<"]";
				}
				cout<<endl;
			}
		}
};

int main(){
	
	Cola cola;
	
	cola.Agregar(1);
	cola.Agregar(2);
	cola.Agregar(3);
	cola.Agregar(4);
	cola.Agregar(5);
	cola.Imprimir();
	cola.Eliminar();
	cola.Eliminar();
	cola.Imprimir();
	cola.Agregar(6);
	cola.Agregar(7);
	cola.Agregar(8);
	cola.Agregar(9);
	cola.Agregar(10);
	cola.Imprimir();
	
	system("pause");
	return 0;
}
