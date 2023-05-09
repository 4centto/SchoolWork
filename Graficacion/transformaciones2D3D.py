'''
    Integrantes:
        Gonzalez Mireles Angel Brayan
        Castro Garcia Ivan

    Grupo: 2058
    Materia: Graficacion por computadora
'''

import os
import matplotlib.pyplot as plt
from math import cos, sin
from mpl_toolkits.mplot3d.art3d import Poly3DCollection

print("¿Que dimensiones quieres calcular?")
print("   1. 2D")
print("   2. 3D")

#Modelos 3D
def cube(coords=[[0, 0, 0], [1, 0, 0], [1, 1, 0], [0, 1, 0],
            [0, 0, 1], [1, 0, 1], [1, 1, 1], [0, 1, 1]]):
    # Crear una figura y un objeto de ejes 3D
    fig = plt.figure()
    ax = fig.add_subplot(projection='3d')

    # Definir las caras de la pirámide utilizando índices de los vértices
    cara1 = [coords[0], coords[1], coords[2], coords[3]]
    cara2 = [coords[0], coords[1], coords[5], coords[4]]
    cara3 = [coords[1], coords[2], coords[6], coords[5]]
    cara4 = [coords[2], coords[3], coords[7], coords[6]]
    cara5 = [coords[3], coords[0], coords[4], coords[7]]
    cara6 = [coords[4], coords[5], coords[6], coords[7]]
    caras = [cara1, cara2, cara3, cara4, cara5, cara6]

    # Crear una colección Poly3DCollection con las caras de la pirámide
    cube = Poly3DCollection(caras, linewidths=0.5, edgecolors='black')
    cube.set_facecolor('yellow')

    # Añadir la pirámide al objeto de ejes
    ax.add_collection3d(cube)

    # Mostrar la figura
    plt.show()

    return coords

def romb(coords=[[0, 0, 0], [1, 0, 0], [1, 1, 0], [0, 1, 0], [0.5, 0.5, 1],
            [0, 0, 0], [1, 0, 0], [1, 1, 0], [0, 1, 0], [0.5, 0.5, -1]]):
    # Crear una figura y un objeto de ejes 3D
    fig = plt.figure()
    ax = fig.add_subplot(projection='3d')

    # Definir las caras de la pirámide utilizando índices de los vértices
    cara1 = [coords[0], coords[1], coords[4]]
    cara2 = [coords[1], coords[2], coords[4]]
    cara3 = [coords[2], coords[3], coords[4]]
    cara4 = [coords[3], coords[0], coords[4]]
    cara5 = [coords[5], coords[6], coords[7]]
    cara6 = [coords[5], coords[6], coords[9]]
    cara7 = [coords[6], coords[7], coords[9]]
    cara8 = [coords[7], coords[8], coords[9]]
    caras = [cara1, cara2, cara3, cara4, cara5, cara6, cara7, cara8]

    # Crear una colección Poly3DCollection con las caras de la pirámide
    romb = Poly3DCollection(caras, linewidths=0.5, edgecolors='black')
    romb.set_facecolor('red')

    # Añadir la pirámide al objeto de ejes
    ax.add_collection3d(romb)

    # Mostrar la figura
    plt.show()

    return coords

def pyramid(coords=[[0, 0, 0], [1, 0, 0], [1, 1, 0], [0, 1, 0], [0.5, 0.5, 1]]):
    # Crear una figura y un objeto de ejes 3D
    fig = plt.figure()
    ax = fig.add_subplot(projection='3d')

    # Definir las caras de la pirámide utilizando índices de los vértices
    cara1 = [coords[0], coords[1], coords[2], coords[3]]
    cara2 = [coords[0], coords[1], coords[4]]
    cara3 = [coords[1], coords[2], coords[4]]
    cara4 = [coords[2], coords[3], coords[4]]
    cara5 = [coords[3], coords[0], coords[4]]
    caras = [cara1, cara2, cara3, cara4, cara5]

    # Crear una colección Poly3DCollection con las caras de la pirámide
    piramide = Poly3DCollection(caras, linewidths=0.5, edgecolors='black')
    piramide.set_facecolor('blue')

    # Añadir la pirámide al objeto de ejes
    ax.add_collection3d(piramide)

    # Mostrar la figura
    plt.show()

    return coords

def plotFigure(coords):
    x, y = [], []
    for coord in coords:
        x.append(coord[0])
        y.append(coord[1])

    x.append(coords[0][0])
    y.append(coords[0][1])

    plt.plot(x, y)
    plt.show()

    return coords

