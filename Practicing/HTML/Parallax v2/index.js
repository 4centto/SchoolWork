function Inicializar(){
    var bg = document.getElementById("bg");
    var trees = document.getElementById("trees");
    var mountains = document.getElementById("mountains");

    window.addEventListener("scroll", function(){
        var value = window.scrollY;

        bg.style.bottom = (-value * 0.7) + "px";
        mountains.style.bottom = (-value * 0.5) + "px";

    }, false);

}

window.addEventListener("load", Inicializar, false);