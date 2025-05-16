import os

# Función para combinar dos términos si difieren en un solo bit
def combinar(a, b):
    diferencia = 0
    nuevo = ""
    for x in range(len(a)):
        if a[x] != b[x]:
            diferencia += 1
            nuevo += "*"
        else:
            nuevo += a[x]
    if diferencia == 1:
        return nuevo
    else:
        return None

# Función principal del método de McCluskey
def obtener_implicantes_primos(cubo):

    usados_global = set()
    implicantes_primos = []
    iteracion = 1

    while True:

        #Imprimimos el cubo en el que estamos
        print(f"\nCubo {iteracion-1}:\n")

        for i in cubo:
            for j in i:
                print(j["numero"])
            print("-"*numero_variables)

        print("-" * 60)

        siguiente_cubo = [ [] for _ in range(numero_variables+1) ]
        usados_local = set()
        combinados = []

        for i in range(len(cubo)-1):
            for a in cubo[i]:
                for b in cubo[i+1]:
                    combinado = combinar(a["numero"], b["numero"])
                    if combinado:
                        usados_local.add(a["numero"])
                        usados_local.add(b["numero"])
                        combinados.append(combinado)

        # Guardamos los que no se usaron (implicantes primos)
        for grupo in cubo:
            for elem in grupo:
                if elem["numero"] not in usados_local and elem["numero"] not in usados_global:
                    implicantes_primos.append(elem["numero"])
                    usados_global.add(elem["numero"])

        if not combinados:
            break

        # Generamos nuevo cubo con combinados
        nuevo_conteo = {}
        for c in combinados:
            if c not in nuevo_conteo:
                count = c.count("1")
                siguiente_cubo[count].append({
                    "numero": c,
                    "minitermino": 1,
                    "factorP": False
                })

        cubo = siguiente_cubo
        iteracion += 1

    # Mostrar cubo final vacío antes de terminar
    print(f"\nCubo {iteracion-1}: (ya no hay combinaciones posibles)\n")

    for i in cubo:
        for j in i:
            print(j["numero"])
        print("-"*numero_variables)

    print("-" * 60)

    return implicantes_primos

#Funcion que transforma los implicantes primos en la ecuacion final
def implicante_a_ecuacion(implicante):
    variables = ["A", "B", "C", "D", "E", "F", "G", "H"]
    ecuacion = ""
    for i in range(len(implicante)):
        if implicante[i] == "1":
            ecuacion += variables[i]
        elif implicante[i] == "0":
            ecuacion += variables[i] + "'"
        # Si es '-', no se agrega nada
    return ecuacion

os.system("clear")

#Primero preguntamos al usuario de cuantas variables sera su tabla de verdad, sabiendo que el maximo es 8
numero_variables = int(input("¿Cuantas variables hay en la tabla de verdad?: "))

while numero_variables <= 1 or numero_variables > 8:
    os.system("clear")
    print("WARNING: Debes ingresar un numero entre 2 y 8")
    print("")
    print("")
    numero_variables = int(input("¿Cuantas variables hay en la tabla de verdad?: "))

#Una vez obtenido el numero de variables hacemos la generacion de la tabla
numero_valores = 2**numero_variables
tabla_v = []
serie = 1

for i in range(numero_variables):
    lista = []
    cero = True
    for j in range(numero_valores):
        if cero == True:
            for x in range(serie):
                if len(lista) < numero_valores:
                    lista.append(0)
            cero = False
        else:
            for x in range(serie):
                if len(lista) < numero_valores:
                    lista.append(1)
            cero = True

    tabla_v.append(lista)
    serie = serie * 2

tabla_verdad = []
for i in range(numero_valores):
    numero = ''
    for j in range(numero_variables):
        numero += str(tabla_v[j][i])

    tabla_verdad.append({
        "numero": numero[::-1],
        "minitermino": int(input(" - Dame el minitermino del numero " + numero[::-1] + ": ")),
        "factorP": False
    })
os.system("clear")

#Ahora los separamos por los que tienen minitertminos 1 y los ordenamos de menor a mayor numero de 1's
#print("|",i["numero"],"|",i["minitermino"],"|")
#tabla_verdad
cubo = [ [] for i in range(numero_variables+1) ]
for i in range(numero_variables+1):
    for j in tabla_verdad:
        if j["minitermino"] == 1:
            cont = 0
            for x in range(len(j["numero"])):
                if j["numero"][x] == "1":
                    cont += 1
            
            if cont == i:
                cubo[i].append(j)

for i in cubo:
    for j in i:
        print(j["numero"])
    print("-"*numero_variables)

# Ejecutamos el método
implicantes_primos = obtener_implicantes_primos(cubo)

# Mostrar los resultados
print("\nImplicantes primos encontrados:")

ecuacion_final = ""
for imp in implicantes_primos:
    termino = implicante_a_ecuacion(imp)
    print(f"→ {imp}")
    if ecuacion_final == "":
        ecuacion_final = termino
    else:
        ecuacion_final += "+" + termino

print("\nEcuación final simplificada:")
print(ecuacion_final)
print("")
