#include <iostream>
#include <string>
#include <Math.h>
#include <cstdlib>
#include <stdlib.h>
#include <ctime>
#include <conio.h>

using namespace std;

/*  ARBOL BINARIO
	Un arbol consta de un conjunto finito de elementos,
	denomidados nodos y un conjunto finito de lineas dirigidas,
	denominadas ramas, que conectan los nodos.
	El arbol binario pueden tener como maximo dos hijos o nodos.
	
	ARBOL BINARIO DE BUSQUEDA
	Es aquel que dada una raiz, todos los datos del sub-arbol izquierdo son menores mientras que todos los datos
	del sub-arbol derecho son mayores
	
*/

/*

	Recorrido PreOrden:
		1. Visite la raiz
		2. Atravesaar el sub-arbol izquierdo
		3. Atravesar el sub-arbol derecho
		
	Recorrido InOrden:
		1. Atravesar el sub-arbol izquierdo
		2. Raiz
		3. Atravesar el sub-arbol derecho
		
	Recorrido en post-orden
		1. Atravesar el sub-arbol izquierdo
		2. '' derecho
		3. Raiz

*/

struct Nodo{
	int dato;
	Nodo *der;
	Nodo *izq;
	Nodo *padre;
};

Nodo *crearNodo(int n, Nodo *padre){
	Nodo *nuevo_nodo = new Nodo();
	nuevo_nodo->dato = n;
	nuevo_nodo->der = NULL;
	nuevo_nodo->izq = NULL;
	nuevo_nodo->padre = padre;
	
	return nuevo_nodo;
}

void Insertar(Nodo *&arbol, int n, Nodo *padre){
	if(arbol == NULL){
		Nodo *nuevo_nodo = crearNodo(n, padre);
		arbol = nuevo_nodo;
	} else {
		int valorRaiz = arbol->dato;
		if( n < valorRaiz){
			Insertar(arbol->izq, n, arbol);
		} else {
			Insertar(arbol->der, n, arbol);
		}
	}
}

void MostrarArbol(Nodo *arbol, int contador){
	if(arbol == NULL){
		return;
	} else {
		MostrarArbol(arbol->der, contador+1);
		for(int i = 0; i < contador; i++){
			cout<<"   ";
		}
		cout<<arbol->dato<<endl;
		MostrarArbol(arbol->izq, contador+1);
	}
}

bool Busqueda(Nodo *arbol, int n){
	if(arbol == NULL){
		return false;
	} else if(arbol->dato == n){
		return true;
	} else if(n < arbol->dato){
		return Busqueda(arbol->izq, n);
	} else {
		return Busqueda(arbol->der, n);
	}
}

void preOrden(Nodo *arbol){
	if(arbol == NULL){
		return;
	} else {
		cout<<arbol->dato<<" - ";
		preOrden(arbol->izq);
		preOrden(arbol->der);
	}
}

void inOrden(Nodo *arbol){
	if(arbol == NULL){
		return;
	} else {
		inOrden(arbol->izq);
		cout<<arbol->dato<<" - ";
		inOrden(arbol->der);
	}
}

void postOrden(Nodo *arbol){
	if(arbol == NULL){
		return;
	} else {
		postOrden(arbol->izq);
		postOrden(arbol->der);
		cout<<arbol->dato<<" - ";
	}
}

Nodo *Minimo(Nodo *arbol){
	if(arbol == NULL){
		return NULL;
	} else {
		if(arbol->izq){
			return Minimo(arbol->izq);
		} else {
			return arbol;
		}
	}
}

void DestruirNodo(Nodo *nodo){
	nodo->izq = NULL;
	nodo->der = NULL;
	
	delete nodo;
}

void Reemplazar(Nodo *arbol, Nodo *nuevoNodo){
	if(arbol->padre){
		if(arbol->dato == arbol->padre->izq->dato){
			arbol->padre->izq = nuevoNodo;
		} else if(arbol->dato == arbol->padre->der->dato ){
			arbol->padre->der = nuevoNodo;
		}
	}
	if(nuevoNodo){
		nuevoNodo->padre = arbol->padre;
	}
}

void Eliminar(Nodo *nodoEliminar){
	if(nodoEliminar->izq && nodoEliminar->der){
		Nodo *menor = Minimo(nodoEliminar->der);
		nodoEliminar->dato = menor->dato;
		EliminarNodo(menor);
	} else if(nodoEliminar->izq){
		Reemplazar(nodoEliminar, nodoEliminar->izq);
		DestruirNodo(nodoEliminar);
	} else if(nodoEliminar->der){
		Reemplazar(nodoEliminar, nodoEliminar->der);
		DestruirNodo(nodoEliminar);
	} else {
		Reemplazar(nodoEliminar, NULL);
		DestruirNodo(nodoEliminar);
	}
}

void EliminarNodo(Nodo *arbol, int n){
	if(arbol == NULL){
		return;
	} else if(n < arbol->dato){
		EliminarNodo(arbol->izq, n);
	} else if(n > arbol->dato){
		EliminarNodo(arbol->der, n);
	} else {
		Eliminar(arbol);
	}
}

Nodo *arbol = NULL;

void Menu(){
	int dato, opcion, contador = 0;
	do{
		cout<<"\tMENU:"<<endl;
		cout<<"1. Insertar un nueo nodo"<<endl;
		cout<<"2. Mostrar el arbol completo"<<endl;
		cout<<"3. Buscar elemento"<<endl;
		cout<<"4. Recorrer arbol en pre-orden"<<endl;
		cout<<"5. Recorrer arbol en in-orden"<<endl;
		cout<<"6. Recorrer arbol en post-orden"<<endl;
		cout<<"7. Eliminar nodo"<<endl;
		cout<<"8. Salir"<<endl;
		cout<<"Opcion: ";
		cin>>opcion;
		
		switch(opcion){
			case 1:
				cout<<"\nDigite un numero: ";
				cin>>dato;
				Insertar(arbol, dato);
				cout<<"\n";
				system("pause");
				break;
				
			case 2:
				cout<<"\nMostrando el arbol completo.\n\n";
				MostrarArbol(arbol, contador);
				cout<<"\n";
				system("pause");
				break;
				
			case 3:
				cout<<"Digite el elemento a buscar: ";
				cin>>dato;
				if(Busqueda(arbol, dato) == true){
					cout<<"El elemento "<<dato<<" existe en el arbol. "<<endl;
				} else {
					cout<<"El elemento "<<dato<<" NO existe en el arbol. "<<endl;
				}
				cout<<"\n";
				system("pause");
				break;
				
			case 4:
				cout<<"\nRecorrido en pre-orden: ";
				preOrden(arbol);
				cout<<"\n";
				system("pause");
				break;
				
			case 5:
				cout<<"\nRecorrido en in-orden: ";
				inOrden(arbol);
				cout<<"\n";
				system("pause");
				break;
				
			case 6:
				cout<<"\nRecorrido en post-orden: ";
				postOrden(arbol);
				cout<<"\n";
				system("pause");
				break;
				
			case 7:
				break;
				
			case 8:
				break;
				
		}
		
		system("cls");
		
	} while(opcion != 8);
}

int main(){
	
	Menu();
	
	system("pause");
	return 0;
	
}
