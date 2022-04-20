package ico.fes;

public class Persona{

	// Atributos de clase
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private int edad;
	private String curp;

	
	public Persona(){ //Metodo Constructor
		nombre = "No asignado";
	}

	/*
	Metodo de acceso getNombre()
	para el atributo Nombre
	No recibe parametro de entrada,
	pero regresa el valor de nombre.
	*/

	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String n){
		this.nombre = n;
	}

	public int getEdad(){
		return this.edad;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}

}