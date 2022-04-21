// Archivo JavaScript

function Ejecuta(){

    /* Todos los elementos de un tipo de etiqueta
    for(var i = 0; i < 3; i++){
        document.getElementsByTagName("p")[i].onclick=Alerta;
    }
    */
    
    //document.getElementById("comentario").onclick=Alerta;

    /* Los elementos por un nombre de clase
    for(var i = 0; i < 2; i++){

        var x = document.getElementsByClassName("comentario")[i].onclick=Alerta;

    }
    */

    //Metodo querySelector()
    //document.querySelector("#principal p:last-child").onclick=Alerta;

    //Metodo querySelectorAll()
    /*
    var elementos = document.querySelectorAll("#principal p, span");
    for(var i = 0; i < elementos.length; i++){
        elementos[i].onclick=Alerta;
    }
    */
}

function Alerta(){
    alert("Que hay de nuevo");
}

window.onload=Ejecuta;