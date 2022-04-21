class Nodo:
    def __init__(self, value):
        self.__data = value
        self.__derecha = None
        self.__izquierda = None
    
    def setData(self, value):
        self.__data = value

    def getData(self):
        return self.__data

    def setDerecha(self, derecha):
        self.__derecha = derecha

    def getDerecha(self):
        return self.__derecha

    def setIzquierda(self, izquierda):
        self.__izquierda = izquierda

    def getIzquierda(self):
        return self.__izquierda