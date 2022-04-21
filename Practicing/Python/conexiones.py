import pymysql

conexion = pymysql.connect( 
    host="localhost", 
    user="root", 
    password="", 
    db="prueba1" 
)

cursor = conexion.cursor()
cursor.execute("SELECT * FROM alumnos")

objetos = cursor.fetchall()

filas = len(objetos)
columnas = len(objetos[0])

for i in range(filas):
    print(f"* Alumno{i+1} * ")
    for j in range(columnas):
        print(f"   - {objetos[i][j]}")
    print("")