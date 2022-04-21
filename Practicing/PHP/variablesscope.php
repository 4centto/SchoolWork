<?php

$edad = 22;
function Estudiantes(){
    global $edad;
    $edad = 24;
    echo $edad;
}

Estudiantes();
echo $edad;
?>