import re

arreglo = ("Manzana", "Naranja", "Papaya", "Sandia", "Kiwi", "Platano", "Carambola", "Mandarina", "Pera", "Coco", "Lichi", "Aguacate")
path = r"([\w\.-]+ar[\w.\-]+)"

for i in arreglo:
    objeto = re.match(path, i)
    if objeto:
        print(objeto.group())