#include <stdlib.h>
#include <cstdlib>
#include <iostream>
#include <ctime>
#include <string>
#include <math.h>
#include <conio.h>

using namespace std;

struct Alumno{
	string nombre;
	string apellido;
	string matricula;
};

struct Nodo{
	Alumno *alumno;
	Nodo *siguiente;
};

Alumno *CrearAlumno(string n, string a, string m){
	Alumno *alumno = new Alumno();
	alumno->nombre = n;
	alumno->apellido = a;
	alumno->matricula = m;

	return alumno;
}

Nodo *CrearNodo(Alumno *alumno){
	Nodo *nodo = new Nodo();
	nodo->alumno = alumno;
	nodo->siguiente = NULL;

	return nodo;
}

void InsertarNodo(Nodo *&lista, string nombre, string apellido, string matricula){
	if(lista == NULL){
		Alumno *alumno = CrearAlumno(nombre, apellido, matricula);
		Nodo *nodo = CrearNodo(alumno);
		lista = nodo;
		cout<<"\n\n¡¡Alumno agregado correctamente!!"<<endl;
	} else{
		InsertarNodo(lista->siguiente, nombre, apellido, matricula);
	}
}

void MostrarLista(Nodo *lista){
	if(lista == NULL){
		return;
	} else {
		cout<<"Nombre: "<<lista->alumno->nombre<<endl;
		cout<<"Apellido: "<<lista->alumno->apellido<<endl;
		cout<<"Matricula: "<<lista->alumno->matricula<<endl;
		cout<<endl;
		MostrarLista(lista->siguiente);
	}
}

void EliminarNodoLista(Nodo *&lista){
	
	if(lista == NULL){
		cout<<"La lista esta vacia. "<<endl;
	} else {
		if(lista->siguiente = NULL){

			Nodo *aux = lista;
			Alumno *a_aux = lista->alumno;
			lista = aux->siguiente;

			delete aux;

		} else {
			Nodo *aux = lista->siguiente;
			lista->alumno = aux->alumno;
			lista->siguiente = aux->siguiente;

			delete aux;
			cout<<"Alumno eliminado correctamente. "<<endl;
		}
	}
}

Nodo *lista;

int main(){

	int seleccion = 0;
	string nombre;
	string apellido;
	string matricula;
	
	do{

		system("cls");
        cout<<" - - MENU - - "<<endl;
        cout<<"\t 1. Insertar. "<<endl;
        cout<<"\t 2. Mostrar. "<<endl;
        cout<<"\t 3. Eliminar. "<<endl;
        cout<<"\t 4. Salir. "<<endl;
        cout << endl;
        cout<<"Que deseas hacer: ";
        cin>>seleccion;

        switch(seleccion){

			//Insertar 
            case 1:
            system("cls");
			cout<<"Nombre del alumno: ";
			cin>>nombre;
			cout<<"Apellido del alumno: ";
			cin>>apellido;
			cout<<"Matricula del alumno: ";
			cin>>matricula;

			InsertarNodo(lista, nombre, apellido, matricula);
			

			system("pause");
            break;

			//Mostrar lista
            case 2:
            system("cls");
			MostrarLista(lista);
            system("pause");
            break;

			//Eliminar
            case 3:
            system("cls");
			EliminarNodoLista(lista);
			system("pause");
            break;

			//Salir del programa
            case 4:
            system("cls");
			cout<<"Hasta luego. "<<endl;
            system("pause");
            break;

            default:
            system("cls");
            cout<<"La opcion seleccionada no existe. Vuelve a intentarlo." <<endl;
            system("pause");
            break;
        }


	} while(seleccion != 4);

    system("pause");
    return 0;

}
