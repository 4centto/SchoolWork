arreglo = []
opcion = 0

def removerItem(item, arreglo, posicion):
    item = int(item)
    if posicion == item:
        arreglo.pop(item)
        print("\n")
        print(" * Elemento eliminado correctamente * ")
        print("\n")
    else:
        removerItem(item, arreglo, posicion + 1)

while opcion != 4:
    print(" 1. Insertar numero.")
    print(" 2. Eliminar numero medio.")
    print(" 3. Mostrar arreglo.")
    print(" 4. Salir.")

    opcion = int(input(" * Que deseas hacer: "))

    if opcion == 4:
        print("\n\n")
        break
    elif opcion == 1:
        print("\n")
        numero = int(input(" * Dame tu numero: "))
        arreglo.append(numero)
        print("Numero agregado!!")
        print("\n\n")
    elif opcion == 3:
        if len(arreglo) > 0:
            print("\n\n")
            for i in range(len(arreglo)):
                print("[" + str(arreglo[i]) + "]", end="")
            print("\n\n\n")
        else:
            print("\n\n")
            print(" * No tienes nada en el arreglo * ")
            print("\n") 
    
    elif opcion == 2:
        length = len(arreglo)

        if length == 0:
            print("\n")
            print(" * Tu arreglo esta vacio * ")
            print("\n")
        elif length == 1:
            print("\n")
            arreglo.clear()
            print(" * Valor removido correctamente * ")
            print("\n")
        
        else:
            
            if (len(arreglo) % 2) == 0:
                removerItem((length / 2) - 1, arreglo, 0)
            else:
                removerItem((length / 2) - 0.5, arreglo, 0)

print("Hasta luego")