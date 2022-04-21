#include <stdlib.h>
#include <math.h>
#include <iostream>
#include <cstdlib>
#include <ctime>
#include <string>
#include <conio.h>

using namespace std;

struct Nodo{
    int dato;
    Nodo *izq;
    Nodo *der;
};

Nodo *CrearNoodo(int n){
    Nodo *nuevoNodo = new Nodo();
    nuevoNodo->dato = n;
    nuevoNodo->izq = NULL;
    nuevoNodo->der = NULL;

    return nuevoNodo;
}

void InsertarNodo(Nodo *&arbol, int n){
    if(arbol == NULL){
        Nodo *nodo = CrearNoodo(n);
        arbol = nodo;
    } else {
        if(n < arbol->dato){
            InsertarNodo(arbol->izq, n);
        } else if(n > arbol->dato){
            InsertarNodo(arbol->der, n);
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

void MostrarPreOrden(Nodo *arbol){
    if(arbol == NULL){
        return;
    } else {
        cout<<arbol->dato<<" - ";
        MostrarPreOrden(arbol->izq);
        MostrarPreOrden(arbol->der);
    }
}

Nodo *arbol;

int main(){

    int contador = 0, valor;

    for(int i = 0; i < 10; i++){
        cout << "Dame un numero: ";
        cin >> valor;

        InsertarNodo(arbol, valor);
    }

    MostrarArbol(arbol, contador);
    cout<<endl;
    MostrarPreOrden(arbol);

    system("pause");
    return 0;

}