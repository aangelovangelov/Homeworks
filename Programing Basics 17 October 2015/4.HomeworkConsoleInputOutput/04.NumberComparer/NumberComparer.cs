using System;

class NumberComparer
{
    static void Main()
    {
        Console.Write("Enter a numbe: ");
        double firstNumber = double.Parse(Console.ReadLine());

        Console.Write("Enter a number: ");
        double secondNumber = double.Parse(Console.ReadLine());

        if (firstNumber > secondNumber)
        {
            Console.WriteLine("Max number is: {0}", firstNumber);
        }
        else
        {
            Console.WriteLine("Max number is: {0}", secondNumber);
        }

        Console.WriteLine("Max number is: {0}", Math.Max(firstNumber, secondNumber));

        Console.WriteLine("Max number is: {0}", ((firstNumber + secondNumber) + Math.Abs(firstNumber - secondNumber)) / 2);
        Console.WriteLine("Min number is: {0}", ((firstNumber + secondNumber) - Math.Abs(firstNumber - secondNumber)) / 2);//for smaller

        Console.WriteLine("Max number is: {0}", firstNumber > secondNumber ? firstNumber : secondNumber);
    }
}

