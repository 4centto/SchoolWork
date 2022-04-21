import matplotlib.pyplot as plt

a = [3, 4, 5, 6] #Eje x
b = [5, 6, 3, 4] #Eje y

#Diagramas de linea
plt.plot(a, b, color='blue', linewidth=1, label='linea') #Dibujar una linea ( valoresx, valoresy, ancholinea, etc. )
plt.title("Diagramas de Lineas") #Titulo de la tabla
plt.ylabel("Eje Y") #Nombre al eje y
plt.xlabel("Eje X") #Nombre al eje x
plt.legend() #Mostrar etiquetas
plt.grid() #Mostrar un mallado
plt.show() #Mostrar las lineas

#Graficos de barras
x1 = [0.25, 1.25, 2.25, 3.25, 4.25]
y1 = [10, 55, 80, 32, 40]
x2 = [0.75, 1.75, 2.75, 3.75, 4.75]
y2 = [42, 26, 10, 29, 66]

plt.bar(x1, y1, label="Datos 1", width= 0.5, color="lightblue") # (posicionx, posiciony, ancholinea, color, label, etc,)
plt.bar(x2, y2, label="Datos 2", width= 0.5, color="orange")

plt.title("Grafico de Barras") #Titulo
plt.ylabel("Eje Y") #Ejes
plt.xlabel("Eje X")
plt.legend() #Mostrar Legendas
plt.show() #Mostrar grafica

#Histograma
a = [22, 55, 62, 45, 21, 22, 34, 42, 42, 4, 2, 102, 95, 85, 55, 110, 120, 70, 65, 55, 111, 115, 80, 75, 65, 54, 44, 43, 42, 48]
bins = [0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

plt.hist(a, bins, histtype="bar", rwidth= 0.1, color="lightgreen")
plt.title("Histogramas")
plt.ylabel("Eje Y")
plt.xlabel("Eje X")
plt.show()

#Grafica de dispersion
x1 = [0.25, 1.25, 2.25, 3.25, 4.25]
y1 = [10, 55, 80, 32, 40]
x2 = [0.75, 1.75, 2.75, 3.75, 4.75]
y2 = [42, 26, 10, 29, 66]

plt.scatter(x1, y1, label="Datos 1", color="red")
plt.scatter(x2, y2, label="Datos 2", color="black")
plt.ylabel("Eje Y")
plt.xlabel("Eje X")
plt.legend()
plt.show()

#Grafico circular
dormir = [7, 8, 6, 11, 7]
comer = [2, 3, 4, 3, 2]
trabajar = [7, 8, 7, 2, 2]
recreacion = [8, 5, 7, 8, 13]
divisiones = [7, 2, 2, 13] #Declaramos las cantidades de nuestras divisiones de la grafica
actividades = ["Dormir","Comer", "Trabajar", "Recreacion"] #Los nombres de cada division
colores = ["red", "purple", "blue", "orange"] #Colores para cada division

plt.pie(divisiones, labels=actividades, colors=colores, startangle=90, shadow=True, explode=(0, 0, 0, 0.1), autopct="%1.1f%%")
#(divisiones, labels, colores, anguloRotacion, sombre, categoriaASeparar, porcentaje)
plt.title("Grafica circular") #Titulo de la grafica
plt.show() #Mostrar grafica