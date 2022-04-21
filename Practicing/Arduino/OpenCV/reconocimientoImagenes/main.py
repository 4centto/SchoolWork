#Ejemplo de reconocimiento de patrones
import cv2
import numpy as np

#Primero hay que importar las imagenes
#Para una busqueda mas sencilla transformar a escala de grises
tarjeta = cv2.imread("./imagenes/Torneo.jpg", cv2.IMREAD_GRAYSCALE) #La imagen en la que vamos a buscar
plantilla = cv2.imread("./imagenes/Ivan.jpg", cv2.IMREAD_GRAYSCALE) #El objeto o patron a buscar

''' METODO PARA MOSTRAR LAS IMAGENES
cv2.imshow("Tarjeta", tarjeta)
cv2.waitKey()

cv2.destroyAllWindows()
'''

alto, ancho = np.shape(plantilla) #Tamaño de la imagen de plantilla
resultado = cv2.matchTemplate(tarjeta, plantilla, cv2.TM_CCORR_NORMED) #Hacer el reconocimiento de la imagen
min, max, pos_min, pos_max = cv2.minMaxLoc(resultado) #Obtenemos las posiciones de nuestra coincidencia

pixel_superior_izq = pos_max
pixel_inferior_der = (pos_max[0] + ancho, pos_max[1] + alto) #[0] -> X     [1] -> Y


tarjeta = cv2.imread("./imagenes/Torneo.jpg")
cv2.rectangle(tarjeta, pixel_superior_izq, pixel_inferior_der, 255, 2)

cv2.imshow("IDENTIFICACION", tarjeta)
cv2.waitKey()
cv2.destroyAllWindows()