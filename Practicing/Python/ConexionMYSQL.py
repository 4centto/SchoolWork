import pymysql

MiConexion = pymysql.connect(
    host='bcszt5zxhmw2paaell6r-mysql.services.clever-cloud.com',
    user='ucn78cjcfakruihj',
    password='VxUWRWcAk7GKO4pt5XIS',
    db='bcszt5zxhmw2paaell6r'
)

productos = ""

cur = MiConexion.cursor()
cur.execute("select nombre_producto, cantidadporbolsa_producto from productos")

MiConexion.close()

