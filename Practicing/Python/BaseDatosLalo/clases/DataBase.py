class DataBase:

    __lista_laptops = []
    __lista_pantallas = []

    def __init__(self):
        self.__lista_laptops = []
        self.__lista_pantallas = []

    def getListaLaptops(self):
        return self.__lista_laptops

    def getListaPantallas(self):
        return self.__lista_pantallas

    def setListaLaptops(self, laptop):
        self.__lista_laptops.append(laptop)

    def setListaPantallas(self, pantalla):
        self.__lista_pantallas.append(pantalla)

    def listaLaptopModificada(self, id_p, marca_p, modelo_p, precio_p):
        for i in range(len(self.__lista_laptops)):
            if self.__lista_laptops[i].getId() == id_p:
                self.__lista_laptops[i].setMarca(marca_p)
                self.__lista_laptops[i].setModelo(modelo_p)
                self.__lista_laptops[i].setPrecio(precio_p)

    def listaPantallaModificada(self, id_p, marca_p, modelo_p, precio_p):
        for i in range(len(self.__lista_pantallas)):
            if self.__lista_pantallas[i].getId() == id_p:
                self.__lista_pantallas[i].setMarca(marca_p)
                self.__lista_pantallas[i].setModelo(modelo_p)
                self.__lista_pantallas[i].setPrecio(precio_p)