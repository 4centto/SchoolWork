from DoubleLinkedList import DoubleLinkedList

#Yo hice el StackADT con mi ADT de listas doblemente ligadas

class StackADT:
    def __init__(self):
        self.data = DoubleLinkedList()

    def is_empty(self):
        return self.data.getSize() == 0

    def length(self):
        return self.data.getSize()

    def pop(self):
        if not self.is_empty():
            return self.data.pop()

    def peek(self):
        if not self.is_empty():
            return self.data.getLast()

    def push(self, value):
        self.data.append(value)

    def to_string(self):
        self.data.to_string()