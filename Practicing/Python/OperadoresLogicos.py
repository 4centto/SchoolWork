#Conjuncion
print("Conjuncion (and). \n")

num_uno = float(input("Escribe un numero mayor a 2 y menor que 5. \n"))

if num_uno > 2 and num_uno < 5:
    print("El numero ", num_uno, " cumple con la condicion. \n")

else:
    print("El numero ", num_uno, " NO cumple con la condicion. \n")


#Disyuncion
print("Disyuncion (or). \n")

palabra = input("Para cumplir con la condicion escribe la palabra 'si' o la palbra 'yes'. \n")

if palabra == "si" or palabra == "yes":
    print("La condicion se ha cumplido")

else:
    print("La palabra no cumple con la condicion")


#Negacion
print("Negacion (not) \n")

num_uno = float(input("Introduce un numero igual a 5. \n"))

if not num_uno == 5:
    print("El numero ", num_uno, " no es igual a 5")

else:
    print("El numero ", num_uno, " es igual a 5")
