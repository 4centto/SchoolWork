from Nodo import Nodo

class Arbol:
    def __init__(self, value = None):
        if value != None:
            self.__arbol = Nodo(value)
            self.__size = 1
        else:
            self.__arbol = None
            self.__size = 0

    def getSize(self):
        return self.__size

    def isEmpty(self):
        return self.__arbol == None

    def insert(self, value):
        if self.__arbol == None:
            self.__arbol = Nodo(value)
            self.__size += 1
        else:
            self.__auxInsert(self.__arbol, value)

    def __auxInsert(self, arbol, value):
        if value > arbol.getData():
            if arbol.getDerecha() == None:
                arbol.setDerecha(Nodo(value))
                self.__size += 1
            else:
                self.__auxInsert(arbol.getDerecha(), value)
        else:
            if arbol.getIzquierda() == None:
                arbol.setIzquierda(Nodo(value))
                self.__size += 1
            else:
                self.__auxInsert(arbol.getIzquierda(), value)

    def preOrden(self):
        self.__auxPreOrden(self.__arbol)
        print()

    def __auxPreOrden(self, arbol):
        if arbol == None:
            return
        else:
            print("[", arbol.getData(), "]", end="")
            self.__auxPreOrden(arbol.getIzquierda())
            self.__auxPreOrden(arbol.getDerecha())

    def inOrden(self):
        self.__auxInOrden(self.__arbol)
        print()

    def __auxInOrden(self, arbol):
        if arbol == None:
            return
        else:
            self.__auxInOrden(arbol.getIzquierda())
            print("[", arbol.getData(), "]", end="")
            self.__auxInOrden(arbol.getDerecha())

    def postOrden(self):
        self.__auxPostOrden(self.__arbol)
        print()

    def __auxPostOrden(self, arbol):
        if arbol == None:
            return
        else:
            self.__auxPostOrden(arbol.getIzquierda())
            self.__auxPostOrden(arbol.getDerecha())
            print("[", arbol.getData(), "]", end="")