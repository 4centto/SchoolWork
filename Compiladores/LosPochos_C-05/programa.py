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

#Importamos la libreria del sistema
import os

#Funcion que transforma el numero obtenido en numero
def transformNumber(number):
    #Almacenamos los valores de cada numero romano en su valor equivalente al arabigo
    copia = number #Guarda una copia que no sera modificada del numero romano que se recibe
    values = {"I": 1, "IV": 4, "V": 5, "IX": 9, "X": 10, "XL": 40, "L": 50, "XC": 90, "C": 100, "CD": 400, "D": 500, "CM": 900, "M": 1000 } 

    '''
        Para validar los numeros que son compuestos, es decir IV, IX, XL, XC, CD, CM
        es necesesario que del numero romano que estemos recibiemdo, lo separemos por este
        numero romano, nos dara un arreglo al cual tendremos que restar 1 para evitar un 
        elemento vacio dentro del arreglo, de esta manera obtendremos el valor de veces que esta
        el numero en la cadena, de esa manera quitamos el numero de nuestra cadena, y ahora
        solo tendremos una cadena con los numeros que son "simples".
        Esto con la finalidad de que si hay mas de un numero compuesto en el mismo numero,
        podamos obtener todos, uno por uno.
    '''

    #Validamos si el numero contiene 4's y guardamos la catidad de 4's que hay
    cuatros = len(number.split("IV")) - 1 #Obtenemos la cantidad de 4's que hay en la cadena
    #Una vez removido el numero compuesto juntamos la cadena restante pero ahora solo contiene los numeros simples
    number = "".join(number.split("IV"))

    #Validamos si el numero contiene 9's y guardamos la catidad de 9's que hay
    nueves = len(number.split("IX")) - 1 #Obtenemos la cantidad de 9's que hay en la cadena
    #Una vez removido el numero compuesto juntamos la cadena restante pero ahora solo contiene los numeros simples
    number = "".join(number.split("IX"))

    #Validamos si el numero contiene 40's y guardamos la catidad de 40's que hay
    cuarentas = len(number.split("XL")) - 1 #Obtenemos la cantidad de 40's que hay en la cadena
    #Una vez removido el numero compuesto juntamos la cadena restante pero ahora solo contiene los numeros simples
    number = "".join(number.split("XL"))

    #Validamos si el numero contiene 90's y guardamos la catidad de 90's que hay
    noventas = len(number.split("XC")) - 1 #Obtenemos la cantidad de 90's que hay en la cadena
    #Una vez removido el numero compuesto juntamos la cadena restante pero ahora solo contiene los numeros simples
    number = "".join(number.split("XC"))

    #Validamos si el numero contiene 400's y guardamos la catidad de 400's que hay
    cuatroscientos = len(number.split("CD")) - 1 #Obtenemos la cantidad de 400's que hay en la cadena
    #Una vez removido el numero compuesto juntamos la cadena restante pero ahora solo contiene los numeros simples
    number = "".join(number.split("CD"))

    #Validamos si el numero contiene 900's y guardamos la catidad de 900's que hay
    novescientos = len(number.split("CM")) - 1 #Obtenemos la cantidad de 900's que hay en la cadena
    #Una vez removido el numero compuesto juntamos la cadena restante pero ahora solo contiene los numeros simples
    number = "".join(number.split("CM"))

    #Sumamos los numeros que son compuestos: 4's, 9's, etc.
    #Para hacer la suma, simplemente multiplicamos la cantidad obtenida de cada numero compuesto
    #por su equivalente al arabigo en el arreglo, y hacemos la sumatoria de todos los encontrados
    #para que en caso de haber varios compuestos, pues que se sumen entre si
    suma = (values["IV"] * cuatros) + (values["IX"] * nueves) + (values["XL"] * cuarentas) + (values["XC"] * noventas) + (values["CD"] * cuatroscientos) + (values["CM"] * novescientos)

    #Recorremos nuestra cadena sin los numeros "compuestos" y aumentamos el valor de nuestra suma
    for n in number:
        suma += values[n] #Aumentamos el valor respecto a su equivalente al arabigo en nuestro arreglo de valores

    #Imprimimos el numero en romano y su equivalente al arabigo
    print(copia,"->",suma)

