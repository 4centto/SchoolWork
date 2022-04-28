using System;

namespace POO
{
    class Persona
    {

        //Metodos de encapsulación: public, private, protected, internal, protected internal.
        private int age;
        private string name;

        public Persona(int age=0, string name="")
        {
            this.name = name;
            this.age = age;
        }

        public void sayHi()
        {
            Console.WriteLine("Hello!");
        }

        //Metodos getter and setter de diferente manera
        public string Name
        {
            get { return name; }
            set { name = (value != "") ? value : "No tiene nombre"; }
        }

        /* Metodo getter y setter de manera rapida por si no se requiere logica adicional
         
        public string Name { get; set; }
         
         */

        //Metodo destructor
       ~Persona()
       {
            Console.WriteLine("Person killed.");
       }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Persona p = new Persona(18, "Ivan");
            p.Name = "Ivan"; //Accedemos a los getter and setter
            p.sayHi();

        }
    }
}
