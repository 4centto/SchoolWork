<?php

function TrabajarArchivo(){
    //Creamos y escribimos en el archivo
    $archivo = fopen("documento.txt", "w");
    $texto = "Este es el texto principal,\nel que se ecribió primero.";
    fwrite($archivo, $texto);
    fclose($archivo);

    //Adjuntamos un texto
    $archivo_a = fopen("documento.txt", "a");
    $texto_a = "\nEste texto es el adjuntado,\nel que se escribio despues.";
    fwrite($archivo_a, $texto_a);

    //Leemos el archivo
    $lectura = file("documento.txt");
    foreach ($lectura as $linea) {
        echo $linea."<br>";
    }

}

TrabajarArchivo();

?>