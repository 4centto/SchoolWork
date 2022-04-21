import cv2
import numpy as np
import imutils

image = cv2.imread("./imagenes/mouse.jpg", cv2.IMREAD_GRAYSCALE)
image = imutils.resize(image, width=400)

_, binarizada = cv2.threshold(image, 210, 255, cv2.THRESH_BINARY)
_, binarizadaiNV = cv2.threshold(image, 210, 255, cv2.THRESH_BINARY_INV)

cv2.imshow("Image", image)
cv2.imshow("Tipos: Binary - Binary Inv", np.hstack([binarizada, binarizadaiNV]))
cv2.waitKey(0)
cv2.destroyAllWindows()