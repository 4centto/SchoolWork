import os
from Gauss import GaussJacobi, GaussJordan, GaussSeidel

#Este archivo encapsula los 3 metodos pero en uno solo
ejecucion = True
opcion = 0

while ejecucion:
    os.system("cls")
    print("    - MENU -")
    print()
    print("1. Gauss-Jordan")
    print("2. Gauss-Seidel")
    print("3. Gauss-Jacobi")
    print("4. Salir")
    print()

    opcion = int(input(" -> ¿Que metodo deseas usar? "))

    if opcion == 1:
        os.system("cls")
        gauss = GaussJordan()
        gauss.pedirDatos()
        gauss.calcular()
        print()
        os.system("pause")

    elif opcion == 2:
        gauss = GaussSeidel()
        gauss.calcular()
        print()
        os.system("pause")

    elif opcion == 3:
        gauss = GaussJacobi()
        gauss.calcular()
        print()
        os.system("pause")

    elif opcion == 4:
        os.system("cls")
        print("Hasta luego!")
        print()
        os.system("pause")
        ejecucion = False
    else:
        os.system("cls")
        print("El metodo no existe. Vuelve a intentarlo.")
        os.system("pause")