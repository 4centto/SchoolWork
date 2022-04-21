import os

'''
Este metodo es un sistema de resolucion de un sistema de ecuaciones lineales de 3x3, pero por un metodo iterativo
    1. Primero obtenemos las 3 ecuaciones en una matriz.
    2. Luego reordenamos la matriz a una matriz dominante.
    3. Ahora despejamos x en la primera, y en la segunda y z en la tercera.
    4. Pedimos los datos iniciales de x, y, z.
    5. Ahora realizamos las iteraciones hasta encontrar un error de casi 0.
    6. Simultaneamente calculamos el error en decimales y en porcentaje.

    *NOTA: Este metodo si respeta los valores iniciales dados
'''

########################## METODO GAUSS-JACOBI ########################

class GaussJacobi:
    def __init__(self):
        os.system("cls")

    def imprimirMatriz(self, matriz):
        for i in range(3):
            for j in range(4):
                if j != 3:
                    print("[", matriz[i][j], "]", end="")
                else:
                    print(" = [", matriz[i][j], "]", end="")
            print()
        print()

    def calcular(self):
        matriz =[[0 for i in range(4)] for i in range(3)]
        for i in range(3):
            os.system("cls")
            print(f"* ECUACION {i+1} *")
            matriz[i][0] = float(input("\tValor X: "))
            matriz[i][1] = float(input("\tValor Y: "))
            matriz[i][2] = float(input("\tValor Z: "))
            matriz[i][3] = float(input("\tValor R: "))

        os.system("cls")
        print(" - Matriz - ")
        self.imprimirMatriz(matriz)

        #Reorganizamos la matriz para encontrar nuestra matriz dominante
        #Encontrar la x mayor de la matriz
        mayor = 0
        aux = []
        for i in range(len(matriz)):
            contador = 0
            for j in range(len(matriz)):
                if j != i:
                    if matriz[i][0] > matriz[j][0]:
                        contador += 1

            if contador == 2:
                mayor = i

        aux = matriz[0]
        matriz[0] = matriz[mayor]
        matriz[mayor] = aux

        #Encontrar la y mayor de la matriz
        if abs(matriz[1][1]) < abs(matriz[2][1]):
            aux = matriz[2]
            matriz[2] = matriz[1]
            matriz[1] = aux

        print(" - Matriz Dominante - ")
        self.imprimirMatriz(matriz)

        #Ya una vez con la matriz dominante despejamos x de la primera ecuacion, y de la segunda y z de la tercera
        print(f"\t* x = ({-1 * matriz[0][1]}y+({-1 * matriz[0][2]})z+({matriz[0][3]})) / {matriz[0][0]}")
        print(f"\t* y = ({-1 * matriz[1][0]}x+({-1 * matriz[1][2]})z+({matriz[1][3]})) / {matriz[1][1]}")
        print(f"\t* z = ({-1 * matriz[2][0]}x+({-1 * matriz[2][1]})y+({matriz[2][3]})) / {matriz[2][2]}")
        print("\n\n")

        inicialX = float(input("Valor inicial de X: "))
        inicialY = float(input("Valor inicial de Y: "))
        inicialZ = float(input("Valor inicial de Z: "))
        iteraciones = int(input("¿Cuantas iteraciones deseas hacer? -> "))

        histoX = {"xi": inicialX, "xi+1": 0}
        histoY = {"yi": inicialY, "yi+1": 0}
        histoZ = {"zi": inicialZ, "zi+1": 0}
        x = 0
        y = 0
        z = 0

        #Realizar iteraciones hasta encontrar un error

        for iter in range(iteraciones):
            print(f"Iteracion N°{iter+1}")
            print()

            #Recorremos los valores de nuestro historiales
            histoX["xi"] = histoX["xi+1"]
            histoX["xi+1"] = 0
            histoY["yi"] = histoY["yi+1"]
            histoY["yi+1"] = 0
            histoZ["zi"] = histoZ["zi+1"]
            histoZ["zi+1"] = 0

            x = round(((-1 * matriz[0][1] * inicialY) + (-1 * matriz[0][2] * inicialZ) + matriz[0][3]) / matriz[0][0], 4)
            print(f"\t* x = ({-1 * matriz[0][1]}({inicialY})+({-1 * matriz[0][2]})({inicialZ})+({matriz[0][3]})) / {matriz[0][0]}")
            print(f"\t\tx = {x}")
            print()

            y = round(((-1 * matriz[1][0] * inicialX) + (-1 * matriz[1][2] * inicialZ) + matriz[1][3]) / matriz[1][1], 4)
            print(f"\t* y = ({-1 * matriz[1][0]}({inicialX})+({-1 * matriz[1][2]})({inicialZ})+({matriz[1][3]})) / {matriz[1][1]}")
            print(f"\t\ty = {y}")
            print()

            z = round(((-1 * matriz[2][0] * inicialX) + (-1 * matriz[2][1] * inicialY) + matriz[2][3]) / matriz[2][2], 4)
            print(f"\t* z = ({-1 * matriz[2][0]}({inicialX})+({-1 * matriz[2][1]})({inicialY})+({matriz[2][3]})) / {matriz[2][2]}")
            print(f"\t\tz = {z}")
            print()

            #Actualizamos nuestro ultimo valor calculado para cada variable
            histoX["xi+1"] = x
            histoY["yi+1"] = y
            histoZ["zi+1"] = z

            #Actualizamos nuestros valores de realimentacion
            inicialX = x
            inicialY = y
            inicialZ = z

            #Por ultimo calculamos el error para la ultima iteracion
            if iter == iteraciones -1:
                #      | (nueva - anterior) / nueva | * 100
                errorX = abs((histoX["xi+1"] - histoX["xi"]) / histoX["xi+1"])
                errorY = abs((histoY["yi+1"] - histoY["yi"]) / histoY["yi+1"])
                errorZ = abs((histoZ["zi+1"] - histoZ["zi"]) / histoZ["zi+1"])

                print("Error X:", errorX)
                print("Error X (%):", round(errorX * 100, 2))
                print()
                print("Error Y:", errorY)
                print("Error Y (%):", round(errorY * 100, 2))
                print()
                print("Error Z:", errorZ)
                print("Error Z (%):", round(errorZ * 100, 2))
                print()

