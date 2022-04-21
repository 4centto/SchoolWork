#include <iostream>
#include <math.h>
#include <stdio.h>
#include <cstdlib>
#include <conio.h>
#include <string>

using namespace std;

//Esta es la clase Nodo, que es la que va a contener los datos (Coordenadas) ingresados por el usuario.
class Nodo{
	private:
		float x;
		float y;
		Nodo *next;
		
	public:
		//Constructor sobrecargado de la clase Nodo
		Nodo(float x, float y){
			this->x = x;
			this->y = y;
			this->next = NULL;
		}
		
		//Constructur por defecto de la clase Nodo
		Nodo(){
			
		}
		
		//Getter y Setter de las variables X y Y
		float getX(){
			return this->x;
		}
		
		void setX(double x){
			this->x = x;
		}
		
		float getY(){
			return this->y;
		}
		
		void setY(double y){
			this->y = y;
		}
		
		Nodo *getNext(){
			return this->next;
		}
		
		void setNext(Nodo *nodo){
			this->next = nodo;
		}
};

//Esta es la clase que contendrá las coordenadas que el usuario ingrese en formato de lista
class ListaCoordenadas{
	private:
		Nodo *head;
		int size;
		
	public:
		//Constructor por defecto de la clase ListaCoordenadas
		ListaCoordenadas(){
			this->head = NULL;
			this->size = 0;
		}
		
		//Este metodo inserta las nuevas coordenadas a la lista de coordenadas
		void insertarCoordenada(float x, float y){
			if(this->isEmpty() == true){
				this->head = new Nodo(x, y);
				this->size ++;
			} else {
				Nodo *aux = this->head;
				while(aux->getNext() != NULL){
					aux = aux->getNext();
				}
				aux->setNext(new Nodo(x, y));
				this->size ++;
			}
		}
		
		//Este meotodo borra todos los datos de la lista
		void limpiarLista(){
			this->head = NULL;
		}
		
		//Este metodo mustra todos los datos de la lista
		void mostrarLista(){
			if(this->isEmpty() != true){
				Nodo *aux = this->head;
				cout<<" * Estas son tus coordenadas * "<<endl;
				while(aux != NULL){
					cout<<"("<<aux->getX()<<", "<<aux->getY()<<") ";
					aux = aux->getNext();
				}
				cout<<endl;
			}
		}
		
		//Este metodo valida si la lista esta vacia o no
		bool isEmpty(){
			return this->head == NULL;
		}	
		
		//Metodo que devuelve el tamño del arreglo
		int getSize(){
			return this->size;
		}
		
		//Metodo que nos devuelve el valor de X de un nodo, en una posicion especifica de la lista
		float getX(int posicion){
			Nodo *aux = this->head;
			for(int i = 1; i < posicion; i++){
				aux = aux->getNext();
			}
			
			return aux->getX();
		}
		
		float getY(int posicion){
			Nodo *aux = this->head;
			for(int i = 1; i < posicion; i++){
				aux = aux->getNext();
			}
			
			return aux->getY();
		}
		
};

