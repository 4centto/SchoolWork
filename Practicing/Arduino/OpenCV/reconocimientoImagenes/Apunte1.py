import cv2

imagen = cv2.imread("./imagenes/Torneo.jpg", 0) #Podemos ponerle a la imagen diferentes valores de visualizacion
cv2.imshow("IMAGEN: ", imagen)
cv2.imwrite("grises.jpg", imagen) #Guardar la imagen con las nuevas actualizaciones (nombre, variable)
cv2.waitKey() #Tiempo de duracion de la imagen cv2.waitKey(1000)
cv2.destroyAllWindows()