#include <stdlib.h>
#include <iostream>
#include <cstdlib>
#include <math.h>
#include <conio.h>
#include <string>
#include <ctime>

using namespace std;

struct Nodo{
    int dato;
    Nodo *siguiente;
};

Nodo *crearNodo(int n){
    Nodo *nuevoNodo = new Nodo();
    nuevoNodo->dato = n;
    nuevoNodo->siguiente = NULL;

    return nuevoNodo;
}

void InsertarNodo(Nodo *&lista, int n){
    if(lista == NULL){
        Nodo *nodo = crearNodo(n);
        lista = nodo;
    } else {
        InsertarNodo(lista->siguiente, n);
    }
}

void MostrarLista(Nodo *lista){
    if(lista == NULL){
        return;
    } else {
        cout<<lista->dato<<" - ";
        MostrarLista(lista->siguiente);
    }
}

Nodo *lista;

int main(){

    int valor;

    for(int i = 0; i < 5; i++){
        cout<<"Ingresa un valor: ";
        cin >> valor;

        InsertarNodo(lista, valor);

    }

    MostrarLista(lista);

    system("pause");
    return 0;

}