int main(){
	
	int opcion = 0;
	float x = 0, y = 0;
	ListaCoordenadas lista;
	
	while(opcion != 2){
		
		system("cls");
		cout<<"\t1. Insertar coordenada."<<endl;
		cout<<"\t2. Calcular. (Usa esta opcion solo si ya ingresaste todas tus coordenadas)"<<endl;
		
		cout<<endl;
		lista.mostrarLista();
		cout<<endl;
		cout<<endl;
		
		cout<<" * ";
		cin >> opcion;
		
		switch(opcion){
			
			//Opcion para ingresar coordenadas
			case 1:
				
				//Pedir datos al usuario
				system("cls");
				cout<<" * Dame tu coordenada X: ";
				cin >> x;
				cout<<" * Dame tu coordenada Y: ";
				cin >> y;
				
				lista.insertarCoordenada(x, y); //Insertar las coordenadas dentro de nuestra lista
				
				break;
				
			//Opcion para hacer todos los calculos
			case 2:
				
				system("cls");
				
				//Validar que la lista ya contenga listas
				if(lista.isEmpty() == true){
					
					cout<<endl;
					cout<<" * La lista no tiene coordenadas para calcular. Vuelve a intentarlo. * "<<endl;
					cout<<endl;
					opcion = 0;
					system("pause");
					
				}
				
				break;
				
		}
		
		
	}
	
	//El codigo de aqui, hasta terminar el programa se ejecutra solo si el usuario al seleccionar Calcular
	//en la lista ya se encuentran valores, de lo contario seguirá ejecutandose el ciclo while
	
	int N = lista.getSize(); //Constante N
	string header[7] = {"i", "x", "y", "x * y", "x^2", "y^2", "( b+mx-y )^2"}; //Titulos de la tabla
	float tablaValores[N][7]; //Tabla competa de valores
	float sumaColumnas [7]; //Arreglo que almacenaa la suma de las columnas 
	
	cout<<endl;
	cout<<" * La tabla sera mostrada en el siguiente formato:"<<endl;
	cout<<endl;
	for(int j = 0; j < 7; j++){
		cout<<header[j]<<"  |  ";
	}
	cout<<endl;
	
	//Pasamos los datos de nuestras coordenadas calculando las demas columnas de la tabla (x * y, x^2, y^2, etc.)
	for(int i = 0; i < N; i++){
		for(int j = 0; j < N; j++){
			if(j == 0){
				tablaValores[i][j] = i + 1; //Valor de i
				
			} else if(j == 1){
				tablaValores[i][j] = (float)lista.getX(i + 1); //Valor de X
				
			} else if(j == 2){
				tablaValores[i][j] = (float)lista.getY(i + 1); //Valor de Y
				
			} else if(j == 3){
				tablaValores[i][j] = (float)lista.getX(i + 1) * lista.getY(i + 1); // Valor de x * y
				
			} else if(j == 4){
				tablaValores[i][j] = (float)pow(lista.getX(i + 1), 2); //Cuadrado de X
				
			} else if(j == 5){
				tablaValores[i][j] = (float)pow(lista.getY(i + 1), 2); //Cuadrado de Y
				
			} else if(j == 6){
				tablaValores[i][j] = (float)0.0; //Valor auxiliar para la funcion ( b + mx - y )^2
				
			}
		}
	}
	
	//Ahora, calculamos la suma de cada columna menos de la columna de i
	sumaColumnas[0] = N;
	for(int j = 1; j < 7; j++){
		float valor = 0;
		for(int i = 0; i < N; i++){
			
			if(j == 0){
				sumaColumnas[0] = N;
				break;
			} else {
				
				valor += tablaValores[i][j];
				
			}
			
		}
		
		sumaColumnas[j] = valor;
		
	}

	//Ahora procedemos a calcular m, b y r de las formulas para obtenerlas
	float m = ( N * sumaColumnas[3] - sumaColumnas[1] * sumaColumnas[2] ) / ( N * sumaColumnas[4] - pow(sumaColumnas[1], 2) );
	float b = ( ( sumaColumnas[2] * sumaColumnas[4] - sumaColumnas[1] * sumaColumnas[3] ) / ( N * sumaColumnas[4] - sumaColumnas[1] * sumaColumnas[1] ) );
	float r = ( ( N * sumaColumnas[3] - sumaColumnas[1] * sumaColumnas[2] ) / ( sqrt( N * sumaColumnas[4] - pow(sumaColumnas[1], 2) ) * sqrt( N * sumaColumnas[5] - pow(sumaColumnas[2], 2) ) ) );
	
	//Ahora ya para casi terminar aplicamos nuestra formula para obtener los valores de la formula ( b + mx - y )^2 de cada fila de 
	//nuestra tabla
	for(int i = 0; i < N; i++){
		tablaValores[i][6] = pow(( b + m * tablaValores[i][1] - tablaValores[i][2] ), 2);
	}
	
	//Hacemos la sumatoria solamente de la ultima columna de nuestra tabla de datos
	for(int i = 0; i < N; i++){
		sumaColumnas[6] += tablaValores[i][6];
	}
	
	//Y ya para terminar solo mostramos todos los datos obtenidos, la tabla de valores, las sumas de las columnas, los valores de
	//m, b, r y la ecuacion resultante de los calculos
	
	//Imprimimos tabla de valores
	for(int i = 0; i < N; i++){
		for(int j = 0; j < 7; j++){
			cout<<tablaValores[i][j]<<"  |  ";
		}	
		cout<<endl;
	}
	cout<<endl;
	
	//Imprimimos el arreglo de la suma de las columnas
	for(int i = 0; i < 7; i++){
		if(i == 0){
			cout<<" * Valor de N: "<<N<<endl;
		} else if(i == 1){
			cout<<" * Sumatoria de X: "<<sumaColumnas[i]<<endl;
		} else if(i == 2){
			cout<<" * Sumatoria de Y: "<<sumaColumnas[i]<<endl;
		} else if(i == 3){
			cout<<" * Sumatoria de X*Y: "<<sumaColumnas[i]<<endl;
		} else if(i == 4){
			cout<<" * Sumatoria de X^2: "<<sumaColumnas[i]<<endl;
		} else if(i == 5){
			cout<<" * Sumatoria de Y^2: "<<sumaColumnas[i]<<endl;
		} else if(i == 6){
			cout<<" * Sumatoria de (b+mx-y)^2: "<<sumaColumnas[i]<<endl;
		}
	}
	cout<<endl;
	cout<<endl;
	
	//Imprimimos todos los valores resultantes
	cout<<" -> Valor de m: "<<m<<endl;
	cout<<" -> Valor de b: "<<b<<endl;
	cout<<" -> Valor de r: "<<r<<endl;
	cout<<" -> Valor de Beta al cuadrado: "<<sumaColumnas[6]<<endl;
	cout<<endl;
	cout<<endl;
	
	cout<<"\t - ECUACION FINAL - "<<endl;
	cout<<"\t ------------------ \n"<<endl;
	cout<<"\t-> y = "<<m<<"x + ("<<b<<")"<<endl;
	cout<<endl;
	cout<<endl;
	
	system("pause");
	return 0;	
	
}
