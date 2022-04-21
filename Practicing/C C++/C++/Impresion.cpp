#include <iostream>
using namespace std;

int main(){
	
	int N;
	cin>>N;
	
	while(N >= 1){
		cout<<N<<endl;
		if((N % 5) == 0){
			cout<<"Beep"<<endl;
		}
		N--;
	}
	
	system("pause");
	return 0;
}
