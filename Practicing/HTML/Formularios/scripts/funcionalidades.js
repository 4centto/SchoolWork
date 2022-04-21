var barra, txt_valor;

function Inicializar(){
    barra = document.getElementById("barra");
    txt_valor = document.getElementById("num_sueldo");
    document.getElementById("enviar_formulario").addEventListener("click", Enviar, false);

    barra.addEventListener("change", ObtenerValor, false);

}

function Enviar(){
    var correcto = document.formulario.checkValidity();
    if(correcto == true){
        document.formulario.submit();
    } else {
        alert("Revisa que tus datos esten correctos");
    }
}

function ObtenerValor(posicion){
    txt_valor.innerHTML= "[" + barra.value + "]";
}

window.addEventListener("load", Inicializar, false);
window.addEventListener("load", ObtenerValor, false);