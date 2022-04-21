print("Introduce dos numeros a comparar: ");
print("");

num_uno = float(input("Ingresa el primer numero:  "));
num_dos = float(input("Ingresa el segundo numero:  "));

print("Los numeros a comparar son: ", num_uno, " y ", num_dos);
print("");

if num_uno == num_dos:
    print("Los numeros son iguales");

elif num_uno > num_dos:
    print(num_uno, " es mayor que ", num_dos);

elif num_uno < num_dos:
    print(num_uno, " es menor que ", num_dos);

elif num_uno >= num_dos:
    print(num_uno, " es mayor o igual que ", num_dos);

elif num_uno <= num_dos:
    print(num_uno, " es mayor o igual que ", num_dos);

print("Listo!")
