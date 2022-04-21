class Laptop:

    __id = ""
    __marca = ""
    __modelo = ""
    __precio = ""

    def __init__(self):
        self.__id = ""
        self.__marca = ""
        self.__modelo = ""
        self.__precio = ""

    def setId(self, id):
        self.__id = id

    def setMarca(self, marca):
        self.__marca = marca

    def setModelo(self, modelo):
        self.__modelo = modelo

    def setPrecio(self, precio):
        self.__precio = precio


    def getId(self):
        return self.__id

    def getMarca(self):
        return self.__marca

    def getModelo(self):
        return self.__modelo

    def getPrecio(self):
        return self.__precio