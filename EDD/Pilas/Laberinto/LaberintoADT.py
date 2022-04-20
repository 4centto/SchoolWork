from Pilas_1358 import StackADT
from Array2D import Array2D
import time, os

class LaberintoADT:
    def __init__(self, archivo):
        self.laberinto = None #Array2D
        self.camino = StackADT()
        self.inicializa( archivo )
        self.encontrada = False
        self.laberinto.to_string()
        self.visitados = []
        self.camino_copia = StackADT()
        self.copia = None
        self.previa = None
        print()

    '''
        P -> Hay una pared
        C -> Corredor
        E -> Entrada
        S -> Salida
        X -> Ya visitado
    '''

    def inicializa(self, archivo):
        entrada = open(archivo, "rt")
        self.laberinto = Array2D( int(entrada.readline().strip()), int(entrada.readline().strip()) )
        self.laberinto.clear("P")
        lineas = entrada.readlines()

        for r in range(len(lineas)):
            lineaBis = lineas[r].strip().split(",")
            for c in range(len(lineaBis)):
                self.laberinto.set_item(r, c, lineaBis[c])

        #Buscar la entrada
        for r in range(self.laberinto.get_row_size()):
            for c in range(self.laberinto.get_col_size()):
                if self.laberinto.get_item(r, c) == "E":
                    self.camino.push((r, c))

    def guardar_copia(self):
        self.copia = self.laberinto

    def get_copia(self):
        return self.copia

    def ya_visitado(self, r ,c):
        resultado = False
        if (r, c) in self.visitados:
            resultado = True
        return resultado

    def marcar_visitado(self, r, c):
        self.visitados.append((r, c))

    def mostrar_camino(self):
        self.camino.to_string()
        #Pintar el camino en el laberinto

    def es_salida(self):
        actual = self.camino.peek()
        return self.laberinto.get_item(actual[0], actual[1]) == "S"

    def verificar_limites(self, r, c):
        limite_correcto = True
        if r < 0 or r > self.laberinto.get_row_size() or \
            c < 0 or c > self.laberinto.get_col_size():
            limite_correcto = False
        return limite_correcto

    def es_corredor(self, r, c):
        resultado = False
        if self.laberinto.get_item(r, c) == "C" or \
            self.laberinto.get_item(r, c) == "S":
            resultado = True
        return resultado

    def set_previa(self, pos_previa):
        self.previa = pos_previa

    def get_previa(self):
        return self.previa

    def buscar_camino(self):
        actual = self.camino.peek()
        ren_actual = actual[0]
        col_actual = actual[1]

        #Izquierda c - 1
        if self.verificar_limites(ren_actual, col_actual - 1) and \
            self.es_corredor(ren_actual, col_actual - 1) and not self.ya_visitado(ren_actual, col_actual - 1):
            self.set_previa(ren_actual, actual)
            self.camino.push((ren_actual, col_actual - 1))

        #Arriba r - 1
        elif self.verificar_limites(ren_actual - 1, col_actual) and \
            self.es_corredor(ren_actual - 1, col_actual) and not self.ya_visitado(ren_actual - 1, col_actual):
            self.set_previa(ren_actual, actual)
            self.camino.push((ren_actual - 1, col_actual))

        #Derecha c + 1
        elif self.verificar_limites(ren_actual, col_actual + 1) and \
            self.es_corredor(ren_actual, col_actual + 1) and not self.ya_visitado(ren_actual, col_actual + 1):
            self.set_previa(ren_actual, actual)
            self.camino.push((ren_actual, col_actual + 1))

        #Abajo r + 1
        elif self.verificar_limites(ren_actual + 1, col_actual) and \
            self.es_corredor(ren_actual + 1, col_actual) and not self.ya_visitado(ren_actual + 1, col_actual):
            self.set_previa(ren_actual, actual)
            self.camino.push((ren_actual + 1, col_actual))

        else:
            #Backtracking
            self.marcar_visitado(ren_actual, col_actual)
            self.camino.pop()


