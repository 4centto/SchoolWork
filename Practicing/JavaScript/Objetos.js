//Creamos nuestro objeto persona manualmente
var persona = {
    nombre:"Ivan",
    edad:18,
    estatura:173
}

//Accediendo a los datos del objeto
document.write("Persona: {Nombre: " + persona.nombre + ", Edad: " + persona['edad'] + ", Estatura: " + persona.estatura + "}");

//Obteniendo la longitud de nuestro objeto o de alguna variable
document.write("</br>El nombre tiene " + persona.nombre.length + " letras");

//Creamos un objeto de tipo person pero por constructor
function person(nombre, edad, estatura){
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;

    //Dentro del constructor se deben de craer los metodos a utilizar
    this.saludar = function(){
        document.write("</br>" + this.nombre + " te esta saludando!! </br>");
    }

    //Declaracion de una funcion externa
    this.cambiarNombre = funcionFuera;
}

//Funcion externa
function funcionFuera(){
    var confirmacion = confirm("Deseas combiar tu nombre?");
    if(confirmacion){
        var nuevoNombre = prompt("Dame tu nuevo nombre: ");
        if(nuevoNombre){
            this.nombre = nuevoNombre;
            alert("Nombre cambiado a: " + this.nombre);
        } else {
            alert("No te preocupes " + this.nombre);
        }
    } else {
        alert("No te preocupes " + this.nombre);
    }
}

var Daniel = new person("Daniel", 15, 168);

//Accediendo a los datos del objeto
document.write("</br>Person: {Nombre: " + Daniel.nombre + ", Edad: " + Daniel['edad'] + ", Estatura: " + Daniel.estatura + "}");
Daniel.cambiarNombre();
Daniel.saludar();