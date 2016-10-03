using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class MethodsPrintingNumbers
{
    static void PrintEvenNumbers(int minRange, int maxRange)
    {
        for (int i = minRange; i <= maxRange; i++)
        {
            if (i % 2 == 0)
            {
                Console.WriteLine(i);
            }
        }
    }

    static void Main()
    {
        int minNumber = int.Parse(Console.ReadLine());
        int maxNumber = int.Parse(Console.ReadLine());

        PrintEvenNumbers(minNumber, maxNumber);

    }
}

