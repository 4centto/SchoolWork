class Array:
    #Constructor para inicializar el arreglo
    def __init__(self, filas, columnas):
        self.__filas = filas
        self.__columnas = columnas
        self.__arreglo = [[ None for i in range(self.__columnas) ] for i in range(self.__filas)]

    #Método para obtener las filas
    def getRowSize(self):
        return self.__filas

    #Método para obtener las columnas
    def getColSize(self):
        return self.__columnas

    #Método para obtener un elemento del arreglo
    def getItem(self, fila, columna):
        if fila >= 0 and fila < self.__filas:
            if columna >= 0 and columna < self.__columnas:

                return self.__arreglo[fila][columna]

            else:
                return "Columna ¡OUT! of range"
        else:
            return  "Fila ¡OUT! of range"

    #Método para insertar un elemento al arreglo
    def setItem(self, fila, columna, dato):
        if fila >= 0 and fila < self.__filas:
            if columna >= 0 and columna < self.__columnas:

                self.__arreglo[fila][columna] = dato

            else:
                print("Columna ¡OUT! of range")
        else:
            print("Fila ¡OUT! of range")

    #Método toString
    def toString(self):
        cadena = ""
        for i in range(self.__filas):
            for j in range(self.__columnas):
                if self.__arreglo[i][j] != None:
                    try:
                        cadena += "[ " + str(self.__arreglo[i][j].getNombre()) + " ]"
                    except:
                        cadena += "[ " + str(self.__arreglo[i][j]) + " ]"
                else:
                    cadena += "[ || ]"
            cadena+= "\n"

        return cadena

    #Método clear para reestablacer todos los valores del arreglo
    def clear(self, dato = None):
        for i in range(self.__filas):
            for j in range(self.__columnas):
                self.__arreglo[i][j] = dato