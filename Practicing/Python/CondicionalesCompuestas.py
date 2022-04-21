print("Sistema para calcular el promedio de un alumno");

nombre = input("Cual es el nombre del alumno: ");
matematicas = float(input("Matematicas: "));
quimica = float(input("Quimica: "));
español = float(input("Español: "));
historia = float(input("Historia: "));

promedio = (matematicas + quimica + español + historia) / 4;

if promedio >= 6:

    print("El alumno " + nombre + " aprobo el grado con: ", round(promedio, 2));
    comentario = input("¿Algun comentario que quiera mandar al alumno? ");
    print("Mensaje enviado");

else:

    print("El alumno " + nombre + " reprobo el grado con: ", round(promedio, 2));
    comentario = input("¿Algun comentario que quiera mandar al alumno? ");
    print("Mensaje enviado");
