#include <iostream>
#include <stdlib.h>
#include <cstdlib>
#include <conio.h>
#include <ctime>
#include <string>
#include <math.h>

using namespace std;

//Clases de los articulos
class Laptop {
    private:
        string id = "null";
        string marca = "null";
        string modelo = "null";
        string precio = "null";
        string color = "null";
        string pulgadas = "null";
        string resolucion = "null";
        string procesador = "null";
        string ram = "null";

    public:
        Laptop() {

        }
        string getId() {
            return id;
        }
        void setId(string id_) {
            id = id_;
        }
        string getMarca() {
            return marca;
        }
        void setMarca(string marca_) {
            marca = marca_;
        }
        string getModelo() {
            return modelo;
        }
        void setModelo(string modelo_) {
            modelo = modelo_;
        }
        string getPrecio() {
            return precio;
        }
        void setPrecio(string precio_) {
            precio = precio_;
        }
        string getColor() {
            return color;
        }
        void setColor(string color_) {
            color = color_;
        }
        string getPulgadas() {
            return pulgadas;
        }
        void setPulgadas(string pulgadas_) {
            pulgadas = pulgadas_;
        }
        string getResolucion() {
            return resolucion;
        }
        void setResolucion(string resolucion_) {
            resolucion = resolucion_;
        }
        string getProcesador() {
            return procesador;
        }
        void setProcesador(string procesador_) {
            procesador = procesador_;
        }
        string getRam() {
            return ram;
        }
        void setRam(string ram_) {
            ram = ram_;
        }
};

class Smartphone {
    private:
        string id = "null";
        string marca = "null";
        string modelo = "null";
        string precio = "null";
        string color = "null";
        string pulgadas = "null";
        string resolucion = "null";
        string interna = "null";
        string ram = "null";

    public:
        Smartphone() {

        }
        string getId() {
            return id;
        }
        void setId(string id_) {
            id = id_;
        }
        string getMarca() {
            return marca;
        }
        void setMarca(string marca_) {
            marca = marca_;
        }
        string getModelo() {
            return modelo;
        }
        void setModelo(string modelo_) {
            modelo = modelo_;
        }
        string getPrecio() {
            return precio;
        }
        void setPrecio(string precio_) {
            precio = precio_;
        }
        string getColor() {
            return color;
        }
        void setColor(string color_) {
            color = color_;
        }
        string getPulgadas() {
            return pulgadas;
        }
        void setPulgadas(string pulgadas_) {
            pulgadas = pulgadas_;
        }
        string getResolucion() {
            return resolucion;
        }
        void setResolucion(string resolucion_) {
            resolucion = resolucion_;
        }
        string getInterna() {
            return interna;
        }
        void setInterna(string interna_) {
            interna = interna_;
        }
        string getRam() {
            return ram;
        }
        void setRam(string ram_) {
            ram = ram_;
        }
};

class Bocina {
    private:
        string id = "null";
        string marca = "null";
        string modelo = "null";
        string precio = "null";
        string color = "null";
        string inalambrica = "null";
        string bluetooth = "null";
        string smart = "null";
        string volumen = "null";

    public:
        Bocina() {

        }
        string getId() {
            return id;
        }
        void setId(string id_) {
            id = id_;
        }
        string getMarca() {
            return marca;
        }
        void setMarca(string marca_) {
            marca = marca_;
        }
        string getModelo() {
            return modelo;
        }
        void setModelo(string modelo_) {
            modelo = modelo_;
        }
        string getPrecio() {
            return precio;
        }
        void setPrecio(string precio_) {
            precio = precio_;
        }
        string getColor() {
            return color;
        }
        void setColor(string color_) {
            color = color_;
        }
        string getInalambrica() {
            return inalambrica;
        }
        void setInalambrica(string inalambrica_) {
            inalambrica = inalambrica_;
        }
        string getBluetooth() {
            return bluetooth;
        }
        void setBluetooth(string bluetooth_) {
            bluetooth = bluetooth_;
        }
        string getSamart() {
            return smart;
        }
        void setSmart(string smart_) {
            smart = smart_;
        }
        string getVolumen() {
            return volumen;
        }
        void setVolumen(string volumen_) {
            volumen = volumen_;
        }
};

class Pantalla {
    private:
        string id = "null";
        string marca = "null";
        string modelo = "null";
        string precio = "null";
        string color = "null";
        string pulgadas = "null";
        string resolucion = "null";
        string smartTv = "null";
        string tipo = "null";

    public:
        Pantalla() {

        }
        string getId() {
            return id;
        }
        void setId(string id_) {
            id = id_;
        }
        string getMarca() {
            return marca;
        }
        void setMarca(string marca_) {
            marca = marca_;
        }
        string getModelo() {
            return modelo;
        }
        void setModelo(string modelo_) {
            modelo = modelo_;
        }
        string getPrecio() {
            return precio;
        }
        void setPrecio(string precio_) {
            precio = precio_;
        }
        string getColor() {
            return color;
        }
        void setColor(string color_) {
            color = color_;
        }
        string getPulgadas() {
            return pulgadas;
        }
        void setPulgadas(string pulgadas_) {
            pulgadas = pulgadas_;
        }
        string getResolucion() {
            return resolucion;
        }
        void setResolucion(string resolucion_) {
            resolucion = resolucion_;
        }
        string getSmartTv() {
            return smartTv;
        }
        void setSmartTv(string smartTv_) {
            smartTv = smartTv_;
        }
        string getTipo() {
            return tipo;
        }
        void setTipo(string tipo_) {
            tipo = tipo_;
        }
};

class Impresora {
    private:
        string id = "null";
        string marca = "null";
        string modelo = "null";
        string precio = "null";
        string color = "null";
        string cartucho = "null";
        string resolucion = "null";
        string tamano = "null";
        string calidad = "null";

