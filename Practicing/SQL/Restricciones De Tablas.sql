create table alumno(
id_alumno int(50) NOT NULL AUTO_INCREMENT UNIQUE,
nombre varchar(100) NOT NULL DEFAULT("No hay nombre"),
edad int(50) NOT NULL,
PRIMARY KEY(id_alumno)
)