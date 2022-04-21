<?php

class Conexion{
    static function Conexion(){
        $conexion = mysqli_connect("bcszt5zxhmw2paaell6r-mysql.services.clever-cloud.com", "ucn78cjcfakruihj", 
        "VxUWRWcAk7GKO4pt5XIS", "bcszt5zxhmw2paaell6r");

        if(!$conexion){
            die("Conexion fallida: ".mysqli_connect_error());
        } else{
            return $conexion;
        }

    }

    public function __destruct(){
        
    }
}
$conexion = Conexion::Conexion();
$cursor = mysqli_query($conexion, "SELECT * FROM modificaciones");

if($cursor){
    while($fila = mysqli_fetch_array($cursor)){
        $dato = $fila["quefue_modificacion"];
        echo "$dato<br>";
    }
} else {
    echo "No se encontraron datos en los registros";
}

mysqli_close($conexion);

?>