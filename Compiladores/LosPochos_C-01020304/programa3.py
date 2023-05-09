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

class Programa3:

    #Contructor de la clase que recibe nuestro archivo a leer
    def __init__(self, file):
        self.__file = file

        self.__file.seek(0) #Establecemos el puntero de nuestro archivo en el inicio del mismo

    #Funcion que ejecuta el programa
    def start(self):
        separator = input("Dame tu separador: ") #Obtenemos el separador del usuario

        text = "" #Almacena el todo el texto del archivo

        #Recorremos las lineas del archivo y las adjuntamos en nuestra variable para tener todo es una
        #misma variable
        for line in self.__file:
            text += line

        #Validamos si el separador es un enter ("") o un salto de linea ("\n")
        if separator == "" or separator == "\n":
            text = text.split("\n") #Separamos el texto por salto de linea
        else:
            text = text.split(separator) #Separamos el texto por el separador que el usuario nos indico

        counter = 0 #Almacenamos la cuenta de las palabras por el separador

        #Una vez el texto separado obtendremos un arreglo con las palabras separadas por el separador indicado
        #Recorremos el arreglo de las palabras
        for t in text:
            #Validamos si la poalabra es diferente de vacia y hacemos el aumento de nuestro contador
            if t != "":
                counter += 1 #Aumentamos en 1 el contador

        #Imprimimos el total de las palabras
        print(f'El archivo contiene: {counter} palabras')