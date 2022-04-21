class ClasePadre:
    __resultado = 0
    __ancho = 0
    __largo = 0

    def Imprimir(self):
        print("El area del rectangulo es:", self.__resultado)

    def PedirDatos(self):
        self._ClasePadre__ancho = int(input("Ancho: "))
        self._ClasePadre__largo = int(input("Largo: "))

class Area(ClasePadre):
    def Calcular(self):
        self._ClasePadre__resultado = self._ClasePadre__ancho * self._ClasePadre__largo
        return self._ClasePadre__resultado

r = Area()
r.PedirDatos()
r.Calcular()
r.Imprimir()

print(r._ClasePadre__ancho)
print(r._ClasePadre__largo)