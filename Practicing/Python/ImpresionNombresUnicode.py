contenedor = [[" " for i in range(7)] for i in range(5)]
icono = "@"
marco = "\u22D2"

#Metodos o funciones que convierten una letra en simbolos
def letra_A():
    contenedor[0][3] = icono
    contenedor[1][2] = icono
    contenedor[1][4] = icono
    contenedor[2][1] = icono
    contenedor[2][5] = icono
    contenedor[4][0] = icono
    contenedor[4][6] = icono

    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 3:
                contenedor[i][j] = icono

    return contenedor

def letra_B():
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if j == 0:
                contenedor[i][j] = icono
            if i == 0 and j <= 3:
                contenedor[i][j] = icono
            if i == 4 and j <= 3:
                contenedor[i][j] = icono
    contenedor[1][4] = icono
    contenedor[2][3] = icono
    contenedor[3][4] = icono

    return contenedor

def letra_C():
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 0:
                if j >= 3 and j <= 5:
                    contenedor[i][j] = icono
            if i == 4:
                if j >= 3 and j <= 5:
                    contenedor[i][j] = icono

    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 2:
                if i >= 1 and i <= 3:
                    contenedor[i][j] = icono

    return contenedor

def letra_D():
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 0:
                if j >= 1 and j <= 3:
                    contenedor[i][j] = icono
            if i == 4:
                if j >= 1 and j <= 3:
                    contenedor[i][j] = icono

    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 1:
                if i >= 1 and i <= 3:
                    contenedor[i][j] = icono
            if j == 4:
                if i >= 1 and i <= 3:
                    contenedor[i][j] = icono

    return contenedor

def letra_E():
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 0:
                if j >= 1 and j <= 4:
                    contenedor[i][j] = icono
            if i == 2:
                if j >= 1 and j <= 2:
                    contenedor[i][j] = icono
            if i == 4:
                if j >= 1 and j <= 4:
                    contenedor[i][j] = icono
    contenedor[1][1] = icono
    contenedor[3][1] = icono

    return contenedor

def letra_F():
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 0:
                if j >= 2 and j <= 5:
                    contenedor[i][j] = icono
            if i == 2:
                if j >= 2 and j <= 3:
                    contenedor[i][j] = icono

    contenedor[1][2] = icono
    contenedor[3][2] = icono
    contenedor[4][2] = icono

    return contenedor

def letra_G():
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 0:
                if j >= 3 and j <= 5:
                    contenedor[i][j] = icono
            if i == 4:
                if j >= 3 and j <= 4:
                    contenedor[i][j] = icono

    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 2:
                if i >= 1 and i <= 3:
                    contenedor[i][j] = icono

    contenedor[2][4] = icono
    contenedor[3][5] = icono

    return contenedor

def letra_H():
    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 1:
                if i >= 0 and i <= 4:
                    contenedor[i][j] = icono
            if j == 5:
                if i >= 0 and i <= 4:
                    contenedor[i][j] = icono
    contenedor[2][2] = icono
    contenedor[2][3] = icono
    contenedor[2][4] = icono

    return contenedor

def letra_I():
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 0:
                if j >= 1 and j <= 5:
                    contenedor[i][j] = icono
            if i == 4:
                if j >= 1 and j <= 5:
                    contenedor[i][j] = icono
    contenedor[1][3] = icono
    contenedor[2][3] = icono
    contenedor[3][3] = icono

    return contenedor

def letra_J():
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 0:
                if j >= 2 and j <= 4:
                    contenedor[i][j] = icono
            if i == 4:
                if j >= 2 and j <= 3:
                    contenedor[i][j] = icono
    contenedor[1][3] = icono
    contenedor[2][3] = icono
    contenedor[3][3] = icono
    contenedor[3][1] = icono

    return contenedor

def letra_K():
    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 1:
                if i >= 0 and i <= 4:
                    contenedor[i][j] = icono
    contenedor[0][4] = icono
    contenedor[1][3] = icono
    contenedor[2][2] = icono
    contenedor[3][3] = icono
    contenedor[4][4] = icono

    return contenedor

def letra_L():
    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 2:
                if i >= 0 and j <= 4:
                    contenedor[i][j] = icono

    contenedor[4][3] = icono
    contenedor[4][4] = icono

    return contenedor

def letra_M():
    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 1:
                if i >= 0 and i <= 4:
                    contenedor[i][j] = icono
            if j == 5:
                if i >= 0 and i <= 4:
                    contenedor[i][j] = icono
    contenedor[1][2] = icono
    contenedor[2][3] = icono
    contenedor[1][4] = icono

    return contenedor

def letra_N():
    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 1:
                if i >= 0 and i <= 4:
                    contenedor[i][j] = icono
            if j == 5:
                if i >= 0 and i <= 4:
                    contenedor[i][j] = icono
    contenedor[1][2] = icono
    contenedor[2][3] = icono
    contenedor[3][4] = icono

    return contenedor

