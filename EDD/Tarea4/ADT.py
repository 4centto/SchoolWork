from Array2D import Array2D
from Vecinos import Vecinos

class JuegoDeLaVidaADT:
    #Metodo constructor
    def __init__(self, rens, cols, lista_poblacion, generaciones):
        self.genAnterior = Array2D(rens, cols)
        self.genAnterior.clear("M")

        self.genSiguiente = Array2D(rens, cols)
        self.genSiguiente.clear("M")

        self.generaciones = generaciones
        self.contador = 1

        for par in lista_poblacion:
            self.genAnterior.set_item(par[0], par[1], "V")

        self.__toString()
    
    #Metodo para imprimir la generacion actual
    def __toString(self):
        print(f"\n----- GENERACION {self.contador} -----")
        self.genAnterior.to_string()

    #Metodo para obtener los vecinos de cada celula
    def __getVecinos(self, fila, columna):
        vecinos = []
        vecinos.append(self.genAnterior.get_item(fila-1, columna-1)) 
        vecinos.append(self.genAnterior.get_item(fila-1, columna))
        vecinos.append(self.genAnterior.get_item(fila-1, columna+1))
        vecinos.append(self.genAnterior.get_item(fila, columna-1))
        vecinos.append(self.genAnterior.get_item(fila, columna))
        vecinos.append(self.genAnterior.get_item(fila, columna+1))
        vecinos.append(self.genAnterior.get_item(fila+1, columna-1))
        vecinos.append(self.genAnterior.get_item(fila+1, columna))
        vecinos.append(self.genAnterior.get_item(fila+1, columna+1))

        return vecinos

    #Metodo para actualizar las generaciones
    def __actualizarGeneracion(self):
        for i in range(self.genAnterior.get_row_size()):
            for j in range(self.genAnterior.get_col_size()):
                self.genAnterior.set_item(i, j, self.genSiguiente.get_item(i, j))

    #Metodo que inicia el juego
    def play(self):
        for x in range(self.generaciones): #Recorre las generaciones indicadas en el constructor
            for i in range(self.genAnterior.get_row_size()): #Recorrer filas
                for j in range(self.genAnterior.get_col_size()): #Recorres columnas
                    listaVecinos = self.__getVecinos(i, j)
                    vecinos = Vecinos(listaVecinos)

                    if vecinos.validarSupervivencia() == True:
                        self.genSiguiente.set_item(i, j, "V")
                    else:
                        self.genSiguiente.set_item(i, j, "M")

            self.contador += 1
            self.__actualizarGeneracion()
            self.__toString()