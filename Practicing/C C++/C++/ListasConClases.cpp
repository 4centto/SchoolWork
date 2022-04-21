#include <iostream>
#include <stdlib.h>
#include <cstdlib>
#include <string>
#include <ctime>
#include <conio.h>

using namespace std;

//Clase del nodo
struct Nodo{
	int dato;
	Nodo *sig;	
};

class Lista{
	
	private:
		Nodo *lista;
		
		//Metodo para crear el nodo
		Nodo *crearNodo(int n){
			Nodo *nodo = new Nodo();
			nodo->dato = n;
			nodo->sig = NULL;
			return nodo;
		}
		
		
	public:
		//Metodo para insertar el nodo creado
		void InsertarNodo(Nodo *&lista, int n){
		    if(lista == NULL){
				Nodo *nodo = crearNodo(n);
		        lista = nodo;
		        cout<<"Nodo agregado correctamente"<<endl;
		    } else {
		        InsertarNodo(lista->sig, n);
		    }
		
		}
		
		//Metodo para mostrar la lista
		void Mostrar(Nodo *lista){
		    if(lista == NULL){
		        cout<<endl;
		        return;
		    } else {
		        cout<<"["<< lista->dato <<"]";
		        Mostrar(lista->sig);
		    }
		}
		
		Nodo *getNodo(){
			return this->lista;
		}
		
};

Lista lista;
Nodo *nodos_Lista = lista.getNodo();

int main(){
	
	lista.InsertarNodo(nodos_Lista, 5);
	lista.InsertarNodo(nodos_Lista, 6);
	lista.InsertarNodo(nodos_Lista, 7);
	lista.InsertarNodo(nodos_Lista, 8);
	
	lista.Mostrar(nodos_Lista);
	
	return 0;
	system("pause");
	
}
