using System;

class QuadraticEquation
{
    static void Main()
    {
        Console.Write("Enter \"a\": ");
        double a = double.Parse(Console.ReadLine());

        Console.Write("Enter \"b\": ");
        double b = double.Parse(Console.ReadLine());

        Console.Write("Enter \"c\": ");
        double c = double.Parse(Console.ReadLine());

        double discriminant = Math.Pow(b, 2) - 4 * a * c;

        if (a != 0 && discriminant < 0)
        {
            Console.WriteLine("no real roots");
        }
        else if (a != 0 && discriminant == 0)
        {
            double x = -b / (2 * a);
            Console.WriteLine("x1=x2={0}", x);
        }
        else if (a != 0 && discriminant > 0)
        {
            double x1 = (-b - Math.Sqrt(discriminant)) / (2 * a);
            double x2 = (-b + Math.Sqrt(discriminant)) / (2 * a);
            Console.WriteLine("x1={0}; x2={1}", x1, x2);
        }
    }
}