    public:
        Impresora() {

        }
        string getId() {
            return id;
        }
        void setId(string id_) {
            id = id_;
        }
        string getMarca() {
            return marca;
        }
        void setMarca(string marca_) {
            marca = marca_;
        }
        string getModelo() {
            return modelo;
        }
        void setModelo(string modelo_) {
            modelo = modelo_;
        }
        string getPrecio() {
            return precio;
        }
        void setPrecio(string precio_) {
            precio = precio_;
        }
        string getColor() {
            return color;
        }
        void setColor(string color_) {
            color = color_;
        }
        string getCartucho() {
            return cartucho;
        }
        void setCartucho(string cartucho_) {
            cartucho = cartucho_;
        }
        string getResolucion() {
            return resolucion;
        }
        void setResolucion(string resolucion_) {
            resolucion = resolucion_;
        }
        string getTamano() {
            return tamano;
        }
        void setTamano(string tamano_) {
            tamano = tamano_;
        }
        string getCalidad() {
            return calidad;
        }
        void setCalidad(string calidad_) {
            calidad = calidad_;
        }
};

//Clase de la base de datos
class BaseDatos {

    private:
        Laptop *base_laptops;
        Smartphone *base_smartphones;
        Bocina *base_bocinas;
        Pantalla *base_pantallas;
        Impresora *base_impresoras;

        int contadorl = 0;
        int contadors = 0;
        int contadorb = 0; 
        int contadorp = 0;
        int contadori = 0;

    public:

        BaseDatos() {

        }

        BaseDatos(int laptops, int smartphones, int bocina, int pantallas, int impresoras) {
            base_laptops = new Laptop[laptops];
            base_smartphones = new Smartphone[smartphones];
            base_bocinas = new Bocina[bocina];
            base_pantallas = new Pantalla[pantallas];
            base_impresoras = new Impresora[impresoras];
        }

        Laptop *getBase_Laptops() {
            return base_laptops;
        }
        void setBase_Laptops(Laptop laptop) {
            base_laptops[contadorl] = laptop;
            contadorl++;
        }
        Smartphone* getBase_Smartphones() {
            return base_smartphones;
        }
        void setBase_Smartphones(Smartphone smartphone) {
            base_smartphones[contadors] = smartphone;
            contadors++;
        }
        Bocina* getBase_Bocinas() {
            return base_bocinas;
        }
        void setBase_Bocinas(Bocina bocina) {
            base_bocinas[contadorb] = bocina;
            contadorb++;
        }
        Pantalla* getBase_Pantallas() {
            return base_pantallas;
        }
        void setBase_Pantallas(Pantalla pantalla) {
            base_pantallas[contadorp] = pantalla;
            contadorp++;
        }
        Impresora* getBase_Impresoras() {
            return base_impresoras;
        }
        void setBase_Impresoras(Impresora impresora) {
            base_impresoras[contadori] = impresora;
            contadori++;
        }
};

//Prototipos de los metodos para el menu de seleccion
void Leer();
void Imprimir();
void Buscar();
void Editar();

//Prototipos de los metodos para buscar los productos
void BuscarLaptops();
void BuscarSmartphones();
void BuscarBocinas();
void BuscarPantallas();
void BuscarImpresoras();

//Variables globales para los id's y la declaracion de los arreglos dinamicos
BaseDatos bd;
int lap = 1;
int sma = 1;
int boc = 1;
int pan = 1;
int imp = 1;
int cantl, cants, cantb, cantp, canti; // <- Estas son para los arreglos dinamicos
int cant_laptops = 0, cant_smartphones = 0, cant_bocinas = 0, cant_pantallas = 0, cant_impresoras = 0; // <- Estas son para llevar un conteo de los productos registrados hasta el momento

//Metodo Main
int main(){

    int eleccion_menu = 0;

    do {
        system("cls");
        cout << " * Cantidades a ingresar * " << endl;
        cout << "Cantidad de laptops: ";
        cin >> cantl;
        cout << "Cantidad de smartphones: ";
        cin >> cants;
        cout << "Cantidad de bocinas: ";
        cin >> cantb;
        cout << "Cantidad de pantallas: ";
        cin >> cantp;
        cout << "Cantidad de impresoras: ";
        cin >> canti;

        if (cantl <= 0 || cants <= 0 || cantb <= 0 || cantp <= 0 || canti <= 0) {
            cout << "No puedes ingresar 0. Por favor vuelve a intentarlo." << endl;
            system("pause");
        }

    } while (cantl <= 0 || cants <= 0 || cantb <= 0 || cantp <= 0 || canti <= 0);

    system("cls");

    bd = BaseDatos(cantl, cants, cantb, cantp, canti);

    cout << "\t¡Bienvenido!" << endl;

    do {
        system("cls");
        
        cout << "1. Leer. " << endl;
        cout << "2. Imprimir. " << endl;
        cout << "3. Buscar ." << endl;
        cout << "4. Editar. " << endl;
        cout << "5. Salir. " << endl;
        cout << endl;
        cout << "¿Que deseas hacer? ";
        cin >> eleccion_menu;

        switch (eleccion_menu) {
        case 1:
            Leer();
            break;
        case 2:
            Imprimir();
            break;
        case 3:
            Buscar();
            break;
        case 4:
            Editar();
            break;
        case 5:
            cout << "Hasta luego!!" << endl;
            system("pause");
            break;
        default:
            cout << "La opcion seleccionada no existe. Vuelve a ingresar una opcion. " << endl;
            system("pause");
            break;
        }

    } while (eleccion_menu != 5);

    system("cls");
    
    system("pause");
    return 0;
}

