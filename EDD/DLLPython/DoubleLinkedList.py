from NodoDoble import NodoDoble

class DoubleLinkedList:
    def __init__(self, value = None):
        if value == None:
            self.__size = 0
            self.__dll = None
        else:
            self.__dll = NodoDoble(value)
            self.__size = 1
    
    def getSize(self):
        return self.__size

    def isEmpty(self):
        if self.__dll == None:
            return True
        else:
            return False

    def append(self, value):
        if self.__dll == None:
            self.__dll = NodoDoble(value)
            self.__size += 1
        else:
            curr_node = self.__dll
            nuevo = NodoDoble(value)
            while(curr_node.getNext() != None):
                curr_node = curr_node.getNext()

            curr_node.setNext(nuevo)
            nuevo.setPrev(curr_node)
            self.__size += 1

    def findFromTail(self, value):
        curr_node = self.__dll
        posicion = 1
        #Llegar hasta el final de la lista
        while(curr_node.getNext() != None):
            curr_node = curr_node.getNext()
        
        #Ahora buscamos el valor
        while(curr_node != None):
            if(curr_node.getData() == value):
                return posicion
            curr_node = curr_node.getPrev()
            posicion += 1
        
        return None

    def findFromHead(self, value):
        curr_node = self.__dll
        posicion = 1
        while(curr_node != None):
            if(curr_node.getData() == value):
                return posicion
            
            curr_node = curr_node.getNext()
            posicion += 1
        
        return None

    def removeFromTail(self, value):
        curr_node = self.__dll
        #Llegar hasta el final de la lista
        while(curr_node.getNext() != None):
            curr_node = curr_node.getNext()
        
        #Ahora buscamos el valor
        while(curr_node != None):
            if(curr_node.getData() == value):
                
                if(curr_node.getNext() == None):
                    aux = curr_node.getPrev()
                    aux.setNext(None)
                    curr_node.setPrev(None)
                    self.__size -= 1
                elif(curr_node.getPrev() == None):
                    aux = curr_node.getNext()
                    aux.setPrev(None)
                    curr_node.setNext(None)
                    self.__dll = aux
                    self.__size -= 1
                else:
                    aux = curr_node.getPrev()
                    auxDos = curr_node.getNext()
                    
                    curr_node.setNext(None)
                    curr_node.setPrev(None)
                    
                    aux.setNext(auxDos)
                    auxDos.setPrev(aux)
                    self.__size -= 1
            
            curr_node = curr_node.getPrev()

    def removeFromHead(self, value):
        curr_node = self.__dll
        while(curr_node != None):
            if(curr_node.getData() == value):
                
                if(curr_node.getNext() == None):
                    aux = curr_node.getPrev()
                    aux.setNext(None)
                    curr_node.setPrev(None)
                    self.__size -= 1
                elif(curr_node.getPrev() == None):
                    aux = curr_node.getNext()
                    aux.setPrev(None)
                    curr_node.setNext(None)
                    self.__dll = aux
                    self.__size -= 1
                else:
                    aux = curr_node.getPrev()
                    auxDos = curr_node.getNext()
                    
                    curr_node.setNext(None)
                    curr_node.setPrev(None)
                    
                    aux.setNext(auxDos)
                    auxDos.setPrev(aux)
                    self.__size -= 1
                
            curr_node = curr_node.getPrev()

    def transversal(self):
        curr_node = self.__dll;
        while(curr_node != None):
            print(f"[{curr_node.getData()}]", end="")
            curr_node = curr_node.getNext()
        
        print("")

    def reverseTransversal(self):
        curr_node = self.__dll
        #Llegar hasta el final de la lista
        while(curr_node.getNext() != None):
            curr_node = curr_node.getNext()
        
        #Ya en el ultimo elemento hacemos el recorrido al reves
        while(curr_node != None):
            print(f"[{curr_node.getData()}]", end="")
            curr_node = curr_node.getPrev()

        print()