#Nombre de jugadores
jugador_uno = input("Ingresa el nombre del primer jugador: ")
jugador_dos = input("Ingresa el nombre del segundo jugador: ")

#Valores de puntajes
sets = 0
puntos_uno = "0"
puntos_dos = "0"
juegos_uno = "0"
juegos_dos = "0"
set_jugadores = [[0 for i in range(3)] for j in range(2)]

while(sets != 3):
    print("1. ", jugador_uno) # Dar los nombre a elegir
    print("2. ", jugador_dos)
    print("\n{}: {}, [{}] \n{}: {}, [{}] \n".format(jugador_uno, puntos_uno, juegos_uno, jugador_dos, puntos_dos, juegos_dos)) # Imprimir marcador
    print("{}: ".format(jugador_uno), end="")
    for i in range(3): # Imprimir sets
        print("[", set_jugadores[0][i], "]", end ="")
    print("")
    print("{}: ".format(jugador_dos), end="")
    for i in range(3):
        print("[", set_jugadores[1][i], "]", end ="")
    print("")
    
    #Pedir cual personaje gano el punto
    punto = int(input())

    #Hacer la logica del programa
    if punto == 1:

        if puntos_uno == "0":
            puntos_uno = "15"
        elif puntos_uno == "15":
            puntos_uno = "30"
        elif puntos_uno == "30":
            puntos_uno = "40"
        elif puntos_uno == "40":

            if puntos_dos == "40":
                puntos_uno = "AD"
                puntos_dos = ""

            else: ###
                aux = (int)(juegos_uno)
                aux += 1
                juegos_uno = aux
                puntos_uno = "0"
                puntos_dos = "0"

                if (int)(juegos_uno) >= 6 or (int)(juegos_dos) >= 6:
                    if ((int)(juegos_uno) - (int)(juegos_dos)) >= 2 or ((int)(juegos_dos) - (int)(juegos_uno)) >= 2:
                        set_jugadores[0][sets] = juegos_uno
                        set_jugadores[1][sets] = juegos_dos
                        juegos_uno = "0"
                        juegos_dos = "0"
                        puntos_uno = "0"
                        puntos_dos = "0"
                        sets += 1

        elif puntos_uno == "AD": ####
            aux = (int)(juegos_uno)
            aux += 1
            juegos_uno = aux
            puntos_uno = "0"
            puntos_dos = "0"

            if (int)(juegos_uno) >= 6 or (int)(juegos_dos) >= 6:
                    if ((int)(juegos_uno) - (int)(juegos_dos)) >= 2 or ((int)(juegos_dos) - (int)(juegos_uno)) >= 2:
                        set_jugadores[0][sets] = juegos_uno
                        set_jugadores[1][sets] = juegos_dos
                        juegos_uno = "0"
                        juegos_dos = "0"
                        puntos_uno = "0"
                        puntos_dos = "0"
                        sets += 1

        elif puntos_uno == "":
            puntos_uno = "40"
            puntos_dos = "40"

    elif punto == 2:

        if puntos_dos == "0":
            puntos_dos = "15"
        elif puntos_dos == "15":
            puntos_dos = "30"
        elif puntos_dos == "30":
            puntos_dos = "40"
        elif puntos_dos == "40":
            if puntos_uno == "40":
                puntos_dos = "AD"
                puntos_uno = ""
            else:
                aux = (int)(juegos_dos)
                aux += 1
                juegos_dos = aux
                puntos_dos = "0"
                puntos_uno = "0"

                if (int)(juegos_uno) >= 6 or (int)(juegos_dos) >= 6:
                    if ((int)(juegos_uno) - (int)(juegos_dos)) >= 2 or ((int)(juegos_dos) - (int)(juegos_uno)) >= 2:
                        set_jugadores[0][sets] = juegos_uno
                        set_jugadores[1][sets] = juegos_dos
                        juegos_uno = "0"
                        juegos_dos = "0"
                        puntos_uno = "0"
                        puntos_dos = "0"
                        sets += 1

        elif puntos_dos == "AD":
            aux = (int)(juegos_dos)
            aux += 1
            juegos_dos = aux
            puntos_uno = "0"
            puntos_dos = "0"

            if (int)(juegos_uno) >= 6 or (int)(juegos_dos) >= 6:
                    if ((int)(juegos_uno) - (int)(juegos_dos)) >= 2 or ((int)(juegos_dos) - (int)(juegos_uno)) >= 2:
                        set_jugadores[0][sets] = juegos_uno
                        set_jugadores[1][sets] = juegos_dos
                        juegos_uno = "0"
                        juegos_dos = "0"
                        puntos_uno = "0"
                        puntos_dos = "0"
                        sets += 1

        elif puntos_dos == "":
            puntos_dos = "40"
            puntos_uno = "40"
    else:
        print("El jugador no existe, por favor intentelo de nuevo. ")

print("------ Marcador Final -------\n")
print("{}: ".format(jugador_uno), end="")
for i in range(3): # Imprimir sets
    print("[", set_jugadores[0][i], "]", end ="")
print("")
print("{}: ".format(jugador_dos), end="")
for i in range(3):
    print("[", set_jugadores[1][i], "]", end ="")
print("")
print("-----------------------------")