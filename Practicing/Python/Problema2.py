i = 1
sueldo = 0

def Sueldos(sueldo):
    if sueldo > 1000:
        sueldo = sueldo + (sueldo * 0.12)
        print("Sueldo con un aumento del %12: $", sueldo)
    else:
        sueldo = sueldo + (sueldo * 0.15)
        print("Sueldo con un aumento del %15: ", sueldo)

while i != 0:
    print("Sueldo del trabajador: ", end="$")
    sueldo = int(input())
    if sueldo == -1:
        i = 0
    else:
        Sueldos(sueldo)