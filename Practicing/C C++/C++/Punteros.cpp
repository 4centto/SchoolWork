#include <iostream>
#include <string>

using namespace std;

int main(){
	
	int personas[5];
	double joven = 0;
	double porcentaje = 0.0;
	
	for(int i = 0; i < 5; i++){
		cin>>personas[i];
	}
	
	for(int i = 0; i < 5; i++){
		if(i == 0){
			joven = personas[i];
		} else {
			if(personas[i] < joven){
				joven = personas[i];
			}
		}
	}
	
	porcentaje = joven / 100;
	cout<<50 - (50 * porcentaje)<<endl;
	
	
	//int *a;
	//float *b;
	//double *c;
	//char *d;
	
	/*
	int a = 5;
	int *p = &a;
	
	cout<<p<<endl;
	cout<<*p<<endl;
	
	*p = 10;
	cout<<*p<<endl;
	*/
	/*
	int *p = new int;
	*p = 5;
	*p = 10; 
	cout<<*p<<endl;
	
	delete p;
	*/
	/*
	int *p = NULL;
	p = new int[20];
	
	delete []p;
	*/
	
	system("pause");
	return 0;
}
