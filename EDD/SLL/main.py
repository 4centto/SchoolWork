from LinkedListADT import LinkedListADT
from Nodo import Nodo

'''
head = Nodo(30)

print(head.data)
print(head.siguiente)
print()

head2 = Nodo(20)
head2.siguiente = Nodo(15)

print(head2.data)
print(head2.siguiente.data)

head2 = Nodo(20, Nodo(15))
print(head2.data)
print(head2.siguiente.data)
print(head2.siguiente.siguiente)
'''
'''
def recorrerLista(lista):
    if lista != None:
        print("Valor:", lista.data)
        recorrerLista(lista.siguiente)
    else:
        return
'''
'''
head = Nodo(5, Nodo(6, Nodo(7, Nodo(8, Nodo(9)))))
curr_node = head

while curr_node != None:
    print(curr_node.data)
    curr_node = curr_node.siguiente

print()
print(" -- Agregar 10 al final -- ")
curr_node = head
while curr_node.siguiente != None:
    curr_node = curr_node.siguiente
curr_node.siguiente = Nodo(10)

curr_node = head
while curr_node != None:
    print(curr_node.data)
    curr_node = curr_node.siguiente
'''
from LinkedListADT import LinkedListADT

lsl = LinkedListADT()
print(lsl.isEmpty())
nodo = lsl.getTail()

print(nodo)

lsl.append(10)
lsl.append(20)

lsl.transversal()