#Votos para los candidatos
VOTOS = [0,0,0,0,0,0,0,0,0,0,0,0,0]
i = 1
voto = 0
VOTOSTOTALES = 0
GANADOR = 1
GANADOR2 = 0

print("**************")
print("* ELECCIONES *")
print("**************")
print()
print("* Para terminar el proceso de votaciones, solo teclee el numero 0 *")
print("")

#Llenado de la matriz
while i != 0:
    print("Valor ", i, ":", end=" ")
    voto = int(input())
    if voto == 0:
        i = 0
    else:
        VOTOS[voto] = VOTOS[voto] + 1
        VOTOSTOTALES = VOTOSTOTALES + 1
        i = i + 1
print("TABLA = ", VOTOS)
print("TOTAL DE VOTOS: ", VOTOSTOTALES)

#Votos de cada candidato
for i in range(1, len(VOTOS)):
    print("Candidato ", i, ": ", VOTOS[i])

#Candidato ganador
for i in range(1, len(VOTOS)):
    if VOTOS[i] > GANADOR:
        GANADOR = VOTOS[i]
        GANADOR2 = i
print()
print("El ganador es el candidato ", GANADOR2, " con ", GANADOR, " votos")
print("Porcentaje: %", round(((GANADOR * 100)/VOTOSTOTALES), 2))