#Funcion que encuentra I's dentro de la linea y retorna la posicion actual y ademas la cadena de I's
#Recibe la linea de caracteres, nuestra posicion actual, y la cadena acumulada de numeros validos
def getI(line, counter, numb):

    #Agregamos nuestra primer I a la cadena, y actualizamos nuestra posicion mas 1
    numb += line[counter]
    counter += 1

    #Validamos si nuestra posicion no se excede de la longitud total de nuestra linea
    #Validamos si en la posicion actual tenemos una I
    if counter < len(line) and line[counter] == "I":
        aux = 0 #Almacena el numero de veces que agrega I a la cadena

        #Recorremos en 2, ya que ya tenemos una I previamente agregada, y solo podemos tener 1 o 2 I's mas
        for i in range(2):
            #Valida si nuestra posicion + i no se excede de la longitud total de nuestra linea
            if counter + i < len(line):
                #Valida si en nuestra siguiente posicion es I
                if line[counter + i] == "I":
                    numb += line[counter + i] #Agregamos esa I a nuestra cadena
                    aux += 1 #Aumentamos nuestro contador de I's en 1

        #Actualizamos nuestra posicion actual aumentando el numero de I's agregadas a la cadena
        counter += aux

    #Validamos si nuestra posicion no se excede de la longitud total de nuestra linea
    #Validamos si en la posicion actual tenemos una I
    elif counter < len(line) and (line[counter] == "V" or line[counter] == "X"):
        '''
            Dado que la I al encontrar despues una V o X, solo puede tener una de cada una, no puede
            tenerlas ni repetidas ni mas de otro valor despues, por lo que solo agregaremos a nuestra
            cadena el valor de nuestra posicion ya sea V o X, y actualizaremos nuestra posicion
            moviendonos 1 mas.
        '''
        numb += line[counter]
        counter += 1

    #Retornamos nuestra posicion y la cadena
    return counter, numb

#Funcion que encuentra V's dentro de la linea y retorna la posicion actual y ademas la cadena de V's
#Recibe la linea de caracteres, nuestra posicion actual, y la cadena acumulada de numeros validos
def getV(line, counter, numb):

    #Agregamos nuestra primer V a la cadena, y actualizamos nuestra posicion mas 1
    numb += line[counter]
    counter += 1

    #Validamos si nuestra posicion no excede de la longitud total de la cadena
    #Validamos si en nuestra posicion encontramos al menos una I, ya que V solo puede tener I's despues
    if counter < len(line) and line[counter] == "I":
        aux = 0 #Almacena el numero de veces que encuentra una I

        #Recorremos en 3, ya que solo podemos agregar maximo 3 I's despues de una V
        for i in range(3):
            #Validamos si en nuestra posicion + i no exede la longitud total de la linea
            if counter + i < len(line):
                #Validamos si nuestra posicion + i es igual a una I
                if line[counter + i] == "I":
                    numb += line[counter + i] #Agregamos la I a nuestra cadena
                    aux += 1 #Aumentamos en 1 nuestra variable

        #Actualizamos nuestra posicion agregando el numero de veces que se añadio una I a la cadena
        counter += aux

    #Retornamos el valor de nuestra posicion actual, y de nuestra cadena
    return counter, numb

