<?php

/*
    Visibilidad:
        - public (Cualquiera)
        - private (Nadie)
        - protected (Solo los que herdan)
*/

class Figura{
    protected $ancho;
    protected $largo;
    //static $texto = "Este es un texto estatico";

    public function CalcularArea(){
        return $this->ancho * $this->largo;
    }
}

class Cuadrado extends Figura{
    public function __construct($ancho = 0, $largo = 0){
        $this->ancho = $ancho;
        $this->largo = $largo;
    }
}

$cuadrado = new Cuadrado(5, 5);
echo $cuadrado->CalcularArea();

//echo Figura::$texto;

?>