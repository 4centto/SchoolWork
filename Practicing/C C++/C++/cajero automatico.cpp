//programa que simule un cajero automatico con saldo inicial de 1000

#include<iostream>

using namespace std;
int main (){
	int saldo_inicial = 1000, opcion;
	float cantidad, retiro;
	
	cout<<"\tBienvenido a su cajero automatico...que desea hacer\n"<<endl;
	
	do{
	
		cout<<"1-Ingresar dinero a su cuenta"<<endl;
		cout<<"2-Retirar dinero de la cuenta"<<endl;
		cout<<"3-Salir"<<endl;
		cin>>opcion;
		
		switch(opcion){
			case 1:
				cout<<"\nDigite la cantidad que desee ingresar  $";
				cin>>cantidad;
				saldo_inicial += cantidad;
				cout<<"Su saldo actual es: $"<<saldo_inicial<<endl;
				break;
				
			case 2:
				cout<<"\nDigite la cantidad que desee retirar  $";
				cin>>retiro;
				if(retiro > saldo_inicial){
					cout<<"No cuenta con esa cantidad para retirar!";
				} else{
					saldo_inicial -= retiro;
					cout<<"Su saldo actual es: $"<<saldo_inicial<<endl;	
				}
				break;
	
			case 3:
				break;
		}
		
	} while(opcion != 3);

 	return 0;
}

