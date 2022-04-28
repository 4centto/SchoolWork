using System;
using System.Collections.Generic;

namespace Generics
{
    class Program
    {
        //Este es un metodo generico, es decir puede recibir cualquier tipo de dato
        private static void Swap<T>(ref T a, ref T b)
        {
            T aux = b;
            b = a;
            a = aux;
        }

        static void Main(string[] args)
        {
            /*
            int a = 6;
            int b = 5;

            //Swap<int>(ref a, ref b);
            Swap(ref a, ref b);

            Console.WriteLine("a: " + a);
            Console.WriteLine("b: " + b);

            //Create a collection
            //using System.Collections.Generic;
            /*
             * List<T>
             * Dictionary<TKey, TValue>
             * SortedList<TKey, TValue>
             * Stack<T>
             * Queue<T>
             * HashSet<T>
             */
            //List<string> lista = new List<string>();
            int discount = Convert.ToInt32(Console.ReadLine());

            Dictionary<string, int> coffe = new Dictionary<string, int>();
            coffe.Add("Americano", 50);
            coffe.Add("Latte", 70);
            coffe.Add("Flat White", 60);
            coffe.Add("Espresso", 60);
            coffe.Add("Cappuccino", 80);
            coffe.Add("Mocha", 90);

            Dictionary<string, int> newCoffe = new Dictionary<string, int>();
            foreach (string k in coffe.Keys)
            {
                double d = Convert.ToDouble(discount) / 100.0;
                int p = Convert.ToInt32(Math.Ceiling(coffe[k] - Convert.ToDouble(coffe[k] * d)));
                newCoffe.Add(k, p);
            }

            foreach (string k in newCoffe.Keys)
            {
                Console.WriteLine("{0}: {1}", k, newCoffe[k]);
            }
        }
    }

    //Esta es una clase generica
    class Stack<T>
    {
        int index = 0;
        T[] innerArray = new T[100];
        public void Push(T item)
        {
            innerArray[index++] = item;
        }

        public T Pop()
        {
            return innerArray[--index];
        }

        public T Get(int k)
        {
            return innerArray[k];
        }
    }
}
