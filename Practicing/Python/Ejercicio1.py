print("================================")
print("= Sistema de Conteo Vacacional =")
print("================================")
print("")
print("")
print("Para comenzar danos tu nombre: ")
print("")

nombre = input("");

print("")
print("Bien " + nombre + " ahora dinos la clave del departamento en el que trabajas. \n")

departamento = int(input(""))

print("Cuantos años de servicio con Rappi tienes. \n")

años = int(input(""))

if departamento == 1:

    if años == 1:
        print("El trabajador " + nombre + " tiene derecho a 6 dias de vacaciones")
    elif años >= 2 or años >= 6:
        print("El trabajador " + nombre + " tiene derecho a 14 dias de vacaciones")
    elif años >= 7:
        print("El trabajador " + nombre + " tiene derecho a 20 dias de vacaciones")

elif departamento == 2:

    if años == 1:
        print("El trabajador " + nombre + " tiene derecho a 7 dias de vacaciones")
    elif años >= 2 or años >= 6:
        print("El trabajador " + nombre + " tiene derecho a 15 dias de vacaciones")
    elif años >= 7:
        print("El trabajador " + nombre + " tiene derecho a 21 dias de vacaciones")

elif departamento == 3:

    if años == 1:
        print("El trabajador " + nombre + " tiene derecho a 8 dias de vacaciones")
    elif años >= 2 or años >= 6:
        print("El trabajador " + nombre + " tiene derecho a 16 dias de vacaciones")
    elif años >= 7:
        print("El trabajador " + nombre + " tiene derecho a 22 dias de vacaciones")
