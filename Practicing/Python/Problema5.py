SUELDO = 0

def Aumento(SUELDO):
    AUMENTO = 0
    if SUELDO < 10000:
        AUMENTO = SUELDO * 0.15
        print("Sueldo: $", AUMENTO)
        print("(Se realizo un aumento del 15%)")
    elif SUELDO >= 10000 and SUELDO <= 15000:
        AUMENTO = SUELDO * 0.11
        print("Sueldo: $", AUMENTO)
        print("(Se realizo un aumento del 11%)")
    elif SUELDO > 15000:
        AUMENTO = SUELDO * 0.08
        print("Sueldo: $", AUMENTO)
        print("(Se realizo un aumento del 8%)")


SUELDO = float(input("Sueldo del trabajador: $"))
print()

Aumento(SUELDO)