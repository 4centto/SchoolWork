from Array import Array
from Empleado import Empleado

class Empresa:
    def __init__(self):
        self.__archivo = self.__leerArchivo()
        self.__empleados = Array(self.__longitudArchivo(self.__archivo))
        self.__inicializarEmpleados()

    #Método que solo es utilizado por la clase para leer el archivo
    def __leerArchivo(self):
        #Se lee el archivo
        archivo = open("junio.dat", "rt", encoding="latin-1").readlines()[1: ]

        for i in range( len(archivo) ):
            archivo[i] = archivo[i].rstrip('\n').split(',')

        return archivo

    #Método que solo es utilizado por la clase para devolver el tamaño del arreglo de empleados
    def __longitudArchivo(self, archivo):
        return len(archivo)

    #Método que inicializa a los empleados dentro del arreglo de la empresa
    def __inicializarEmpleados(self):
        for i in range(self.__longitudArchivo(self.__archivo)):

            empleado = Empleado(self.__archivo[i][0], self.__archivo[i][1], self.__archivo[i][2], self.__archivo[i][3], 
                                self.__archivo[i][4], self.__archivo[i][5], self.__archivo[i][6])

            self.__empleados.setItem(empleado, i)

    #Metodo que busca al empleado mas antiguo de la empresa
    def empleadoMasAntiguo(self):

        menorNombre = ""
        menorAnnio = 0

        #Recorremos la lista de empleados
        for i in range(self.__empleados.getLength()):

            #Recuperamos el empleado
            empleado = self.__empleados.getItem(i)

            #En caso de ser el primer empleado seleccionado por el ciclo
            if i == 0:
                menorNombre = empleado.getNombre() + " " + empleado.getPaterno() + " " + empleado.getMaterno()
                menorAnnio = int(empleado.getAnnioIngreso())

            #En caso de ser del 1er empleado en adelante
            else:
                annio =int(empleado.getAnnioIngreso())
                if annio <= menorAnnio:
                    menorNombre = empleado.getNombre() + " " + empleado.getPaterno() + " " + empleado.getMaterno()
                    menorAnnio = int(empleado.getAnnioIngreso())

        print("El empleado mas antiguo es: ")
        print("-> " + menorNombre)
        print("Ingreso en:", menorAnnio)
        print()

    def empleadoMenosAntiguo(self):
        mayorNombre = ""
        mayorAnnio = 0

        #Recorremos la lista de empleados
        for i in range(self.__empleados.getLength()):

            #Recuperamos el empleado
            empleado = self.__empleados.getItem(i)

            #En caso de ser el primer empleado seleccionado por el ciclo
            if i == 0:
                mayorNombre = empleado.getNombre() + " " + empleado.getPaterno() + " " + empleado.getMaterno()
                mayorAnnio = int(empleado.getAnnioIngreso())

            #En caso de ser del 1er empleado en adelante
            else:
                annio =int(empleado.getAnnioIngreso())
                if annio >= mayorAnnio:
                    mayorNombre = empleado.getNombre() + " " + empleado.getPaterno() + " " + empleado.getMaterno()
                    mayorAnnio = int(empleado.getAnnioIngreso())

        print("El empleado menos antiguo es: ")
        print("-> " + mayorNombre)
        print("Ingreso en:", mayorAnnio)
        print()