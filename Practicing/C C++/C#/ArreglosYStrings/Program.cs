using System;

namespace ArreglosYStrings
{
    class Program
    {
        static void Main(string[] args)
        {
            //Un arreglo tiene sus metodos
            /*
             int[] array = new int[5];
             array.
             */
            int[,] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    Console.Write(arr[i, j]);
                }
                Console.WriteLine();
            }

            //Otra manera de declarar arreglos es por medio del jagged array
            int[][] jaggedArray = new int[2][]; //Este es un arreglo bidimensional de arreglos
                                                //unidimensionales de cualquier tamaño, pero
                                                //Filas solo tendra en este cxaso 2

            //Validar una contraseña
            string password = "homebhTom";
            char[] notAllowedSymbols = { '!', '#', '$', '%', '&', '(', ')', '*', ',', '+', '-' };
            for (int i = 0; i < notAllowedSymbols.Length; i++)
            {
                if (password.Contains(notAllowedSymbols[i]))
                {
                    Console.WriteLine("Invalid");
                    break;
                }
            }

            //Programa final del tema de arreglos
            string[] words =
            {
                "home",
                "programming",
                "victory",
                "C#",
                "football",
                "sport",
                "book",
                "learn",
                "dream",
                "fun"
            };

            bool aux = false;
            string letter = Console.ReadLine();

            for (int i = 0; i < 10; i++)
            {
                if (words[i].Contains(letter))
                {
                    Console.WriteLine(words[i]);

                    if (aux == false)
                        aux = true;
                }
            }

            if (aux == false)
                Console.WriteLine("No match");

        }
    }
}
