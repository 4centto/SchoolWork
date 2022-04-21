#include <iostream>
#include <cstdlib>
#include <string>
#include <ctime>

using namespace std;

template <class T>
T sum (T a, T b){
	return a + b;
}

//Plantillas de clases
template <class T>
class Clase{
	private:
		T primero, segundo;
		
	public:
		Clase(T a, T b):primero(a), segundo(b){
			
		}
};

int main(){
	
	int a = 5.5, b = 15;
	cout<<sum(a, b)<<endl;
	
	system("pause");
	return 0;
	
}
