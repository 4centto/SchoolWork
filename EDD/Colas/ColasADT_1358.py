class QueueADT:
  def __init__(self):
    self.__data = []

  def is_empty(self):
    return len (self.__data) == 0
  
  def length (self):
    return len(self.__data)

  def enqueue(self,elem):
    self.__data.append(elem)

  def dequeue(self):
    if not self.is_empty():
      return self.__data.pop(0)

  def to_string(self):
    for elem in self.__data:
      print(f"| {elem} | <--", end=" ")
    print("")
'''
cola = QueueADT()
print("Esta vacio", cola.is_empty())
print("# de elemtos", cola.length())
cola.enqueue(10)
cola.to_string()
print(".-.-.-.-.-.-.-")
cola.enqueue(20)
cola.enqueue(30)
cola.enqueue(40)
cola.to_string()
siguiente = cola.dequeue()
print("Atendiendo a:",siguiente)
cola.to_string()
'''

class ColaPrioridadAcotada:
  def __init__(self, niveles):
    self.__data = [QueueADT() for x in range(niveles)]
    self.length = 0 #Numero de elementos colados

  def is_empty(self):
    return self.length == 0

  def length(self):
    return self.length

  def enqueue(self, prioridad, elem):
    if prioridad >= 0 and prioridad < len(self.__data):
      self.__data[prioridad].enqueue(elem)
      self.length += 1

  def to_string(self):
    for p in range(len(self.__data)):
      print(f"Prioridad {p} -->", end ="")
      self.__data[p].to_string()

  def dequeue(self):
    for nivel in self.__data:
      if not nivel.is_empty():
        self.length -= 1
        return nivel.dequeue()

cpa = ColaPrioridadAcotada(7)
cpa.enqueue(4,"A")
cpa.enqueue(2,"Z")
cpa.enqueue(4,"N")
cpa.enqueue(1,"P")
cpa.to_string()
print(".-.-.-.-.-.-.-.-.-.-.-")
sig = cpa.dequeue()
cpa.to_string()

class ColaDePrioridad:
  def __init__(self):
    self.__data = []
    self.__length = 0

  def is_empty(self):
    return self.length == 0

  def length(self):
    return self.length

  #Tarea Moral es implementar un metodo que nos permita ordenar la prioridades
  def enqueue(self, prioridad, elem):
    existe = False
    indice = 0
    for index in range(len(self.__data)):
      if self.__data[index]["p"] == prioridad:
        existe = True
        indice = index
        break
    if existe:
      self.__data[indice]["cola"].enqueue(elem)
    else:
      self.__data.append( {"p":prioridad, "cola": QueueADT() } )
      self.__data[-1]["cola"].enqueue(elem)

  def to_string(self):
    for level in self.__data:
      print(level["p"], end=" = ")
      level["cola"].to_string()
    print()

cp = ColaDePrioridad()
cp.enqueue(2, "A")
cp.enqueue(4, "Z")
cp.enqueue(1, "R")
cp.enqueue(2, "B")
cp.enqueue(4, "Y")

cp.to_string()