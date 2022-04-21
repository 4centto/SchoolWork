/*
Ici  il nous permet de pouvoir sélectionner de différents objects dans notre project .html
On peut obtenir ces objects en utilisant les méthodes suivants:
*/

document.getElementById(); // Le élément avec un id spécifique
document.getElementsByTagName(); // Les éléments avec un nom d'étiquette HTML spécifique
document.getElementsByClassName(); // Les éléments avec un nom de class spécifique
document.getElementsByName(); // Les éléments avec un name spécifique
document.getElementsByTagNameNS(); // Je sais pas haha

//Cet élément qu'on va obtenir on peut le garder dans un variable
var element = document.getElementById("id");

element.innerHTML="HOLA MUNDO!"; //Le méthode innerHTML il nous permet de modifiér le texte ou le valeur d'un étiquette HTML

/*
Tous les méthodes pour obtenir un élément HTML qui dissent "Elements", ils vont nous donner un array de tous les étiquettes 
qui aient le nom établis, par example:
*/

var elements = document.getElementsByClassName("elementos");

for(var i = 0; i < elementos.length; i++){
    elements.innerHTML="Elemento " + (i + 1) + ". </br>";
}

/* Dans les éléments obtenus on peut utiliser de méthodes spécifiques qui peuvent nous donner le prémier élément ou le 
dérnier élément de l'array 
*/

var elements = document.getElementsByClassName("Elements");
var premier = elements.firstChild; //Le prémier élément de l'array
var dernier = elements.lastChild; //Le dérnier élément de l'array
elements.appendChild(premier); //Il ajoute un nouveax fils a l'étiquette pére

/** 
 * Quand on ait les éléments ou l'élément, on pourras aussi modifier ces attributes ou son style ou plus
*/
var elements = document.getElementById("Element");
element.src="imagen.png";
element.style.background="#FFFFFF";
element.id="nouveaux";

/* CRÉATION D'ANIMATIONS */
//Pour commencer on doit mettre un intervalle pour fair un action chaque certains temps
var t  = setInterval(deplacer, 500);
var caisse = document.getElementById("caisse");
var position = 0;

function deplacer(){
    position += 1;
    caisse.style.left = position + "px";
}

/* MANIEMENT DES ÉVÉNEMENTS */
var x = document.getElementById("id").onclick = function(){
    alert("Hola");
};

// OU

var x = document.getElementById("id").addEventListener("click", function(){
    alert("Variable x");
}, false);

window.addEventListener("load", function(){
    alert("Hola");
}, false);

//Aussin un peut remuer un addEventListener
window.removeEventListener("load");

/*
Quand on mettre un addEventListsner le dérnier paramètre est true ou false, mais ¿pour quoi?
Ici ils existent le bibbling et capturing.
    Capturing: Si on a 2 événements click, un dans une étiquette div et l'autre dans une étiquette p et si l'étiquette p est dans
              l'étiquette div, l'événement du div va être execute en prémier et l'autre événemts en deuxiéme. ->.<-

    Bubbling: Si on a 2 événements click, un dans une étiquette div et l'autre dans une étiquette p et si l'étiquette p est dans
               l'étiquette div, l'événement du p va être execute en prémier et l'autre événemts en deuxiéme. <-.->
*/

x.addEventListener("click", function(){}, false); //-> Bubbling
x.addEventListener("click", function(){}, true); //-> Capturing

/* VALIDATION DES FORMULAIRES */
/*
Un formulaire a un événement qui s'appel onsubmit et qu'on peut utiliser pour valider un formulaire
ou peut returner false si le formulaire est pas corecte et true s'il est correcte
*/