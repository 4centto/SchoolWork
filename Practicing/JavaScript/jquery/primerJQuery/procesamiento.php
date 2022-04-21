<?php
$nombre = $_POST["name"];
$mensaje = $_POST["msg"];

$conexion = mysqli_connect(
    $hostname = "localhost",
    $username = "root",
    $password = "",
    $database = "pruebas"
);

if(insertarMensaje($conexion, $mensaje) == true){

    $cursor = mysqli_query($conexion, "SELECT * FROM mensajes");

    if($cursor){

        $mensajes = "";

        while($fila = mysqli_fetch_array($cursor)){

            $mensajes = $mensajes.$fila['mensaje']."\n";

        }

        echo $mensajes;

    }

}

function insertarMensaje($conexion, $mensaje){
    $cursor = mysqli_query($conexion, "INSERT INTO mensajes VALUES(0, '$mensaje')");

    if($cursor){
        return true;
    } else {
        return false;
    }

}

?>