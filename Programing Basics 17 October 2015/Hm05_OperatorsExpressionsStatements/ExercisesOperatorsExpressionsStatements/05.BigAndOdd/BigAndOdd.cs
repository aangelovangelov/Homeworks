using System;

class BigAndOdd
{
    static void Main()
    {
        try
        {
            Console.Write("Enter an integer number: ");
            int number = int.Parse(Console.ReadLine());

            bool result = number > 20 && number % 2 != 0;

            Console.WriteLine(result);
        }
        catch (FormatException e)
        {
            Console.WriteLine(e.Message);
        }
        
    }
}