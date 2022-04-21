<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Prueba de escritura de archivos</title>
    </head>
    <body>
        <form action="pruebaarchivos.php" method="post">
            <input type="text" name="usuario" id="usuario">
            <input type="text" name="password" id="password">
            <input type="submit" value="Enviar">
        </form>
        <?php

        $texto = $_POST["usuario"].",".$_POST["password"];
        $archivo = fopen("datosusuario.txt", "w");
        fwrite($archivo, $texto);
        fclose($archivo);

        $archivo = file("datosusuario.txt");
        $line;
        foreach ($archivo as $linea) {
            $line = explode(",", $linea);
        }

        echo "Usuario: <strong>".$line[0]."</strong><br>";
        echo "Password: <strong>".$line[1]."</strong><br>";

        ?>
    </body>
</html>