using System;

class NullValuesArithmetic
{
    static void Main()
    {
        int? firstVariable = null;

        double? secondVariable = null;

        Console.WriteLine(firstVariable + "\n" + secondVariable);

        Console.WriteLine(firstVariable + 5);

        Console.WriteLine(secondVariable + 5);

        Console.WriteLine(firstVariable + null);

        Console.WriteLine(secondVariable + null);
    }
}

