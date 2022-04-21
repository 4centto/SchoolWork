print("=============")
print("= Conversor =")
print("=============")
print("")
print("Menu de Opciones")
print("")

print("Presiona 1 si quieres convertir a letras el numero 1")
print("Presiona 2 si quieres convertir a letras el numero 2")

num_uno = int(input("¿Cual es tu eleccion?"))

if num_uno == 1:

    print("El numero que seleccionaste fue el 1")
    print("")
    print("¿Quieres hacer otra conversion?")
    repeticion = int(input("Si = 1       No = 0"))

    if repeticion == 1:

        print("¿Que numero quieres convertir?")
        print("1, 2, 3 o 4")

        num_dos = int(input(""))

        if num_dos == 1:

            print("Numero uno")

        elif num_dos == 2:

            print("Numero dos")

        elif num_dos == 3:

            print("Numero tres")

        elif num_dos== 4:

            print("Numero cuatro")

        else:

            print("El numero que ingresaste no esta registrado en la BD")

    elif repeticion == 0:

        print("Fin. Gracias.")

elif num_uno == 2:

    print("El numero que seleccionaste fue el dos")
    print("")
    print("En esta opcion no tenemos repeticiones ¿Tienes algun inconveniente?")
    print("")
    no_repeticiones = int(input("Si = 1       No = 0"))

    if no_repeticiones == 1:

        print("A con que muy salsas no?")

    elif no_repeticiones ==0:

        print("Bueno, TQM")

    else:

        print("Esta opcion no existe krnal, lo siento")

else:

    print("No seleccionaste ninguna opcion")
