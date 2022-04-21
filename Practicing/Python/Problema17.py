Pulgadas, Yardas, Millas = 0, 0, 0

def Conversiones(P, Y, M):
    MIL = P * 25.40
    print(P, " pulgadas son: ", MIL, "mm")
    MET = Y * 0.9144
    print(Y, " yardas son: ", MET, "m")
    KIL = M * 1.6093
    print(M, " milas son: ", KIL, "km")

Pulgadas = float(input("Pulgadas: "))
Yardas = float(input("Yardas: "))
Millas = float(input("Millas: "))

Conversiones(Pulgadas, Yardas, Millas)