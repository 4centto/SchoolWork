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

class Programa2:

    #Contructor de la clase que recibe nuestro archivo a leer
    def __init__(self, file):
        self.__file = file
        self.__file.seek(0) #Establecemos el puntero de nuestro archivo en el inicio del mismo

    #Funcion que ejecuta el programa
    def start(self):
        characters = [] #Almacena los caracteres que tiene el archivo sin repeticiones

        #Recorre las lineas del archivo
        for line in self.__file:

            #Recorre los cada caracter de la linea que se esta leyendo
            for character in line:

                #Valida si el caracter que se esta recorriendo esta en nuestro arreglo de caracteres
                #y de no estarlo, lo agregamos, esto para evita repeticiones
                if not character in characters:
                    
                    characters.append(character) #Agregamos el caracter al arreglo

        #Recorremos los caracteres de nuestro arreglo
        for c in characters:

            counter = 0 #Almacena el conteo de las veces que se repite el caracter en el texto del archivo
            self.__file.seek(0) #Reinicia el puntero de la lectura en el archivo

            #Volvemos a recorrer el archivom, primero comenzando por las lineas del archivo
            for line in self.__file:

                #Recorremos cada caracter de cada linea del archivo
                for character in line:

                    #Si el caracter que estamos recorriendo en la linea del archivo es igual al
                    #caracter que estamos recorriendo de nuestro arreglo 
                    if c == character:

                        counter += 1 #Aumentamos el contador en 1

            print(f'-> {c} = {counter}') #Imprimimos cada caracter de nuestro arreglo con las veces que se repite