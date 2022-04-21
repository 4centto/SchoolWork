class Rectangulo:
    def __init__(self, ancho, largo):
        self.ancho = ancho
        self.largo = largo

    def Calcular(self):
        return (self.largo * self.ancho)

class Cuadrado(Rectangulo):
    def __init__(self, ancho, largo):
        Rectangulo().__init__(ancho, largo)
    def CalcularArea(self):
        return (super().Calcular())

ancho = int(input("Ancho: "))
largo = int(input("Largo: "))


print(Cuadrado().CalcularArea())