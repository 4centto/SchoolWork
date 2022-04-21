<?php

$conexion = mysqli_connect("bcszt5zxhmw2paaell6r-mysql.services.clever-cloud.com", "ucn78cjcfakruihj", 
"VxUWRWcAk7GKO4pt5XIS", "bcszt5zxhmw2paaell6r");

$imagen = addslashes(file_get_contents($_FILES["imagen"]["tmp_name"]));

$query = "INSERT INTO Imagenes VALUES ('1', '$imagen')";

$resultado = $conexion->query($query);

if($resultado){
    echo "SI";
} else {
    echo "NO";
}

?>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>
    <body>
        <?php

        $conexion = mysqli_connect("bcszt5zxhmw2paaell6r-mysql.services.clever-cloud.com", "ucn78cjcfakruihj", 
        "VxUWRWcAk7GKO4pt5XIS", "bcszt5zxhmw2paaell6r");
        
        $cursor = mysqli_query($conexion, "SELECT imagen FROM Imagenes WHERE id_imagen = '1'");
        if($cursor){

            $fila = mysqli_fetch_array($cursor);

            $imagen = base64_encode($fila["imagen"]);

            echo "<img height='500px' src='data:image/jpg;base64,$imagen'/>";

        } else {
            echo "Ocurrio un error";
        }
        ?>

    </body>
</html>