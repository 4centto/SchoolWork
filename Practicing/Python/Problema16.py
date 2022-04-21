M, COSTO = 0, 0

def Descuentos(Modelo, Costo):
    if Modelo == 1:
        return Costo - (Costo * 0.08)
    elif Modelo == 2:
        return Costo - (Costo * 0.05)
    elif Modelo == 3:
        return Costo - (Costo * 0.06)
    elif Modelo == 4:
        return Costo - (Costo * 0.09)

print("*********************")
print("*  1. Blazer-Trail  *")
print("*  2. Cavalier      *")
print("*  3. Chevy         *")
print("*  4. Opel-Astra    *")
print("*********************")
print()

M = int(input("Modelo: "))

if M > 0 and M < 5:
    COSTO = int(input("Costo: "))
    print("TOTAL: $", Descuentos(M, COSTO))
else:
    print("El modelo seleccionado no esta registrado")