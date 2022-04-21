#Promedio de N Alumnos
N = 0
ALUMNOS = []
Promedio = 0
PROMGEN, ACUM = 0, 0
APROBADOS, REPROBADOS = 0, 0
PORCENTAJE = 0
MAYORAOCHO = 0
N = int(input("¿Cuantos alumnos hay en el grupo?  "))

#Inicializar el array
for i in range(N + 1):
    ALUMNOS.append(0)

#Llenado de Calificaciones de cada alumno
for i in range(1, len(ALUMNOS)):
    print("Alumno ", i, ":", end=" ")
    promedio = float(input())
    ALUMNOS[i] = promedio
print()
print("Tabla de alumnos: ", ALUMNOS)
print()

#Promedio general del grupo
for i in range(1, len(ALUMNOS)):
    ACUM = ACUM + ALUMNOS[i]
PROMGEN = ACUM / (len(ALUMNOS) - 1)
print("El promedio del grupo es: ", PROMGEN)
print()

#Numero de alumnos aprobados y reprobados
for i in range(1, len(ALUMNOS)):
    if ALUMNOS[i] > 6:
        APROBADOS = APROBADOS + 1
    else:
        REPROBADOS = REPROBADOS + 1
print("APROBADOS: ", APROBADOS)
print("REPOBADOS: ", REPROBADOS)
print()

#Porcentaje de alumnos aprobados y reprobados
PORCENTAJE = ((APROBADOS * 100) / (len(ALUMNOS) - 1))
print("Porcentaje de alumnos aprobados: ", PORCENTAJE)

PORCENTAJE = ((REPROBADOS * 100) / (len(ALUMNOS) - 1))
print("Porcentaje de alumnos reprobados: ", PORCENTAJE)
print()

#Alumnos con califiacion mayor a 8
for i in range(1, len(ALUMNOS)):
    if ALUMNOS[i] > 8:
        MAYORAOCHO = MAYORAOCHO + 1
print("Alumnos con promedio mayor a 8: ", MAYORAOCHO, " alumnos")