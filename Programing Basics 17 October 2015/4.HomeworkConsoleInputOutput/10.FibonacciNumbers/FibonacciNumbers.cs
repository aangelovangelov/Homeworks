using System;

class FibonacciNumbers
{
    static void Main()
    {
        Console.Write("Enter members of the Fibonacci sequence you want to see: ");
        int members = int.Parse(Console.ReadLine());

        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < members; i++)
        {
            Console.Write("{0} ", num1);

            num1 += num2;
            num2 = num1 - num2;
        }
    }
}

