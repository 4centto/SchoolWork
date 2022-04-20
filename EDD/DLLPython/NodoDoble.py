class NodoDoble:
    def __init__(self, value, siguiente = None, anterior = None):
        self.__data = value
        self.__next = siguiente
        self.__prev = anterior

    def setData(self, value):
        self.__data = value

    def getData(self):
        return self.__data

    def setNext(self, siguiente):
        self.__next = siguiente

    def getNext(self):
        return self.__next

    def setPrev(self, anterior):
        self.__prev = anterior

    def getPrev(self):
        return self.__prev