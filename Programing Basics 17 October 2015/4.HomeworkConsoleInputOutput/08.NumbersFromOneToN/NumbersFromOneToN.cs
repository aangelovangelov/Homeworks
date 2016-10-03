using System;

class NumbersFromOneToN
{
    static void Main()
    {
        Console.Write("Enter an integer number: ");
        int num = int.Parse(Console.ReadLine());

        for (int counter = 1; counter <= num; counter++)
        {
            Console.WriteLine(counter);
        }
    }
}

