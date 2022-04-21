//programa que lee 2 numeros y determina cual de ellos es mayor

#include<iostream>

using namespace std; 

int main(){

int numeroA, numeroB;

cout<<"seleccione un numero (A): ";
cin>>numeroA;
cout<<"seleccione otro numero (B): ";
cin>>numeroB; 

if(numeroA == numeroB){
	cout<<"Los numeros son iguales. ";
} else if(numeroA > numeroB){
	cout<<"EL numero A es mayor. "<<numeroA<<endl;
} else{
	cout<<"El numero B es mayor. "<<numeroB;
}

return 0;

}



