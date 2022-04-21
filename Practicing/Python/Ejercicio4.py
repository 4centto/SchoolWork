print("CALCULADORA")
print("")
print("********************")
print("* MENU DE OPCIONES *")
print("********************")
print("")
print("")
print("  1. Suma")
print("  2. Resta")
print("  3. Division")
print("  4. Multiplicacion")
print("  5. Division Entera")
print("  6. Exponentes (Elevar a una potencia)")
print("  7. Modulo o Resto")
print("")
print("")

operacion = int(input("¿Cual es la operacion que deseas realizar?"))

if operacion == 1:
    num = float(input("Introduce el primer numero:  "))
    print("")
    num += float(input("Introduce tu segundo numero:  "))
    print("")
    print("El resultado de la suma es: ", num)

elif operacion == 2:
    num = float(input("Introduce el primer numero:  "))
    print("")
    num -= float(input("Introduce tu segundo numero:  "))
    print("")
    print("El resultado de la resta es: ", num)

elif operacion == 3:
    num = float(input("Introduce el primer numero:  "))
    print("")
    num /= float(input("Introduce tu segundo numero:  "))
    print("")
    print("El resultado de la division es: ", num)

elif operacion == 4:
    num = float(input("Introduce el primer numero:  "))
    print("")
    num *= float(input("Introduce tu segundo numero:  "))
    print("")
    print("El resultado de la multiplicacion es: ", num)

elif operacion == 5:
    num = float(input("Introduce el primer numero:  "))
    print("")
    num //= float(input("Introduce tu segundo numero:  "))
    print("")
    print("El resultado de la division entera es: ", num)

elif operacion == 6:
    num = float(input("Introduce el primer numero:  "))
    print("")
    num **= float(input("Introduce tu segundo numero:  "))
    print("")
    print("El resultado elevado es: ", num)

elif operacion == 7:
    num = float(input("Introduce el primer numero:  "))
    print("")
    num %= float(input("Introduce tu segundo numero:  "))
    print("")
    print("El resto es: ", num)

else:
    print("Esa opcion no existe, revisa correctamente el menu de opciones")
