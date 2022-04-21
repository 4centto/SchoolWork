TIEMPO, DISTANCIA = 0, 0
TOTAL, DESCUENTO = 0, 0

def Calculo(TIEMPO, DISTANCIA):
    if TIEMPO > 7 and DISTANCIA > 800:
        TOTAL = DISTANCIA * 0.23
        DESCUENTO = TOTAL - (TOTAL * 0.30)
        print("TOTAL: $", round(DESCUENTO, 2))
        print("(Se aplico un descuento del 30%)")
    else:
        TOTAL = DISTANCIA * 0.23
        print("TOTAL: $", round(TOTAL, 2))
        print("(No se aplico ningun descuento)")

TIEMPO = int(input("Cuantos dias estuvo abordo: "))
DISTANCIA = float(input("Cuantos kilometros recorrio: "))
print()

Calculo(TIEMPO, DISTANCIA)