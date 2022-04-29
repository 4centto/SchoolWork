using System;
using System.Collections.Generic;
using System.Text;

namespace ArbolBinario
{
    class ArbolBinario
    {
        private Nodo lista;
        private int size;
        public ArbolBinario()
        {
            this.lista = null;
            this.size = 0;
        }
        public Nodo Lista
        {
            get { return this.lista; }
        }
        public int Size
        {
            get { return this.size; }
            set { this.size = value; }
        }
        public void Add(int data)
        {
            if (this.lista == null)
            {
                this.lista = new Nodo(data);
                this.size ++;
                Console.WriteLine(" * NODO AGREGADO * ");
                Console.WriteLine();
            } else
            {
                this.__add(data, this.lista);
            }
        }

        private void __add(int data, Nodo lista)
        {
            if (lista == null)
            {
                lista = new Nodo(data);
                this.size++;
                Console.WriteLine(" * NODO AGREGADO * ");
                Console.WriteLine();

            } else
            {
                if (data > lista.Data)
                {
                    if (lista.Right == null)
                    {
                        lista.Right = new Nodo(data);
                        this.size++;
                        Console.WriteLine(" * NODO AGREGADO * ");
                        Console.WriteLine();

                    } else
                    {
                        this.__add(data, lista.Right);
                    }
                } else
                {
                    if (lista.Left == null)
                    {
                        lista.Left = new Nodo(data);
                        this.size++;
                        Console.WriteLine(" * NODO AGREGADO * ");
                        Console.WriteLine();
                    } else
                    {
                        this.__add(data, lista.Left);
                    }
                }
            }
        }

        public void Show()
        {
            if (lista == null)
            {
                Console.WriteLine(" * Tu lista esta vacia * ");
                Console.WriteLine("");
            } else
            {
                this.__show(this.lista);
                Console.WriteLine("\n");
            }
        }

        private void __show(Nodo lista)
        {
            if (lista != null)
            {
                this.__show(lista.Left);
                this.__show(lista.Right);

                Console.Write("[{0}]", lista.Data);
            }
        }
    }
}