#Funcion que encuentra X's dentro de la linea y retorna la posicion actual y ademas la cadena de X's
#Recibe la linea de caracteres, nuestra posicion actual, y la cadena acumulada de numeros validos
def getX(line, counter, numb):

    #Agregamos nuestra primer X a nuestra cadena
    numb += line[counter]
    counter += 1 #Aumentamos nuestra posicion actual en 1

    aux = 0 #Almacenamos nuestro conteo de cuantas X's se van a agregar despues

    #Validamos si nuestra posicion actual no excede la longitud total de nuestra linea
    #Validamos si en nuestra posicion se encuentra otra X
    if counter < len(line) and line[counter] == "X":
        #Recorremos en 2, ya que de tener una X antes, solo podemos tener como maximo 2 mas
        for i in range(2):
            #Validamos si en nuestra posicion + i no excedemos la longitud total de nuestra linea
            if counter + i < len(line):
                #Validamos si en nuestra posicion + i es igual a X
                if line[counter + i] == "X":
                    numb += line[counter + i] #Agregamos la X a nuestra cadena
                    aux += 1 #Aumentamos el numero de X's agregadas

        #Actualizamos nuestra posicion actual mas el numero de X's que agregamos
        counter += aux

    #De no encontrar una X o haber añadido 2 mas, validamos si tenemos un valor despues,
    #ya que X puede tener mas numeros despues
    #Primero validamos si el numero despues de las X's es I
    if counter < len(line) and line[counter] == "I":

        #Ejecutamos nuestra funcion que se encarga de encontrar I's y todas sus variantes
        #Mandamos la linea, nuestra posicion actual y nuestra cadena de numeros validos hasta el momento
        #Y actualizamos nuestros valores
        counter, numb = getI(line, counter, numb)

    #Validamos si el numero despues de las X's es V
    elif counter < len(line) and line[counter] == "V":

        #Ejecutamos nuestra funcion que se encarga de encontrar V's y todas sus variantes
        #Mandamos la linea, nuestra posicion actual y nuestra cadena de numeros validos hasta el momento
        #Y actualizamos nuestros valores
        counter, numb = getV(line, counter, numb)
    
    #Validamos si el numero despues de las X's es L
    elif counter < len(line) and line[counter] == "L":

        '''
            Para que haya una L depues de una X, es necesario que solo sea una X la que hay antes de la L
            Por lo que utilizamos nuestra variable que acumula cuantas X fueroin agregadas
            Si esta es 0, quiere decir que solo hay una antes de la L, de lo contrario, solo se retornan los
            valores
        '''
        if aux == 0:
            #Agregamos nuestra L a la cadena
            numb += line[counter]
            counter += 1 #Actualizamos nuestra posicion agregando 1

            '''
                Despues de la L, podemos tener cualquier valor de los antes mencionados, ya sea 
                I, V o X, por lo que volvemos a hacer cada una de sus validaciones
            '''

            #Validamos si nuestra posicion actual no excede la longitud total de nuestra linea
            #Validamos si el numero despues de la L es I
            if counter < len(line) and line[counter] == "I":

                #Ejecutamos nuestra funcion getI para obtenerlas y actualizar nuestros valores
                counter, numb = getI(line, counter, numb)

            #Validamos si nuestra posicion actual no excede la longitud total de nuestra linea
            #Validamos si el numero despues de la L es V
            elif counter < len(line) and line[counter] == "V":

                #Ejecutamos nuestra funcion getV para obtenerlas y actualizar nuestros valores
                counter, numb = getV(line, counter, numb)
        
    #Validamos si el numero despues de las X's es C
    elif counter < len(line) and line[counter] == "C":

        '''
            Para que haya una C depues de una X, es necesario que solo sea una X la que hay antes de la C
            Por lo que utilizamos nuestra variable que acumula cuantas X fueroin agregadas
            Si esta es 0, quiere decir que solo hay una antes de la C, de lo contrario, solo se retornan los
            valores
        '''
        if aux == 0:
            numb += line[counter] #Agregamos la C a la cadena
            counter += 1 #Aumentamos nuestra posicion actual en 1

            '''
                Despues de la C, podemos tener cualquier valor de los antes mencionados, ya sea 
                I, V o X por lo que volvemos a hacer cada una de sus validaciones
            '''

            #Validamos si nuestra posicion actual no excede la longitud total de nuestra linea
            #Validamos si el numero despues de C es I
            if counter < len(line) and line[counter] == "I":

                #Ejecutamos nuestra funcion getI y actualizamos nuestros valores con los resultados obtenidos
                counter, numb = getI(line, counter, numb)

            #Validamos si nuestra posicion actual no excede la longitud total de nuestra linea
            #Validamos si el numero despues de C es V
            elif counter < len(line) and line[counter] == "V":

                #Ejecutamos nuestra funcion getV y actualizamos nuestros valores con los resultados obtenidos
                counter, numb = getV(line, counter, numb)
        
    #Retornamos nuestra posicion actual y la cadena de numeros validos encontrados
    return counter, numb

