function Porcentajes(precio, porcentaje){
    return precio * porcentaje;
}

var precio = prompt("¿Cuanto es el costo del producto?");
var porcentaje = prompt("¿De cuanto es el descuento?");

var resultado = Porcentajes(precio, porcentaje);

if(resultado < 100){
    document.write("El precio es muy barato");
} else {
    document.write("El precio es muy caro");
}

alertt("HASTA LUEGO!!");