//Metodos del menu del usuario
void Leer() {
    system("cls");

    int eleccion = 0;
    string c1, c2, c3, c4, c5, c6, c7, c8;

    Laptop laptop;
    Smartphone smartphone;
    Bocina bocina;
    Pantalla pantalla;
    Impresora impresora;

    cout << "\tQue deseas ingresar: " << endl;
    cout << "1. Laptop. " << endl;
    cout << "2. Smartphone. " << endl;
    cout << "3. Bocina. " << endl;
    cout << "4. Pantalla. " << endl;
    cout << "5. Impresora. " << endl;
    cin >> eleccion;

    switch (eleccion) {
    case 1:
        system("cls");
        if ((cantl - cant_laptops) != 0) {

            laptop = Laptop();
            cout << "-> Marca: ";
            cin >> c1;
            cout << "-> Modelo: ";
            cin >> c2;
            cout << "-> Precio: ";
            cin >> c3;
            cout << "-> Color: ";
            cin >> c4;
            cout << "-> Pulgadas: ";
            cin >> c5;
            cout << "-> Resolcucion: ";
            cin >> c6;
            cout << "-> Procesador: ";
            cin >> c7;
            cout << "-> Ram: ";
            cin >> c8;

            laptop.setId("L" + to_string(lap));
            laptop.setMarca(c1);
            laptop.setModelo(c2);
            laptop.setPrecio(c3);
            laptop.setColor(c4);
            laptop.setPulgadas(c5);
            laptop.setResolucion(c6);
            laptop.setProcesador(c7);
            laptop.setRam(c8);

            bd.setBase_Laptops(laptop);
            lap++;
            cant_laptops++;

            cout << "\n * Producto agregado correctamente!" << endl;

        }
        else {
            cout << "\n *** No hay mas espacio para registrar mas laptops" << endl;
        }

        system("pause");
        break;

    case 2:
        system("cls");
        if ((cants - cant_smartphones) != 0) {
            smartphone = Smartphone();
            smartphone.setId("S" + to_string(sma));
            cout << "-> Marca: ";
            cin >> c1;
            cout << "-> Modelo: ";
            cin >> c2;
            cout << "-> Precio: ";
            cin >> c3;
            cout << "-> Color: ";
            cin >> c4;
            cout << "-> Pulgadas: ";
            cin >> c5;
            cout << "-> Resolcucion: ";
            cin >> c6;
            cout << "-> Memoria interna: ";
            cin >> c7;
            cout << "-> Ram: ";
            cin >> c8;

            smartphone.setMarca(c1);
            smartphone.setModelo(c2);
            smartphone.setPrecio(c3);
            smartphone.setColor(c4);
            smartphone.setPulgadas(c5);
            smartphone.setResolucion(c6);
            smartphone.setInterna(c7);
            smartphone.setRam(c8);

            bd.setBase_Smartphones(smartphone);
            sma++;
            cant_smartphones++;

            cout << "\n * Producto agregado correctamente!" << endl;

        }
        else {
            cout << "\n *** No hay mas espacio para registrar mas smartphones" << endl;
        }
        system("pause");
        break;

    case 3:
        system("cls");
        if ((cantb - cant_bocinas) != 0) {
            bocina = Bocina();
            bocina.setId("B" + to_string(boc));
            cout << "-> Marca: ";
            cin >> c1;
            cout << "-> Modelo: ";
            cin >> c2;
            cout << "-> Precio: ";
            cin >> c3;
            cout << "-> Color: ";
            cin >> c4;
            cout << "-> Inalambrica: ";
            cin >> c5;
            cout << "-> Bluetooth: ";
            cin >> c6;
            cout << "-> Smart: ";
            cin >> c7;
            cout << "-> Volumen: ";
            cin >> c8;

            bocina.setMarca(c1);
            bocina.setModelo(c2);
            bocina.setPrecio(c3);
            bocina.setColor(c4);
            bocina.setInalambrica(c5);
            bocina.setBluetooth(c6);
            bocina.setSmart(c7);
            bocina.setVolumen(c8);

            bd.setBase_Bocinas(bocina);
            boc++;
            cant_bocinas++;

            cout << "\n * Producto agregado correctamente!" << endl;

        }
        else {
            cout << "\n *** No hay mas espacio para registrar mas bocinas" << endl;
        }
        system("pause");
        break;

    case 4:
        system("cls");
        if ((cantp - cant_pantallas) != 0) {
            pantalla = Pantalla();
            pantalla.setId("P" + to_string(pan));
            cout << "-> Marca: ";
            cin >> c1;
            cout << "-> Modelo: ";
            cin >> c2;
            cout << "-> Precio: ";
            cin >> c3;
            cout << "-> Color: ";
            cin >> c4;
            cout << "-> Pulgadas: ";
            cin >> c5;
            cout << "-> Resolucion: ";
            cin >> c6;
            cout << "-> SmartTv: ";
            cin >> c7;
            cout << "-> Tipo: ";
            cin >> c8;

            pantalla.setMarca(c1);
            pantalla.setModelo(c2);
            pantalla.setPrecio(c3);
            pantalla.setColor(c4);
            pantalla.setPulgadas(c5);
            pantalla.setResolucion(c6);
            pantalla.setSmartTv(c7);
            pantalla.setTipo(c8);

            bd.setBase_Pantallas(pantalla);
            pan++;
            cant_pantallas++;

            cout << "\n * Producto agregado correctamente!" << endl;

        }
        else {
            cout << "\n *** No hay mas espacio para registrar mas pantallas" << endl;
        }
        system("pause");
        break;

    case 5:
        system("cls");
        if ((canti - cant_impresoras) != 0) {
            impresora = Impresora();
            impresora.setId("I" + to_string(imp));
            cout << "-> Marca: ";
            cin >> c1;
            cout << "-> Modelo: ";
            cin >> c2;
            cout << "-> Precio: ";
            cin >> c3;
            cout << "-> Color: ";
            cin >> c4;
            cout << "-> Cartucho: ";
            cin >> c5;
            cout << "-> Resolucion: ";
            cin >> c6;
            cout << "-> Tamaño: ";
            cin >> c7;
            cout << "-> Calidad: ";
            cin >> c8;

            impresora.setMarca(c1);
            impresora.setModelo(c2);
            impresora.setPrecio(c3);
            impresora.setColor(c4);
            impresora.setCartucho(c5);
            impresora.setResolucion(c6);
            impresora.setTamano(c7);
            impresora.setCalidad(c8);

            bd.setBase_Impresoras(impresora);
            imp++;
            cant_impresoras++;

            cout << "\n * Producto agregado correctamente!" << endl;

        }
        else {
            cout << "\n *** No hay mas espacio para registrar mas impresoras" << endl;
        }

        system("pause");
        break;
    default:
        cout << "El producto elegido no existe. Vuelve a intentarlo. " << endl;
        system("pause");
        break;
    }

}

