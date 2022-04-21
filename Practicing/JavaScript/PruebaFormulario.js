function enviarFormulario(){

    var inpUno = document.getElementById("nombre");
    var inpDos = document.getElementById("apellido");
    var texto = document.getElementById("texto");

    var nombre = inpUno.value;
    var appellido = inpDos.value;

    var string = "DATOS USUARIO: " + nombre + " " + appellido;

    texto.innerHTML=string;

    return false;
}