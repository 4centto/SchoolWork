using System;

namespace ArbolBinario
{
    class Program
    {

        static void Main(string[] args)
        {
            ArbolBinario arbol = new ArbolBinario();
            int op = 0;
            do
            {
                Console.WriteLine(" * MENU * ");
                Console.WriteLine(" 1. Agregar nodo.");
                Console.WriteLine(" 2. Tamaño de lista");
                Console.WriteLine(" 3. Mostrar lista");
                Console.WriteLine(" 4. Salir");
                Console.WriteLine("");
                Console.Write(" -> ");

                op = Convert.ToInt32(Console.ReadLine());

                menu(op, arbol);

            } while (op != 4);
        }

        private static void menu(int op, ArbolBinario lista)
        {
            switch (op)
            {
                case 1:
                    Console.Write(" -> Ingresa tu numero: ");
                    int numero = Convert.ToInt32(Console.ReadLine());
                    lista.Add(numero);
                    break;
                case 2:
                    Console.WriteLine(" * La lista tiene: {0} elementos.", lista.Size);
                    Console.WriteLine("");
                    break;
                case 3:
                    lista.Show();
                    break;
                case 4:
                    Console.WriteLine("Hasta luego!");
                    Console.WriteLine("");
                    break;
                default:
                    Console.WriteLine(" * Opcion incorrecta *");
                    Console.WriteLine("");
                    break;
            }
        }
    }
}
