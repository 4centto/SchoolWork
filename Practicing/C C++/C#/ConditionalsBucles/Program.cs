using System;

namespace ConditionalsBucles {
    class Program {
        static void Main(string[] args) {
            int n = Convert.ToInt32(Console.ReadLine());

            for (int i = 0; i <= n; i++)
            {
                if (i%3 == 0)
                {
                    Console.Write("*");
                } else
                {
                    Console.Write(i);
                }
            }
        }
    }
}
