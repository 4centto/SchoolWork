from LaberintoADT import LaberintoADT

juego = LaberintoADT("./laberintos/entrada.txt")

while not juego.es_salida():
    juego.buscar_camino()