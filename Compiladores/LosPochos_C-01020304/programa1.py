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

class Programa1:

    #Constructor de la clase que recive el archivo a leer
    def __init__(self, file):
        self.__file = file

        self.__file.seek(0) #Establecemos el puntero de nuestro archivo en el inicio del mismo

    #Funcion que ejecuta el programa
    def start(self):
        counter = 0 #Almacena el numero total de caracteres en la cadena

        #Recorremos cada linea del archivo leido
        for line in self.__file:

            #Recorre cada caracter de la linea leida
            for character in line:
                
                counter += 1 #Aumentamos en 1 por cada caracter recorrido

        #Imprimimos el total de caracteres
        print(f'El archivo contiene: {counter} caracteres.')