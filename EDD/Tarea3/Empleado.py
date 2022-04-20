class Empleado:
    def __init__(self, numTrabajador, nombre, paterno, materno, hrsExtra, sueldo, annioIngreso):
        self.__numTrabajador = numTrabajador
        self.__nombre = nombre
        self.__paterno = paterno
        self.__materno = materno
        self.__hrsExtra = hrsExtra
        self.__sueldo = sueldo
        self.__annioIngreso = annioIngreso

    def getNumTrabajador(self):
        return self.__numTrabajador
    def setNumTrabajador(self, numTrabajador):
        self.__numTrabajador = numTrabajador

    def getNombre(self):
        return self.__nombre
    def setNumTrabajador(self, nombre):
        self.__nombre = nombre

    def getPaterno(self):
        return self.__paterno
    def setPaterno(self, paterno):
        self.__paterno = paterno

    def getMaterno(self):
        return self.__materno
    def setMaterno(self, materno):
        self.__materno = materno

    def getHrsExtra(self):
        return self.__hrsExtra
    def setNumTrabajador(self, hrsExtra):
        self.__hrsExtra = hrsExtra

    def getSueldo(self):
        return self.__sueldo
    def setNumTrabajador(self, sueldo):
        self.__sueldo = sueldo

    def getAnnioIngreso(self):
        return self.__annioIngreso
    def setNumTrabajador(self, annioIngreso):
        self.__annioIngreso = annioIngreso

    def toString(self):
        return "Empleado: [Numero: {}, Nombre: {}, Paterno: {}, Materno: {}, HrsExtra: {}, Sueldo: {}, Año Ingreso: {}]".format(
            self.__numTrabajador,
            self.__nombre,
            self.__paterno,
            self.__materno,
            self.__hrsExtra,
            self.__sueldo,
            self.__annioIngreso
        )