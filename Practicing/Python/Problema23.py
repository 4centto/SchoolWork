N = 0

def Aumentos(N):
    SUELDO = 0
    for i in range(N):
        print("Sueldo ", (i + 1), ":", end=" ")
        SUELDO = int(input())
        if SUELDO < 800:
            SUELDO = SUELDO + (SUELDO * 0.15)
            print("SUELDO ", (i + 1), ": ", SUELDO)
            print("(Se aplico un aumento del 15%)")
        else:
            print("SUELDO ", (i + 1), ": ", SUELDO)
            print("(No se aplico ningun aumento)")

N = int(input("¿Cuantos sueldos se van a regsitrar? "))

Aumentos(N)