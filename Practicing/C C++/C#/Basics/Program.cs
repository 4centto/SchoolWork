using System;

namespace Basics {
    class Program {
        static void Main(string[] args){

            const double PI = 3.141516;

            //Impresion formateada
            int x = 10, y = 11;
            Console.WriteLine("x = {0}, y = {1}", x, y);

            //Obtencion de datos
            Console.Write("What's your name: ");
            string name = Console.ReadLine();
            Console.WriteLine("Hello {0}", name);

            //Obtencion de numeros
            Console.WriteLine("What's your age: ");
            int age = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Your age is {0}", age);
        }
    }
}