#Funcion que encuentra L's dentro de la linea y retorna la posicion actual y ademas la cadena de L's
#Recibe la linea de caracteres, nuestra posicion actual, y la cadena acumulada de numeros validos
def getL(line, counter, numb):

    numb += line[counter] #Agregamos nuestra primer L a nuestra cadena
    counter += 1 #Actualizamos nuestra posicion mas 1

    '''
        Despues de una L podemos tener casi todos nuestros valores anteriores, ya sean I's, V's o X's,
        pero vamos por jerarquias, primero validamos si hay una o mas X's despues de nuestra L
    '''

    #Validamos si nuestra posicion actual no excede la longitud total de nuestra cadena
    #Validamos que en la posicion actual haya una X
    if counter < len(line) and line[counter] == "X":

        #Ejecutamos getX que nos retorna la cadena con nuestras X agregadas y actualizamosnuestros valores
        counter, numb = getX(line, counter, numb)

    #Primero validamos si el primer numero de la cadena es I
    if counter < len(line) and line[counter] == "I":

        #Ejecutamos getI que nos retorna la cadena con nuestras X agregadas y actualizamosnuestros valores
        counter, numb = getI(line, counter, numb)

    #Validamos cuando el primero de la cadena es V
    elif counter < len(line) and line[counter] == "V":

        #Ejecutamos getV que nos retorna la cadena con nuestras X agregadas y actualizamosnuestros valores
        counter, numb = getV(line, counter, numb)
    
    #Retornamos nuestra posicion actual y nuestra cadena con los numero validados
    return counter, numb

