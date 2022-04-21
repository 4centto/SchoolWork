function Inicializar(){

    var bg = document.getElementById("bg");
    var mountains = document.getElementById("mountains");

    window.addEventListener("scroll", function(){

        var valeur = window.scrollY;

        bg.style.top = (valeur * 0.2) + "px";
        mountains.style.top = (valeur * 0.4) + "px";

    }, false);

}

window.addEventListener("load", Inicializar, false);