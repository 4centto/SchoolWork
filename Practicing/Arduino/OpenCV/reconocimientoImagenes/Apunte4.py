#Deteccion de colores
import cv2
import numpy as np
from numpy.core.fromnumeric import reshape

imagen = cv2.imread("./imagenes/Torneo.jpg", 0)
patron = cv2.imread("./imagenes/Ivan.jpg", 0)

alto, ancho = np.shape(patron)

resultado = cv2.matchTemplate(imagen, patron, cv2.TM_CCOEFF_NORMED)

min, max, pos_min, pos_max = cv2.minMaxLoc(resultado)

pos_sup_izq = pos_max
pos_inf_der = (pos_max[0] + ancho, pos_max[1] + alto)

imagen = cv2.imread("./imagenes/Torneo.jpg")
cv2.rectangle(imagen, pos_sup_izq, pos_inf_der, (0, 0, 255), 2)

cv2.imshow("RESULTADO", imagen)
cv2.waitKey()
cv2.destroyAllWindows()