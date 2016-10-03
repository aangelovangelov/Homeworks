using System;
using System.Numerics;

class SomeFactorials
{
    static void Main()
    {
        BigInteger value1 = 1;
        BigInteger value2 = 1;
        BigInteger value3 = 1;

        for (int i = 2; i <= 100; i++)
        {
            value1 *= i;
        }
        Console.WriteLine("100! = " + value1);

        for (int i = 2; i <= 171; i++)
        {
            value2 *= i;
        }
        Console.WriteLine("171! = " + value2);

        for (int i = 2; i <= 250; i++)
        {
            value3 *= i;
        }
        Console.WriteLine("250! = " + value3);
    }
}

