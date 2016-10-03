using System;

class Trapezoid
{
    static void Main()
    {
        Console.Write("Enter first base side: ");
        double firstSide = double.Parse(Console.ReadLine());

        Console.Write("Enter second base side: ");
        double secondSide = double.Parse(Console.ReadLine());

        Console.Write("Enter height: ");
        double height = double.Parse(Console.ReadLine());

        double area = ((firstSide + secondSide) / 2) * height;

        Console.WriteLine("{0:0.#}", area);
    }
}

