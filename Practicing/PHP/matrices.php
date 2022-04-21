<?php
//Matrices y/o arreglos multidimensionales

$matriz;
$matriz_dos;
$matriz_resultado;
$contador = 10;

//Llenado matriz uno
for ($i=0; $i < 5; $i++) { 
    for ($j=0; $j < 5; $j++) { 
        $matriz[$i][$j] = $contador;
        $contador ++;
    }
}

//Llenado matriz dos
for ($i=0; $i < 5; $i++) { 
    for ($j=0; $j < 5; $j++) { 
        $matriz_dos[$i][$j] = $contador;
        $contador ++;
    }
}

//Calcular la matriz resultante
for ($i=0; $i < 5; $i++) { 
    for ($j=0; $j < 5; $j++) { 
        $matriz_resultado[$i][$j] = $matriz[$i][$j] + $matriz_dos[$i][$j];
    }
}

//Impresion de matrices
for ($i=0; $i < 5; $i++) { 
    for ($j=0; $j < 5; $j++) { 
        echo "[".$matriz[$i][$j]."]";
    }
    if($i == 2){
        echo "&nbsp + &nbsp";
    }else{
        echo "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp";
    }
    for ($j=0; $j < 5; $j++) { 
        echo "[".$matriz_dos[$i][$j]."]";
    }
    if($i == 2){
        echo "&nbsp = &nbsp";
    }else{
        echo "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp";
    }
    for ($j=0; $j < 5; $j++) { 
        echo "[".$matriz_resultado[$i][$j]."]";
    }

    echo "<br>";
}

?>