def transforms(coords):

    print("¿Que transformaciones deseas hacer?")
    print("   1. Trasladar\n   2. Rotar\n   3. Escalar")

    opcion = int(input(" -> "))

    transCoords = []

    #Metodo para traslacion
    if opcion == 1:
        #Hacemos las operaciones de traslacion para cada punto
        transCoords.append([float(x) for x in input(" -> Dame la coordenada del vector separada por una coma, y sin espacios: ").split(",")])

        for coord in coords:
            x, y = transCoords[0][0], transCoords[0][1]
            coord[0] += x
            coord[1] += y

        plotFigure(coords)

        os.system("clear")
        transforms(coords)

    #Metodo para rotacion
    elif opcion == 2:
        deg = float(input(" -> Cuantos grados quieres rotar la figura: "))

        for coord in coords:
            x1 = coord[0]*cos(deg) - coord[1]*sin(deg)
            y1 = coord[1]*cos(deg) + coord[0]*sin(deg)

            coord[0], coord[1] = x1, y1

        plotFigure(coords)

        os.system("clear")
        transforms(coords)

    #Metodo para escalar
    elif opcion == 3:
        percent = float(input(" -> Cuanto deseas escalar tu figura del 0.0 al 1.0: "))

        for coord in coords:
            coord[0] = coord[0] * percent
            coord[1] = coord[1] * percent
        
        plotFigure(coords)

        os.system("clear")
        transforms(coords)

    else:
        os.system("clear")
        transforms(coords)

def transforms3D(coords, fig):
    print("¿Que transformaciones deseas hacer?")
    print("   1. Trasladar\n   2. Rotar\n   3. Escalar")

    opcion = int(input(" -> "))

    transCoords = []

    #Metodo para traslacion
    if opcion == 1:
        #Hacemos las operaciones de traslacion para cada punto
        transCoords.append([float(x) for x in input(" -> Dame la coordenada del vector separada por una coma, y sin espacios: ").split(",")])

        for coord in coords:
            x, y, z = transCoords[0][0], transCoords[0][1], transCoords[0][2]
            coord[0] += x
            coord[1] += y
            coord[2] += z

        cube(coords) if fig == 1 else pyramid(coords) if fig == 2 else romb(coords) if fig == 3 else print()

        os.system("clear")
        transforms3D(coords, fig)

    #Metodo para rotacion
    elif opcion == 2:

        eje = int(input(" -> Sobre que eje quieres hacer la rotaxion: \n   1. X\n   2. Y\n   3. Z\n -> "))
        deg = float(input(" -> Cuantos grados quieres rotar la figura: "))

        if eje == 1:
            for coord in coords:
                x1 = coord[0]*cos(deg) - coord[1]*sin(deg)
                y1 = coord[0]*sin(deg) + coord[1]*cos(deg)
                z1 = coord[2]

                coord[0], coord[1], coord[2] = x1, y1, z1

        elif eje == 2:
            for coord in coords:
                x1 = coords[0]
                y1 = coord[1]*cos(deg) - coord[2]*sin(deg)
                z1 = coord[1]*sin(deg) + coord[2]*cos(deg)

                coord[0], coord[1], coord[2] = x1, y1, z1

        elif eje == 3:
            for coord in coords:
                x1 = coord[2]*sin(deg) + coord[0]*cos(deg)
                y1 = coord[1]
                z1 = coord[2]*cos(deg) - coord[0]*sin(deg)

                coord[0], coord[1], coord[2] = x1, y1, z1
            

        cube(coords) if fig == 1 else pyramid(coords) if fig == 2 else romb(coords) if fig == 3 else print()

        os.system("clear")
        transforms3D(coords, fig)

    #Metodo para escalar
    elif opcion == 3:
        percent = float(input(" -> Cuanto deseas escalar tu figura del 0.0 al 1.0: "))

        for coord in coords:
            coord[0] = coord[0] * percent
            coord[1] = coord[1] * percent
            coord[2] = coord[2] * percent
        
        cube(coords) if fig == 1 else pyramid(coords) if fig == 2 else romb(coords) if fig == 3 else print()

        os.system("clear")
        transforms3D(coords, fig)

    else:
        os.system("clear")
        transforms3D(coords, fig)

def start():
    opcion = int(input(" -> "))

    if opcion == 1:
        #Obtenemos las coordenadas de la figura, minimo 2 coordenadas
        numCoords = int(input("¿Cuantas coordenadas vas a ingresar? "))
        coords = []

        for i in range(numCoords):
            coords.append([float(x) for x in input(" -> Dame la coordenada separada por una coma, y sin espacios: ").split(",")])

        #Preguntamos si quiere hacer algunas transformaciones sobre la figura
        coords = plotFigure(coords)

        os.system("clear")
        transforms(coords)

    elif opcion == 2:
        os.system("clear")
        opcion = int(input("* Elige una figura: \n   1. Cubo\n   2. Piramide\n   3. Rombo\n -> "))

        if opcion == 1:
            coords = cube()

            os.system("clear")
            transforms3D(coords, opcion)

        elif opcion == 2:
            coords = pyramid()

            os.system("clear")
            transforms3D(coords, opcion)

        elif opcion == 3:
            coords = romb()

            os.system("clear")
            transforms3D(coords, opcion)

    else:
        os.system("clear")
        start()

start()