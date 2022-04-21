import serial
import os

led = 0
mot = 0

serialArduino = serial.Serial("COM3", 9600)

def showMenu():
    os.system("cls")
    print("\t1. (Encender/Apagar) LED.")
    print("\t2. Servo.")
    print("\t3. Salir.")
    print("")

while(True):
    showMenu()
    opcion = int(input(" * Que deseas hacer: "))
    
    if opcion == 1:
        if led == 0:
            led = 1
        else:
            led = 0
        cad = str(led) + "," + str(mot)
        serialArduino.write(cad.encode("ascii"))
    elif opcion == 2:
        if mot == 0:
            mot = 45
        elif mot == 45:
            mot = 90
        elif mot == 90:
            mot = 135
        elif mot == 135:
            mot = 180
        elif mot == 180:
            mot = 0
        cad = str(led) + "," + str(mot)
        serialArduino.write(cad.encode("ascii"))
    elif opcion == 3:
        print("Hasta Luego")
        break