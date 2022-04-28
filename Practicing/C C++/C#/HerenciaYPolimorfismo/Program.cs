using System;

namespace HerenciaYPolimorfismo
{
    //Herencia
    class Animal
    {
        private string raza;
        private int patas;
        private string color;

        public string Raza
        {
            get { return this.raza; }
            set { this.raza = value; }
        }

        public int Patas
        {
            get { return this.patas; }
            set { this.patas = value; }
        }

        public string Color
        {
            get { return this.color; }
            set { this.color = value; }
        }

        public virtual void Walk()
        {
            Console.WriteLine("Base walking");
        }

    }

    class Dog : Animal
    {
        public Dog(string raza, int patas, string color)
        {
            Color = color;
            Raza = raza;
            Patas = patas;
        }

        public void bark()
        {
            Console.WriteLine("Woof");
        }

        public void toString()
        {
            Console.WriteLine("Raza: " + Raza);
            Console.WriteLine("Color: " + Color);
            Console.WriteLine("Patas: " + Patas);
        }

        public override void Walk()
        {
            Console.WriteLine("Animal Walking");
        }
    }

    //Clases abstractas
    abstract class Shape
    {
        public abstract void Area();
    }

    class Square : Shape
    {
        public override void Area()
        {
            Console.WriteLine("Square Area");
        }
    }

    //Interfaces
    public interface IShape
    {
        void Draw();
        void Finish()
        {
            Console.WriteLine("Default method");
        }
    }

    class Circle : IShape
    {
        public void Draw()
        {

        }
    }

    //Metodo Main
    class Program
    {
        static void Main(string[] args)
        {
            Dog perro = new Dog("Chihuahua", 4, "Cafe");
            perro.toString();
            perro.Walk();
        }
    }
}
