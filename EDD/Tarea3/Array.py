class Array:
    def __init__(self, tamano):
        self.__tamano = tamano
        self.__data = [ 0 for x in range(self.__tamano) ]

    def getItem(self, index):
        if index >= 0 and index  < self.__tamano:
            return self.__data[index]
        else:
            print("(ERROR) Index out of range.")

    def toString(self):
        print(self.__data)

    def setItem(self, empleado, index):
        if index >= 0 and index < self.__tamano:
            self.__data[index] = empleado
        else:
            print("(ERROR) Index out of range.")

    def getLength(self):
        return len(self.__data)

    def clear(self, valor = 0):
        for i in range(len(self.__data)):
            self.__data[i] = valor
        print("Arreglo reseteado.")

    def getList(self):
        return self.__data