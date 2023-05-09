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

class Programa4:

    #Contructor de la clase que recibe nuestro archivo a leer
    def __init__(self, file):
        self.__file = file

        self.__file.seek(0) #Establecemos el puntero de nuestro archivo en el inicio del mismo

    #Funcion que ejecuta el programa
    def start(self):

        separator = input("Dame tu separador: ") #Guardamos el separador que el usuario nos indiqu

        text = "" #Almacenamos el texto acumulado del archivo

        #Recorremos las lineas del archivo
        for line in self.__file:
            text += line #Acumulamos las lineas del archivo en una sola "linea" o "variable"

        #Validamos si el separador fue un enter ("") o un salto de linea ("\n")
        if separator == "" or separator == "\n":
            text = text.split("\n") #Separamos nuestro texto por salto de linea
        else:
            text = text.split(separator) #Separamos nuestro texto por el separador indicado

        counter = 0 #Almacenaremos el conteo de las lineas del archivo

        #Recorremos el arreglo obtenido de la separacion del texto por nuestro separador
        for t in text:

            #Validamos si la linea no esta vacia
            if t != "":
                counter += 1 #Aumentamos nuestro contador en 1 al saber que la linea no esta vacia

        #Imprimimos el numero de lineas del archivo
        print(f'El archivo contiene: {counter} lineas')