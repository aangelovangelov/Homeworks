using System;

class DecimalToBinary
{
    static void Main()
    {
        long number = long.Parse(Console.ReadLine());

        string binary = string.Empty;

        if (number == 0)
        {
            Console.WriteLine(number);
        }
        else
        {
            while (number / 2 != 0 || number % 2 != 0)
            {
                long bit = number % 2;

                binary = bit + binary;

                number /= 2;
            }
        }

        Console.WriteLine(binary);
    }
}