#Funcion que encuentra C's dentro de la linea y retorna la posicion actual y ademas la cadena de C's
#Recibe la linea de caracteres, nuestra posicion actual, y la cadena acumulada de numeros validos
def getC(line, counter, numb):

    numb += line[counter] #Agregamos nuestra C a la cadena
    counter += 1 #Aumentamos en 1 nuestra posicion

    aux = 0 #Almacena el numero de veces que se encuentra minimo 2 C's mas despues de nuestra primera C

    #Validamos que nuestra posicion actual no se exceda de la longitud total de nuestra linea
    #Validamos que en la posicion actual se encuentre una C
    if counter < len(line) and line[counter] == "C":

        #Recorremos en 2, ya que solo podemos agregar como maximo 2 C's mas a nuestra cadena
        for i in range(2):
            #Validamos que nuestra posicion actual no exceda la longitud total de la linea
            if counter + i < len(line):
                #Validamos si en nuestra posicion + i es igual a C
                if line[counter + i] == "C":
                    numb += line[counter + i] #Agregamos la C a la cadena
                    aux += 1 #Aumentamos en uno el numero de C agregadas

        #Aumentamos nuestra posicion el numero de veces que se agrego una C
        counter += aux

    #Validamos que nuestra posicion actual no se exceda de la longitud total de nuestra linea
    #Validamos si el numero despues de la C es D y validamos que solo se haya agregado una C
    if counter < len(line) and line[counter] == "D" and aux == 0:
        numb += line[counter] #Agregamos nuestra L a la cadena
        counter += 1 #Actualizamos nuestra posicion en 1

        #Validamos si nuestra posicion no excede la longitud total de nuestra linea
        if counter < len(line):
        
            #Ejecutamos getX y actualizamos los valores
            counter, numb = getX(line, counter, numb)

    #Validamos que nuestra posicion actual no se exceda de la longitud total de nuestra linea
    #Validamos si el numero despues de la C es I
    if counter < len(line) and line[counter] == "I":

        #Ejecutamos getI y actualizamos nuestros valores
        counter, numb = getI(line, counter, numb)

    #Validamos que nuestra posicion actual no se exceda de la longitud total de nuestra linea
    #Validamos si el numero despues de la C es V
    elif counter < len(line) and line[counter] == "V":

        #Ejecutamos getV y actualizamos nuestros valores
        counter, numb = getV(line, counter, numb)
    
    #Validamos que nuestra posicion actual no se exceda de la longitud total de nuestra linea
    #Validamos si el numero despues de la C es X
    elif counter < len(line) and line[counter] == "X":

        #Ejecutamos getX y actualizamos nuestros valores
        counter, numb = getX(line, counter, numb)
    
    #Validamos que nuestra posicion actual no se exceda de la longitud total de nuestra linea
    #Validamos si el numero despues de la C es L
    elif counter < len(line) and line[counter] == "L":
        numb += line[counter] #Agregamos nuestra L a la cadena
        counter += 1 #Actualizamos nuestra posicion en 1

        #Validamos si nuestra posicion no excede la longitud total de nuestra linea
        if counter < len(line):

            #Ejecutamos getX y actualizamos nuestros valores
            counter, numb = getX(line, counter, numb)
    
    #Validamos que nuestra posicion actual no se exceda de la longitud total de nuestra linea
    #Validamos si el numero despues de la C es M
    elif counter < len(line) and line[counter] == "M":
        numb += line[counter] #Agregamos nuestra M a la cadena
        counter += 1 #Actualizamos nuestra posicion en 1

        #Validamos si el numero despues de la M es I
        if counter < len(line) and line[counter] == "I":

            #Ejecutamos getI y actualizamos nuestros valores
            counter, numb = getI(line, counter, numb)

        #Validamos si el numero despues de la M es V
        elif counter < len(line) and line[counter] == "V":

            #Ejecutamos getV y actualizamos nuestros valores
            counter, numb = getV(line, counter, numb)
        
        #Validamos si el numero despues de la M es X
        elif counter < len(line) and line[counter] == "X":
            
            #Ejecutamos getX y axtualizamos nuestros valores
            counter, numb = getX(line, counter, numb)
        
        #Validamos si el numero despues de la M es L
        elif counter < len(line) and line[counter] == "L":
            numb += line[counter] #Agregamos nuestra L a la cadena
            counter += 1 #Actualizamos nuestra posicion en 1

            #Ejecutamos getX y actualizamos nuestros valores
            counter, numb = getX(line, counter, numb)
        
    #Retornamos nuestra posicion actual y la cadena de numeros validos
    return counter, numb

