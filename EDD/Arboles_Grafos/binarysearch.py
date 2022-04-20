class BinaryNode:
    def __init__(self, value, left=None, right=None, father=None):
        self.data = value
        self.father = father
        self.left = left
        self.right = right

class BinarySerachTree:

    def __init__(self):
        self.root = None
        self.contador = 0

    def insert(self, value):
        if self.root == None:
            self.root = BinaryNode(value)
        else:
            self.__insert_nodo(self.root, value, None)
    
    def __insert_nodo(self, nodo, value, father):
        if nodo.data == value:
            pass
        elif value < nodo.data:
            if nodo.left == None:
                nodo.left = BinaryNode(value, father=nodo)
            else:
                self.__insert_nodo(nodo.left, value, nodo)
        else:
            if nodo.right == None:
                nodo.right = BinaryNode(value, father=nodo)
            else:
                self.__insert_nodo(nodo.right, value, nodo)

    def transversal(self, formato = "posorden"):
        if formato == "posorden":
            print()
            self.recorrido_pos(self.root)
        elif formato == "preorden":
            self.recorrido_pre(self.root)
        else:
            self.recorrido_in(self.root)
        print()

    def recorrido_pos(self, nodo):
        if nodo != None:
            self.recorrido_pos(nodo.left)
            self.recorrido_pos(nodo.right)
            print(nodo.data, end=", ")

    def recorrido_pre(self, nodo):
        if nodo != None:
            print(nodo.data, end=", ")
            self.recorrido_pre(nodo.left)
            self.recorrido_pre(nodo.right)

    def recorrido_in(self, nodo):
        if nodo != None:
            self.recorrido_in(nodo.left)
            print(nodo.data, end=", ")
            self.recorrido_in(nodo.right)

    def search(self, value):
        if self.root == None:
            print("El árbol está vació")
            return None
        else:
            return self.__search(self.root, value)

    def __search(self, nodo, value):
        if nodo == None:
            print("El dato no existe en el árbol")
            return None
        elif nodo.data == value:
            print("Encontrado")
            return nodo
        elif value < nodo.data:
            return self.__search(nodo.left, value)
        else:
            return self.__search(nodo.right, value)

    def remove(self, value):
        if self.root == None:
            print("El arbol esta vacio")
            return
        else:
            nodo = self.search(value)
            if nodo != None:

                if nodo.left == None and nodo.right == None: #No tiene hijos

                    padre = nodo.father
                    if nodo.data < padre.data: #Izquierda
                        padre.left = None
                    else: #Derecha
                        padre.right = None
                    print("Eliminado")

                elif nodo.left != None and nodo.right != None: #Si el nodo a eliminar tiene dos hijos
                    #Primero hay que ir un nodo hacia la drecha y luego hasta el nodo mas izquierdo posible
                    self.contador = 0
                    menor = self.__minimo(nodo.right)
                    nodo.data = menor.data

                    if self.contador == 0:
                        nodo.right = None
                    else:
                        pMinimo = menor.father
                        pMinimo.left = None

                    print("Eliminado")

                elif nodo.left != None or nodo.right != None: #Si solo tiene un hijo

                    padre = nodo.father
                    if nodo.data < padre.data: #Izquierda
                        if nodo.left != None: #Validamos donde esta el hijo
                            aux = nodo.left
                            padre.left = aux
                            aux.father = padre

                        elif nodo.right != None:
                            aux = nodo.right
                            padre.left = aux
                            aux.father = padre

                    else: #Derecha
                        if nodo.left != None: #Validamos donde esta el hijo
                            aux = nodo.left
                            padre.right = aux
                            aux.father = padre

                        elif nodo.right != None:
                            aux = nodo.right
                            padre.right = aux
                            aux.father = padre

                    print("Eliminado")


    def __minimo(self, arbol): #Funcion para hallar el nodo hasta la izquierda
        if arbol == None:
            return
        if arbol.left:
            self.contador += 1
            return self.__minimo(arbol.left) #Se busca el nodo mas a la izquierda posible
        else:
            return arbol

'''
arb1 = BinarySerachTree()
arb1.insert(60)
arb1.insert(30)
arb1.insert(15)
arb1.insert(40)
arb1.transversal("posorden")
arb1.transversal("preorden")
arb1.transversal("inorden")
print(arb1.search(110))
print(arb1.search(15))

res = arb1.search(30)

print(res.data)
print(res.left.data)
'''
arbol = BinarySerachTree()
arbol.insert(8)
arbol.insert(5)
arbol.insert(1)
arbol.insert(4)
arbol.insert(6)
arbol.insert(7)
arbol.insert(20)
arbol.insert(12)
arbol.insert(23)

arbol.transversal("inorden")

arbol.remove(1)

arbol.transversal("inorden")