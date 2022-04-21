#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>

using namespace std;

/*
Para poder usar una funcion es necesario declararla antes del metodo main, y si se declara despues es necesario hacer 
un prototipo de la funcion.
*/
/*
bool PrintSomething(string nombre = "Angel"){
	
	srand(time(0));
	cout<<(rand() % 10)<<endl;
	
	cout<<"Hola "<<nombre<<endl;
	return true;
}

int Factorial(int n){
	if(n == 1){
		return 1;
	} else {
		return n * Factorial(n - 1);
	}
}

void ImprimirArreglo(int arreglo[], int size){
	for(int i = 0; i < size; i++){
		cout<<arreglo[i]<<endl;
	}
}

void PasosPorReferencia(int *a, int *b){
	int z = *a;
	*a = *b;
	*b = z;
}
*/

bool isPalindrome(int x){
	int original = x;
	int inv = 0;
	while(x > 0){
	  inv = inv * 10 + (x % 10);
	  x = x / 10;
	}
	
	if(inv == original){
		return true;
	} else {
		return false;
	}
	
}

int main(){
	
	int x = 0;
	cin>>x;
	
	if(isPalindrome(x)){
		cout<<"SI"<<endl;
	} else {
		cout<<"NO"<<endl;
	}
	
	/*
	string nombre;
	
	cout<<"Dame tu nombre: ";
	cin>>nombre;
	
	if(PrintSomething(nombre) == true){
		cout<<"Como estas?"<<endl;
	}
	cout<<Factorial(5)<<endl;
	
	//Pasando arreglos a funciones
	int arreglo[] = {1, 2, 3, 4, 5};
	ImprimirArreglo(arreglo, 5);
	
	cout<<"\nPASO POR REFERENCIA\n"<<endl;
	int a = 5, b = 10;
	cout<<"a: "<<a<<" b: "<<b<<endl;
	PasosPorReferencia(&a, &b);
	cout<<"a: "<<a<<" b: "<<b<<endl;
	*/
	
	system("pause");
	return 0;
}
