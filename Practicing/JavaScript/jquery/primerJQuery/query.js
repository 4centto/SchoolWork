$(document).ready(() => {
    var boton = document.getElementById("enviar").addEventListener("click", EnviarDatos, false);

    bucle = setInterval(() => {
        tomarMensajes();
    }, 1000);

});

function EnviarDatos(){
    var nombre = document.getElementById("nombre").value;
    var mensaje = document.getElementById("mensaje").value;

    if(nombre && mensaje){
    
        $.ajax({
            type: "post",
            url: "procesamiento.php",
            data: {name: nombre, msg: mensaje},
            success: function(resp){
                if(resp){
                    $("#mensajes").html(resp);
                } else {
                    alert("Conexion fallida");
                }
            }
        });

    } else {
        alert("Espacios vacios!!");
    }

}

function tomarMensajes(){

    var nombre = document.getElementById("nombre").value;

    $.ajax({
        type: "post",
        url: "consulta.php",
        success: function(resp){
            if(resp){
                $("#mensajes").html(resp);
            } else {
                alert("Conexion fallida");
            }
        }
    });
}