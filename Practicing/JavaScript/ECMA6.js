/*
Cet est un langue un petit différent de JS, mais ils ont la même utilisation, seulement des petits mots changent mais
en fait tout c'est le même
*/

/* VARIABLES */
var a = 10; // On peut dire que VAR on l'utilise pour définir une variable, mais locale, ca veut dire dir qu'il est 
//             seulement dans un fonction spécifique ou dant tout le document.

const b = 'Salut!'; // Cette type de variable ne nous permet pas le modifier, son nom nous indique qu'il est un constant.

let c = true; // Ici c'est presque le même que Var mais, ici il est trés locale, s'il est seulement dans un if on le pourras utiliser
//               seulement dans ce certain if.

/**************************/
let nom = "Ivan";
let msg = `Salut  ${nom}!`; //Ca peut être un peut comme en python quand on utilise l'option format pour ajouter des variables
//Mais ici c'est trés important de enfermer les variables et le texte entre accents inversés
document.write(msg);

/* FUNCTIONS */
//Maintenant les functions avec le ECMA6, ils s'écrivent un petit différent

const ajouter = (x = 0, y = 0) => {
    let sum = x + y;
    document.write("</br>" + sum);
}
ajouter(5, 10);

const array = [1, 2, 3, 4, 5];
array.forEach(v => {
    document.write("</br>" + v);
})

/* OBJECTS */
let personne = {
    nom: "Ivan",
    age: 18,
    stature: 173,
    Anniversaire(){
        this.age ++;
    }
}

/* CLASSES AVEC ECMA6 */
class Figura{ //Création de la classe
    constructor(large = 0, haut = 0){
        this.large = large;
        this.haut = haut;
    }
    area(){
        return (this.large * this.haut);
    }
}

class Cuadrado extends Figura{ // Ici la classe Cuadrado hérit de la class Figura
    constructor(figura, large = 0, haut = 0){
        super(large, haut);
        this.figura = figura;
    }
    getNom(){
        return this.figura;
    }
}

var figura = new Cuadrado("Cuadrado", 5, 5);
document.write("</br>" + figura.getNom() + " tiene " + figura.area() + " de área");

//Ici á cet théme de classes, on doit utiliser tout le méthodes qu'on a appris dans le lange java
//les mots réservés comme super, this, extends, return, static, etc.

class Add{
    constructor(...words){
        this.words = words;
    }
    print(){
        var string = "$";
        for(let i = 0; i < this.words.length; i++){
            string += this.words[i] + "$";
        }
        document.write("</br>" + string);
    }
}

var x = new Add("hehe", "hoho", "haha", "hihi", "huhu");

x.print();