def letra_O():
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 0:
                if j >= 2 and j <= 4:
                    contenedor[i][j] = icono
            if i == 4:
                if j >= 2 and j <= 4:
                    contenedor[i][j] = icono
    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 1:
                if i >= 1 and i <= 3:
                    contenedor[i][j] = icono
            if j == 5:
                if i >= 1 and i <= 3:
                    contenedor[i][j] = icono

    return contenedor

def letra_P():
    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 1:
                if i >= 0 and i <= 4:
                    contenedor[i][j] = icono
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 0:
                if j >= 2 and j <= 3:
                    contenedor[i][j] = icono
            if i == 2:
                if j >= 2 and j <= 3:
                    contenedor[i][j] = icono

    contenedor[1][4] = icono

    return contenedor

def letra_Q():
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 0:
                if j >= 2 and j <= 4:
                    contenedor[i][j] = icono
            if i == 4:
                if j >= 2 and j <= 4:
                    contenedor[i][j] = icono
    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 1:
                if i >= 1 and i <= 3:
                    contenedor[i][j] = icono
            if j == 5:
                if i >= 1 and i <= 3:
                    contenedor[i][j] = icono

    contenedor[2][3] = icono
    contenedor[3][4] = icono
    contenedor[4][5] = icono

    return contenedor

def letra_R():
    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 1:
                if i >= 0 and i <= 4:
                    contenedor[i][j] = icono
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 0:
                if j >= 2 and j <= 3:
                    contenedor[i][j] = icono
            if i == 2:
                if j >= 2 and j <= 3:
                    contenedor[i][j] = icono

    contenedor[1][4] = icono
    contenedor[3][3] = icono
    contenedor[4][4] = icono

    return contenedor

def letra_S():
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 0:
                if j >= 2 and j <= 5:
                    contenedor[i][j] = icono
            if i == 2:
                if j >= 2 and j <= 4:
                    contenedor[i][j] = icono
            if i == 4:
                if j >= 1 and j <= 4:
                    contenedor[i][j] = icono
    contenedor[1][1] = icono
    contenedor[3][5] = icono

    return contenedor

def letra_T():
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 0:
                if j >= 1 and j <= 5:
                    contenedor[i][j] = icono
    contenedor[1][3] = icono
    contenedor[2][3] = icono
    contenedor[3][3] = icono
    contenedor[4][3] = icono

    return contenedor

def letra_U():
    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 1:
                if i >= 0 and i <= 3:
                    contenedor[i][j] = icono
            if j == 5:
                if i >= 0 and i <= 3:
                    contenedor[i][j] = icono
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 4:
                if j >= 2 and j <= 4:
                    contenedor[i][j] = icono

    return contenedor

def letra_V():
    contenedor[0][0] = icono
    contenedor[0][6] = icono
    contenedor[1][0] = icono
    contenedor[1][6] = icono
    contenedor[2][1] = icono
    contenedor[3][2] = icono
    contenedor[4][3] = icono
    contenedor[3][4] = icono
    contenedor[2][5] = icono

    return contenedor

def letra_W():
    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 0:
                if i >= 0 and i <= 3:
                    contenedor[i][j] = icono
            if j == 6:
                if i >= 0 and i <= 3:
                    contenedor[i][j] = icono
    contenedor[4][1] = icono
    contenedor[3][2] = icono
    contenedor[2][3] = icono
    contenedor[3][4] = icono
    contenedor[4][5] = icono

    return contenedor

def letra_X():
    contenedor[0][1] = icono
    contenedor[1][2] = icono
    contenedor[2][3] = icono
    contenedor[3][4] = icono
    contenedor[4][5] = icono
    contenedor[0][5] = icono
    contenedor[1][4] = icono
    contenedor[2][3] = icono
    contenedor[3][2] = icono
    contenedor[4][1] = icono

    return contenedor

def letra_Y():
    contenedor[2][2] = icono
    contenedor[2][4] = icono
    for j in range(len(contenedor[0])):
        for i in range(len(contenedor)):
            if j == 1:
                if i >= 0 and i <= 1:
                    contenedor[i][j] = icono
            if j == 5:
                if i >= 0 and i <= 1:
                    contenedor[i][j] = icono
            if j == 3:
                if i >= 3 and i <= 4:
                    contenedor[i][j] = icono

    return contenedor

def letra_Z():
    for i in range(len(contenedor)):
        for j in range(len(contenedor[0])):
            if i == 0:
                if j >= 1 and j <= 5:
                    contenedor[i][j] = icono
            if i == 4:
                if j >= 1 and j <= 5:
                    contenedor[i][j] = icono

    contenedor[1][4] = icono
    contenedor[2][3] = icono
    contenedor[3][2] = icono

    return contenedor

