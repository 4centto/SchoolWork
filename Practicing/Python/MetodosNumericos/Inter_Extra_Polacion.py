import os
'''
Este programa esta hecho con la finalidad de resolver problemas de interpolacion y extrapolacion de datos,
dandonos el dato requerido y ademas preguntar si va a realizar una extrapolacion para obtener un valor que 
esta fuera del rango de los datos de la tabla.
Ademas el programa supone que esta sea con pendientes parecidas, es decir, que el usuario debera ya de tener
en cuenta si el problema o la grafica cuenta con pendientes similares, en resumen; Que cumpla con las reglas 
para pode ser interpolada o extrapolada.

    1. Se piden los datos de la tabla, pero sin los datos faltantes, esos se pediran y calcularan despues.
    2. Ahora si, pedimos el dato que se quiera obtener en el eje y respecto a x.
    3. Calculamos la pendiente del punto A con el B
    4. Luego la trasformamos a la forma Ordenada al Origen (y-y1 = m(x-x1)).
    5. Y en esa ecuacion sustituimos x por el valor dado por el usuario.

    6. Opcionalmente preguntamos si quiere hacer una extrapolacion.
    7. De ser cierto, calculamos la pendiente de A, con el ultimo valor conocido.
    8. Luego esa pendiente la ponemos en nuestra formula anteriormente obtenida.
    9. Pedimos el dato que se quiera obtener de la extrapolacion y realizamos las operciones para obtener el resultado.

    *Por ultimo y ya como punto opcional se actualiza nuestra tabla

'''

def mostrarTabla(tabla):
    print("-----------")
    print(" X   |   Y ")
    for i in tabla:
        print(f" {i[0]}   |   {i[1]}")
    print("-----------")
    print()

def validarRangos(x, xUno, xDos):
    if x > xUno and x < xDos:
        return True
    else:
        return False

def imprimirOrdenadaAlOrigen(m, b):
    if b < 0:
        print(f"\ty = {m}x - {abs(b)}")
    else:
        print(f"\ty = {m}x + {b}")
    print()

def actualizarTabla(tabla, datoX, y, A):
    index = 0
    for i in range(len(tabla)):
        if tabla[i][0] == A[0]:
            index = i + 1

    tabla.insert(index, [datoX, y])

totalDatos = int(input("¿Cuantos datos seran ingresados? -> "))
tabla = []

#Obtenemos los datos de la tabla
for i in range(totalDatos):
    os.system("cls")
    print(f"Valor {i + 1}: ")
    x = int(input("Valor en X: "))
    y = int(input("Valor en Y: "))
    tabla.append([x, y])

os.system("cls")
print(" - TABLA - ")
mostrarTabla(tabla)

#Ahora pedimos que dato del eje x desea saber
datoX = float(input("¿Que valor en el eje de X quieres saber su valor? -> "))
encontrado = False

#Validamos que el punto X dado, tenga antes y despues datos o puntos ya conocidos
A = []
B = []

for i in range(len(tabla)):
    try:
        xUno = tabla[i][0]
        xDos = tabla[i+1][0]

        if validarRangos(datoX, xUno, xDos) == True:
            A = tabla[i]
            B = tabla[i+1]
            encontrado = True
            break
        
    except:
        print("Valor no encontrado.")
        break

#Validamos si el dato esta dentro de algunas coordenadas
if encontrado:
    print("Estos son los dos puntos encontrados: ")
    print(f"\tA({A[0]}, {A[1]})")
    print(f"\tB({B[0]}, {B[1]})")
    print()

    #Calculamos la pendiento
    #m = (y2- y1) / (x2 - x1)
    m = (B[1] - A[1]) / (B[0] - A[0])
    print("\tm =", round(m, 2))
    print()

    #Hacemos nuestra ecuacion ordenada al origen
    #y - y1 = m(x - x1)
    print("Ecuacion de la ordenada al origen: y - y1 = m(x - x1)")
    print(f"\ty - ({A[1]}) = {m}(x - ({A[0]}))")

    b = (m * (-1 * A[0])) + (-1 * A[1] * -1) #Calculamos el valor de b en la ecuacion de la forma y = mx + b

    imprimirOrdenadaAlOrigen(m, b)

    #Ahora si, sustituimos el valor que el usuario quiere saber en nuestra ecuacion obtenida
    y = (m * datoX) + b
    print(f"\t * El valor de Y para X = {datoX}: {y} * ")

    actualizarTabla(tabla, datoX, y, A)
    mostrarTabla(tabla)

    #Preguntamos si el usuario quiere hacer una extrapolacion
    print("\n\n")
    print(" ********************************** ")
    print("\t 1. SI")
    print("\t 2. NO\n")

    pregunta = int(input("¿Deseas hacer una extrapolacion? -> "))

    if pregunta == 1:
        #Preguntamos el nuevo valor de x
        print()
        datoX = float(input("¿Que valor en X deseas obtener? -> "))
        print()

        ultimoPunto = tabla[len(tabla) - 1]

        m = (ultimoPunto[1] - A[1]) / (ultimoPunto[0] - A[0])

        print("Ecuacion de la ordenada al origen: y - y1 = m(x - x1)")
        print(f"\ty - ({A[1]}) = {m}(x - ({A[0]}))")

        print("\tm =", round(m, 2))
        print()

        #Ahora con esta nueva pendiente reformulamos nuestra ecuacion ordenada al origen
        imprimirOrdenadaAlOrigen(m, b)

        #Por ultimo calculamos el ultimo dato de x
        y = (m * datoX) + b
        print(f"\t * El valor de Y para X = {datoX}: {y} * ")
        print()

        #Actualizamos la tabla de valores
        tabla.append([datoX, y])
        mostrarTabla(tabla)

else:
    print()
    print("Error. El valor dado no ha podido se rencontrado. Intentalo de nuevo.")

print()
print("Hasta luego!!!")

os.system("pause")