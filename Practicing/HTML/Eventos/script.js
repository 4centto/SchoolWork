function PresionarTitulo(){
    alert("Este es el titulo de la pagina :) ");
}

function FuncionalidadImagenes(){
    alert("Presionaste una imagen")
}

function InicializarScript(){
    document.getElementById("texto_titulo").onclick=PresionarTitulo;

    var imagenes = document.querySelectorAll("img");
    for(var i =0; i < imagenes.length; i++){
        imagenes[i].onclick=FuncionalidadImagenes;
    }

}

window.onload=InicializarScript;