#BIAS Y VARIANZA
'''
ERRORES:
    -bias:
        Es la diferencia entre la predicción de esperada de nuestro modelo y
        los valores verdaderos.

    -varianza:
        La cantidad que la estimacion de la funcion objetivo cambiará si se utiliza 
        diferentes datos de entrenamiento.

    -irreducible:
        No se puede reducir independientemente de que algoritmo se use
        y viene de variables desconocidas.
'''

'''
SOBREAJUSTE:
    Cubre todos los puntos del grafico, inclusive el ruido y los valores atipicos.
    Modela los datos de entrenamiento demasiado bien y ocurre cuando un modelo aprende el detalle.


SUBAJUSTE:
    No cubre todos los puntos que se muestran en el gráfico.
    No puede modelar los datos de entrenamiento, no generalizar a nuevos datos, es decir,   
    que nuestro modelo no se dapta bien a los datos lo suficientemente bien.

APROPIADO:
    Cubre la mayoria de los puntos en el grafico y mantiene un equilibri entre la bias y la varianza.

        -Usar mas información para entrenamiento.
        -Tecnica de validación cruzada.
        -Detección temprana.
        -Regularizacion.
'''

'''

edades = [15, 16, 18, 19, 22, 24, 29, 30, 34]
promedio(median) = 23
distancia = [8, 7, 5, 4, 1, 1, 6, 7, 11] -> Lejania de cada edad con respecto al promedio (23)

CALCULAR DESVIACION ESTANDAR:
    -> Al valor de la varianza le sacamos raíz cuadrada = 6.34

CALCULAR VARIANZA:
    -> Cada valor de la distancia lo elevamos al cuadrado y los sumamos todos (362)
    -> Luego lo dividimos entre el total de edades (362 / 9) = 40.2 ->Esta es la Varianza

GRAFICA:
                          ||||||||||||||||||||||||||||
                         ||||||||||||||||||||||||||||||                            
                        ||||||||||||||||||||||||||||||||
                       ||||||||||||||||||||||||||||||||||
                      ||||||||||||||||||||||||||||||||||||                                 
                     ||||||||||||||||||||||||||||||||||||||                                    
                    ||||||||||||||||||||||||||||||||||||||||                                     
                   ||||||||||||||||||||||||||||||||||||||||||                                        
                  ||||||||||||||||||||||||||||||||||||||||||||                                          
                 ||||||||||||||||||||||||||||||||||||||||||||||                                            
                ||||||||||||||||||||||||||||||||||||||||||||||||                                              
               ||||||||||||||||||||||||||||||||||||||||||||||||||                                                
              ||||||||||||||||||||||||||||||||||||||||||||||||||||                                                  
             ||||||||||||||||||||||||||||||||||||||||||||||||||||||                                                   
            ||||||||||||||||||||||||||||||||||||||||||||||||||||||||                                                      
           ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||                                                       
          ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||                                                          
         ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||                                                           
        ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||                                                              
       ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||                                                               
      ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||                                                                  
     ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||                                                                   
    ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||                                                                      
    ( promedio - std )------------( promedio )------------( promedio + std )

'''

import numpy as np, pandas as pd

data = [15, 16, 18, 19, 22, 24, 29, 30, 34]

print("Promedio(Mean):", np.mean(data)) #Promedio
print("Media(Median):", np.median(data)) #Media
print("Desviacion Estandar(std):", np.std(data)) #Desviacion Estandar
print("Varianza(var):", np.var(data)) #Varianza
print("50th percentile: ", np.percentile(data, 50)) #Percentile
print("25th percentile: ", np.percentile(data, 25))
print("75th percentile: ", np.percentile(data, 75))

df = pd.read_csv("tittanic.csv")
#titanic["male"] = titanic["Sex"] == "male" ----> Crear una nueva columna en la tabla

#Pasar la columnas Fare a un arreglo de numpy
arreglo = df["Fare"].values #Arreglo unidimensional
arreglo = df[["Pclass", "Fare", "Age"]].values #Arreglo bidimensional

