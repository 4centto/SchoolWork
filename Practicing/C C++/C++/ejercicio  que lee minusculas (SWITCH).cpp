//Programa que identifica si el caracter es minuscula o no lo es 

#include<iostream>
using namespace std;

int main() 
{
	char letra;
	cout<<"Escribe una letra: ";
	cin>>letra;
	
	switch(letra){
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			cout<<"Es una letra minuscula";break;
		default:cout<<"No es una letra minuscula";break;
	}
	
	return 0;
	
}
