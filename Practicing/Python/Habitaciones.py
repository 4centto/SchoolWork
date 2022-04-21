class Puerta:
    def __init__(self, material, color, largo, ancho, vidrio):
        self.__material = material
        self.__color = color
        self.__largo = largo
        self.__ancho = ancho
        self.__vidrio = vidrio
    
    def abrir():
        print("Abriendo puerta...")

    def toString(self):
        return f"Puerta[Material: {self.__material}, Color: {self.__color}, Largo: {self.__largo}, Ancho: {self.__ancho}, Vidrio: {self.__vidrio}]"

class Ventana:
    def __init__(self, material, color, largo, ancho):
        self.__material = material
        self.__color = color
        self.__largo = largo
        self.__ancho = ancho
    
    def abrir():
        print("Abriendo ventana...")

    def toString(self):
        return f"Ventana[Material: {self.__material}, Color: {self.__color}, Largo: {self.__largo}, Ancho: {self.__ancho}]"

class Muro:
    def __init__(self, puerta = "null", ventana = "null"):
        self.__puerta = puerta
        self.__ventana = ventana

    def getPuerta(self):
        return self.__puerta

    def getVentana(self):
        return self.__ventana

class Habitacion:
    def __init__(self):
        self.__muros = []

    def agregarMuro(self, muro):
        self.__muros.append(muro)

    def verHabitacion(self):
        if len(self.__muros) == 0:
            print("No hay muros todavia")
        else:

            for i in range(len(self.__muros)):
                print(" ******************")
                print(f"Muro {i+1}: ")
                print(f"  Puertas: ")

                if self.__muros[i].getPuerta() == "null":
                    print("  No tiene puerta")
                else:
                    print("  ", self.__muros[i].getPuerta().toString())

                print("\n  Ventanas: ")

                if self.__muros[i].getVentana() == "null":
                    print("  No tiene ventana")
                else:
                    print("  ", self.__muros[i].getVentana().toString())

                print("")
                print(" ******************")

habitacion = Habitacion()
muro_Uno = Muro(Puerta("Madera", "Cafe", 2.2, 1, False))
muro_Dos = Muro(Puerta("Madera", "Cafe Oscuro", 2.2, 1, False))
muro_Tres = Muro()
muro_Cuatro = Muro("null", Ventana("Aluminio", "Negra", 2, 2))

habitacion.agregarMuro(muro_Uno)
habitacion.agregarMuro(muro_Dos)
habitacion.agregarMuro(muro_Tres)
habitacion.agregarMuro(muro_Cuatro)

habitacion.verHabitacion()