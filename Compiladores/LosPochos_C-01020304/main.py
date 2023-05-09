'''
    Materia: Compiladores
    Equipo: Los Pochos
    Grupo: 2658

    Integrantes:
        Castro Garcia Ivan
        Delabra Perez Xiomara Adamari
        Garcia Trejo Sebastian
        Gonzalez Mireles Angel Brayan

    Desarrollado en Python:
        Version de VSCode: 1.77.0
        Version de python: 3.9.6
'''

#Importamos las clases de los programas 1, 2, 3, y 4 al igual que la libreria del sistema
from programa1 import Programa1
from programa2 import Programa2
from programa3 import Programa3
from programa4 import Programa4

import os

#Abrimos nuestro archivo
file = open("file.txt", "r")

print("--------- PROGRAMA 1 ----------")
#Creamos nuestro objeto del programa1
p1 = Programa1(file)
p1.start() #Ejecutamos el programa

os.system("pause") #Pausamos la consola

print("\n--------- PROGRAMA 2 ----------")
#Creamos nuestro objeto del programa2
p2 = Programa2(file)
p2.start() #Ejecutamos el programa

os.system("pause") #Pausamos la consola

print("\n--------- PROGRAMA 3 ----------")
#Creamos nuestro objeto del programa3
p3 = Programa3(file)
p3.start() #Ejecutamos el programa

os.system("pause") #Pausamos la consola

print("\n--------- PROGRAMA 4 ----------")
#Creamos nuestro objeto del programa4
p4 = Programa4(file)
p4.start() #Ejecutamos el programa

os.system("pause") #Pausamos la consola

#Cerramos nuestro archivo
file.close()