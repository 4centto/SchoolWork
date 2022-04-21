#include <stdio.h>
#include <iostream>
#include <conio.h>
#include <string>
#include <cstdio>
#include <ctime>

using namespace std;

class Nodo{
	private:
		Nodo *prev;
		int data;
		Nodo *next;
		
	public:
		Nodo(int value){
			this->prev = NULL;
			this->data = value;
			this->next = NULL;	
		}
		Nodo *getPrev(){
			return this->prev;	
		}
		void setPrev(Nodo *prev){
			this->prev = prev;
		}
		int getData(){
			return this->data;
		}
		void setData(int value){
			this->data = value;
		}
		Nodo *getNext(){
			return this->next;
		}
		void setNext(Nodo *next){
			this->next = next;
		}
};

class DoubleLinkedList{
	private:
		Nodo *head;
		int size;
		
	public:
		DoubleLinkedList(){
			this->head = NULL;
			this->size = 0;
		}
		DoubleLinkedList(int value){
			this->head = new Nodo(value);
			this->size = 1;
		}
		int getSize(){
			return this->size;
		}
		bool isEmpty(){
			if(this->head == NULL){
				return true;
			} else {
				return false;
			}
		}
		void append(int value){
			if(this->isEmpty() == true){
				this->head = new Nodo(value);
				cout<<"Nodo agregado correctamente"<<endl;
				cout<<endl;
			} else {
				Nodo *currNode = this->head;
				while(currNode->getNext() != NULL){
					currNode = currNode->getNext();
				}
				
				Nodo *aux = new Nodo(value);
				currNode->setNext(aux);
				aux->setPrev(currNode);
				
				cout<<"Nodo agregado correctamente"<<endl;
				cout<<endl;
				
			}
		}
		int fintFromTail(int value){
			if(this->isEmpty() == true){
				cout<<"La lista esta vacia"<<endl;
				cout<<endl;
			} else{
				
				Nodo *currNode = this->head;
				int posicion = 1;
				
				//Llegamos al final de la lista
				while(currNode->getNext() != NULL){
					currNode = currNode->getNext();
				}
				
				while(currNode != NULL){
					if(currNode->getData() == value){
						return posicion;
					}
					currNode = currNode->getPrev();
					posicion ++;
				}
				
				return -1;
				
			}
		}
		int fintFromHead(int value){
			if(this->isEmpty() == true){
				cout<<"La lista esta vacia"<<endl;
				cout<<endl;
			} else{
				
				Nodo *currNode = this->head;
				int posicion = 1;
				
				//Llegamos al final de la lista
				while(currNode != NULL){
					if(currNode->getData() == value){
						return posicion;
					}
					currNode = currNode->getNext();
					posicion ++;
				}
				
				return -1;
				
			}
		}
		void transversal(){
			if(this->isEmpty() == true){
				cout<<"La lista esta vacia"<<endl;
				cout<<endl;
			} else {
				Nodo *currNode = this->head;
				while(currNode != NULL){
					cout<<"["<<currNode->getData()<<"]";
					currNode = currNode->getNext();
				}
				cout<<endl;
				cout<<endl;
			}
		}
		void removeFromTail(int value){
			if(this->isEmpty() == true){
				cout<<"La lista esta vacia"<<endl;
				cout<<endl;
			} else{
				
				Nodo *currNode = this->head;
				
				//Llegamos al final de la lista
				while(currNode->getNext() != NULL){
					currNode = currNode->getNext();
				}
				
				while(currNode != NULL){
					if(currNode->getData() == value){
						
						if(currNode->getNext() == NULL){
							
							Nodo *aux = currNode->getPrev();
							aux->setNext(NULL);
							currNode->setPrev(NULL);
							
							cout<<"Nodo eliminado correctamente."<<endl;
							cout<<endl;
							
						} else if(currNode->getPrev() == NULL){
							
							Nodo *aux = currNode->getNext();
							aux->setPrev(NULL);
							currNode->setNext(NULL);
							
							this->head = aux;
							
							cout<<"Nodo eliminado correctamente."<<endl;
							cout<<endl;
							
						} else {
							
							Nodo *aux = currNode->getPrev();
							Nodo *auxDos = currNode->getNext();
							
							currNode->setNext(NULL);
							currNode->setPrev(NULL);
							
							aux->setNext(auxDos);
							auxDos->setPrev(aux);
							
							cout<<"Nodo eliminado correctamente."<<endl;
							cout<<endl;
							
						}
						
					}
					currNode = currNode->getPrev();
				}
				
			}
		}
		void removeFromHead(int value){
			if(this->isEmpty() == true){
				cout<<"La lista esta vacia"<<endl;
				cout<<endl;
			} else{
				
				Nodo *currNode = this->head;
				
				while(currNode != NULL){
					if(currNode->getData() == value){
						
						if(currNode->getNext() == NULL){
							
							Nodo *aux = currNode->getPrev();
							aux->setNext(NULL);
							currNode->setPrev(NULL);
							
							cout<<"Nodo eliminado correctamente."<<endl;
							cout<<endl;
							
						} else if(currNode->getPrev() == NULL){
							
							Nodo *aux = currNode->getNext();
							aux->setPrev(NULL);
							currNode->setNext(NULL);
							
							this->head = aux;
							
							cout<<"Nodo eliminado correctamente."<<endl;
							cout<<endl;
							
						} else {
							
							Nodo *aux = currNode->getPrev();
							Nodo *auxDos = currNode->getNext();
							
							currNode->setNext(NULL);
							currNode->setPrev(NULL);
							
							aux->setNext(auxDos);
							auxDos->setPrev(aux);
							
							cout<<"Nodo eliminado correctamente."<<endl;
							cout<<endl;
							
						}
						
					}
					currNode = currNode->getNext();
				}
				
			}
		}
		void reverseTransversal(){
			if(this->isEmpty() == true){
				cout<<"La lista esta vacia"<<endl;
				cout<<endl;
			} else{
				
				Nodo *currNode = this->head;
				
				//Llegamos al final de la lista
				while(currNode->getNext() != NULL){
					currNode = currNode->getNext();
				}
				
				while(currNode != NULL){
					cout<<"["<<currNode->getData()<<"]";
					currNode = currNode->getPrev();
				}
				cout<<endl;
				
			}
		}
};

int main(){	

	DoubleLinkedList lista;
	
	for(int i = 1; i <= 10; i++){
		lista.append(i);
	}
	system("cls");
	
	lista.transversal();
	lista.reverseTransversal();
	
	system("pause");
	return 0;
	
}
