from random import randint

class RSA:
    def __init__(self, p=None, q=None, e=None, randomValues=False):
        self.__randomValues = randomValues
        self.__p = p
        self.__q = q
        self.__e = e
        self.__n = p*q if p != None and q != None else None
        self.__phi = (p - 1) * (q - 1) if p != None and q != None else None
        self.__ecs = []
        self.__sust = []
        self.__keys = {
            'public': None,
            'private': None,
            'module': None
        }

    def createKeys(self):
        if (self.__p == None or self.__q == None or self.__e == None) and self.__randomValues == False:
            self.__p = int(input(" * Ingresa una p: "))
            self.__q = int(input(" * Ingresa una q: "))
            self.__e = int(input(" * Ingresa una e: "))

            self.__n = self.__p * self.__q
            self.__phi = (self.__p - 1) * (self.__q - 1)

            #print(f"\n{self.__e}d + {self.__phi}q = 1     mcd({self.__phi}, {self.__e}) = 1\n")

            self.__euclides()
            self.__diofanto()
            self.__particularSolution()

        elif (self.__p == None or self.__q == None or self.__e == None) and self.__randomValues == True:

            self.__automaticCrypto()

        else:
            #print(f"\n{self.__e}d + {self.__phi}q = 1     mcd({self.__phi}, {self.__e}) = 1\n")

            self.__euclides()
            self.__diofanto()
            self.__particularSolution()

    #Funcion que hace el algoritmo de euclides
    def __euclides(self):
        #print(" * ALGORITMO DE EUCLIDES * \n")

        aux_e, pib = self.__e, self.__phi
        while aux_e >= 1:
            mult = pib//aux_e
            resto = pib-(aux_e*mult)

            #print(f"{pib} = {aux_e}({mult}) + {resto}")

            if aux_e != 1:
                self.__ecs.append([[pib, 1], [aux_e, mult], [resto]])

            pib = aux_e
            aux_e = resto

        #print()

        for i in range(len(self.__ecs)):
            #print(f"{self.__ecs[i][0][0]}({self.__ecs[i][0][1]}) + {self.__ecs[i][1][0]}({self.__ecs[i][1][1]*-1}) = {self.__ecs[i][2][0]}")
            self.__ecs[i][1][1] = self.__ecs[i][1][1]*-1

        #print()

    #Funcion que resuelve ecuaciones de diofanto
    def __diofanto(self):
        #print(" * POR ECUACIONES DE DIOFANTO * \n")

        self.__sust = self.__ecs[-1]
        num = 0
        for i in range(len(self.__ecs) - 1, 0, -1):
            ec_aux = self.__ecs[i - 1]
            pos = 0
            pos_sum = 0
            for j in range(2):
                if self.__sust[j][0] == ec_aux[2][0]:
                    pos = j
                    ec_aux[0][1] = ec_aux[0][1] * self.__sust[j][1]
                    ec_aux[1][1] = ec_aux[1][1] * self.__sust[j][1]

                    self.__sust[j] = [ec_aux[0], ec_aux[1]]

            for j in range(len(self.__sust[pos])):
                for k in range(2):
                    if self.__sust[pos][j][0] == self.__sust[k][0]:
                        self.__sust[k][1] += self.__sust[pos][j][1]
                        pos_sum = j
                    continue

            sust_aux = []
            for j in range(len(self.__sust[pos])):
                if j != pos_sum:
                    sust_aux.append(self.__sust[pos][j])
            
            self.__sust.pop(pos)
            self.__sust.insert(1, sust_aux[0])
            #print(f"Ecuacion {num}: ", end="")
            #print(f"{self.__sust[0][0]}({self.__sust[0][1]}) + {self.__sust[1][0]}({self.__sust[1][1]}) = {self.__sust[2][0]}")
            num += 1

    #Encontrar la solucion particular de la ecuacion
    def __particularSolution(self):
        #print(f"\nx = {self.__sust[0][1]} + {self.__phi}n")
        #print(f"d0 = {self.__sust[0][1]} + {self.__phi}(1)        -> Evaluamos mcd() = 1")

        #Evaluamos nuestro mcd(e, phi) = 1, osea evaluamos 1 en la funcion
        d0 = self.__sust[0][1] + (self.__phi * 1)
        #print(f"\nd0 = {d0}\n")

        #Imprimir llaves privadas y publicas
        #print(f"({self.__e}, {self.__n}) -> Llave publica")
        #print(f"({d0}, {self.__n}) -> Llave privada")

        self.__keys['public'] = self.__e
        self.__keys['private'] = d0
        self.__keys['module'] = self.__n

        print(f"Tus llaves son: {self.__keys}")

    def encrypt(self, item):
        s = "".join(str(chr(ord(i) ** self.__keys['public'] % self.__keys['module'])) for i in item)
        #print(s)
        return s

    def deencrypt(self, item):
        return "".join(str(chr(ord(i) ** self.__keys['private'] % self.__keys['module'])) for i in item)

    def __generateRandomValues(self):
        aux_p = self.__randPrimeNumber()
        aux_q = self.__randPrimeNumber()
        aux_e = self.__randPrimeNumber()
        aux_n = aux_p * aux_q
        aux_phi = (aux_p - 1) * (aux_q - 1)

        while aux_e < 1 or aux_e > aux_phi:
            aux_e = self.__randPrimeNumber()

        self.__p = aux_p
        self.__q = aux_q
        self.__e = aux_e
        self.__n = aux_n
        self.__phi = aux_phi

    def __randPrimeNumber(self):
        number = randint(2, 1000)
        if not self.__isPrime(number):
            return self.__randPrimeNumber()
        else:
            return number

    def __isPrime(self, number):
        for i in range(2, number):
            if number % i == 0:
                return False
        return True

    def __automaticCrypto(self):
        self.__generateRandomValues()

        #print(f"\n{self.__e}d + {self.__phi}q = 1     mcd({self.__phi}, {self.__e}) = 1\n")

        self.__euclides()
        self.__diofanto()
        self.__particularSolution()

        #Hacemos una encriptacion de prueba, y si funciona mandamos las llaves, de lo contrario volvemos a generar numeros aleatorios
        encr = self.encrypt("Mensaje de prueba")
        decr = self.deencrypt(encr)

        if decr == "Mensaje de prueba":
            print(f"Tus llaves son las siguientes: {self.__keys}")
        else:
            self.__automaticCrypto()
