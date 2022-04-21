print("Sistema para calcular el promedio del alumno");

nombre = input("Nombre del alumno: ");
matematicas = float(input("Matematicas: "));
quimica = float(input("Quimica: "));
historia = float(input("Historia: "));

resultado = (matematicas + quimica + historia) / 3;

if resultado >= 6:
    print("El alumno " + nombre + " aprobo el primer grado con: ", resultado);

if resultado <= 5:
    print("El alumno " + nombre + " reprobo el primer grado con: ", resultado);
