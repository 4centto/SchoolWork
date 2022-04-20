class Nodo:
    def __init__(self, value, prev = None, next = None):
        self.prev = prev
        self.data = value
        self.next = next

class DoubleLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def getSize(self):
        return self.size

    def isEmpty(self):
        return self.head == None

    def append(self, value):
        if not self.isEmpty():
            self.tail.next = Nodo(value, self.tail, None)
            self.tail = self.tail.next
            self.size += 1
        else:
            self.head = Nodo(value, None, None)
            self.tail = self.head
            self.size += 1

    def pop(self):
        if not self.isEmpty():
            if self.size > 1:
                aux = self.tail
                self.tail = aux.prev
                self.tail.next = None
                aux.prev = None
                self.size -= 1

                return aux

            else:
                aux = self.head
                self.head = None
                self.tail = None
                self.size -= 1

                return aux

    def getLast(self):
        return self.tail

    def to_string(self):
        aux = self.tail
        print()
        while(aux != None):
            print(f"[{aux.data}]")
            aux = aux.prev
        print()