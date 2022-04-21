class Personne:
    __nombre, ___edad, __altura = "", 0, 0
    def __init__(self, nombre, edad, altura):
        self.__nombre = nombre
        self.___edad = edad
        self.__altura = altura

    def toString(self):
        return f"Personne: [Nom: {self.__nombre}, Âge: {self.___edad}, Hauteur: {self.__altura}]"

class Etudiant(Personne):
    __semestre, __carrera, __matricula = 0, "", ""
    def __init__(self, nombre, edad, altura, semestre, carrera, matricula):
        super().__init__(nombre, edad, altura)
        self.__semestre = semestre
        self.__carrera = carrera
        self.__matricula = matricula

    def toString(self):
        return super().toString() + f" Étudiant: [Semestre: {self.__semestre}, Carrière: {self.__carrera}, Inscription: {self.__matricula}]"



#Crear una nueva persona que sea estudiante
estudiante = Etudiant("Ivan", 18, 1.73, 2, "Ingenieria en Computacion", "318146506")
print(estudiante.toString())