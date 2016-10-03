using System;

class ThirdDigitIs7
{
    static void Main()
    {
        try
        {
            Console.Write("Enter an integer number: ");
            int number = int.Parse(Console.ReadLine());

            bool isThirdDigit7 = ( (number / 100) % 10 ) == 7;

            Console.WriteLine(isThirdDigit7);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

