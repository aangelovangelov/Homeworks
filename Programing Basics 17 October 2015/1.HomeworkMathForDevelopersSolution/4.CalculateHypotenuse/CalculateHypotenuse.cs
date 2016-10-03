using System;

class CalculateHypotenuse
{
    static void Main()
    {
        Console.Write("Enter a positive integer number - first cathet: ");
        int a = int.Parse(Console.ReadLine());

        Console.Write("Enter a positive integer number - second cathet: ");
        int b = int.Parse(Console.ReadLine());

        double c = Math.Sqrt(a * a + b * b);
        Console.WriteLine("Your hypotenus is = " + c);
    }
}