########################### METODO GAUSS-JORDAN #################################
class GaussJordan:
    def __init__ (self, matriz = []):
        if len(matriz) == 0:
            self.__matriz = [[0 for columnas in range(4)] for filas in range(3)]
        else:
            self.__matriz = matriz

    def imprimirMatriz(self):
        for i in range(3):
            for j in range(4):
                if j != 3:
                    print("[", self.__matriz[i][j], "]", end="")
                else:
                    print(" = [", self.__matriz[i][j], "]", end="")
            print()
        print()

    def pedirDatos(self):
        for i in range(3):
            print()
            print(" ** Dame los coeficientes de la ecuacion", i + 1, " ** ")
            self.__matriz[i][0] = int(input(" X = "))
            self.__matriz[i][1] = int(input(" Y = "))
            self.__matriz[i][2] = int(input(" Z = "))
            self.__matriz[i][3] = int(input(" R = "))
            print()

        self.imprimirMatriz()

    def calcular(self):
        #Ahora realizamos los calculos
        #Primero obtenemos el primer 0 es decir el cero de [2, 0]
        pivote = [self.__matriz[0][0], self.__matriz[0][1], self.__matriz[0][2], self.__matriz[0][3]]
        aux = [self.__matriz[2][0], self.__matriz[2][1], self.__matriz[2][2], self.__matriz[2][3]]
        res = []

        for i in range(4):
            if pivote[0] < 0 and aux[0] < 0: #Los dos primeros negativos
                result = (aux[0] * pivote[i]) + (abs(pivote[0]) * aux[i])
                res.append(result)
                metodo = f"{aux[0]}R1 + {abs(pivote[0])}R3"
            elif pivote[0] > 0 and aux[0] > 0: #Los dos primeros son positivos
                result = (-1 * aux[0] * pivote[i]) + (abs(pivote[0]) * aux[i])
                res.append(result)
                metodo = f"-{aux[0]}R1 + {abs(pivote[0])}R3"
            elif (pivote[0] < 0 and aux[0] > 0) or (pivote[0] > 0 and aux[0] < 0): #Si uno de los dos es negativo y el otro positivo
                result = (abs(aux[0]) * pivote[i]) + (abs(pivote[0]) * aux[i])
                res.append(result)
                metodo = f"{abs(aux[0])}R1 + {abs(pivote[0])}R3"

        self.__matriz[2] = res
    
        #Ahora obtenemos el segundo cero
        aux = [self.__matriz[1][0], self.__matriz[1][1], self.__matriz[1][2], self.__matriz[1][3]]
        res = []

        for i in range(4):
            if pivote[0] < 0 and aux[0] < 0: #Los dos primeros negativos
                result = (aux[0] * pivote[i]) + (abs(pivote[0]) * aux[i])
                res.append(result)
                metodo = f"{aux[0]}R1 + {abs(pivote[0])}R2"
            elif pivote[0] > 0 and aux[0] > 0: #Los dos primeros son positivos
                result = (-1 * aux[0] * pivote[i]) + (abs(pivote[0]) * aux[i])
                res.append(result)
                metodo = f"-{aux[0]}R1 + {abs(pivote[0])}R2"
            elif (pivote[0] < 0 and aux[0] > 0) or (pivote[0] > 0 and aux[0] < 0): #Si uno de los dos es negativo y el otro positivo
                result = (abs(aux[0]) * pivote[i]) + (abs(pivote[0]) * aux[i])
                res.append(result)
                metodo = f"{abs(aux[0])}R1 + {abs(pivote[0])}R2"

        self.__matriz[1] = res

        #Luego obtenemos el tercer cero
        pivote = [self.__matriz[1][0], self.__matriz[1][1], self.__matriz[1][2], self.__matriz[1][3]]
        aux = [self.__matriz[2][0], self.__matriz[2][1], self.__matriz[2][2], self.__matriz[2][3]]
        res = []

        for i in range(4):
            if pivote[1] < 0 and aux[1] < 0: #Los dos primeros negativos
                result = (aux[1] * pivote[i]) + (abs(pivote[1]) * aux[i])
                res.append(result)
                metodo = f"{aux[1]}R2 + {abs(pivote[1])}R3"
            elif pivote[1] > 0 and aux[1] > 0: #Los dos primeros son positivos
                result = (-1 * aux[1] * pivote[i]) + (abs(pivote[1]) * aux[i])
                res.append(result)
                metodo = f"-{aux[1]}R2 + {abs(pivote[1])}R3"
            elif (pivote[1] < 0 and aux[1] > 0) or (pivote[1] > 0 and aux[1] < 0): #Si uno de los dos es negativo y el otro positivo
                result = (abs(aux[1]) * pivote[i]) + (abs(pivote[1]) * aux[i])
                res.append(result)
                metodo = f"{abs(aux[1])}R2 + {abs(pivote[1])}R3"

        self.__matriz[2] = res

        #Por ultimo calculamos las variables de salida (Resultado)
        #Primero calculamos z
        z = self.__matriz[2][3] / self.__matriz[2][2]
        y = (((-1 * self.__matriz[1][2] * z) + self.__matriz[1][3]) / self.__matriz[1][1])
        x = (( (-1 * self.__matriz[0][2] * z) + (-1 * self.__matriz[0][1] * y) + self.__matriz[0][3] ) / self.__matriz[0][0])

        print(" X =", x)
        print(" Y =", y)
        print(" Z =", z)

        return {"x": x, "y": y, "z": z}

