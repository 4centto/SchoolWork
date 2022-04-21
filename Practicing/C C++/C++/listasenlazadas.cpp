#include <stdio.h>
#include <cstdlib>
#include <ctime>
#include <conio.h>
#include <string>
#include <iostream>
#include <math.h>

using namespace std;

void Insertar(int);
void Eliminar(int);

struct Nodo{
    int dato;
    Nodo *siguiente;
};

Nodo *CrearNodo(int n){
    Nodo *nodo = new Nodo();
    nodo->dato = n;
    nodo->siguiente = NULL;

    return nodo;
}

void InsertarNodo(Nodo *&lista, int n, bool bandera){
    if(bandera == true){ // Insertar al final de la lista
        if(lista == NULL){
            Nodo *nodo = CrearNodo(n);
            lista = nodo;
            cout<<"Nodo agregado correctamente"<<endl;
        } else {
            InsertarNodo(lista->siguiente, n, true);
        }
    } else { // Insertar al inicio de la fila
        Nodo *aux = CrearNodo(n);
        aux->siguiente = lista;
        lista = aux;

        delete aux;

        cout<<"Nodo agregado correctamente"<<endl;
    }
}

void InsertarNodoEntre(Nodo *&lista, int n, int btw){
    if(lista == NULL){
        cout<<"Nodo no encontrado. "<<endl;
    } else {
        if(lista->dato == btw){
            
            Nodo *aux = CrearNodo(n);
            aux->siguiente = lista->siguiente;
            lista->siguiente = aux;

            cout<<"Nodo agregado correctamente. "<<endl;

        } else {
            InsertarNodoEntre(lista->siguiente, n, btw);
        }
    }
}

void EliminarNodoInicio(Nodo *&lista){
    int primero = 0;
    if(lista == NULL){
        cout<<"La lista esta vacia. "<<endl;
    } else {
        Nodo *aux = lista;
        primero = aux->dato;
        lista = aux->siguiente;

        delete aux;

        cout<<"Nodo eliminado correctamente. "<<endl;

    }
}

void EliminarNodoFinal(Nodo *&lista){
    int final = 0;
    if(lista == NULL){
        cout<<"La lista esta vacia. "<<endl;
    } else {
        if(lista->siguiente == NULL){

            Nodo *aux = lista;
            final = aux->dato;
            lista = aux->siguiente;

            delete aux;

            cout<<"Nodo eliminado correctamente. "<<endl;

        } else {
            EliminarNodoFinal(lista->siguiente);
        }
    }
}

void EliminarNodoEspecifico(Nodo *&lista, int btw){
    int final = 0;
    if(lista == NULL){
        cout<<"Nodo no encontrado. "<<endl;
    } else {
        if(lista->dato == btw){
            if(lista->siguiente == NULL){

                Nodo *aux = lista;
                final = aux->dato;
                lista = aux->siguiente;

                delete aux;

                cout<<"Nodo eliminado correctamente. "<<endl;


            } else {
                Nodo *aux = lista->siguiente;
                lista->dato = aux->dato;
                lista->siguiente = aux->siguiente;

                delete aux;

                cout<<"Nodo eliminado correctamente. "<<endl;
            }
        } else {
            EliminarNodoEspecifico(lista->siguiente, btw);
        }
    }
}

void Mostrar(Nodo *lista){
    if(lista == NULL){
        cout<<endl;
        return;
    } else {
        cout<<"["<< lista->dato <<"]";
        Mostrar(lista->siguiente);
    }
}

void BuscarNodo(Nodo *lista, int n){
    if(lista == NULL){
        cout<<"Nodo no encontrado. "<<endl;
    } else {
        if(lista->dato == n){
            cout<<"Se ha encontrado el nodo: ["<<n<<"]"<<endl;
        } else {
            BuscarNodo(lista->siguiente, n);
        }
    }
}

void EditarNodo(Nodo *&lista, int n, int btw){
    if(lista == NULL){
        cout<<"Nodo no encontrado. "<<endl;
    } else {
        if(lista->dato == btw){

            int aux = lista->dato;
            lista->dato = n;
            cout<<"["<<aux<<"] ha sido sustituido por: ["<<n<<"]"<<endl;

        } else {
            EditarNodo(lista->siguiente, n, btw);
        }
    }
}