nombre = ""

print("************************")
print("* CONVERSOR DE NOMBRES *")
print("************************")
print()

print("Por favor ingresa tu nombre")
nombre = input("Nombre: ")

if len(nombre) > 10:
    print("El nombre excede los 10 caracteres permitidos, vuelve a intentar")
else:
    nombre = nombre.strip() #Eliminar espacios
    nombre = nombre.upper() #Poner en mayusculas todas las palabras
    longitud = len(nombre) #Saber la longitud del nombre

    filas = 5 #Filas del contenedor del nombre completo
    columnas = longitud * 7 #Columnas del contenedor del nombre completo (Por cada letra se aumentaran 7 columnas)

    contenedor_Nombre = [["+" for i in range(columnas)] for j in range(filas)] #Contenedor del nombre completo
    letra_Aux = [] #Arreglo auxiliar para poder cambiar de arreglos

    contador = 0 #Contador para saber si es la primera palabra o no
    acumulador = 7 #Acumulador para aumentar las posiciones en el contenedor del nombre completo

    #Impresion de un marco superior al nombre
    for i in range(columnas - 4):
        print(marco, end="")
    print()

    #Metodo que asigna a cada letra del nombre un arreglo y ese arreglo lo meto dentro del arreglo
    #que contendra a nuestro nombre completo
    for i in nombre:

        if contador == 0:

            if i == "A":
                letra_Aux = letra_A()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "B":
                letra_Aux = letra_B()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "C":
                letra_Aux = letra_C()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "D":
                letra_Aux = letra_D()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "E":
                letra_Aux = letra_E()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "F":
                letra_Aux = letra_F()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "G":
                letra_Aux = letra_G()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "H":
                letra_Aux = letra_H()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "I":
                letra_Aux = letra_I()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "J":
                letra_Aux = letra_J()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "K":
                letra_Aux = letra_K()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "L":
                letra_Aux = letra_L()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "M":
                letra_Aux = letra_M()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "N":
                letra_Aux = letra_N()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "Ñ":
                letra_Aux = letra_N()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "O":
                letra_Aux = letra_O()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "P":
                letra_Aux = letra_P()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "Q":
                letra_Aux = letra_Q()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "R":
                letra_Aux = letra_R()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "S":
                letra_Aux = letra_S()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "T":
                letra_Aux = letra_T()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "U":
                letra_Aux = letra_U()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "V":
                letra_Aux = letra_V()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "W":
                letra_Aux = letra_W()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "X":
                letra_Aux = letra_X()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "Y":
                letra_Aux = letra_Y()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]
            if i == "Z":
                letra_Aux = letra_Z()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j] = letra_Aux[i][j]

            contador += 1

        else:

            if i == "A":
                letra_Aux = letra_A()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "B":
                letra_Aux = letra_B()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "C":
                letra_Aux = letra_C()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "D":
                letra_Aux = letra_D()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "E":
                letra_Aux = letra_E()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "F":
                letra_Aux = letra_F()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "G":
                letra_Aux = letra_G()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "H":
                letra_Aux = letra_H()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "I":
                letra_Aux = letra_I()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "J":
                letra_Aux = letra_J()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "K":
                letra_Aux = letra_K()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "L":
                letra_Aux = letra_L()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "M":
                letra_Aux = letra_M()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "N":
                letra_Aux = letra_N()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "Ñ":
                letra_Aux = letra_N()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "O":
                letra_Aux = letra_O()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "P":
                letra_Aux = letra_P()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "Q":
                letra_Aux = letra_Q()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "R":
                letra_Aux = letra_R()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "S":
                letra_Aux = letra_S()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "T":
                letra_Aux = letra_T()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "U":
                letra_Aux = letra_U()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "V":
                letra_Aux = letra_V()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "W":
                letra_Aux = letra_W()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "X":
                letra_Aux = letra_X()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "Y":
                letra_Aux = letra_Y()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]
            if i == "Z":
                letra_Aux = letra_Z()
                for i in range(len(letra_Aux)):
                    for j in range(len(letra_Aux[0])):
                        contenedor_Nombre[i][j + acumulador] = letra_Aux[i][j]

            acumulador += 7
            contador += 1

        #Limpiar el arreglo
        for i in range(len(contenedor)):
            for j in range(len(contenedor[0])):
                contenedor[i][j] = " "


        # Impresion del arreglo final

    #Método para la impresion del contenedor con el nombre completo
    for i in range(len(contenedor_Nombre)):
        for j in range(len(contenedor_Nombre[0])):
            print(contenedor_Nombre[i][j], end="")
        print()

    # Impresion de un marco inferior al nombre
    for i in range(columnas - 4):
        print(marco, end="")
    print()