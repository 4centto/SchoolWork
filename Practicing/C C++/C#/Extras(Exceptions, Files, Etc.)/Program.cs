using System;
using System.IO;

namespace Extras_Exceptions__Files__Etc._
{
    class Program
    {
        struct Book //Creacion de una estructura de datos
                    //Puede tener un contructor subre cargado, pero no sin parametros
                    //Puede tener sus metodos, propiedades, etc. pero no puede ser derivada
        {
            public string title;
            public int year;
            public int pages;
            public Book(string title, int year, int pages)
            {
                this.title = title;
                this.year = year;
                this.pages = pages;
            }
            public void Read()
            {
                Console.WriteLine("Reading...");
            }
        }

        //Esta es una "Estructura" que puede ser utilizada dentro de un metodo switch
        enum Days { Dom, Lun, Mar, Mier, Jue, Vie, Sab };

        private static void useEnum(Days d)
        {
            switch (d)
            {
                case Days.Lun:
                    Console.WriteLine("El dia es lunes");
                    break;
                case Days.Mar:
                    Console.WriteLine("El dia es martes");
                    break;
                case Days.Mier:
                    Console.WriteLine("El dia es miercoles");
                    break;
                case Days.Jue:
                    Console.WriteLine("El dia es jueves");
                    break;
                case Days.Vie:
                    Console.WriteLine("El dia es viernes");
                    break;
                case Days.Sab:
                    Console.WriteLine("El dia es sabado");
                    break;
                case Days.Dom:
                    Console.WriteLine("El dia es domingo");
                    break;
                default:
                    Console.WriteLine("El dia no existe");
                    break;
            }
        }

        //Metodo para trabajar con archivos
        private static void files(string t)
        {
            string text = t;
            File.WriteAllText("test.txt", text);

            string txt = File.ReadAllText("test.txt");
            Console.WriteLine(txt);
        }

        static void Main(string[] args)
        {
            Book libro = new Book("Libro 1", 2002, 450);
            libro.Read();

            //Usar enum
            useEnum(Days.Mar);
            files("This is some cool text for my .txt file.");
        }
    }
}