Nodo *lista;

int main(){

    int opcion = 0;
    int sub_opciones = 0;
    int bnumero = 0;
    int bbtw = 0;

    do{
        system("cls");
        cout<<" - - MENU - - "<<endl;
        cout<<"\t 1. Insertar. "<<endl;
        cout<<"\t 2. Imprimir. "<<endl;
        cout<<"\t 3. Eliminar. "<<endl;
        cout<<"\t 4. Buscar. "<<endl;
        cout<<"\t 5. Editar. "<<endl;
        cout<<"\t 6. Salir. "<<endl;
        cout << endl;
        cout<<"Que deseas hacer: ";
        cin>>opcion;

        switch(opcion){

            case 1:
            system("cls");
            cout<<"\t 1. Insertar al inicio."<<endl;
            cout<<"\t 2. Insertar despues de..."<<endl;
            cout<<"\t 3. Insertar al final."<<endl;
            cout<< endl;
            cin>>sub_opciones;

            Insertar(sub_opciones);

            break;

            case 2:
            system("cls");
            Mostrar(lista);
            system("pause");
            break;

            case 3:
            system("cls");
            cout<<"\t 1. Eliminar al inicio."<<endl;
            cout<<"\t 2. Eliminar nodo especifico."<<endl;
            cout<<"\t 3. Eliminar al final."<<endl;
            cout<< endl;
            cin>>sub_opciones;

            Eliminar(sub_opciones);

            break;

            case 4:
            system("cls");

            cout<<"Que numero deseas buscar: ";
            cin>>bnumero;

            BuscarNodo(lista, bnumero);

            system("pause");
            break;

            case 5:
            system("cls");

            cout<<"Que numero deseas editar: ";
            cin>>bbtw;
            cout<<"Ahora dame el nuevo numero: ";
            cin>>bnumero;

            EditarNodo(lista, bnumero, bbtw);

            system("pause");
            break;

            case 6:
            system("cls");
            cout<<"Hasta luego!"<<endl;
            break;

            default:
            system("cls");
            cout<<"La opcion seleccionada no existe. Vuelve a intentarlo." <<endl;
            system("pause");
            break;
        }

    } while(opcion != 6);

    system("pause");
    return 0;

}

//Metodo para insertar valores
void Insertar(int eleccion){
    int numero = 0;
    int btw = 0;
    switch(eleccion){

        //Insertar al inicio
        case 1:
        system("cls");

        cout<<"Dame un numero: ";
        cin>>numero;

        InsertarNodo(lista, numero, false);

        system("pause");
        break;

        //Insertar despues de...
        case 2:
        system("cls");

        cout<<"Dame tu numero: ";
        cin>>numero;

        cout<<"Despues de que numero quieres ingresar el "<<numero<<" ? ";
        cin>>btw;

        InsertarNodoEntre(lista, numero, btw);

        system("pause");
        break;

        //Insertar al final
        case 3:
        system("cls");

        cout<<"Dame tu numero: ";
        cin>>numero;

        InsertarNodo(lista, numero, true);

        system("pause");
        break;

        //Opcion no valida
        default:
        system("cls");
        cout<<"La opcion no existe. "<<endl;
        system("pause");
        break;

    }
}

void Eliminar(int eleccion){
    int btw = 0;
    switch(eleccion){

        //Eliminar al inicio
        case 1:
        system("cls");

        EliminarNodoInicio(lista);

        system("pause");
        break;

        //Eliminar nodo especifico
        case 2:
        system("cls");

        cout<<"Que numero deseas eliminar: ";
        cin>>btw;

        EliminarNodoEspecifico(lista, btw);

        system("pause");
        break;

        //Eliminar al final
        case 3:
        system("cls");

        EliminarNodoFinal(lista);

        system("pause");
        break;

        //Opcion no valida
        default:
        system("cls");
        cout<<"La opcion no existe. "<<endl;
        system("pause");
        break;

    }
}