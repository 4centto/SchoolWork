#Bucles o ciclos (while)
x = 1;

while x<=10:
    print(x)
    x += 1;

print("Fin Ciclo whlie")

for i in range(1, 10):
    print("Posicion ", i, ": ", i)
print("Fin del Ciclo for 1")

for i in range(0, 10):
    print("Posicion ", i, ": ", i + 1)
print("Fin del Ciclo for 2")

for i in range(0, 12, 2):
    print("Posicion ", i, ": ", i)
print("Fin del Ciclo for 3")

for i in range(10, 0, -1):
    print(i, end=" ")
print("Fin del Ciclo for 4")