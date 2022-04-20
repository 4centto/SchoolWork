class Vecinos:
    def __init__(self, vecinos):
        self.__vecinos = vecinos

    def validarSupervivencia(self):
        contVivos = 0
        celulaActual = self.__vecinos[4]
        for i in range(len(self.__vecinos)):
            if self.__vecinos[i] == "V" and i != 4:
                contVivos += 1
        
        if celulaActual == "V" and contVivos <= 1:
            return False
        elif celulaActual == "V" and (contVivos == 2 or contVivos == 3):
            return True
        elif celulaActual == "V" and contVivos > 2:
            return False
        elif celulaActual == "M" and contVivos == 3:
            return True
        else:
            return False