def RestarYMinimo(lista):
    aux = 0
    for i in lista:
        if aux == 0:
            aux = i
        else:
            aux -= i
    cadena = "La resta de tu lista es: {}. \nEl numero menor de tu lista es: {}. \n".format(aux, min(lista))
    return cadena
