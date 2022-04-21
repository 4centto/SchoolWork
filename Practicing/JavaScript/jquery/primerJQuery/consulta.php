<?php

$conexion = mysqli_connect(
    $hostname = "localhost",
    $username = "root",
    $password = "",
    $database = "pruebas"
);

$cursor = mysqli_query($conexion, "SELECT * FROM mensajes");

    if($cursor){

        if(mysqli_num_rows($cursor) > 0){
            $mensajes = "";

            while($fila = mysqli_fetch_array($cursor)){

                $mensajes = $mensajes.$fila['mensaje']."\n";

            }

            echo $mensajes;
            
        } else {

            echo "No tienes mensajes aun";

        }

    }

?>