void Imprimir() {
    system("cls");
    int eleccion = 0;

    Laptop* lista;
    Smartphone* listas;
    Bocina* listab;
    Pantalla* listap;
    Impresora* listai;

    cout << "\tQue deseas imprimir: " << endl;
    cout << "1. Laptop. " << endl;
    cout << "2. Smartphone. " << endl;
    cout << "3. Bocina. " << endl;
    cout << "4. Pantalla. " << endl;
    cout << "5. Impresora. " << endl;
    cin >> eleccion;

    switch (eleccion) {

    case 1:

        lista = bd.getBase_Laptops();
        cout << "\t * Laptops registradas * " << endl;
        for (int i = 0; i < cantl; i++) {
            string id = lista[i].getId();
            if (id != "null") {
                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << lista[i].getId() << endl;
                cout << "-> Marca: " << lista[i].getMarca() << endl;
                cout << "-> Modelo: " << lista[i].getModelo() << endl;
                cout << "-> Precio: " << lista[i].getPrecio() << endl;
                cout << "-> Color: " << lista[i].getColor() << endl;
                cout << "-> Pulgadas: " << lista[i].getPulgadas() << endl;
                cout << "-> Resolucion: " << lista[i].getResolucion() << endl;
                cout << "-> Procesador: " << lista[i].getProcesador() << endl;
                cout << "-> RAM: " << lista[i].getRam() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;
            }
        }
        system("pause");
        break;

    case 2:
        listas = bd.getBase_Smartphones();
        cout << "\t * Smartphones registrados * " << endl;
  
        for (int i = 0; i < cants; i++) {
            string id = listas[i].getId();
            if (id != "null") {
                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << listas[i].getId() << endl;
                cout << "-> Marca: " << listas[i].getMarca() << endl;
                cout << "-> Modelo: " << listas[i].getModelo() << endl;
                cout << "-> Precio: " << listas[i].getPrecio() << endl;
                cout << "-> Color: " << listas[i].getColor() << endl;
                cout << "-> Pulgadas: " << listas[i].getPulgadas() << endl;
                cout << "-> Resolucion: " << listas[i].getResolucion() << endl;
                cout << "-> Interna: " << listas[i].getInterna() << endl;
                cout << "-> RAM: " << listas[i].getRam() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;
            }
        }
        system("pause");
        break;

    case 3:
        listab = bd.getBase_Bocinas();
        cout << "\t * Bocinas registradas * " << endl;
        for (int i = 0; i < cantb; i++) {
            string id = listab[i].getId();
            if (id != "null") {
                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << listab[i].getId() << endl;
                cout << "-> Marca: " << listab[i].getMarca() << endl;
                cout << "-> Modelo: " << listab[i].getModelo() << endl;
                cout << "-> Precio: " << listab[i].getPrecio() << endl;
                cout << "-> Color: " << listab[i].getColor() << endl;
                cout << "-> Inalambrica: " << listab[i].getInalambrica() << endl;
                cout << "-> Bluetooth: " << listab[i].getBluetooth() << endl;
                cout << "-> Smart: " << listab[i].getSamart() << endl;
                cout << "-> Volumen: " << listab[i].getVolumen() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;
            }
        }
        system("pause");
        break;

    case 4:
        listap = bd.getBase_Pantallas();
        cout << "\t * Pantallas registradas * " << endl;
        for (int i = 0; i < cantp; i++) {
            string id = listap[i].getId();
            if (id != "null") {
                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << listap[i].getId() << endl;
                cout << "-> Marca: " << listap[i].getMarca() << endl;
                cout << "-> Modelo: " << listap[i].getModelo() << endl;
                cout << "-> Precio: " << listap[i].getPrecio() << endl;
                cout << "-> Color: " << listap[i].getColor() << endl;
                cout << "-> Pulgadas: " << listap[i].getPulgadas() << endl;
                cout << "-> Resolucion: " << listap[i].getResolucion() << endl;
                cout << "-> Smart Tv: " << listap[i].getSmartTv() << endl;
                cout << "-> Tipo: " << listap[i].getTipo() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;
            }
        }
        system("pause");
        break;

    case 5:
        listai = bd.getBase_Impresoras();
        cout << "\t * Impresoras registradas * " << endl;
        for (int i = 0; i < canti; i++) {
            string id = listai[i].getId();
            if (id != "null") {
                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << listai[i].getId() << endl;
                cout << "-> Marca: " << listai[i].getMarca() << endl;
                cout << "-> Modelo: " << listai[i].getModelo() << endl;
                cout << "-> Precio: " << listai[i].getPrecio() << endl;
                cout << "-> Color: " << listai[i].getColor() << endl;
                cout << "-> Cartucho: " << listai[i].getCartucho() << endl;
                cout << "-> Resolucion: " << listai[i].getResolucion() << endl;
                cout << "-> Tamano: " << listai[i].getTamano() << endl;
                cout << "-> Calidad: " << listai[i].getCalidad() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;
            }
        }
        system("pause");
        break;

    default:
        cout << "El producto elegido no existe. Vuelve a intentarlo. " << endl;
        system("pause");
        break;
    }
}

void Buscar() {
    system("cls");
    int eleccion = 0;

    cout << "\tQue deseas buscar: " << endl;
    cout << "1. Laptop. " << endl;
    cout << "2. Smartphone. " << endl;
    cout << "3. Bocina. " << endl;
    cout << "4. Pantalla. " << endl;
    cout << "5. Impresora. " << endl;
    cin >> eleccion;

    switch (eleccion) {
    case 1:
        BuscarLaptops();
        break;
    case 2:
        BuscarSmartphones();
        break;
    case 3:
        BuscarBocinas();
        break;
    case 4:
        BuscarPantallas();
        break;
    case 5:
        BuscarImpresoras();
        break;
    default:
        cout << "El producto elegido no existe. Vuelve a intentarlo. " << endl;
        system("pause");
        break;
    }

}