#Funcion que encuentra M's dentro de la linea y retorna la posicion actual y ademas la cadena de M's
#Recibe la linea de caracteres, nuestra posicion actual, y la cadena acumulada de numeros validos
def getD(line, counter, numb):
    numb += line[counter] #Agregamos nuestra D a la cadena
    counter += 1 #Acualizamos nuestra posicion en 1

    #Validamos que la posicion actual no exceda nuestra longitud total de la linea
    #Validamos si e numero despues de la D es I
    if counter < len(line) and line[counter] == "I":

        #Ejecutamos nuestro getI y actualizamos nuestros valores
        counter, numb = getI(line, counter, numb)

    #Validamos que la posicion actual no exceda nuestra longitud total de la linea
    #Validamos si e numero despues de la D es V
    elif counter < len(line) and line[counter] == "V":

        #Ejecutamos nuestro getV y actualizamos nuestros valores
        counter, numb = getV(line, counter, numb)
    
    #Validamos que la posicion actual no exceda nuestra longitud total de la linea
    #Validamos si e numero despues de la D es X
    elif counter < len(line) and line[counter] == "X":

        #Ejecutamos nuestro getX y actualizamos nuestros valores
        counter, numb = getX(line, counter, numb)
    
    #Validamos que la posicion actual no exceda nuestra longitud total de la linea
    #Validamos si e numero despues de la D es L
    elif counter < len(line) and line[counter] == "L":
        numb += line[counter] #Agregamos nuestra L a la cadena
        counter += 1 #Actuializamos nuestra posicion en 1

        #Validamos que nuestra posicion actual sea menor a la longitud total de la linea
        if counter < len(line):

            #Ejecutamos getX y actualizamos los valores
            counter, numb = getX(line, counter, numb)

    #Validamos que la posicion actual no exceda nuestra longitud total de la linea 
    #Validamos si e numero despues de la D es C
    elif counter < len(line) and line[counter] == "C":

        #Ejecutamos getC y actuializamos los valores
        counter, numb = getC(line, counter, numb)
        
    #Retornamos el valor de nuestra posicion actual y de nuestra cadena de numeros validos
    return counter, numb

