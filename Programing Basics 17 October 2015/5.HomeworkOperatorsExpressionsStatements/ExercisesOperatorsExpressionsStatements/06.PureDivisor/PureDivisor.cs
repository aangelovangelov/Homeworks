using System;

class Program
{
    static void Main()
    {
        try
        {
            Console.Write("Enter a number: ");
            int number = int.Parse(Console.ReadLine());

            bool result = number % 9 == 0 || number % 11 == 0 || number % 13 == 0;

            Console.WriteLine(result);
        }
        catch (FormatException e)
        {
            Console.WriteLine(e.Message);
        }
        
    }
}

