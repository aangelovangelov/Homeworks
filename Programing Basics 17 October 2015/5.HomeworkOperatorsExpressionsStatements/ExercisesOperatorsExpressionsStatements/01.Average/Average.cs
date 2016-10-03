using System;

class Average
{
    static void Main()
    {
        Console.WriteLine("Enter three numbers on a diferent line: ");
        double num1 = double.Parse(Console.ReadLine());
        double num2 = double.Parse(Console.ReadLine());
        double num3 = double.Parse(Console.ReadLine());

        double average = (num1 + num2 + num3) / 3;

        Console.WriteLine("{0:f5}", average);

    }
}

