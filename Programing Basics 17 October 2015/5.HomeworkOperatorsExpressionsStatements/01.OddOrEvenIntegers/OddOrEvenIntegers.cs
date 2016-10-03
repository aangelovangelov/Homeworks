using System;

class OddOrEvenIntegers
{
    static void Main()
    {
        try
        {
            Console.Write("Enter an integer number: ");
            int number = int.Parse(Console.ReadLine());

            bool isOdd = number % 2 != 0;

            Console.WriteLine(isOdd);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

