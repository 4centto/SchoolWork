CLAVE, MIN = 0, 0

def Calculo(Clave, Min):
    if(Clave == 12):
        if Min <= 3:
            Total = Min * 2
            print("TOTAL DE LA LLAMADA: $", Total)
        else:
            Dif = Min - 3
            Total = (Dif * 1.5) + 2
            print("TOTAL DE LA LLAMADA: $", Total)
    elif(Clave == 15):
        if Min <= 3:
            Total = Min * 2.2
            print("TOTAL DE LA LLAMADA: $", Total)
        else:
            Dif = Min - 3
            Total = (Dif * 1.8) + 2.2
            print("TOTAL DE LA LLAMADA: $", Total)
    elif(Clave == 18):
        if Min <= 3:
            Total = Min * 4.5
            print("TOTAL DE LA LLAMADA: $", Total)
        else:
            Dif = Min - 3
            Total = (Dif * 3.5) + 4.5
            print("TOTAL DE LA LLAMADA: $", Total)
    elif(Clave == 19):
        if Min <= 3:
            Total = Min * 3.5
            print("TOTAL DE LA LLAMADA: $", Total)
        else:
            Dif = Min - 3
            Total = (Dif * 2.7) + 3.5
            print("TOTAL DE LA LLAMADA: $", Total)
    elif(Clave == 23):
        if Min <= 3:
            Total = Min * 6
            print("TOTAL DE LA LLAMADA: $", Total)
        else:
            Dif = Min - 3
            Total = (Dif * 4.6) + 6
            print("TOTAL DE LA LLAMADA: $", Total)
    elif(Clave == 25):
        if Min <= 3:
            Total = Min * 6
            print("TOTAL DE LA LLAMADA: $", Total)
        else:
            Dif = Min - 3
            Total = (Dif * 4.6) + 6
            print("TOTAL DE LA LLAMADA: $", Total)
    elif(Clave == 29):
        if Min <= 3:
            Total = Min * 5
            print("TOTAL DE LA LLAMADA: $", Total)
        else:
            Dif = Min - 3
            Total = (Dif * 3.9) + 5
            print("TOTAL DE LA LLAMADA: $", Total)
    else:
        print("La clave no esta registrada")

CLAVE = int(input("Cual es la clave de la llamada: "))
MIN = float(input("Cuantos minutos duro la llamada: "))

Calculo(CLAVE, MIN)