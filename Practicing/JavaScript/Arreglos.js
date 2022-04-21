//Déclaration d'un array
var cours = new Array("Anglais", "Mathématiques", "Histoire");

//Montrer tout l'array
document.write(cours + "</br>");

//Accéder á l'array pour modifier les donées
cours[0] = "Francais";
document.write(cours);

//Créer un array mais dinamiquement
var cours = new Array(10);
for(var i = 0; i < cours.length; i++){
    cours[i] = (i + 1);
}
document.write("</br>" + cours);

//Aussi les arrays sont trés dinamique, donc ils peuvent être modifiés sans avoir un taille
var cours = new Array();
for(var i = 0; i < 50; i++){
    cours[i] = (i + 1);
}
document.write("</br>" + cours);

//Les arrays peuvent aussi être déclarés literalment
var cours = ["Anglais", "Spagnol", "Francais", "Allemand"];
document.write("</br>" + cours);

//Propriétés d'un array
cours.length; // Le taille d'un array

var cours_Deux = ["Calcule", "Algébre"];

var nuevoArreglo = cours.concat(cours_Deux); // Mixer 2 arrays dans un même array

nuevoArreglo.sort(); // Cet function ordonne l'array alphabetiquement

document.write("</br>" + nuevoArreglo);

//Un array peut être devenue á un array associatif et être un object
var personne = []
personne["nom"] = "Ivan";
personne["age"] = 18;
personne["stature"] = 173;

document.write("</br> Personne{Nom: " + personne.nom + ", Âge: " + personne.age + ", Stature: " + personne.stature + "}");


/*******************************************/
//L'object math il nous aide pour pouvoir réaliser des operations mathématique plus complexes
document.write("</br>" + Math.PI);

/*******************************************/
//Aussi un object qui peut nous aider c'est la function:
/*
setInterval(ecrire, 1000); // Cet function établis un intervale pour fair quelque chose chaque certain temps

function ecrire(){
    document.write("Hola");
}
*/

//Un object qui peut nous aider beacoup c'est la function date. Il va nous donner la date actuelle du jour
var date = new Date();
document.write("</br>Date: " + date.getDate() + "/" + (date.getMonth() + 1) + "/" + date.getFullYear());
document.write("</br>Heure: " + date.getHours() + ":" + date.getMinutes());