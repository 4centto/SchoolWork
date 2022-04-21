function Inicializar(){

    var bg = document.getElementById("bg");
    var moon = document.getElementById("moon");
    var mountains = document.getElementById("mountain");
    var road = document.getElementById("road");
    var text = document.getElementById("text");

    window.addEventListener("scroll", function(){

        var value = window.scrollY;

        bg.style.top=(value * 0.5) + "px";
        moon.style.left=(-value * 0.5) + "px";
        mountains.style.top=(value * 0.15) + "px";
        road.style.top=(value * 0.15) + "px";
        text.style.top=(value * 1) + "px";

    }, false);

}

window.addEventListener("load", Inicializar, false);