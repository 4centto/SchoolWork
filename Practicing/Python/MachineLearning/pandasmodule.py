import pandas as pd, numpy as np

data = np.array([['', 'Nombre', 'Edad', 'Correo'], ['Alumno 1', 'Ivan', 19, 'ivangarcia080902@gmail.com'], 
['Alumno 2', 'Daniel', 15, 'daniel@gmail.com'], ['Alumno 3', 'Angel', 18, 'rulastic@gmail.com']]) #Un arreglo bidimensional

print(pd.DataFrame(data=data[1: , 1: ], index=data[1: , 0], columns=data[0, 1: ])) #Obtenemos una tipo tabla que es DataFrame
print()

df = pd.DataFrame(np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])) #Diferente manera de crear una tabla bidimensional
print("Data Frame")
print(df)
print()

#Manera de crear una tabla con tuplas
serie = pd.Series({"Mexico": "Toluca", "Argentina": "Buenos Aires", "E.U.": "Washington D.C.", "España": "Madrid"})
print("Serie")
print(serie)
print()

#Trabajar con archivos externos
prueba = pd.read_json("https://grimplast-native.herokuapp.com/get/admin") #Hacer consulta a una api de URL
print(prueba["nombre_admin"][0])
print()

df = pd.read_csv('train.csv') #Abrir un archivo excel
print(df)
print()

'''
df.shape -> Dorma del DataFrame
len(df.index) -> Altura del data frame
df.describe() -> Estadísticas del frame
df.mean() -> Medida de las columnas
df.corr() -> Correlacion de cada columna
df.count() -> Valores no nulos de cada columna
df.max() -> Valor mas alto de cada columna de cada columna
df.min() -> Valor mas bajo de cada columnas
df.meadian() -> Mediana de cada columna
df.std() -> Desviacion estandar de cada columna

df[0] -> Primera columna del frame
df[["columna1", "columna2", "columna3"]] -> Crear un nuevo DataFrame con las columnas indicadas
df["nuevaColumna"] = df["columnaX"] == "datoX" -> Crear una nueva columna basandonos en datos anteriores y en formato booleano
df[[0, 1]] -> Devolver la primera y segunda columna como un nuevo frame
df.iloc[0][2] -> Devolver el valor de una celda con su fila y columna
df.iloc[0, : ] -> Devolver todos los valores de la columna 0

df.isnull() -> Verificar si faltan valores en el conjunto de datos
df.isnull().sum() -> Obtener suma de valores nulos 

pd.dropna() -> En una lista de valores perdidos eliminamos las filas
df.dropaxis(axis = 1) -> Eliminar columnas donde haya datos perdidos
df.fillna(x) -> Remplazar valores nulos o perdidos
'''