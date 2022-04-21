<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Calculadora</title>
        <link rel="stylesheet" href="estilos.css">
    </head>
    <body>
        <section class="contenedor">
            <form class="formulario" id="formulario" name="formulario" method="get" autocomplete="off">
                <h1 class="titulo">CALCULADORA</h1>
                <input class="entrada" type="number" name="primero" id="primero" required>
                <input class="entrada" type="number" name="segundo" id="segundo" required>
                <input class="boton" type="submit" value="CALCULAR">
            </form>
        </section>
    </body>
</html>

<?php

if(isset($_GET["primero"]) && isset($_GET["segundo"]) && is_numeric($_GET["primero"]) && is_numeric($_GET["segundo"])){
    $primero = $_GET["primero"];
    $segundo = $_GET["segundo"];
    echo "<p class='resultado'>".$primero + $segundo."</p>";
}

?>