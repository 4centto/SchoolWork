<?php

$texto_mail = "Hola";
$destinatario = "ivangarcia080902@gmail.com";
$asunto = "Tarea";
$headers = "MIME-Version: 1.0\r\n";
$headers.="Content-type: text/html; charset=iso-8859-1\r\n";
$headers.="From: Ivan Garcia < ivangarcia080902@gmail.com >\r\n";

$exito = mail($destinatario, $asunto, $texto_mail, $headers);

if($exito){
    echo "Mensaje enviado con exito";
} else {
    echo "Ocurrio un error";
}

?>