from Nodo import Nodo

class LinkedListADT:
    def __init__(self):
        self.head = None

    def isEmpty(self):
        return self.head == None

    def getTail(self):
        curr_node = self.head
        if curr_node != None:
            while curr_node.siguiente != None:
                curr_node = curr_node.siguiente
            return curr_node

    def append(self, dato):
        if self.head == None:
            self.head = Nodo(dato)
        else:
            self.getTail().siguiente = Nodo(dato)

    def transversal(self):
        curr_node = self.head
        while curr_node != None:
            print("[", curr_node.data, "]", end="")
            curr_node = curr_node.siguiente
        print()