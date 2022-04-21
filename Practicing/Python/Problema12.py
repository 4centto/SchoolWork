TEMP = 0

def Cual(TEMP):
    if TEMP > 85:
        print("1. Natación")
        print("2. Tenis")
        print("3. Golf")
        print("4. Esquí")
        print("5. Marcha")
    elif TEMP > 70 and TEMP <= 85:
        print("1. Tenis")
        print("2. Golf")
        print("3. Esquí")
        print("4. Marcha")
    elif TEMP > 32 and TEMP <= 70:
        print("1. Golf")
        print("2. Esquí")
        print("3. Marcha")
    elif TEMP > 10 and TEMP <= 32:
        print("1. Esquí")
        print("2. Marcha")
    elif TEMP <= 10 and TEMP >= 5:
        print("1. Marcha")
    else:
        print("0. Ninguno")

TEMP = float(input("¿Cual es la temperatura? "))
print()

Cual(TEMP)