#Funcion que ejecuta el programa y ademas recive el archivo que se va a leer
def start(file):

    #En caso de que el archivo sea multilinea, las juntamos todas en una misma linea
    line = "" #Almacenamos la union de todas las lineas del archivo

    #Recorremos las lineas del archivo
    for l in file:

        #Remplazamos saltos de linea, espacios en blanco y ponemos en mayusculas las letras
        #para luego agregarlas a nuestra variable
        line += l.replace("\n", "").upper().replace(" ", "")

    counter = 0 #Almacena la posicion en la que nos encontramos a la hora de recorrer cada uno de los
                #caracteres

    #Mientras que nuestra posicion actual sea menor a la longitud total de la linea vamos a continuar
    while(counter < len(line)):

        numb = "" #Almacena la "cadena" de numeros romanos que son validos hasta el momento

        '''
            Cuando empezamos a validar, tomamos en cuenta con cual numero empieza el recorrido,
            sabemos que un numero romano puede empezar con I, V, X, L, C, D, M, etc. nosotros lo
            hicimos hasta M, pero la cuenta sigue...
            Por lo que primero validamos con cual numero comienza el recorrido, ya que cada numero
            tiene ciertas reglas que otros numeros no tienen.
            Por ejemplo, I solamente puede tener despues dos I's mas o ya sea V o X, cuando el numero sea 
            V, este debe tener despues solo I's (no mas de 3), cuando es X, puede tener no mas de 2 X's
            mas y despues de esas X's puede tener cualquier valor de los de antes (V, I) en sus 
            combinaciones...
        '''

        #Validamos que nuestra posicion no se salga dentro del rango valido de la cadena
        #Validamos cuando el primero de la cadena es I
        if counter <= len(line) and line[counter] == "I":

            #Ejecutamos la funcion getId que nos retornara nuestra nueva posicion en la linea
            #y tambien nuestro numero romano valido con las I's
            #Recibe nuestra linea, la posicion actual, y nuestra cadena
            counter, numb = getI(line, counter, numb)

            #Ejecutamos la funcion que transformara a nuestro numero romano en numero arabigo
            #Recive nuestro numero en romano, en este caso nuestro numero valido "numb"
            transformNumber(numb)

        #Validamos que nuestra posicion no se salga dentro del rango valido de la cadena
        #Validamos cuando el primero de la cadena es V
        elif counter <= len(line) and line[counter] == "V":

            #Ejecutamos la funcion getId que nos retornara nuestra nueva posicion en la linea
            #Recibe nuestra linea, la posicion actual, y nuestra cadena
            #y tambien nuestro numero romano valido con las V's
            counter, numb = getV(line, counter, numb)

            #Ejecutamos la funcion que transformara a nuestro numero romano en numero arabigo
            #Recive nuestro numero en romano, en este caso nuestro numero valido "numb"
            transformNumber(numb)

        #Validamos que nuestra posicion no se salga dentro del rango valido de la cadena
        #Validamos cuando el primero de la cadena es X
        elif counter <= len(line) and line[counter] == "X":

            #Ejecutamos la funcion getId que nos retornara nuestra nueva posicion en la linea
            #Recibe nuestra linea, la posicion actual, y nuestra cadena
            #y tambien nuestro numero romano valido con las X's
            counter, numb = getX(line, counter, numb)

            #Ejecutamos la funcion que transformara a nuestro numero romano en numero arabigo
            #Recive nuestro numero en romano, en este caso nuestro numero valido "numb"
            transformNumber(numb)

        #Validamos que nuestra posicion no se salga dentro del rango valido de la cadena
        #Validamos cuando el primero de la cadena es L
        elif counter <= len(line) and line[counter] == "L":

            #Ejecutamos la funcion getId que nos retornara nuestra nueva posicion en la linea
            #Recibe nuestra linea, la posicion actual, y nuestra cadena
            #y tambien nuestro numero romano valido con las L's
            counter, numb = getL(line, counter, numb)

            #Ejecutamos la funcion que transformara a nuestro numero romano en numero arabigo
            #Recive nuestro numero en romano, en este caso nuestro numero valido "numb"
            transformNumber(numb)

        #Validamos que nuestra posicion no se salga dentro del rango valido de la cadena
        #Validamos cuando el primero de la cadena es C
        elif counter <= len(line) and line[counter] == "C":

            #Ejecutamos la funcion getId que nos retornara nuestra nueva posicion en la linea
            #Recibe nuestra linea, la posicion actual, y nuestra cadena
            #y tambien nuestro numero romano valido con las C's
            counter, numb = getC(line, counter, numb)

            #Ejecutamos la funcion que transformara a nuestro numero romano en numero arabigo
            #Recive nuestro numero en romano, en este caso nuestro numero valido "numb"
            transformNumber(numb)

        #Validamos que nuestra posicion no se salga dentro del rango valido de la cadena
        #Validamos cuando el primero de la cadena es C
        elif counter <= len(line) and line[counter] == "D":

            #Ejecutamos la funcion getId que nos retornara nuestra nueva posicion en la linea
            #Recibe nuestra linea, la posicion actual, y nuestra cadena
            #y tambien nuestro numero romano valido con las D's
            counter, numb = getD(line, counter, numb)

            #Ejecutamos la funcion que transformara a nuestro numero romano en numero arabigo
            #Recive nuestro numero en romano, en este caso nuestro numero valido "numb"
            transformNumber(numb)

        #Validamos que nuestra posicion no se salga dentro del rango valido de la cadena
        #Validamos cuando el primero de la cadena es M
        elif counter <= len(line) and line[counter] == "M":

            '''
                Como nuestro codigo solo llega al numero 1000 -> M, en este caso, cuando detecte M, solamente
                agrega M a nuestra cadena de numeros, lo transforma a numero arabigo y finalmente
                actualiza su posicion en la cadena
            '''
            numb += line[counter] #Agregamos M a nuestra cadena de numeros romanos

            #Ejecutamos la funcion que transformara a nuestro numero romano en numero arabigo
            #Recive nuestro numero en romano, en este caso nuestro numero valido "numb"
            transformNumber(numb)

            counter += 1 #Actualizamos nuestra posicion en la cadena

        #Validamos en caso de que haya una letra que no existe
        else:
            counter += 1

    os.system("pause")

#Funcion que inicia el programa y mandamos el archivo que se va a leer
start(open("file.txt", "r"))