void Editar() {
    system("cls");
    int eleccion = 0;
    string id;
    string c1, c2, c3, c4, c5, c6, c7, c8;
    int contador = 0;

    Laptop* laptops;
    Smartphone* smartphones;
    Bocina* bocinas;
    Pantalla* pantallas;
    Impresora* impresoras;

    cout << "\tQue articulo deseas editar: " << endl;
    cout << "1. Laptop. " << endl;
    cout << "2. Smartphone. " << endl;
    cout << "3. Bocina. " << endl;
    cout << "4. Pantalla. " << endl;
    cout << "5. Impresora. " << endl;
    cin >> eleccion;

    switch (eleccion) {

    case 1:
        system("cls");

        cout << "Ingresa el ID del producto: ";
        cin >> id;

        laptops = bd.getBase_Laptops();

        for (int i = 0; i < cantl; i++) {
            if (laptops[i].getId() == id) {

                cout << "-> Marca: ";
                cin >> c1;
                cout << "-> Modelo: ";
                cin >> c2;
                cout << "-> Precio: ";
                cin >> c3;
                cout << "-> Color: ";
                cin >> c4;
                cout << "-> Pulgadas: ";
                cin >> c5;
                cout << "-> Resolcucion: ";
                cin >> c6;
                cout << "-> Procesador: ";
                cin >> c7;
                cout << "-> Ram: ";
                cin >> c8;

                laptops[i].setMarca(c1);
                laptops[i].setModelo(c2);
                laptops[i].setPrecio(c3);
                laptops[i].setColor(c4);
                laptops[i].setPulgadas(c5);
                laptops[i].setResolucion(c6);
                laptops[i].setProcesador(c7);
                laptops[i].setRam(c8);

                contador++;

                cout << endl;
                cout << "Producto modificado correctamente. " <<endl;

            }

            if (contador == 0) {
                cout << "El producto no ha sido encontrado" << endl;
            }
            system("pause");
        }

        break;

    case 2:
        system("cls");

        cout << "Ingresa el ID del producto: ";
        cin >> id;

        smartphones = bd.getBase_Smartphones();

        for (int i = 0; i < cants; i++) {
            if (smartphones[i].getId() == id) {

                cout << "-> Marca: ";
                cin >> c1;
                cout << "-> Modelo: ";
                cin >> c2;
                cout << "-> Precio: ";
                cin >> c3;
                cout << "-> Color: ";
                cin >> c4;
                cout << "-> Pulgadas: ";
                cin >> c5;
                cout << "-> Resolcucion: ";
                cin >> c6;
                cout << "-> Memoria interna: ";
                cin >> c7;
                cout << "-> Ram: ";
                cin >> c8;

                smartphones[i].setMarca(c1);
                smartphones[i].setModelo(c2);
                smartphones[i].setPrecio(c3);
                smartphones[i].setColor(c4);
                smartphones[i].setPulgadas(c5);
                smartphones[i].setResolucion(c6);
                smartphones[i].setInterna(c7);
                smartphones[i].setRam(c8);

                contador++;

                cout << endl;
                cout << "Producto modificado correctamente. " << endl;

            }

            if (contador == 0) {
                cout << "El producto no ha sido encontrado" << endl;
            }
            system("pause");
        }
        break;

    case 3:
        system("cls");

        cout << "Ingresa el ID del producto: ";
        cin >> id;

        bocinas = bd.getBase_Bocinas();

        for (int i = 0; i < cantb; i++) {
            if (bocinas[i].getId() == id) {

                cout << "-> Marca: ";
                cin >> c1;
                cout << "-> Modelo: ";
                cin >> c2;
                cout << "-> Precio: ";
                cin >> c3;
                cout << "-> Color: ";
                cin >> c4;
                cout << "-> Inalambrica: ";
                cin >> c5;
                cout << "-> Bluetooth: ";
                cin >> c6;
                cout << "-> Smart: ";
                cin >> c7;
                cout << "-> Volumen: ";
                cin >> c8;

                bocinas[i].setMarca(c1);
                bocinas[i].setModelo(c2);
                bocinas[i].setPrecio(c3);
                bocinas[i].setColor(c4);
                bocinas[i].setInalambrica(c5);
                bocinas[i].setBluetooth(c6);
                bocinas[i].setSmart(c7);
                bocinas[i].setVolumen(c8);

                contador++;

                cout << endl;
                cout << "Producto modificado correctamente. " << endl;

            }

            if (contador == 0) {
                cout << "El producto no ha sido encontrado" << endl;
            }
            system("pause");
        }
        break;

    case 4:
        system("cls");

        cout << "Ingresa el ID del producto: ";
        cin >> id;

        pantallas = bd.getBase_Pantallas();

        for (int i = 0; i < cantp; i++) {
            if (pantallas[i].getId() == id) {

                cout << "-> Marca: ";
                cin >> c1;
                cout << "-> Modelo: ";
                cin >> c2;
                cout << "-> Precio: ";
                cin >> c3;
                cout << "-> Color: ";
                cin >> c4;
                cout << "-> Pulgadas: ";
                cin >> c5;
                cout << "-> Resolucion: ";
                cin >> c6;
                cout << "-> SmartTv: ";
                cin >> c7;
                cout << "-> Tipo: ";
                cin >> c8;

                pantallas[i].setMarca(c1);
                pantallas[i].setModelo(c2);
                pantallas[i].setPrecio(c3);
                pantallas[i].setColor(c4);
                pantallas[i].setPulgadas(c5);
                pantallas[i].setResolucion(c6);
                pantallas[i].setSmartTv(c7);
                pantallas[i].setTipo(c8);

                contador++;

                cout << endl;
                cout << "Producto modificado correctamente. " << endl;

            }

            if (contador == 0) {
                cout << "El producto no ha sido encontrado" << endl;
            }
            system("pause");
        }
        break;

    case 5:
        system("cls");

        cout << "Ingresa el ID del producto: ";
        cin >> id;

        impresoras = bd.getBase_Impresoras();

        for (int i = 0; i < canti; i++) {
            if (impresoras[i].getId() == id) {

                cout << "-> Marca: ";
                cin >> c1;
                cout << "-> Modelo: ";
                cin >> c2;
                cout << "-> Precio: ";
                cin >> c3;
                cout << "-> Color: ";
                cin >> c4;
                cout << "-> Cartucho: ";
                cin >> c5;
                cout << "-> Resolucion: ";
                cin >> c6;
                cout << "-> Tamaño: ";
                cin >> c7;
                cout << "-> Calidad: ";
                cin >> c8;

                impresoras[i].setMarca(c1);
                impresoras[i].setModelo(c2);
                impresoras[i].setPrecio(c3);
                impresoras[i].setColor(c4);
                impresoras[i].setCartucho(c5);
                impresoras[i].setResolucion(c6);
                impresoras[i].setTamano(c7);
                impresoras[i].setCalidad(c8);

                contador++;

                cout << endl;
                cout << "Producto modificado correctamente. " << endl;

            }

            if (contador == 0) {
                cout << "El producto no ha sido encontrado" << endl;
            }
            system("pause");
        }
        break;

    default:
        cout << "El producto elegido no existe. Vuelve a intentarlo. " << endl;
        system("pause");
        break;

    }
}