############################### METODO GAUSS-SEIDEL ##########################################

'''
Este metodo es un sistema de resolucion de un sistema de ecuaciones lineales de 3x3, pero por un metodo iterativo
    1. Primero obtenemos las 3 ecuaciones en una matriz.
    2. Luego reordenamos la matriz a una matriz dominante.
    3. Ahora despejamos x en la primera, y en la segunda y z en la tercera.
    4. Pedimos los datos iniciales de x, y, z.
    5. Ahora realizamos las iteraciones hasta encontrar un error de casi 0.
    6. Simultaneamente calculamos el error en decimales y en porcentaje.
'''

class GaussSeidel:
    def __init__(self):
        os.system("cls")

    def imprimirMatriz(self, matriz):
        for i in range(3):
            for j in range(4):
                if j != 3:
                    print("[", matriz[i][j], "]", end="")
                else:
                    print(" = [", matriz[i][j], "]", end="")
            print()
        print()

    def calcular(self):

        matriz =[[0 for i in range(4)] for i in range(3)]

        #Pedir datos al usuario de las ecuaciones
        for i in range(3):
            os.system("cls")
            print(f"* ECUACION {i+1} *")
            matriz[i][0] = float(input("\tValor X: "))
            matriz[i][1] = float(input("\tValor Y: "))
            matriz[i][2] = float(input("\tValor Z: "))
            matriz[i][3] = float(input("\tValor R: "))

        os.system("cls")
        print(" - Matriz - ")
        self.imprimirMatriz(matriz)

        #Reorganizamos la matriz para encontrar nuestra matriz dominante
        #Encontrar la x mayor de la matriz
        mayor = 0
        aux = []
        for i in range(len(matriz)):
            contador = 0
            for j in range(len(matriz)):
                if j != i:
                    if matriz[i][0] > matriz[j][0]:
                        contador += 1

            if contador == 2:
                mayor = i

        aux = matriz[0]
        matriz[0] = matriz[mayor]
        matriz[mayor] = aux

        #Encontrar la y mayor de la matriz
        if abs(matriz[1][1]) < abs(matriz[2][1]):
            aux = matriz[2]
            matriz[2] = matriz[1]
            matriz[1] = aux

        print(" - Matriz Dominante - ")
        self.imprimirMatriz(matriz)

        #Ya una vez con la matriz dominante despejamos x de la primera ecuacion, y de la segunda y z de la tercera
        print(f"\t* x = ({-1 * matriz[0][1]}y+({-1 * matriz[0][2]})z+({matriz[0][3]})) / {matriz[0][0]}")
        print(f"\t* y = ({-1 * matriz[1][0]}x+({-1 * matriz[1][2]})z+({matriz[1][3]})) / {matriz[1][1]}")
        print(f"\t* z = ({-1 * matriz[2][0]}x+({-1 * matriz[2][1]})y+({matriz[2][3]})) / {matriz[2][2]}")
        print("\n\n")

        x = float(input("Valor inicial de X: "))
        y = float(input("Valor inicial de Y: "))
        z = float(input("Valor inicial de Z: "))
        iteraciones = int(input("¿Cuantas iteraciones deseas hacer? -> "))

        histoX = {"xi": x, "xi+1": 0}
        histoY = {"yi": y, "yi+1": 0}
        histoZ = {"zi": z, "zi+1": 0}

        #Realizar iteraciones hasta encontrar un error
        for iter in range(iteraciones):
            print(f"Iteracion N°{iter+1}")
            print()

            #Recorremos los valores de nuestro historiales
            histoX["xi"] = histoX["xi+1"]
            histoX["xi+1"] = 0
            histoY["yi"] = histoY["yi+1"]
            histoY["yi+1"] = 0
            histoZ["zi"] = histoZ["zi+1"]
            histoZ["zi+1"] = 0

            x = round(((-1 * matriz[0][1] * y) + (-1 * matriz[0][2] * z) + matriz[0][3]) / matriz[0][0], 4)
            print(f"\t* x = ({-1 * matriz[0][1]}({y})+({-1 * matriz[0][2]})({z})+({matriz[0][3]})) / {matriz[0][0]}")
            print(f"\t\tx = {x}")
            print()

            y = round(((-1 * matriz[1][0] * x) + (-1 * matriz[1][2] * z) + matriz[1][3]) / matriz[1][1], 4)
            print(f"\t* y = ({-1 * matriz[1][0]}({x})+({-1 * matriz[1][2]})({z})+({matriz[1][3]})) / {matriz[1][1]}")
            print(f"\t\ty = {y}")
            print()

            z = round(((-1 * matriz[2][0] * x) + (-1 * matriz[2][1] * y) + matriz[2][3]) / matriz[2][2], 4)
            print(f"\t* z = ({-1 * matriz[2][0]}({x})+({-1 * matriz[2][1]})({y})+({matriz[2][3]})) / {matriz[2][2]}")
            print(f"\t\tz = {z}")
            print()

            #Actualizamos nuestro ultimo valor calculado para cada variable
            histoX["xi+1"] = x
            histoY["yi+1"] = y
            histoZ["zi+1"] = z

            #Por ultimo calculamos el error para la ultima iteracion
            if iter == iteraciones -1:
                #      | (nueva - anterior) / nueva | * 100
                errorX = abs((histoX["xi+1"] - histoX["xi"]) / histoX["xi+1"])
                errorY = abs((histoY["yi+1"] - histoY["yi"]) / histoY["yi+1"])
                errorZ = abs((histoZ["zi+1"] - histoZ["zi"]) / histoZ["zi+1"])

                print("Error X:", errorX)
                print("Error X (%):", round(errorX * 100, 2))
                print()
                print("Error Y:", errorY)
                print("Error Y (%):", round(errorY * 100, 2))
                print()
                print("Error Z:", errorZ)
                print("Error Z (%):", round(errorZ * 100, 2))
                print()