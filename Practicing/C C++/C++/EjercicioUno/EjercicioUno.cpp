#include <iostream>
#include <stdlib.h>
#include <cstdlib>
#include <math.h>
#include <ctime>
#include <string>

using namespace std;

int A[5][5];
int B[5][5];
int C[5][5];

void Llenado(int A[][5]);
void Impresion();
void Sumar(int A[][5], int B[][5], int C[][5]);

int main(){

    //Lenado
    Llenado(A);
    Llenado(B);
    Sumar(A, B, C);

    Impresion();

    system("pause");
    return 0;

}

void Impresion() {
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            cout << "[" << A[i][j] << "]";
        }
        if (i == 2) {
            cout << " + ";
        }
        if (i != 2) {
            cout << "   ";
        }
        for (int j = 0; j < 5; j++) {
            cout << "[" << B[i][j] << "]";
        }
        if (i == 2) {
            cout << " = ";
        }
        if (i != 2) {
            cout << "   ";
        }
        for (int j = 0; j < 5; j++) {
            cout << "[" << C[i][j] << "]";
        }
        cout << endl;
    }
}

void Sumar(int A[][5], int B[][5], int C[][5]) {
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            C[i][j] = A[i][j] + B[i][j];
        }
    }
}

void Llenado(int A[][5]) {
    srand(time(NULL));
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            int valor;
            do {
                valor = rand() % 99;
            } while (valor <= 9);
            A[i][j] = valor;
        }
    }
}