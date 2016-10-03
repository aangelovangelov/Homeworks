using System;
using System.Numerics;

class TrailingZeroes
{
    static void Main()
    {
        int number = int.Parse(Console.ReadLine());

        BigInteger factorial = 1;

        for (int i = 2; i <= number; i++)
        {
            factorial *= i;
        }

        string converted = Convert.ToString(factorial);

        int position = converted.Length;

        char lastIndex = converted[position - 1];

        int counter = 0;

        if (lastIndex == '0')
        {
            while (lastIndex == '0')
            {
                counter++;

                lastIndex = converted[position - 1 - counter];
            }

            Console.WriteLine(counter);
        }
        else
        {
            Console.WriteLine(0);
        }
    }
}