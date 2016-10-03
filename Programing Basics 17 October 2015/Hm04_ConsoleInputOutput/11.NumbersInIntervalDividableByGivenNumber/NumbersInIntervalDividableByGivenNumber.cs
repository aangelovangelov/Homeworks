using System;

class NumbersInIntervalDividableByGivenNumber
{
    static void Main()
    {
        Console.Write("Enter a positive integer number: ");
        int num1 = int.Parse(Console.ReadLine());

        Console.Write("Enter a positive integer number: ");
        int num2 = int.Parse(Console.ReadLine());

        Console.Write("Enter divader: ");
        int divider = int.Parse(Console.ReadLine());


        if (divider != 0)
        {
            for (int i = Math.Min(num1, num2); i <= Math.Max(num1, num2); i++)
            {
                if (i % divider == 0)
                {
                    Console.Write("{0}, ", i);
                }
                else if (divider > Math.Max(num1, num2))
                {
                    Console.WriteLine("No such a number!");
                    break;
                }
            }
        }
        else
        {
            Console.WriteLine("Can not be divided by zero! Enter valid number!");
        }
    }
}