'''
    def play(self):

        while not self.encontrada:

            posicionActual = self.camino.peek().data

            self.__validarParedes(posicionActual)

        self.__updateLaberinto()

    def __validarParedes(self, posicionActual):
        if self.laberinto.get_item(posicionActual[0] - 1, posicionActual[1]) == "C": #Arriba
            
            if self.__validarVisitados((posicionActual[0] - 1, posicionActual[1])) == True:

                #Revisar izquierda, derecha y abajo
                if (self.laberinto.get_item(posicionActual[0], posicionActual[1] - 1) == "C" or self.laberinto.get_item(posicionActual[0], posicionActual[1] - 1) == "S") and (
                    self.laberinto.get_item(posicionActual[0], posicionActual[1] - 1) != None): #Izquierda
                    pos = (posicionActual[0], posicionActual[1] - 1)
                    
                    if self.__validarSalida(pos) == True:
                        return
                       
                    self.__moverse(pos)

                elif (self.laberinto.get_item(posicionActual[0], posicionActual[1] + 1) == "C" or self.laberinto.get_item(posicionActual[0], posicionActual[1] + 1) == "S") and (
                    self.laberinto.get_item(posicionActual[0], posicionActual[1] + 1) != None): #Derecha1
                    pos = (posicionActual[0], posicionActual[1] + 1)
                    
                    if self.__validarSalida(pos) == True:
                        return
                       
                    self.__moverse(pos)

                elif (self.laberinto.get_item(posicionActual[0] + 1, posicionActual[1]) == "C" or self.laberinto.get_item(posicionActual[0] + 1, posicionActual[1]) == "S") and (
                    self.laberinto.get_item(posicionActual[0] + 1, posicionActual[1]) != None): #Abajo
                    pos = (posicionActual[0] + 1, posicionActual[1])
                    
                    if self.__validarSalida(pos) == True:
                        return
                       
                    self.__moverse(pos)
                
                else:
                    self.__returnLast()

            else:
                self.__moverse((posicionActual[0] - 1, posicionActual[1]))

        elif self.laberinto.get_item(posicionActual[0], posicionActual[1] - 1) == "C": #Izquierda
            if self.__validarVisitados((posicionActual[0], posicionActual[1] - 1)) == True:

                #Revisar abajo, arriba, derecha
                if (self.laberinto.get_item(posicionActual[0] - 1, posicionActual[1]) == "C" or self.laberinto.get_item(posicionActual[0] - 1, posicionActual[1]) == "S") and (
                    self.laberinto.get_item(posicionActual[0] - 1, posicionActual[1]) != None): #Arriba
                    pos = (posicionActual[0] - 1, posicionActual[1])
                    
                    if self.__validarSalida(pos) == True:
                        return
                       
                    self.__moverse(pos)

                elif (self.laberinto.get_item(posicionActual[0], posicionActual[1] + 1) == "C" or self.laberinto.get_item(posicionActual[0], posicionActual[1] + 1) == "S") and (
                    self.laberinto.get_item(posicionActual[0], posicionActual[1] + 1) != None): #Derecha1
                    pos = (posicionActual[0], posicionActual[1] + 1)
                    
                    if self.__validarSalida(pos) == True:
                        return
                       
                    self.__moverse(pos)

                elif (self.laberinto.get_item(posicionActual[0] + 1, posicionActual[1]) == "C" or self.laberinto.get_item(posicionActual[0] + 1, posicionActual[1]) == "S") and (
                    self.laberinto.get_item(posicionActual[0] + 1, posicionActual[1]) != None): #Abajo
                    pos = (posicionActual[0] + 1, posicionActual[1])
                    
                    if self.__validarSalida(pos) == True:
                        return
                       
                    self.__moverse(pos)
                
                else:
                    self.__returnLast()

            else:
                self.__moverse((posicionActual[0], posicionActual[1] - 1))

        elif self.laberinto.get_item(posicionActual[0] + 1, posicionActual[1]) == "C": #Abajo
            if self.__validarVisitados((posicionActual[0] + 1, posicionActual[1])) == True:

                #Revisar izquierda, derecha, arriba
                if (self.laberinto.get_item(posicionActual[0] - 1, posicionActual[1]) == "C" or self.laberinto.get_item(posicionActual[0] - 1, posicionActual[1]) == "S") and (
                    self.laberinto.get_item(posicionActual[0] - 1, posicionActual[1]) != None): #Arriba
                    pos = (posicionActual[0] - 1, posicionActual[1])
                    
                    if self.__validarSalida(pos) == True:
                        return
                       
                    self.__moverse(pos)

                elif (self.laberinto.get_item(posicionActual[0], posicionActual[1] + 1) == "C" or self.laberinto.get_item(posicionActual[0], posicionActual[1] + 1) == "S") and (
                    self.laberinto.get_item(posicionActual[0], posicionActual[1] + 1) != None): #Derecha1
                    pos = (posicionActual[0], posicionActual[1] + 1)
                    
                    if self.__validarSalida(pos) == True:
                        return
                       
                    self.__moverse(pos)

                elif (self.laberinto.get_item(posicionActual[0], posicionActual[1] - 1) == "C" or self.laberinto.get_item(posicionActual[0], posicionActual[1] - 1) == "S") and (
                    self.laberinto.get_item(posicionActual[0], posicionActual[1] - 1) != None): #Izquierda
                    pos = (posicionActual[0], posicionActual[1] - 1)
                    
                    if self.__validarSalida(pos) == True:
                        return
                       
                    self.__moverse(pos)

                else:
                    self.__returnLast()

            else:
                self.__moverse((posicionActual[0] + 1, posicionActual[1]))

        elif self.laberinto.get_item(posicionActual[0], posicionActual[1] + 1) == "C": #Derecha

            if self.__validarVisitados((posicionActual[0], posicionActual[1] + 1)) == True:
                #Revisar abajo, arriba, izquierda
                if (self.laberinto.get_item(posicionActual[0] - 1, posicionActual[1]) == "C" or self.laberinto.get_item(posicionActual[0] - 1, posicionActual[1]) == "S") and (
                    self.laberinto.get_item(posicionActual[0] - 1, posicionActual[1]) != None): #Arriba
                    pos = (posicionActual[0] - 1, posicionActual[1])
                    
                    if self.__validarSalida(pos) == True:
                        return
                       
                    self.__moverse(pos)

                elif (self.laberinto.get_item(posicionActual[0] + 1, posicionActual[1]) == "C" or self.laberinto.get_item(posicionActual[0] + 1, posicionActual[1]) == "S") and (
                    self.laberinto.get_item(posicionActual[0] + 1, posicionActual[1]) != None): #Abajo
                    pos = (posicionActual[0] + 1, posicionActual[1])
                    
                    if self.__validarSalida(pos) == True:
                        return

                    self.__moverse(pos)

                elif (self.laberinto.get_item(posicionActual[0], posicionActual[1] - 1) == "C" or self.laberinto.get_item(posicionActual[0], posicionActual[1] - 1) == "S") and (
                    self.laberinto.get_item(posicionActual[0], posicionActual[1] - 1) != None): #Izquierda
                    pos = (posicionActual[0], posicionActual[1] - 1)

                    if self.__validarSalida(pos) == True:
                        return

                    self.__moverse(pos)

                else:
                    self.__returnLast()

            else:
                self.__moverse((posicionActual[0], posicionActual[1] + 1))

    def __validarSalida(self, posicion):
        if self.laberinto.get_item(posicion[0], posicion[1]) == "S":

            self.encontrada = True
            self.camino.push((posicion[0], posicion[1]))
            return True

        return False

    def __moverse(self, posicion):
        self.camino.push((posicion[0], posicion[1]))
        self.visitados.append((posicion[0], posicion[1]))

    def __returnLast(self):
        aux = self.camino.pop().data
        self.laberinto.set_item(aux[0], aux[1], "X")

    def __validarVisitados(self, posicion):
        for visited in self.visitados:
            if visited[0] == posicion[0] and visited[1] == posicion[1]:
                return True
        return False

    def __updateLaberinto(self):
        for i in range(self.camino.length()):
            os.system("cls")
            aux = self.camino.pop().data
            self.camino_copia.push(aux)
            self.camino_copia
            self.laberinto.set_item(aux[0], aux[1], "\u25A0")
            self.laberinto.to_string()
            time.sleep(0.000000001)
        
        self.camino_copia.to_string()
'''