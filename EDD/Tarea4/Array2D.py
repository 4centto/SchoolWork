from colorama import Back

class Array2D():
  #Constructor
  def __init__(self, ren, col):
    self.__columnas = col
    self.__renglones = ren
    self.__data = [[ 0 for i in range(col)]for i in range (ren)]

  def to_string(self):
    for i in range(self.__renglones):
      print(self.__data[i])

  def clear(self, dato):
    for i in range (self.__renglones):
      for x in range(self.__columnas):
        self.__data[i][x] = dato

  def get_row_size(self):
    return (self.__renglones)

  def get_col_size(self):
    return (self.__columnas)

  def set_item(self,ren,col,dato):
    self.__data[ren][col] = dato

  def get_item(self,ren,col):
    if ren >= 0 and ren < self.__renglones:
        if col >= 0 and col < self.__columnas:
            return self.__data[ren][col]
        else:
            return None
    else:
        return None