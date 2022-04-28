using System;

namespace Metodos
{
    class Program
    {
        static void Main(string[] args)
        {
            saludar("Hello World!");
        }

        //Metodo con valores por default
        int defaultValues(int x = 0, int y = 0)
        {
            return x + y;
            //Para llamar al metodo y mandar ciertos valores defautlValues(x: 10);
        }

        //Metodo recursivo
        int factorial(int x)
        {
            return (x == 1) ? 1 : x*factorial(x-1);
        }

        //Metodo que cambia valores de los parametros
        void changeValues(ref int x, out int y)
        {
            x = 10;
            y = 11;
        }

        //Metodo que returna un tipo de valor
        int suma(int x, int y)
        {
            return x + y;
        }

        //Metodo que no retorna nada
        static void saludar(string s)
        {
            Console.WriteLine(s);
        }

    }
}
