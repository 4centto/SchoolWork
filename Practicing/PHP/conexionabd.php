<?php

$conexion = mysqli_connect("bcszt5zxhmw2paaell6r-mysql.services.clever-cloud.com", "ucn78cjcfakruihj", 
"VxUWRWcAk7GKO4pt5XIS", "bcszt5zxhmw2paaell6r");

if(!$conexion){
   die("Conexion fallida ".mysqli_connect_error());
} else{
    echo "Conexion exitosa<br><br>";

    $cursor = mysqli_query($conexion, "SELECT * FROM modificaciones");
    if($cursor){

        while($fila = mysqli_fetch_array($cursor)){
            $nombre = $fila["quefue_modificacion"];
            echo $nombre."<br>";
        }

    } else {
        echo "No se encontraron datos";
    }

    mysqli_close($conexion);
}

?>