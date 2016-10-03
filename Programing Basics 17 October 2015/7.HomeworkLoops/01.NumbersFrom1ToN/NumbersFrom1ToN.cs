using System;

class NumbersFrom1ToN
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());

        for (int i = 1; i <= n; i++)
        {
            Console.Write("{0} ", i);
        }
        //int counter = 1;

        //while (counter <= n)
        //{
        //    Console.Write("{0} ", counter);
        //    counter++;
        //}

        //do
        //{
        //    Console.Write("{0} ", counter);
        //    counter++;
        //} while (counter <= n);
    }
}

