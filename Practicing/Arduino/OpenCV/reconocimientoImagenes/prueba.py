import cv2
import numpy as np

imagen = cv2.imread("./imagenes/Torneo.jpg", cv2.IMREAD_GRAYSCALE)
persona = cv2.imread("./imagenes/Ivan.jpg", cv2.IMREAD_GRAYSCALE)

alto, ancho = np.shape(persona)
resultado = cv2.matchTemplate(imagen, persona, cv2.TM_CCORR_NORMED)

min, max, pos_mix, pos_max = cv2.minMaxLoc(resultado)

pos_sup_izq = pos_max
pos_inf_der = (pos_max[0] + ancho, pos_max[1] + alto)

aux = cv2.imread("./imagenes/Torneo.jpg")
color = (0, 0, 255) #BGR
cv2.rectangle(aux, pos_sup_izq, pos_inf_der, color, 2)

cv2.imshow("RESULTADO", aux)
cv2.waitKey()
cv2.destroyAllWindows()