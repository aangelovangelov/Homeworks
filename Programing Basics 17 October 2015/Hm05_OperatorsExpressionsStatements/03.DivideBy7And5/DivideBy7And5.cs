using System;

class DivideBy7And5
{
    static void Main()
    {
        try
        {
            Console.Write("Enter an integer number: ");
            int number = int.Parse(Console.ReadLine());

            bool isDivide = number % 7 == 0 && number % 5 == 0;

            Console.WriteLine(isDivide);
            //pri "0" e true, poneje ostatakut ot delenieto na 7 i na 5 e 0!
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

