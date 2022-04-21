#include "stdio.h"
#include "conio.h"
#include "iostream"
#include "cstdlib"
#include "string"
#include "math.h"
#include "ctime"

using namespace std;

struct Nodo{
    int dato;
    Nodo *sig;
};

Nodo *crearNodo(int n){
    Nodo *nuevoNodo = new Nodo();
    nuevoNodo->dato = n;
    nuevoNodo->sig = NULL;
    return nuevoNodo;
}

void insertarNodo(Nodo *&lista, int n){
    if(lista == NULL){
        Nodo *nodo = crearNodo(n);
        lista = nodo;
        cout<<"Elemento "<<n<<" agregado a la lista"<<endl;
    } else {
        insertarNodo(lista->sig, n);
    }
}

void leerLista(Nodo *lista){
    if(lista == NULL){
        return;
    } else {
        cout<<"["<<lista->dato<<"]";
        leerLista(lista->sig);
    }
}

void eliminarNodo(Nodo *&lista){
    int final = 0;
    if(lista == NULL){
        cout<<"La lista esta vacia. "<<endl;
    } else {
        Nodo *aux = lista;
        final = aux->dato;
        lista = aux->sig;

        delete aux;

        cout<<"Nodo eliminado correctamente. "<<endl;
    }
}

Nodo *lista;

int main(){

    int opcion = 0, numero = 0;

    cout<<" -- BIENVENIDO -- "<<endl;

    do{

        system("cls");
        cout<<"     1. Insertar nodo. "<<endl;
        cout<<"     2. Eliminar nodo. "<<endl;
        cout<<"     3. Mostrar lista. "<<endl;
        cout<<"     4. Salir. "<<endl;
        cout<<endl;
        cout<<":";
        cin>>opcion;

        switch(opcion){
            case 1:
            system("cls");

            cout<<"Dame tu numero: ";
            cin >> numero;

            insertarNodo(lista, numero);

            system("pause");
            break;

            case 2:
            system("cls");
            eliminarNodo(lista);
            system("pause");
            break;

            case 3:
            system("cls");
            leerLista(lista);
            cout<<endl;
            system("pause");
            break;

            case 4:
            system("cls");
            cout<<"Hasta luego."<<endl;
            system("pause");
            break;

            default:
            system("cls");
            cout<<"La ocpion seleccionada no existe"<<endl;
            system("pause");
            break;
        }

    } while(opcion != 4);

    system("pause");
    return 0;

}