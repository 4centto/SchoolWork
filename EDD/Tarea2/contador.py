import time

print(" * CONTADOR DE BOMBA * ")
tiempo = int(input("¿Cuantos segundos quieres que la bomba espere? "))

def explotar(tiempo):
    time.sleep(1)
    if tiempo == 0:
        print("BOOOOOOOMMMM!!")
    else:
        print(tiempo)
        explotar(tiempo - 1)

explotar(tiempo)