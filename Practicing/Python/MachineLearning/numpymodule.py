#Introducción a numpy
import numpy as np

#aleatorios = np.random.random((numFilas, numColumnas))
#vacia = np.empty((filas, columnas))

a = np.array([1, 2, 3])
print("1D Array")
print(a)
print()

b = np.array([(1, 2, 3), (4, 5, 6)])
print("2D Array")
print(b)
print()

'''
a.ndim -> Dimension
a.dtype -> Tipo de datos
a.size -> Tamaño
a.shape -> Forma
a = a.reshape(3, 2) -> Cambiar la forma de la matriz
a[0, 2] -> Obtener elemento
a[0: , 2] -> Obtener valores de la fila 0 en adelante y tomara solo los valores de la columna dos
a.min() -> Minimo
a.max() -> Maximo
a.sum() -> Suma de la matriz
np.sqrt(a) -> Raíz cuadrada
np.std(a) -> Desviación estandar

a + b -> Sumar matrices
a - b -> Restar matrices
a * b -> Multiplicar
a / b -> Dividir

Para seleccionar o poner un filto a los datos creamos una mascar y luego mostramos los datos.
Por ejemplo, nosotros seleccionaremos los alumnos menores de edad de una lista

mask = alumnos[:, 2] < 18
print(alumnos[mask])

O podemos hacerlo en una sola linea

print(alumnos[alumnos[: ,2 ] < 18])

'''