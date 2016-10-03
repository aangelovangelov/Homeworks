using System;

class FourDigitNumber
{
    static void Main()
    {
        try
        {
            Console.Write("Enter 4-digit integer number: ");
            int number = int.Parse(Console.ReadLine());

            int position0 = (number / 1000);
            int position1 = ((number / 100) % 10);
            int position2 = ((number / 10) % 10);
            int position3 = (number % 10);

            int sum = position0 + position1 + position2 + position3;
            Console.WriteLine("Sum of digits: {0}", sum);

            Console.WriteLine("Reversed digit: {0}{1}{2}{3}", position3, position2, position1, position0);

            Console.WriteLine("Last digit in front: {0}{1}{2}{3}", position3, position0, position1, position2);

            Console.WriteLine("Second and third digits exchanged: {0}{1}{2}{3}", position0, position3, position2, position1);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

