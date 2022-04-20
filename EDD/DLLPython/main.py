from DoubleLinkedList import DoubleLinkedList
import os
dll = DoubleLinkedList()

opcion = 0

while opcion != 10:
    os.system("cls")
    print("\t1. Obtener tamaño.")
    print("\t2. Validar si esta vacia.")
    print("\t3. Append (Agregar al final).")
    print("\t4. Encontrar desde la cola.")
    print("\t5. Encontrar desde la cabeza.")
    print("\t6. Quitar desde la cola.")
    print("\t7. Quitar desde la cabeza.")
    print("\t8. Lectura transversal.")
    print("\t9. Lectura transversal reversa.")
    print("\t10. Salir.")
    print()

    opcion = int(input("¿Que opción deseas? -> "))

    if opcion == 1:
        os.system("cls")
        print(f"El tamaño de la lista es: {dll.getSize()}")
        os.system("pause")

    elif opcion == 2:
        os.system("cls")
        if dll.isEmpty():
            print("La lista esta vacia.")
        else:
            print("La lista no esta vacia.")
        os.system("pause")

    elif opcion == 3:
        os.system("cls")
        numero = int(input(" * Dame tu numero: "))
        dll.append(numero)

        print("Agregado correctamente!!")
        os.system("pause")

    elif opcion == 4:
        os.system("cls")
        numero = int(input("* ¿Que numero deseas buscar? "))
        valor = dll.findFromTail(numero)
        if valor != None:
            print(f"El numero esta en la posicion: {valor}")
        else:
            print("Valor no encontrado!")
        os.system("pause")

    elif opcion == 5:
        os.system("cls")
        numero = int(input("* ¿Que numero deseas buscar? "))
        valor = dll.findFromHead(numero)
        if valor != None:
            print(f"El numero esta en la posicion: {valor}")
        else:
            print("Valor no encontrado!")
        os.system("pause")

    elif opcion == 6:
        os.system("cls")
        numero = int(input("¿Que valor deseas eliminar? "))
        dll.removeFromTail(numero)

        print("Numero eliminado correctamente!!")
        os.system("pause")

    elif opcion == 7:
        os.system("cls")
        numero = int(input("¿Que valor deseas eliminar? "))
        dll.removeFromHead(numero)

        print("Numero eliminado correctamente!!")
        os.system("pause")

    elif opcion == 8:
        os.system("cls")
        dll.transversal()
        os.system("pause")

    elif opcion == 9:
        os.system("cls")
        dll.reverseTransversal()
        os.system("pause")

print("Hasta Luego!!")