using System;
using System.Collections.Generic;
using System.Text;

namespace ArbolBinario
{
    class Nodo
    {
        private Nodo left = null;
        private int data;
        private Nodo right = null;

        public Nodo()
        {

        }
        public Nodo(int data)
        {
            this.data = data;
        }

        public Nodo Left
        {
            get { return this.left; }
            set { this.left = value; }
        }
        public int Data
        {
            get { return this.data; }
            set { this.data = value; }
        }
        public Nodo Right
        {
            get { return this.right; }
            set { this.right = value; }
        }
    }
}
