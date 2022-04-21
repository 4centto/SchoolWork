x, y = 0, 0
operacion = ""

def Operaciones(x, y, operacion):
    if operacion == "+":
        print("SUMA: ", (x + y))
    elif operacion == "-":
        print("RESTA: ", (x - y))
    elif operacion == "*":
        print("MULTIPLICACION: ", (x * y))
    elif operacion == "/":
        print("DIVISION: ", (x / y))


x = float(input("Dame el valor de x: "))
y = float(input("Dame el valor de y: "))
operacion = input("¿Que operacion quieres realizar? ")
print()

Operaciones(x, y, operacion)