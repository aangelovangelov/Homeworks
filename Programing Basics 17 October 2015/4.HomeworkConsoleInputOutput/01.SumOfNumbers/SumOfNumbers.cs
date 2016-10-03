using System;

class SumOfNumbers
{
    static void Main()
    {
        Console.Write("Enter first number: ");
        double firstNumber = double.Parse(Console.ReadLine());

        Console.Write("Enter second number: ");
        double secondNumber = double.Parse(Console.ReadLine());

        Console.Write("Enter last number: ");
        double lastNumber = double.Parse(Console.ReadLine());

        Console.WriteLine("The sum is: {0}",firstNumber + secondNumber + lastNumber);


        //double firstNumber;
        //double secondNumber;
        //double lastNumber;

        //if (double.TryParse(Console.ReadLine(), out firstNumber) 
        //    && double.TryParse(Console.ReadLine(), out secondNumber)
        //    && double.TryParse(Console.ReadLine(), out lastNumber))
        //{
        //    Console.WriteLine("The sum is: {0}", firstNumber + secondNumber + lastNumber);
        //}
        //else
        //{
        //    Console.WriteLine("Enter a valid number!");
        //}
    }
}

