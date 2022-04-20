#Programa que recibe una lista de numeros y al final les agrega +52 y quita espacios entre los numeros
#Primero mostramos el menu al usuario

opcion = 0
numeros = []

print(" * MENU * ")
while (opcion != 3):
    print("\n\n")
    print("\t1. Ingresar numero.")
    print("\t2. Mostrar numeros.")
    print("\t3. Salir.")
    
    try:
        opcion = int(input(" -> "))

        #Opcion para agregar numeros
        if opcion == 1:
            num = input(" * Dame tu numero: ")
            num = num.replace(" ", "")

            if num[0] == "+" and (num[1] + num[2]) == "52":
                numeros.append(num)
                print("¡Numero agregado correctamente!")
            elif num[0] != "+" and (num[0] + num[1]) == "52":
                numeros.append("+" + num)
                print("¡Numero agregado correctamente!")
            else:
                numeros.append("+52" + num)
                print("¡Numero agregado correctamente!")

        #Opcion para mostrar los numeros del arreglo
        elif opcion == 2:
            for i in range(len(numeros)):
                print(" -> Numero", (i + 1), ":", numeros[i]) 

        #Opcion para salir del programa
        elif opcion == 3:
            break

        else:
            print(" -> La opcion seleccionada no existe <-")

    except ValueError:
        print("Debes de ingresar numeros")

print("¡Hasta Luego!")