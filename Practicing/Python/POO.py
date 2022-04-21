class Clase:
    def __init__(self, palabra):
        self.palabra = palabra

    def Calcular(self):
        palabra2 = ""
        for i in self.palabra.split():
            if len(i) > len(palabra2):
                palabra2 = i
        return palabra2

palabra = input("Dame tu frase: ")

c = Clase(palabra)

print("La palabra mas larga es:", c.Calcular())