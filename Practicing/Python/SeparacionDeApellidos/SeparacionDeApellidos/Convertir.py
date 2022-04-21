def ConvertirNombre(nombre):
    nombre_dos = nombre.split(" ")
    cadena = ""
    for i in range(len(nombre_dos)):
        if i == 0:
            cadena += nombre_dos[i]
        else:
            cadena += " " + nombre_dos[i][0] + "."
    return cadena