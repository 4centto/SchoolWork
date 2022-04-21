<?php

function Estudiante($nombre, $apellido){
    echo "Nuevo estudiante: $nombre $apellido <br>";
}

Estudiante("Ivan", "Michel");
Estudiante("Daniel", "Castro");
Estudiante("Angel", "Avila");
Estudiante("Lalo", "Mendoza");

function Suma($a, $b){
    $resultado = $a + $b;
    return $resultado;
}

echo "Tu suma es: ".Suma(5, 5);

?>