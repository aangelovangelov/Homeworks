using System;

class Trapezoids
{
    static void Main()
    {
        try
        {
            Console.Write("Enter side \"a\": ");
            double a = double.Parse(Console.ReadLine());

            Console.Write("Enter side \"b\": ");
            double b = double.Parse(Console.ReadLine());

            Console.Write("Enter height \"h\": ");
            double h = double.Parse(Console.ReadLine());

            double area = ((a + b) / 2) * h;

            Console.WriteLine("The area is: {0}", area);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

