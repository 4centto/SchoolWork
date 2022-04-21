print("***************************")
print("* El numero mas grande es *")
print("***************************")
print("")

num_uno = float(input("Introduce el primer numero: "))
print("")
num_dos = float(input("Introduce el segundo numero: "))
print("")
num_tres = float(input("Introduce el tercer numero: "))
print("")

if num_uno > num_dos and num_uno > num_tres:
    print("El numero ", num_uno, " es el mayor de los tres")

elif num_dos > num_uno and num_dos > num_tres:
    print("El numero ", num_dos, " es el mayor de los tres")

elif num_tres > num_uno and num_tres > num_dos:
    print("El numero ", num_tres, " es el mayor de los tres")

else:
    print("Debe haber un numero mayor como maximo")
