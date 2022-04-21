#Guardar y leer un video con open cv
import cv2

#GRABAR UN VIDEO
video = cv2.VideoCapture(0) #Puede ser 0 o -1 para la webcam
salida = cv2.VideoWriter("VideoSalida.avi", cv2.VideoWriter_fourcc(*"XVID"), 20.0, (640,480))

while(video.isOpened()):
    ret, imagen = video.read() #ret -> True o False (Si la imagen ya se capturo)
    if ret:
        cv2.imshow("Video", imagen)
        salida.write(imagen)
        if cv2.waitKey(1) & 0xFF == ord("s"):
            break

video.release()
salida.release()
cv2.destroyAllWindows()