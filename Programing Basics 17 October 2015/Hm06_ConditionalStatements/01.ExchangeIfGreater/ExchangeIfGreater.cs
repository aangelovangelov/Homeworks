using System;

class ExchangeIfGreater
{
    static void Main()
    {
        double firstInput = double.Parse(Console.ReadLine());
        double secondInput = double.Parse(Console.ReadLine());

        if (firstInput > secondInput)
        {
            firstInput = firstInput + secondInput;
            secondInput = firstInput - secondInput;
            firstInput = firstInput - secondInput;

            Console.WriteLine("{0} {1}", firstInput, secondInput);
        }
        else
        {
            Console.WriteLine("{0} {1}", firstInput, secondInput);
        }
    }
}