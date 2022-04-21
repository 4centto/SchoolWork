ALUMNOS, PROMEDIO, GEN = 0, 0, 0,

def Promedio(Alumnos):
    ACUM = 0
    for i in range(1, Alumnos + 1):
        print("Alumno ", i, ":", end="")
        PROMEDIO = float(input())
        print()
        ACUM = ACUM + PROMEDIO
    return ACUM

ALUMNOS = int(input("¿Cuantos promedios seran registrados? "))
print()

GEN = (Promedio(ALUMNOS) / ALUMNOS)

print("PROMEDIO: ", GEN)