//Metodos para las busquedas de productos
void BuscarLaptops() {
    system("cls");
    int eleccion = 0;
    string criterio;
    int contador = 0;

    Laptop* laptops;

    cout << "\tCriterio de busqueda: " << endl;
    cout << "1. Marca. " << endl;
    cout << "2. Modelo. " << endl;
    cout << "3. Precio. " << endl;
    cin >> eleccion;

    switch (eleccion) {

    case 1:
        laptops = bd.getBase_Laptops();

        cout << "Cual es la marca: ";
        cin >> criterio;

        for (int i = 0; i < cantl; i++) {

            string marca = laptops[i].getMarca();
            if (marca == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << laptops[i].getId() << endl;
                cout << "-> Marca: " << laptops[i].getMarca() << endl;
                cout << "-> Modelo: " << laptops[i].getModelo() << endl;
                cout << "-> Precio: " << laptops[i].getPrecio() << endl;
                cout << "-> Color: " << laptops[i].getColor() << endl;
                cout << "-> Pulgadas: " << laptops[i].getPulgadas() << endl;
                cout << "-> Resolucion: " << laptops[i].getResolucion() << endl;
                cout << "-> Procesador: " << laptops[i].getProcesador() << endl;
                cout << "-> RAM: " << laptops[i].getRam() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");

        break;

    case 2:
        laptops = bd.getBase_Laptops();

        cout << "Cual es la modelo: ";
        cin >> criterio;

        for (int i = 0; i < cantl; i++) {

            string modelo = laptops[i].getModelo();
            if (modelo == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << laptops[i].getId() << endl;
                cout << "-> Marca: " << laptops[i].getMarca() << endl;
                cout << "-> Modelo: " << laptops[i].getModelo() << endl;
                cout << "-> Precio: " << laptops[i].getPrecio() << endl;
                cout << "-> Color: " << laptops[i].getColor() << endl;
                cout << "-> Pulgadas: " << laptops[i].getPulgadas() << endl;
                cout << "-> Resolucion: " << laptops[i].getResolucion() << endl;
                cout << "-> Procesador: " << laptops[i].getProcesador() << endl;
                cout << "-> RAM: " << laptops[i].getRam() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");
        break;

    case 3:
        laptops = bd.getBase_Laptops();

        cout << "Cual es el precio: ";
        cin >> criterio;

        for (int i = 0; i < cantl; i++) {

            string precio = laptops[i].getPrecio();
            if (precio == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << laptops[i].getId() << endl;
                cout << "-> Marca: " << laptops[i].getMarca() << endl;
                cout << "-> Modelo: " << laptops[i].getModelo() << endl;
                cout << "-> Precio: " << laptops[i].getPrecio() << endl;
                cout << "-> Color: " << laptops[i].getColor() << endl;
                cout << "-> Pulgadas: " << laptops[i].getPulgadas() << endl;
                cout << "-> Resolucion: " << laptops[i].getResolucion() << endl;
                cout << "-> Procesador: " << laptops[i].getProcesador() << endl;
                cout << "-> RAM: " << laptops[i].getRam() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");
        break;

    default:
        cout << "El producto elegido no existe. Vuelve a intentarlo. " << endl;
        system("pause");
        break;
    }

}

void BuscarSmartphones() {
    system("cls");
    int eleccion = 0;
    string criterio;
    int contador = 0;

    Smartphone* smartphones;

    cout << "\tCriterio de busqueda: " << endl;
    cout << "1. Marca. " << endl;
    cout << "2. Modelo. " << endl;
    cout << "3. Precio. " << endl;
    cin >> eleccion;

    switch (eleccion) {

    case 1:
        smartphones = bd.getBase_Smartphones();

        cout << "Cual es la marca: ";
        cin >> criterio;

        for (int i = 0; i < cants; i++) {

            string marca = smartphones[i].getMarca();
            if (marca == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << smartphones[i].getId() << endl;
                cout << "-> Marca: " << smartphones[i].getMarca() << endl;
                cout << "-> Modelo: " << smartphones[i].getModelo() << endl;
                cout << "-> Precio: " << smartphones[i].getPrecio() << endl;
                cout << "-> Color: " << smartphones[i].getColor() << endl;
                cout << "-> Pulgadas: " << smartphones[i].getPulgadas() << endl;
                cout << "-> Resolucion: " << smartphones[i].getResolucion() << endl;
                cout << "-> Interna: " << smartphones[i].getInterna() << endl;
                cout << "-> RAM: " << smartphones[i].getRam() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");

        break;

    case 2:
        smartphones = bd.getBase_Smartphones();

        cout << "Cual es el modelo: ";
        cin >> criterio;

        for (int i = 0; i < cants; i++) {

            string modelo = smartphones[i].getModelo();
            if (modelo == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << smartphones[i].getId() << endl;
                cout << "-> Marca: " << smartphones[i].getMarca() << endl;
                cout << "-> Modelo: " << smartphones[i].getModelo() << endl;
                cout << "-> Precio: " << smartphones[i].getPrecio() << endl;
                cout << "-> Color: " << smartphones[i].getColor() << endl;
                cout << "-> Pulgadas: " << smartphones[i].getPulgadas() << endl;
                cout << "-> Resolucion: " << smartphones[i].getResolucion() << endl;
                cout << "-> Interna: " << smartphones[i].getInterna() << endl;
                cout << "-> RAM: " << smartphones[i].getRam() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");
        break;

    case 3:
        smartphones = bd.getBase_Smartphones();

        cout << "Cual es el precio: ";
        cin >> criterio;

        for (int i = 0; i < cants; i++) {

            string precio = smartphones[i].getPrecio();
            if (precio == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << smartphones[i].getId() << endl;
                cout << "-> Marca: " << smartphones[i].getMarca() << endl;
                cout << "-> Modelo: " << smartphones[i].getModelo() << endl;
                cout << "-> Precio: " << smartphones[i].getPrecio() << endl;
                cout << "-> Color: " << smartphones[i].getColor() << endl;
                cout << "-> Pulgadas: " << smartphones[i].getPulgadas() << endl;
                cout << "-> Resolucion: " << smartphones[i].getResolucion() << endl;
                cout << "-> Interna: " << smartphones[i].getInterna() << endl;
                cout << "-> RAM: " << smartphones[i].getRam() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");
        break;

    default:
        cout << "El producto elegido no existe. Vuelve a intentarlo. " << endl;
        system("pause");
        break;
    }

}

void BuscarBocinas() {
    system("cls");
    int eleccion = 0;
    string criterio;
    int contador = 0;

    Bocina* bocina;

    cout << "\tCriterio de busqueda: " << endl;
    cout << "1. Marca. " << endl;
    cout << "2. Modelo. " << endl;
    cout << "3. Precio. " << endl;
    cin >> eleccion;

    switch (eleccion) {

    case 1:
        bocina = bd.getBase_Bocinas();

        cout << "Cual es la marca: ";
        cin >> criterio;

        for (int i = 0; i < cantb; i++) {

            string marca = bocina[i].getMarca();
            if (marca == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << bocina[i].getId() << endl;
                cout << "-> Marca: " << bocina[i].getMarca() << endl;
                cout << "-> Modelo: " << bocina[i].getModelo() << endl;
                cout << "-> Precio: " << bocina[i].getPrecio() << endl;
                cout << "-> Color: " << bocina[i].getColor() << endl;
                cout << "-> Inalambrica: " << bocina[i].getInalambrica() << endl;
                cout << "-> Bluetooth: " << bocina[i].getBluetooth() << endl;
                cout << "-> Smart: " << bocina[i].getSamart() << endl;
                cout << "-> Volumen: " << bocina[i].getVolumen() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");

        break;

    case 2:
        bocina = bd.getBase_Bocinas();

        cout << "Cual es el modelo: ";
        cin >> criterio;

        for (int i = 0; i < cantb; i++) {

            string modelo = bocina[i].getModelo();
            if (modelo == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << bocina[i].getId() << endl;
                cout << "-> Marca: " << bocina[i].getMarca() << endl;
                cout << "-> Modelo: " << bocina[i].getModelo() << endl;
                cout << "-> Precio: " << bocina[i].getPrecio() << endl;
                cout << "-> Color: " << bocina[i].getColor() << endl;
                cout << "-> Inalambrica: " << bocina[i].getInalambrica() << endl;
                cout << "-> Bluetooth: " << bocina[i].getBluetooth() << endl;
                cout << "-> Smart: " << bocina[i].getSamart() << endl;
                cout << "-> Volumen: " << bocina[i].getVolumen() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");
        break;

    case 3:
        bocina = bd.getBase_Bocinas();

        cout << "Cual es el precio: ";
        cin >> criterio;

        for (int i = 0; i < cantb; i++) {

            string precio = bocina[i].getPrecio();
            if (precio == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << bocina[i].getId() << endl;
                cout << "-> Marca: " << bocina[i].getMarca() << endl;
                cout << "-> Modelo: " << bocina[i].getModelo() << endl;
                cout << "-> Precio: " << bocina[i].getPrecio() << endl;
                cout << "-> Color: " << bocina[i].getColor() << endl;
                cout << "-> Inalambrica: " << bocina[i].getInalambrica() << endl;
                cout << "-> Bluetooth: " << bocina[i].getBluetooth() << endl;
                cout << "-> Smart: " << bocina[i].getSamart() << endl;
                cout << "-> Volumen: " << bocina[i].getVolumen() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");
        break;

    default:
        cout << "El producto elegido no existe. Vuelve a intentarlo. " << endl;
        system("pause");
        break;
    }

}

void BuscarPantallas() {
    system("cls");
    int eleccion = 0;
    string criterio;
    int contador = 0;

    Pantalla* pantalla;

    cout << "\tCriterio de busqueda: " << endl;
    cout << "1. Marca. " << endl;
    cout << "2. Modelo. " << endl;
    cout << "3. Precio. " << endl;
    cin >> eleccion;

    switch (eleccion) {

    case 1:
        pantalla = bd.getBase_Pantallas();

        cout << "Cual es la marca: ";
        cin >> criterio;

        for (int i = 0; i < cantp; i++) {

            string marca = pantalla[i].getMarca();
            if (marca == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << pantalla[i].getId() << endl;
                cout << "-> Marca: " << pantalla[i].getMarca() << endl;
                cout << "-> Modelo: " << pantalla[i].getModelo() << endl;
                cout << "-> Precio: " << pantalla[i].getPrecio() << endl;
                cout << "-> Color: " << pantalla[i].getColor() << endl;
                cout << "-> Pulgadas: " << pantalla[i].getPulgadas() << endl;
                cout << "-> Resolucion: " << pantalla[i].getResolucion() << endl;
                cout << "-> Smart Tv: " << pantalla[i].getSmartTv() << endl;
                cout << "-> Tipo: " << pantalla[i].getTipo() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");

        break;

    case 2:
        pantalla = bd.getBase_Pantallas();

        cout << "Cual es el modelo: ";
        cin >> criterio;

        for (int i = 0; i < cantp; i++) {

            string modelo = pantalla[i].getModelo();
            if (modelo == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << pantalla[i].getId() << endl;
                cout << "-> Marca: " << pantalla[i].getMarca() << endl;
                cout << "-> Modelo: " << pantalla[i].getModelo() << endl;
                cout << "-> Precio: " << pantalla[i].getPrecio() << endl;
                cout << "-> Color: " << pantalla[i].getColor() << endl;
                cout << "-> Pulgadas: " << pantalla[i].getPulgadas() << endl;
                cout << "-> Resolucion: " << pantalla[i].getResolucion() << endl;
                cout << "-> Smart Tv: " << pantalla[i].getSmartTv() << endl;
                cout << "-> Tipo: " << pantalla[i].getTipo() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");
        break;

    case 3:
        pantalla = bd.getBase_Pantallas();

        cout << "Cual es el precio: ";
        cin >> criterio;

        for (int i = 0; i < cantp; i++) {

            string precio = pantalla[i].getPrecio();
            if (precio == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << pantalla[i].getId() << endl;
                cout << "-> Marca: " << pantalla[i].getMarca() << endl;
                cout << "-> Modelo: " << pantalla[i].getModelo() << endl;
                cout << "-> Precio: " << pantalla[i].getPrecio() << endl;
                cout << "-> Color: " << pantalla[i].getColor() << endl;
                cout << "-> Pulgadas: " << pantalla[i].getPulgadas() << endl;
                cout << "-> Resolucion: " << pantalla[i].getResolucion() << endl;
                cout << "-> Smart Tv: " << pantalla[i].getSmartTv() << endl;
                cout << "-> Tipo: " << pantalla[i].getTipo() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");
        break;

    default:
        cout << "El producto elegido no existe. Vuelve a intentarlo. " << endl;
        system("pause");
        break;
    }

}

void BuscarImpresoras() {
    system("cls");
    int eleccion = 0;
    string criterio;
    int contador = 0;

    Impresora* impresora;

    cout << "\tCriterio de busqueda: " << endl;
    cout << "1. Marca. " << endl;
    cout << "2. Modelo. " << endl;
    cout << "3. Precio. " << endl;
    cin >> eleccion;

    switch (eleccion) {

    case 1:
        impresora = bd.getBase_Impresoras();

        cout << "Cual es la marca: ";
        cin >> criterio;

        for (int i = 0; i < canti; i++) {

            string marca = impresora[i].getMarca();
            if (marca == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << impresora[i].getId() << endl;
                cout << "-> Marca: " << impresora[i].getMarca() << endl;
                cout << "-> Modelo: " << impresora[i].getModelo() << endl;
                cout << "-> Precio: " << impresora[i].getPrecio() << endl;
                cout << "-> Color: " << impresora[i].getColor() << endl;
                cout << "-> Cartucho: " << impresora[i].getCartucho() << endl;
                cout << "-> Resolucion: " << impresora[i].getResolucion() << endl;
                cout << "-> Tamano: " << impresora[i].getTamano() << endl;
                cout << "-> Calidad: " << impresora[i].getCalidad() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");

        break;

    case 2:
        impresora = bd.getBase_Impresoras();

        cout << "Cual es el modelo: ";
        cin >> criterio;

        for (int i = 0; i < canti; i++) {

            string modelo = impresora[i].getModelo();
            if (modelo == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << impresora[i].getId() << endl;
                cout << "-> Marca: " << impresora[i].getMarca() << endl;
                cout << "-> Modelo: " << impresora[i].getModelo() << endl;
                cout << "-> Precio: " << impresora[i].getPrecio() << endl;
                cout << "-> Color: " << impresora[i].getColor() << endl;
                cout << "-> Cartucho: " << impresora[i].getCartucho() << endl;
                cout << "-> Resolucion: " << impresora[i].getResolucion() << endl;
                cout << "-> Tamano: " << impresora[i].getTamano() << endl;
                cout << "-> Calidad: " << impresora[i].getCalidad() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");
        break;

    case 3:
        impresora = bd.getBase_Impresoras();

        cout << "Cual es el precio: ";
        cin >> criterio;

        for (int i = 0; i < canti; i++) {

            string precio = impresora[i].getPrecio();
            if (precio == criterio) {

                cout << " - - - - - - - - - - - - - - - - " << endl;
                cout << "-> Id: " << impresora[i].getId() << endl;
                cout << "-> Marca: " << impresora[i].getMarca() << endl;
                cout << "-> Modelo: " << impresora[i].getModelo() << endl;
                cout << "-> Precio: " << impresora[i].getPrecio() << endl;
                cout << "-> Color: " << impresora[i].getColor() << endl;
                cout << "-> Cartucho: " << impresora[i].getCartucho() << endl;
                cout << "-> Resolucion: " << impresora[i].getResolucion() << endl;
                cout << "-> Tamano: " << impresora[i].getTamano() << endl;
                cout << "-> Calidad: " << impresora[i].getCalidad() << endl;
                cout << " - - - - - - - - - - - - - - - - " << endl;

                contador++;

            }

        }

        if (contador == 0) {
            cout << "El producto no ha sido encontrado" << endl;
        }

        system("pause");
        break;

    default:
        cout << "El producto elegido no existe. Vuelve a intentarlo. " << endl;
        system("pause");
        break;
    }

}