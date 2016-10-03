using System;

class NumbersNotDivisibleBy3And7
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());

        //for (int i = 1; i <= n; i++)
        //{
        //    if (i % 3 == 0 || i % 7 == 0)//zakon na morgan
        //    {
        //        continue;
        //    }
        //    Console.Write("{0} ", i);
        //}

        for (int i = 1; i <= n; i++)
        {
            if (i % 3 != 0 && i % 7 != 0)
            {
                Console.Write("{0} ", i);
            }
        }
    }
}

